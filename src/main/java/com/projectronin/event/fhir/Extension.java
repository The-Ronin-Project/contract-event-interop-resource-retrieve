
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Optional Extension Element - found in all resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "url",
    "_url",
    "valueBase64Binary",
    "_valueBase64Binary",
    "valueBoolean",
    "_valueBoolean",
    "valueCanonical",
    "_valueCanonical",
    "valueCode",
    "_valueCode",
    "valueDate",
    "_valueDate",
    "valueDateTime",
    "_valueDateTime",
    "valueDecimal",
    "_valueDecimal",
    "valueId",
    "_valueId",
    "valueInstant",
    "_valueInstant",
    "valueInteger",
    "_valueInteger",
    "valueMarkdown",
    "_valueMarkdown",
    "valueOid",
    "_valueOid",
    "valuePositiveInt",
    "_valuePositiveInt",
    "valueString",
    "_valueString",
    "valueTime",
    "_valueTime",
    "valueUnsignedInt",
    "_valueUnsignedInt",
    "valueUri",
    "_valueUri",
    "valueUrl",
    "_valueUrl",
    "valueUuid",
    "_valueUuid",
    "valueAddress",
    "valueAge",
    "valueAnnotation",
    "valueAttachment",
    "valueCodeableConcept",
    "valueCoding",
    "valueContactPoint",
    "valueCount",
    "valueDistance",
    "valueDuration",
    "valueHumanName",
    "valueIdentifier",
    "valueMoney",
    "valuePeriod",
    "valueQuantity",
    "valueRange",
    "valueRatio",
    "valueReference",
    "valueSampledData",
    "valueSignature",
    "valueTiming",
    "valueContactDetail",
    "valueContributor",
    "valueDataRequirement",
    "valueExpression",
    "valueParameterDefinition",
    "valueRelatedArtifact",
    "valueTriggerDefinition",
    "valueUsageContext",
    "valueDosage",
    "valueMeta"
})
@Generated("jsonschema2pojo")
public class Extension {

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String id;
    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
    private List<Extension> extension = new ArrayList<Extension>();
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String url;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _url;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBase64Binary")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueBase64Binary;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBase64Binary")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBase64Binary;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBoolean")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private Boolean valueBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueBoolean;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCanonical")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueCanonical;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCanonical")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueCanonical;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCode")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueCode;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDate")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDate;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDateTime")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDateTime;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDecimal")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private Double valueDecimal;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueDecimal;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueId")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueId;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInstant")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueInstant;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInstant")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInstant;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInteger")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private Double valueInteger;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueInteger;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueMarkdown")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueMarkdown;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueMarkdown")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueMarkdown;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueOid")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueOid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueOid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueOid;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valuePositiveInt")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private Double valuePositiveInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valuePositiveInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valuePositiveInt;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueString")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueString;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueTime")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueTime;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUnsignedInt")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private Double valueUnsignedInt;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUnsignedInt")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUnsignedInt;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUri")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueUri;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUri;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUrl")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUrl;
    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUuid")
    @JsonPropertyDescription("Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).")
    private String valueUuid;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUuid")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _valueUuid;
    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("valueAddress")
    @JsonPropertyDescription("An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.")
    private Address valueAddress;
    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("valueAge")
    @JsonPropertyDescription("A duration of time during which an organism (or a process) has existed.")
    private Age valueAge;
    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("valueAnnotation")
    @JsonPropertyDescription("A  text note which also  contains information about who made the statement and when.")
    private Annotation valueAnnotation;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment valueAttachment;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept valueCodeableConcept;
    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    @JsonPropertyDescription("A reference to a code defined by a terminology system.")
    private Coding valueCoding;
    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("valueContactPoint")
    @JsonPropertyDescription("Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.")
    private ContactPoint valueContactPoint;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueCount")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Count valueCount;
    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("valueDistance")
    @JsonPropertyDescription("A length - a value with a unit that is a physical distance.")
    private Distance valueDistance;
    /**
     * A length of time.
     * 
     */
    @JsonProperty("valueDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration valueDuration;
    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("valueHumanName")
    @JsonPropertyDescription("A human's name with the ability to identify parts and usage.")
    private HumanName valueHumanName;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("valueIdentifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier valueIdentifier;
    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("valueMoney")
    @JsonPropertyDescription("An amount of economic utility in some recognized currency.")
    private Money valueMoney;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period valuePeriod;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity valueQuantity;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range valueRange;
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio valueRatio;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference valueReference;
    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    @JsonPropertyDescription("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.")
    private SampledData valueSampledData;
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("valueSignature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature valueSignature;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("valueTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing valueTiming;
    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("valueContactDetail")
    @JsonPropertyDescription("Specifies contact information for a person or organization.")
    private ContactDetail valueContactDetail;
    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("valueContributor")
    @JsonPropertyDescription("A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.")
    private Contributor valueContributor;
    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("valueDataRequirement")
    @JsonPropertyDescription("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.")
    private DataRequirement valueDataRequirement;
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("valueExpression")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression valueExpression;
    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("valueParameterDefinition")
    @JsonPropertyDescription("The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.")
    private ParameterDefinition valueParameterDefinition;
    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("valueRelatedArtifact")
    @JsonPropertyDescription("Related artifacts such as additional documentation, justification, or bibliographic references.")
    private RelatedArtifact valueRelatedArtifact;
    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("valueTriggerDefinition")
    @JsonPropertyDescription("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.")
    private TriggerDefinition valueTriggerDefinition;
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("valueUsageContext")
    @JsonPropertyDescription("Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).")
    private UsageContext valueUsageContext;
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("valueDosage")
    @JsonPropertyDescription("Indicates how the medication is/was taken or should be taken by the patient.")
    private Dosage valueDosage;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("valueMeta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta valueMeta;

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public List<Extension> getExtension() {
        return extension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public Element get_url() {
        return _url;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    public void set_url(Element _url) {
        this._url = _url;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBase64Binary")
    public String getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(String valueBase64Binary) {
        this.valueBase64Binary = valueBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBase64Binary")
    public Element get_valueBase64Binary() {
        return _valueBase64Binary;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBase64Binary")
    public void set_valueBase64Binary(Element _valueBase64Binary) {
        this._valueBase64Binary = _valueBase64Binary;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public Element get_valueBoolean() {
        return _valueBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueBoolean")
    public void set_valueBoolean(Element _valueBoolean) {
        this._valueBoolean = _valueBoolean;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCanonical")
    public String getValueCanonical() {
        return valueCanonical;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCanonical")
    public void setValueCanonical(String valueCanonical) {
        this.valueCanonical = valueCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCanonical")
    public Element get_valueCanonical() {
        return _valueCanonical;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCanonical")
    public void set_valueCanonical(Element _valueCanonical) {
        this._valueCanonical = _valueCanonical;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCode")
    public String getValueCode() {
        return valueCode;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueCode")
    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    public Element get_valueCode() {
        return _valueCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueCode")
    public void set_valueCode(Element _valueCode) {
        this._valueCode = _valueCode;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDate")
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDate")
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    public Element get_valueDate() {
        return _valueDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDate")
    public void set_valueDate(Element _valueDate) {
        this._valueDate = _valueDate;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDateTime")
    public String getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDateTime")
    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public Element get_valueDateTime() {
        return _valueDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDateTime")
    public void set_valueDateTime(Element _valueDateTime) {
        this._valueDateTime = _valueDateTime;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDecimal")
    public Double getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    public Element get_valueDecimal() {
        return _valueDecimal;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueDecimal")
    public void set_valueDecimal(Element _valueDecimal) {
        this._valueDecimal = _valueDecimal;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueId")
    public String getValueId() {
        return valueId;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueId")
    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueId")
    public Element get_valueId() {
        return _valueId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueId")
    public void set_valueId(Element _valueId) {
        this._valueId = _valueId;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInstant")
    public String getValueInstant() {
        return valueInstant;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInstant")
    public void setValueInstant(String valueInstant) {
        this.valueInstant = valueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInstant")
    public Element get_valueInstant() {
        return _valueInstant;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInstant")
    public void set_valueInstant(Element _valueInstant) {
        this._valueInstant = _valueInstant;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInteger")
    public Double getValueInteger() {
        return valueInteger;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueInteger")
    public void setValueInteger(Double valueInteger) {
        this.valueInteger = valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public Element get_valueInteger() {
        return _valueInteger;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueInteger")
    public void set_valueInteger(Element _valueInteger) {
        this._valueInteger = _valueInteger;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueMarkdown")
    public String getValueMarkdown() {
        return valueMarkdown;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueMarkdown")
    public void setValueMarkdown(String valueMarkdown) {
        this.valueMarkdown = valueMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueMarkdown")
    public Element get_valueMarkdown() {
        return _valueMarkdown;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueMarkdown")
    public void set_valueMarkdown(Element _valueMarkdown) {
        this._valueMarkdown = _valueMarkdown;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueOid")
    public String getValueOid() {
        return valueOid;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueOid")
    public void setValueOid(String valueOid) {
        this.valueOid = valueOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueOid")
    public Element get_valueOid() {
        return _valueOid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueOid")
    public void set_valueOid(Element _valueOid) {
        this._valueOid = _valueOid;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valuePositiveInt")
    public Double getValuePositiveInt() {
        return valuePositiveInt;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valuePositiveInt")
    public void setValuePositiveInt(Double valuePositiveInt) {
        this.valuePositiveInt = valuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valuePositiveInt")
    public Element get_valuePositiveInt() {
        return _valuePositiveInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valuePositiveInt")
    public void set_valuePositiveInt(Element _valuePositiveInt) {
        this._valuePositiveInt = _valuePositiveInt;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueString")
    public String getValueString() {
        return valueString;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueString")
    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public Element get_valueString() {
        return _valueString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueString")
    public void set_valueString(Element _valueString) {
        this._valueString = _valueString;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueTime")
    public String getValueTime() {
        return valueTime;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueTime")
    public void setValueTime(String valueTime) {
        this.valueTime = valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public Element get_valueTime() {
        return _valueTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueTime")
    public void set_valueTime(Element _valueTime) {
        this._valueTime = _valueTime;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUnsignedInt")
    public Double getValueUnsignedInt() {
        return valueUnsignedInt;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUnsignedInt")
    public void setValueUnsignedInt(Double valueUnsignedInt) {
        this.valueUnsignedInt = valueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUnsignedInt")
    public Element get_valueUnsignedInt() {
        return _valueUnsignedInt;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUnsignedInt")
    public void set_valueUnsignedInt(Element _valueUnsignedInt) {
        this._valueUnsignedInt = _valueUnsignedInt;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUri")
    public String getValueUri() {
        return valueUri;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUri")
    public void setValueUri(String valueUri) {
        this.valueUri = valueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    public Element get_valueUri() {
        return _valueUri;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUri")
    public void set_valueUri(Element _valueUri) {
        this._valueUri = _valueUri;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUrl")
    public String getValueUrl() {
        return valueUrl;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUrl")
    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUrl")
    public Element get_valueUrl() {
        return _valueUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUrl")
    public void set_valueUrl(Element _valueUrl) {
        this._valueUrl = _valueUrl;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUuid")
    public String getValueUuid() {
        return valueUuid;
    }

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     * 
     */
    @JsonProperty("valueUuid")
    public void setValueUuid(String valueUuid) {
        this.valueUuid = valueUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUuid")
    public Element get_valueUuid() {
        return _valueUuid;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_valueUuid")
    public void set_valueUuid(Element _valueUuid) {
        this._valueUuid = _valueUuid;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("valueAddress")
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     * 
     */
    @JsonProperty("valueAddress")
    public void setValueAddress(Address valueAddress) {
        this.valueAddress = valueAddress;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("valueAge")
    public Age getValueAge() {
        return valueAge;
    }

    /**
     * A duration of time during which an organism (or a process) has existed.
     * 
     */
    @JsonProperty("valueAge")
    public void setValueAge(Age valueAge) {
        this.valueAge = valueAge;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("valueAnnotation")
    public Annotation getValueAnnotation() {
        return valueAnnotation;
    }

    /**
     * A  text note which also  contains information about who made the statement and when.
     * 
     */
    @JsonProperty("valueAnnotation")
    public void setValueAnnotation(Annotation valueAnnotation) {
        this.valueAnnotation = valueAnnotation;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Attachment valueAttachment) {
        this.valueAttachment = valueAttachment;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
        this.valueCodeableConcept = valueCodeableConcept;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * A reference to a code defined by a terminology system.
     * 
     */
    @JsonProperty("valueCoding")
    public void setValueCoding(Coding valueCoding) {
        this.valueCoding = valueCoding;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("valueContactPoint")
    public ContactPoint getValueContactPoint() {
        return valueContactPoint;
    }

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     * 
     */
    @JsonProperty("valueContactPoint")
    public void setValueContactPoint(ContactPoint valueContactPoint) {
        this.valueContactPoint = valueContactPoint;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueCount")
    public Count getValueCount() {
        return valueCount;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueCount")
    public void setValueCount(Count valueCount) {
        this.valueCount = valueCount;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("valueDistance")
    public Distance getValueDistance() {
        return valueDistance;
    }

    /**
     * A length - a value with a unit that is a physical distance.
     * 
     */
    @JsonProperty("valueDistance")
    public void setValueDistance(Distance valueDistance) {
        this.valueDistance = valueDistance;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("valueDuration")
    public Duration getValueDuration() {
        return valueDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("valueDuration")
    public void setValueDuration(Duration valueDuration) {
        this.valueDuration = valueDuration;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("valueHumanName")
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * A human's name with the ability to identify parts and usage.
     * 
     */
    @JsonProperty("valueHumanName")
    public void setValueHumanName(HumanName valueHumanName) {
        this.valueHumanName = valueHumanName;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("valueIdentifier")
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("valueIdentifier")
    public void setValueIdentifier(Identifier valueIdentifier) {
        this.valueIdentifier = valueIdentifier;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("valueMoney")
    public Money getValueMoney() {
        return valueMoney;
    }

    /**
     * An amount of economic utility in some recognized currency.
     * 
     */
    @JsonProperty("valueMoney")
    public void setValueMoney(Money valueMoney) {
        this.valueMoney = valueMoney;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Period valuePeriod) {
        this.valuePeriod = valuePeriod;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Quantity valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("valueRange")
    public void setValueRange(Range valueRange) {
        this.valueRange = valueRange;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("valueRatio")
    public void setValueRatio(Ratio valueRatio) {
        this.valueRatio = valueRatio;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("valueReference")
    public void setValueReference(Reference valueReference) {
        this.valueReference = valueReference;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     * 
     */
    @JsonProperty("valueSampledData")
    public void setValueSampledData(SampledData valueSampledData) {
        this.valueSampledData = valueSampledData;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("valueSignature")
    public Signature getValueSignature() {
        return valueSignature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("valueSignature")
    public void setValueSignature(Signature valueSignature) {
        this.valueSignature = valueSignature;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("valueTiming")
    public Timing getValueTiming() {
        return valueTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("valueTiming")
    public void setValueTiming(Timing valueTiming) {
        this.valueTiming = valueTiming;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("valueContactDetail")
    public ContactDetail getValueContactDetail() {
        return valueContactDetail;
    }

    /**
     * Specifies contact information for a person or organization.
     * 
     */
    @JsonProperty("valueContactDetail")
    public void setValueContactDetail(ContactDetail valueContactDetail) {
        this.valueContactDetail = valueContactDetail;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("valueContributor")
    public Contributor getValueContributor() {
        return valueContributor;
    }

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     * 
     */
    @JsonProperty("valueContributor")
    public void setValueContributor(Contributor valueContributor) {
        this.valueContributor = valueContributor;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("valueDataRequirement")
    public DataRequirement getValueDataRequirement() {
        return valueDataRequirement;
    }

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     * 
     */
    @JsonProperty("valueDataRequirement")
    public void setValueDataRequirement(DataRequirement valueDataRequirement) {
        this.valueDataRequirement = valueDataRequirement;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("valueExpression")
    public Expression getValueExpression() {
        return valueExpression;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("valueExpression")
    public void setValueExpression(Expression valueExpression) {
        this.valueExpression = valueExpression;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("valueParameterDefinition")
    public ParameterDefinition getValueParameterDefinition() {
        return valueParameterDefinition;
    }

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     * 
     */
    @JsonProperty("valueParameterDefinition")
    public void setValueParameterDefinition(ParameterDefinition valueParameterDefinition) {
        this.valueParameterDefinition = valueParameterDefinition;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("valueRelatedArtifact")
    public RelatedArtifact getValueRelatedArtifact() {
        return valueRelatedArtifact;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     */
    @JsonProperty("valueRelatedArtifact")
    public void setValueRelatedArtifact(RelatedArtifact valueRelatedArtifact) {
        this.valueRelatedArtifact = valueRelatedArtifact;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("valueTriggerDefinition")
    public TriggerDefinition getValueTriggerDefinition() {
        return valueTriggerDefinition;
    }

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
     * 
     */
    @JsonProperty("valueTriggerDefinition")
    public void setValueTriggerDefinition(TriggerDefinition valueTriggerDefinition) {
        this.valueTriggerDefinition = valueTriggerDefinition;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("valueUsageContext")
    public UsageContext getValueUsageContext() {
        return valueUsageContext;
    }

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     * 
     */
    @JsonProperty("valueUsageContext")
    public void setValueUsageContext(UsageContext valueUsageContext) {
        this.valueUsageContext = valueUsageContext;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("valueDosage")
    public Dosage getValueDosage() {
        return valueDosage;
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     * 
     */
    @JsonProperty("valueDosage")
    public void setValueDosage(Dosage valueDosage) {
        this.valueDosage = valueDosage;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("valueMeta")
    public Meta getValueMeta() {
        return valueMeta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("valueMeta")
    public void setValueMeta(Meta valueMeta) {
        this.valueMeta = valueMeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Extension.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("valueBase64Binary");
        sb.append('=');
        sb.append(((this.valueBase64Binary == null)?"<null>":this.valueBase64Binary));
        sb.append(',');
        sb.append("_valueBase64Binary");
        sb.append('=');
        sb.append(((this._valueBase64Binary == null)?"<null>":this._valueBase64Binary));
        sb.append(',');
        sb.append("valueBoolean");
        sb.append('=');
        sb.append(((this.valueBoolean == null)?"<null>":this.valueBoolean));
        sb.append(',');
        sb.append("_valueBoolean");
        sb.append('=');
        sb.append(((this._valueBoolean == null)?"<null>":this._valueBoolean));
        sb.append(',');
        sb.append("valueCanonical");
        sb.append('=');
        sb.append(((this.valueCanonical == null)?"<null>":this.valueCanonical));
        sb.append(',');
        sb.append("_valueCanonical");
        sb.append('=');
        sb.append(((this._valueCanonical == null)?"<null>":this._valueCanonical));
        sb.append(',');
        sb.append("valueCode");
        sb.append('=');
        sb.append(((this.valueCode == null)?"<null>":this.valueCode));
        sb.append(',');
        sb.append("_valueCode");
        sb.append('=');
        sb.append(((this._valueCode == null)?"<null>":this._valueCode));
        sb.append(',');
        sb.append("valueDate");
        sb.append('=');
        sb.append(((this.valueDate == null)?"<null>":this.valueDate));
        sb.append(',');
        sb.append("_valueDate");
        sb.append('=');
        sb.append(((this._valueDate == null)?"<null>":this._valueDate));
        sb.append(',');
        sb.append("valueDateTime");
        sb.append('=');
        sb.append(((this.valueDateTime == null)?"<null>":this.valueDateTime));
        sb.append(',');
        sb.append("_valueDateTime");
        sb.append('=');
        sb.append(((this._valueDateTime == null)?"<null>":this._valueDateTime));
        sb.append(',');
        sb.append("valueDecimal");
        sb.append('=');
        sb.append(((this.valueDecimal == null)?"<null>":this.valueDecimal));
        sb.append(',');
        sb.append("_valueDecimal");
        sb.append('=');
        sb.append(((this._valueDecimal == null)?"<null>":this._valueDecimal));
        sb.append(',');
        sb.append("valueId");
        sb.append('=');
        sb.append(((this.valueId == null)?"<null>":this.valueId));
        sb.append(',');
        sb.append("_valueId");
        sb.append('=');
        sb.append(((this._valueId == null)?"<null>":this._valueId));
        sb.append(',');
        sb.append("valueInstant");
        sb.append('=');
        sb.append(((this.valueInstant == null)?"<null>":this.valueInstant));
        sb.append(',');
        sb.append("_valueInstant");
        sb.append('=');
        sb.append(((this._valueInstant == null)?"<null>":this._valueInstant));
        sb.append(',');
        sb.append("valueInteger");
        sb.append('=');
        sb.append(((this.valueInteger == null)?"<null>":this.valueInteger));
        sb.append(',');
        sb.append("_valueInteger");
        sb.append('=');
        sb.append(((this._valueInteger == null)?"<null>":this._valueInteger));
        sb.append(',');
        sb.append("valueMarkdown");
        sb.append('=');
        sb.append(((this.valueMarkdown == null)?"<null>":this.valueMarkdown));
        sb.append(',');
        sb.append("_valueMarkdown");
        sb.append('=');
        sb.append(((this._valueMarkdown == null)?"<null>":this._valueMarkdown));
        sb.append(',');
        sb.append("valueOid");
        sb.append('=');
        sb.append(((this.valueOid == null)?"<null>":this.valueOid));
        sb.append(',');
        sb.append("_valueOid");
        sb.append('=');
        sb.append(((this._valueOid == null)?"<null>":this._valueOid));
        sb.append(',');
        sb.append("valuePositiveInt");
        sb.append('=');
        sb.append(((this.valuePositiveInt == null)?"<null>":this.valuePositiveInt));
        sb.append(',');
        sb.append("_valuePositiveInt");
        sb.append('=');
        sb.append(((this._valuePositiveInt == null)?"<null>":this._valuePositiveInt));
        sb.append(',');
        sb.append("valueString");
        sb.append('=');
        sb.append(((this.valueString == null)?"<null>":this.valueString));
        sb.append(',');
        sb.append("_valueString");
        sb.append('=');
        sb.append(((this._valueString == null)?"<null>":this._valueString));
        sb.append(',');
        sb.append("valueTime");
        sb.append('=');
        sb.append(((this.valueTime == null)?"<null>":this.valueTime));
        sb.append(',');
        sb.append("_valueTime");
        sb.append('=');
        sb.append(((this._valueTime == null)?"<null>":this._valueTime));
        sb.append(',');
        sb.append("valueUnsignedInt");
        sb.append('=');
        sb.append(((this.valueUnsignedInt == null)?"<null>":this.valueUnsignedInt));
        sb.append(',');
        sb.append("_valueUnsignedInt");
        sb.append('=');
        sb.append(((this._valueUnsignedInt == null)?"<null>":this._valueUnsignedInt));
        sb.append(',');
        sb.append("valueUri");
        sb.append('=');
        sb.append(((this.valueUri == null)?"<null>":this.valueUri));
        sb.append(',');
        sb.append("_valueUri");
        sb.append('=');
        sb.append(((this._valueUri == null)?"<null>":this._valueUri));
        sb.append(',');
        sb.append("valueUrl");
        sb.append('=');
        sb.append(((this.valueUrl == null)?"<null>":this.valueUrl));
        sb.append(',');
        sb.append("_valueUrl");
        sb.append('=');
        sb.append(((this._valueUrl == null)?"<null>":this._valueUrl));
        sb.append(',');
        sb.append("valueUuid");
        sb.append('=');
        sb.append(((this.valueUuid == null)?"<null>":this.valueUuid));
        sb.append(',');
        sb.append("_valueUuid");
        sb.append('=');
        sb.append(((this._valueUuid == null)?"<null>":this._valueUuid));
        sb.append(',');
        sb.append("valueAddress");
        sb.append('=');
        sb.append(((this.valueAddress == null)?"<null>":this.valueAddress));
        sb.append(',');
        sb.append("valueAge");
        sb.append('=');
        sb.append(((this.valueAge == null)?"<null>":this.valueAge));
        sb.append(',');
        sb.append("valueAnnotation");
        sb.append('=');
        sb.append(((this.valueAnnotation == null)?"<null>":this.valueAnnotation));
        sb.append(',');
        sb.append("valueAttachment");
        sb.append('=');
        sb.append(((this.valueAttachment == null)?"<null>":this.valueAttachment));
        sb.append(',');
        sb.append("valueCodeableConcept");
        sb.append('=');
        sb.append(((this.valueCodeableConcept == null)?"<null>":this.valueCodeableConcept));
        sb.append(',');
        sb.append("valueCoding");
        sb.append('=');
        sb.append(((this.valueCoding == null)?"<null>":this.valueCoding));
        sb.append(',');
        sb.append("valueContactPoint");
        sb.append('=');
        sb.append(((this.valueContactPoint == null)?"<null>":this.valueContactPoint));
        sb.append(',');
        sb.append("valueCount");
        sb.append('=');
        sb.append(((this.valueCount == null)?"<null>":this.valueCount));
        sb.append(',');
        sb.append("valueDistance");
        sb.append('=');
        sb.append(((this.valueDistance == null)?"<null>":this.valueDistance));
        sb.append(',');
        sb.append("valueDuration");
        sb.append('=');
        sb.append(((this.valueDuration == null)?"<null>":this.valueDuration));
        sb.append(',');
        sb.append("valueHumanName");
        sb.append('=');
        sb.append(((this.valueHumanName == null)?"<null>":this.valueHumanName));
        sb.append(',');
        sb.append("valueIdentifier");
        sb.append('=');
        sb.append(((this.valueIdentifier == null)?"<null>":this.valueIdentifier));
        sb.append(',');
        sb.append("valueMoney");
        sb.append('=');
        sb.append(((this.valueMoney == null)?"<null>":this.valueMoney));
        sb.append(',');
        sb.append("valuePeriod");
        sb.append('=');
        sb.append(((this.valuePeriod == null)?"<null>":this.valuePeriod));
        sb.append(',');
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueRange");
        sb.append('=');
        sb.append(((this.valueRange == null)?"<null>":this.valueRange));
        sb.append(',');
        sb.append("valueRatio");
        sb.append('=');
        sb.append(((this.valueRatio == null)?"<null>":this.valueRatio));
        sb.append(',');
        sb.append("valueReference");
        sb.append('=');
        sb.append(((this.valueReference == null)?"<null>":this.valueReference));
        sb.append(',');
        sb.append("valueSampledData");
        sb.append('=');
        sb.append(((this.valueSampledData == null)?"<null>":this.valueSampledData));
        sb.append(',');
        sb.append("valueSignature");
        sb.append('=');
        sb.append(((this.valueSignature == null)?"<null>":this.valueSignature));
        sb.append(',');
        sb.append("valueTiming");
        sb.append('=');
        sb.append(((this.valueTiming == null)?"<null>":this.valueTiming));
        sb.append(',');
        sb.append("valueContactDetail");
        sb.append('=');
        sb.append(((this.valueContactDetail == null)?"<null>":this.valueContactDetail));
        sb.append(',');
        sb.append("valueContributor");
        sb.append('=');
        sb.append(((this.valueContributor == null)?"<null>":this.valueContributor));
        sb.append(',');
        sb.append("valueDataRequirement");
        sb.append('=');
        sb.append(((this.valueDataRequirement == null)?"<null>":this.valueDataRequirement));
        sb.append(',');
        sb.append("valueExpression");
        sb.append('=');
        sb.append(((this.valueExpression == null)?"<null>":this.valueExpression));
        sb.append(',');
        sb.append("valueParameterDefinition");
        sb.append('=');
        sb.append(((this.valueParameterDefinition == null)?"<null>":this.valueParameterDefinition));
        sb.append(',');
        sb.append("valueRelatedArtifact");
        sb.append('=');
        sb.append(((this.valueRelatedArtifact == null)?"<null>":this.valueRelatedArtifact));
        sb.append(',');
        sb.append("valueTriggerDefinition");
        sb.append('=');
        sb.append(((this.valueTriggerDefinition == null)?"<null>":this.valueTriggerDefinition));
        sb.append(',');
        sb.append("valueUsageContext");
        sb.append('=');
        sb.append(((this.valueUsageContext == null)?"<null>":this.valueUsageContext));
        sb.append(',');
        sb.append("valueDosage");
        sb.append('=');
        sb.append(((this.valueDosage == null)?"<null>":this.valueDosage));
        sb.append(',');
        sb.append("valueMeta");
        sb.append('=');
        sb.append(((this.valueMeta == null)?"<null>":this.valueMeta));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this._valueBoolean == null)? 0 :this._valueBoolean.hashCode()));
        result = ((result* 31)+((this.valueTime == null)? 0 :this.valueTime.hashCode()));
        result = ((result* 31)+((this.valueTriggerDefinition == null)? 0 :this.valueTriggerDefinition.hashCode()));
        result = ((result* 31)+((this.valueMoney == null)? 0 :this.valueMoney.hashCode()));
        result = ((result* 31)+((this.valueSignature == null)? 0 :this.valueSignature.hashCode()));
        result = ((result* 31)+((this.valueUuid == null)? 0 :this.valueUuid.hashCode()));
        result = ((result* 31)+((this.valueRatio == null)? 0 :this.valueRatio.hashCode()));
        result = ((result* 31)+((this._valueDecimal == null)? 0 :this._valueDecimal.hashCode()));
        result = ((result* 31)+((this.valueParameterDefinition == null)? 0 :this.valueParameterDefinition.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.valueInteger == null)? 0 :this.valueInteger.hashCode()));
        result = ((result* 31)+((this.valueUnsignedInt == null)? 0 :this.valueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.valueQuantity == null)? 0 :this.valueQuantity.hashCode()));
        result = ((result* 31)+((this.valueCanonical == null)? 0 :this.valueCanonical.hashCode()));
        result = ((result* 31)+((this.valueCount == null)? 0 :this.valueCount.hashCode()));
        result = ((result* 31)+((this._valueMarkdown == null)? 0 :this._valueMarkdown.hashCode()));
        result = ((result* 31)+((this._valueString == null)? 0 :this._valueString.hashCode()));
        result = ((result* 31)+((this.valueId == null)? 0 :this.valueId.hashCode()));
        result = ((result* 31)+((this._valueInstant == null)? 0 :this._valueInstant.hashCode()));
        result = ((result* 31)+((this.valueCode == null)? 0 :this.valueCode.hashCode()));
        result = ((result* 31)+((this._valueCanonical == null)? 0 :this._valueCanonical.hashCode()));
        result = ((result* 31)+((this._valueOid == null)? 0 :this._valueOid.hashCode()));
        result = ((result* 31)+((this.valueAddress == null)? 0 :this.valueAddress.hashCode()));
        result = ((result* 31)+((this.valueContactPoint == null)? 0 :this.valueContactPoint.hashCode()));
        result = ((result* 31)+((this.valuePeriod == null)? 0 :this.valuePeriod.hashCode()));
        result = ((result* 31)+((this.valueSampledData == null)? 0 :this.valueSampledData.hashCode()));
        result = ((result* 31)+((this.valueTiming == null)? 0 :this.valueTiming.hashCode()));
        result = ((result* 31)+((this.valueInstant == null)? 0 :this.valueInstant.hashCode()));
        result = ((result* 31)+((this.valueAge == null)? 0 :this.valueAge.hashCode()));
        result = ((result* 31)+((this.valueDosage == null)? 0 :this.valueDosage.hashCode()));
        result = ((result* 31)+((this.valueBase64Binary == null)? 0 :this.valueBase64Binary.hashCode()));
        result = ((result* 31)+((this.valueBoolean == null)? 0 :this.valueBoolean.hashCode()));
        result = ((result* 31)+((this.valueCoding == null)? 0 :this.valueCoding.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._valueTime == null)? 0 :this._valueTime.hashCode()));
        result = ((result* 31)+((this.valueIdentifier == null)? 0 :this.valueIdentifier.hashCode()));
        result = ((result* 31)+((this.valueExpression == null)? 0 :this.valueExpression.hashCode()));
        result = ((result* 31)+((this.valueReference == null)? 0 :this.valueReference.hashCode()));
        result = ((result* 31)+((this.valueRange == null)? 0 :this.valueRange.hashCode()));
        result = ((result* 31)+((this.valueUri == null)? 0 :this.valueUri.hashCode()));
        result = ((result* 31)+((this._valueUrl == null)? 0 :this._valueUrl.hashCode()));
        result = ((result* 31)+((this.valueDistance == null)? 0 :this.valueDistance.hashCode()));
        result = ((result* 31)+((this.valueUrl == null)? 0 :this.valueUrl.hashCode()));
        result = ((result* 31)+((this._valueUri == null)? 0 :this._valueUri.hashCode()));
        result = ((result* 31)+((this.valueContactDetail == null)? 0 :this.valueContactDetail.hashCode()));
        result = ((result* 31)+((this.valueMeta == null)? 0 :this.valueMeta.hashCode()));
        result = ((result* 31)+((this._valueUuid == null)? 0 :this._valueUuid.hashCode()));
        result = ((result* 31)+((this.valueCodeableConcept == null)? 0 :this.valueCodeableConcept.hashCode()));
        result = ((result* 31)+((this.valueMarkdown == null)? 0 :this.valueMarkdown.hashCode()));
        result = ((result* 31)+((this.valueAttachment == null)? 0 :this.valueAttachment.hashCode()));
        result = ((result* 31)+((this.valueUsageContext == null)? 0 :this.valueUsageContext.hashCode()));
        result = ((result* 31)+((this._valueDate == null)? 0 :this._valueDate.hashCode()));
        result = ((result* 31)+((this.valueDateTime == null)? 0 :this.valueDateTime.hashCode()));
        result = ((result* 31)+((this._valueInteger == null)? 0 :this._valueInteger.hashCode()));
        result = ((result* 31)+((this.valueHumanName == null)? 0 :this.valueHumanName.hashCode()));
        result = ((result* 31)+((this.valueRelatedArtifact == null)? 0 :this.valueRelatedArtifact.hashCode()));
        result = ((result* 31)+((this._valueBase64Binary == null)? 0 :this._valueBase64Binary.hashCode()));
        result = ((result* 31)+((this.valueDecimal == null)? 0 :this.valueDecimal.hashCode()));
        result = ((result* 31)+((this._valueCode == null)? 0 :this._valueCode.hashCode()));
        result = ((result* 31)+((this.valueDate == null)? 0 :this.valueDate.hashCode()));
        result = ((result* 31)+((this.valueOid == null)? 0 :this.valueOid.hashCode()));
        result = ((result* 31)+((this._valuePositiveInt == null)? 0 :this._valuePositiveInt.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._valueDateTime == null)? 0 :this._valueDateTime.hashCode()));
        result = ((result* 31)+((this._valueId == null)? 0 :this._valueId.hashCode()));
        result = ((result* 31)+((this.valueContributor == null)? 0 :this.valueContributor.hashCode()));
        result = ((result* 31)+((this.valueString == null)? 0 :this.valueString.hashCode()));
        result = ((result* 31)+((this._valueUnsignedInt == null)? 0 :this._valueUnsignedInt.hashCode()));
        result = ((result* 31)+((this.valuePositiveInt == null)? 0 :this.valuePositiveInt.hashCode()));
        result = ((result* 31)+((this.valueDuration == null)? 0 :this.valueDuration.hashCode()));
        result = ((result* 31)+((this.valueDataRequirement == null)? 0 :this.valueDataRequirement.hashCode()));
        result = ((result* 31)+((this.valueAnnotation == null)? 0 :this.valueAnnotation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Extension) == false) {
            return false;
        }
        Extension rhs = ((Extension) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this._valueBoolean == rhs._valueBoolean)||((this._valueBoolean!= null)&&this._valueBoolean.equals(rhs._valueBoolean)))&&((this.valueTime == rhs.valueTime)||((this.valueTime!= null)&&this.valueTime.equals(rhs.valueTime))))&&((this.valueTriggerDefinition == rhs.valueTriggerDefinition)||((this.valueTriggerDefinition!= null)&&this.valueTriggerDefinition.equals(rhs.valueTriggerDefinition))))&&((this.valueMoney == rhs.valueMoney)||((this.valueMoney!= null)&&this.valueMoney.equals(rhs.valueMoney))))&&((this.valueSignature == rhs.valueSignature)||((this.valueSignature!= null)&&this.valueSignature.equals(rhs.valueSignature))))&&((this.valueUuid == rhs.valueUuid)||((this.valueUuid!= null)&&this.valueUuid.equals(rhs.valueUuid))))&&((this.valueRatio == rhs.valueRatio)||((this.valueRatio!= null)&&this.valueRatio.equals(rhs.valueRatio))))&&((this._valueDecimal == rhs._valueDecimal)||((this._valueDecimal!= null)&&this._valueDecimal.equals(rhs._valueDecimal))))&&((this.valueParameterDefinition == rhs.valueParameterDefinition)||((this.valueParameterDefinition!= null)&&this.valueParameterDefinition.equals(rhs.valueParameterDefinition))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.valueInteger == rhs.valueInteger)||((this.valueInteger!= null)&&this.valueInteger.equals(rhs.valueInteger))))&&((this.valueUnsignedInt == rhs.valueUnsignedInt)||((this.valueUnsignedInt!= null)&&this.valueUnsignedInt.equals(rhs.valueUnsignedInt))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))))&&((this.valueCanonical == rhs.valueCanonical)||((this.valueCanonical!= null)&&this.valueCanonical.equals(rhs.valueCanonical))))&&((this.valueCount == rhs.valueCount)||((this.valueCount!= null)&&this.valueCount.equals(rhs.valueCount))))&&((this._valueMarkdown == rhs._valueMarkdown)||((this._valueMarkdown!= null)&&this._valueMarkdown.equals(rhs._valueMarkdown))))&&((this._valueString == rhs._valueString)||((this._valueString!= null)&&this._valueString.equals(rhs._valueString))))&&((this.valueId == rhs.valueId)||((this.valueId!= null)&&this.valueId.equals(rhs.valueId))))&&((this._valueInstant == rhs._valueInstant)||((this._valueInstant!= null)&&this._valueInstant.equals(rhs._valueInstant))))&&((this.valueCode == rhs.valueCode)||((this.valueCode!= null)&&this.valueCode.equals(rhs.valueCode))))&&((this._valueCanonical == rhs._valueCanonical)||((this._valueCanonical!= null)&&this._valueCanonical.equals(rhs._valueCanonical))))&&((this._valueOid == rhs._valueOid)||((this._valueOid!= null)&&this._valueOid.equals(rhs._valueOid))))&&((this.valueAddress == rhs.valueAddress)||((this.valueAddress!= null)&&this.valueAddress.equals(rhs.valueAddress))))&&((this.valueContactPoint == rhs.valueContactPoint)||((this.valueContactPoint!= null)&&this.valueContactPoint.equals(rhs.valueContactPoint))))&&((this.valuePeriod == rhs.valuePeriod)||((this.valuePeriod!= null)&&this.valuePeriod.equals(rhs.valuePeriod))))&&((this.valueSampledData == rhs.valueSampledData)||((this.valueSampledData!= null)&&this.valueSampledData.equals(rhs.valueSampledData))))&&((this.valueTiming == rhs.valueTiming)||((this.valueTiming!= null)&&this.valueTiming.equals(rhs.valueTiming))))&&((this.valueInstant == rhs.valueInstant)||((this.valueInstant!= null)&&this.valueInstant.equals(rhs.valueInstant))))&&((this.valueAge == rhs.valueAge)||((this.valueAge!= null)&&this.valueAge.equals(rhs.valueAge))))&&((this.valueDosage == rhs.valueDosage)||((this.valueDosage!= null)&&this.valueDosage.equals(rhs.valueDosage))))&&((this.valueBase64Binary == rhs.valueBase64Binary)||((this.valueBase64Binary!= null)&&this.valueBase64Binary.equals(rhs.valueBase64Binary))))&&((this.valueBoolean == rhs.valueBoolean)||((this.valueBoolean!= null)&&this.valueBoolean.equals(rhs.valueBoolean))))&&((this.valueCoding == rhs.valueCoding)||((this.valueCoding!= null)&&this.valueCoding.equals(rhs.valueCoding))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this._valueTime == rhs._valueTime)||((this._valueTime!= null)&&this._valueTime.equals(rhs._valueTime))))&&((this.valueIdentifier == rhs.valueIdentifier)||((this.valueIdentifier!= null)&&this.valueIdentifier.equals(rhs.valueIdentifier))))&&((this.valueExpression == rhs.valueExpression)||((this.valueExpression!= null)&&this.valueExpression.equals(rhs.valueExpression))))&&((this.valueReference == rhs.valueReference)||((this.valueReference!= null)&&this.valueReference.equals(rhs.valueReference))))&&((this.valueRange == rhs.valueRange)||((this.valueRange!= null)&&this.valueRange.equals(rhs.valueRange))))&&((this.valueUri == rhs.valueUri)||((this.valueUri!= null)&&this.valueUri.equals(rhs.valueUri))))&&((this._valueUrl == rhs._valueUrl)||((this._valueUrl!= null)&&this._valueUrl.equals(rhs._valueUrl))))&&((this.valueDistance == rhs.valueDistance)||((this.valueDistance!= null)&&this.valueDistance.equals(rhs.valueDistance))))&&((this.valueUrl == rhs.valueUrl)||((this.valueUrl!= null)&&this.valueUrl.equals(rhs.valueUrl))))&&((this._valueUri == rhs._valueUri)||((this._valueUri!= null)&&this._valueUri.equals(rhs._valueUri))))&&((this.valueContactDetail == rhs.valueContactDetail)||((this.valueContactDetail!= null)&&this.valueContactDetail.equals(rhs.valueContactDetail))))&&((this.valueMeta == rhs.valueMeta)||((this.valueMeta!= null)&&this.valueMeta.equals(rhs.valueMeta))))&&((this._valueUuid == rhs._valueUuid)||((this._valueUuid!= null)&&this._valueUuid.equals(rhs._valueUuid))))&&((this.valueCodeableConcept == rhs.valueCodeableConcept)||((this.valueCodeableConcept!= null)&&this.valueCodeableConcept.equals(rhs.valueCodeableConcept))))&&((this.valueMarkdown == rhs.valueMarkdown)||((this.valueMarkdown!= null)&&this.valueMarkdown.equals(rhs.valueMarkdown))))&&((this.valueAttachment == rhs.valueAttachment)||((this.valueAttachment!= null)&&this.valueAttachment.equals(rhs.valueAttachment))))&&((this.valueUsageContext == rhs.valueUsageContext)||((this.valueUsageContext!= null)&&this.valueUsageContext.equals(rhs.valueUsageContext))))&&((this._valueDate == rhs._valueDate)||((this._valueDate!= null)&&this._valueDate.equals(rhs._valueDate))))&&((this.valueDateTime == rhs.valueDateTime)||((this.valueDateTime!= null)&&this.valueDateTime.equals(rhs.valueDateTime))))&&((this._valueInteger == rhs._valueInteger)||((this._valueInteger!= null)&&this._valueInteger.equals(rhs._valueInteger))))&&((this.valueHumanName == rhs.valueHumanName)||((this.valueHumanName!= null)&&this.valueHumanName.equals(rhs.valueHumanName))))&&((this.valueRelatedArtifact == rhs.valueRelatedArtifact)||((this.valueRelatedArtifact!= null)&&this.valueRelatedArtifact.equals(rhs.valueRelatedArtifact))))&&((this._valueBase64Binary == rhs._valueBase64Binary)||((this._valueBase64Binary!= null)&&this._valueBase64Binary.equals(rhs._valueBase64Binary))))&&((this.valueDecimal == rhs.valueDecimal)||((this.valueDecimal!= null)&&this.valueDecimal.equals(rhs.valueDecimal))))&&((this._valueCode == rhs._valueCode)||((this._valueCode!= null)&&this._valueCode.equals(rhs._valueCode))))&&((this.valueDate == rhs.valueDate)||((this.valueDate!= null)&&this.valueDate.equals(rhs.valueDate))))&&((this.valueOid == rhs.valueOid)||((this.valueOid!= null)&&this.valueOid.equals(rhs.valueOid))))&&((this._valuePositiveInt == rhs._valuePositiveInt)||((this._valuePositiveInt!= null)&&this._valuePositiveInt.equals(rhs._valuePositiveInt))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._valueDateTime == rhs._valueDateTime)||((this._valueDateTime!= null)&&this._valueDateTime.equals(rhs._valueDateTime))))&&((this._valueId == rhs._valueId)||((this._valueId!= null)&&this._valueId.equals(rhs._valueId))))&&((this.valueContributor == rhs.valueContributor)||((this.valueContributor!= null)&&this.valueContributor.equals(rhs.valueContributor))))&&((this.valueString == rhs.valueString)||((this.valueString!= null)&&this.valueString.equals(rhs.valueString))))&&((this._valueUnsignedInt == rhs._valueUnsignedInt)||((this._valueUnsignedInt!= null)&&this._valueUnsignedInt.equals(rhs._valueUnsignedInt))))&&((this.valuePositiveInt == rhs.valuePositiveInt)||((this.valuePositiveInt!= null)&&this.valuePositiveInt.equals(rhs.valuePositiveInt))))&&((this.valueDuration == rhs.valueDuration)||((this.valueDuration!= null)&&this.valueDuration.equals(rhs.valueDuration))))&&((this.valueDataRequirement == rhs.valueDataRequirement)||((this.valueDataRequirement!= null)&&this.valueDataRequirement.equals(rhs.valueDataRequirement))))&&((this.valueAnnotation == rhs.valueAnnotation)||((this.valueAnnotation!= null)&&this.valueAnnotation.equals(rhs.valueAnnotation))));
    }

}
