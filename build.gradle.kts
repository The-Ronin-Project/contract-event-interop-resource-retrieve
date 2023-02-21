import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import com.networknt.schema.JsonSchemaFactory
import com.networknt.schema.SpecVersion
import com.sun.codemodel.JClassContainer
import com.sun.codemodel.JDocComment
import com.sun.codemodel.JDocCommentable
import com.sun.codemodel.JType
import org.apache.commons.lang3.StringUtils
import org.apache.commons.text.StringEscapeUtils
import org.jsonschema2pojo.Schema
import org.jsonschema2pojo.rules.DescriptionRule
import org.jsonschema2pojo.rules.EnumRule
import org.jsonschema2pojo.rules.Rule
import org.jsonschema2pojo.rules.RuleFactory

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
            mavenContent {
                releasesOnly()
            }
        }
    }

    dependencies {
        classpath("org.jsonschema2pojo:jsonschema2pojo-gradle-plugin:1.1.3")
        classpath("com.networknt:json-schema-validator:1.0.72")
        classpath("org.apache.commons:commons-text:1.10.0")
    }
}

plugins {
    id("com.projectronin.interop.gradle.version")
    id("com.projectronin.interop.gradle.publish")
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-annotations:2.14.2")
}

apply(plugin = "org.jsonschema2pojo")

class MyEnumRule(ruleFactory: RuleFactory) : EnumRule(ruleFactory) {
    private val mappings = mapOf(
        "<" to "LESS_THAN",
        "<=" to "LESS_THAN_OR_EQUAL",
        ">" to "GREATER_THAN",
        ">=" to "GREATER_THAN_OR_EQUAL"
    )

    override fun getConstantName(nodeName: String?, customName: String?): String {
        return mappings[nodeName] ?: super.getConstantName(nodeName, customName)
    }
}

class MyDescriptionRule : DescriptionRule() {
    override fun apply(
        nodeName: String?,
        node: JsonNode,
        parent: JsonNode?,
        generatableType: JDocCommentable,
        schema: Schema?
    ): JDocComment {
        val javadoc = generatableType.javadoc()

        val descriptionText = StringEscapeUtils.escapeHtml4(node.asText())
        println("nodeName; $nodeName")
        println("description: $descriptionText")
        println()

        if (StringUtils.isNotBlank(descriptionText)) {
            val lines = descriptionText.split("/\r?\n/".toRegex())
            for (line in lines) {
                javadoc.append(line)
            }
        }

        return javadoc
    }
}

class MyRuleFactory : RuleFactory() {
    override fun getEnumRule(): Rule<JClassContainer, JType> {
        return MyEnumRule(this)
    }

    override fun getDescriptionRule(): Rule<JDocCommentable, JDocComment> {
        return MyDescriptionRule()
    }
}

configure<org.jsonschema2pojo.gradle.JsonSchemaExtension> {
    sourceFiles = fileTree("v1") {
        include("*-v1.schema.json")
    }
    targetDirectory = file("src/main/java")
    targetPackage = "com.projectronin.event.fhir"
    setCustomRuleFactory(MyRuleFactory::class.java)
    propertyWordDelimiters[2] = ' '
}

task("validateSchema") {
    val factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V6)
    val schema = factory.getSchema(file("v1/Patient.schema.json").toURI())
    val node = JsonMapper().readTree(file("v1/examples/resource-retrieve.json"))
    val errors = schema.validate(node)
    errors.forEach(::println)
}

tasks.jar {
    from(project.projectDir) {
        include("v*/*.schema.json")
    }
}

// apply<net.pwall.json.kotlin.codegen.gradle.JSONSchemaCodegenPlugin>()
//
// sourceSets.main {
//     java.srcDirs("build/generated-sources/kotlin")
// }
//
// configure<net.pwall.json.kotlin.codegen.gradle.JSONSchemaCodegen> {
//     packageName.set("com.projectronin.event.fhir")
//     inputs {
//         inputFile {
//             file.set(file("v1/fhir-v1.schema.json"))
//             subPackage.set("v1")
//         }
//     }
// }
