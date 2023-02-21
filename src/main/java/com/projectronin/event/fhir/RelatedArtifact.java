
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "type",
    "_type",
    "label",
    "_label",
    "display",
    "_display",
    "citation",
    "_citation",
    "url",
    "_url",
    "document",
    "resource"
})
@Generated("jsonschema2pojo")
public class RelatedArtifact {

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
     * The type of relationship to the related artifact.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of relationship to the related artifact.")
    private RelatedArtifact.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String label;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _label;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String display;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _display;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("citation")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String citation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_citation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _citation;
    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A URI that is a literal reference")
    private String url;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_url")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _url;
    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("document")
    @JsonPropertyDescription("For referring to data content defined in other formats.")
    private Attachment document;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String resource;

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
     * The type of relationship to the related artifact.
     * 
     */
    @JsonProperty("type")
    public RelatedArtifact.Type getType() {
        return type;
    }

    /**
     * The type of relationship to the related artifact.
     * 
     */
    @JsonProperty("type")
    public void setType(RelatedArtifact.Type type) {
        this.type = type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public Element get_type() {
        return _type;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    public void set_type(Element _type) {
        this._type = _type;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public Element get_label() {
        return _label;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_label")
    public void set_label(Element _label) {
        this._label = _label;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    public Element get_display() {
        return _display;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_display")
    public void set_display(Element _display) {
        this._display = _display;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("citation")
    public String getCitation() {
        return citation;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("citation")
    public void setCitation(String citation) {
        this.citation = citation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_citation")
    public Element get_citation() {
        return _citation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_citation")
    public void set_citation(Element _citation) {
        this._citation = _citation;
    }

    /**
     * A URI that is a literal reference
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * A URI that is a literal reference
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
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("document")
    public Attachment getDocument() {
        return document;
    }

    /**
     * For referring to data content defined in other formats.
     * 
     */
    @JsonProperty("document")
    public void setDocument(Attachment document) {
        this.document = document;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelatedArtifact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("_label");
        sb.append('=');
        sb.append(((this._label == null)?"<null>":this._label));
        sb.append(',');
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
        sb.append(',');
        sb.append("_display");
        sb.append('=');
        sb.append(((this._display == null)?"<null>":this._display));
        sb.append(',');
        sb.append("citation");
        sb.append('=');
        sb.append(((this.citation == null)?"<null>":this.citation));
        sb.append(',');
        sb.append("_citation");
        sb.append('=');
        sb.append(((this._citation == null)?"<null>":this._citation));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("document");
        sb.append('=');
        sb.append(((this.document == null)?"<null>":this.document));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
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
        result = ((result* 31)+((this._citation == null)? 0 :this._citation.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.citation == null)? 0 :this.citation.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.display == null)? 0 :this.display.hashCode()));
        result = ((result* 31)+((this.document == null)? 0 :this.document.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._label == null)? 0 :this._label.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._display == null)? 0 :this._display.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedArtifact) == false) {
            return false;
        }
        RelatedArtifact rhs = ((RelatedArtifact) other);
        return (((((((((((((((this._citation == rhs._citation)||((this._citation!= null)&&this._citation.equals(rhs._citation)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.citation == rhs.citation)||((this.citation!= null)&&this.citation.equals(rhs.citation))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.display == rhs.display)||((this.display!= null)&&this.display.equals(rhs.display))))&&((this.document == rhs.document)||((this.document!= null)&&this.document.equals(rhs.document))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._label == rhs._label)||((this._label!= null)&&this._label.equals(rhs._label))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._display == rhs._display)||((this._display!= null)&&this._display.equals(rhs._display))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))));
    }


    /**
     * The type of relationship to the related artifact.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        DOCUMENTATION("documentation"),
        JUSTIFICATION("justification"),
        CITATION("citation"),
        PREDECESSOR("predecessor"),
        SUCCESSOR("successor"),
        DERIVED_FROM("derived-from"),
        DEPENDS_ON("depends-on"),
        COMPOSED_OF("composed-of");
        private final String value;
        private final static Map<String, RelatedArtifact.Type> CONSTANTS = new HashMap<String, RelatedArtifact.Type>();

        static {
            for (RelatedArtifact.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static RelatedArtifact.Type fromValue(String value) {
            RelatedArtifact.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
