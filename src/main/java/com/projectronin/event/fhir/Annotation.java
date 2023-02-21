
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A  text note which also  contains information about who made the statement and when.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "authorReference",
    "authorString",
    "_authorString",
    "time",
    "_time",
    "text",
    "_text"
})
@Generated("jsonschema2pojo")
public class Annotation {

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authorReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference authorReference;
    /**
     * The individual responsible for making the annotation.
     * 
     */
    @JsonProperty("authorString")
    @JsonPropertyDescription("The individual responsible for making the annotation.")
    private String authorString;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorString")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _authorString;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("time")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String time;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_time")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _time;
    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine")
    private String text;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _text;

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
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authorReference")
    public Reference getAuthorReference() {
        return authorReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("authorReference")
    public void setAuthorReference(Reference authorReference) {
        this.authorReference = authorReference;
    }

    /**
     * The individual responsible for making the annotation.
     * 
     */
    @JsonProperty("authorString")
    public String getAuthorString() {
        return authorString;
    }

    /**
     * The individual responsible for making the annotation.
     * 
     */
    @JsonProperty("authorString")
    public void setAuthorString(String authorString) {
        this.authorString = authorString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorString")
    public Element get_authorString() {
        return _authorString;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_authorString")
    public void set_authorString(Element _authorString) {
        this._authorString = _authorString;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_time")
    public Element get_time() {
        return _time;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_time")
    public void set_time(Element _time) {
        this._time = _time;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public Element get_text() {
        return _text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public void set_text(Element _text) {
        this._text = _text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Annotation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("authorReference");
        sb.append('=');
        sb.append(((this.authorReference == null)?"<null>":this.authorReference));
        sb.append(',');
        sb.append("authorString");
        sb.append('=');
        sb.append(((this.authorString == null)?"<null>":this.authorString));
        sb.append(',');
        sb.append("_authorString");
        sb.append('=');
        sb.append(((this._authorString == null)?"<null>":this._authorString));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("_time");
        sb.append('=');
        sb.append(((this._time == null)?"<null>":this._time));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
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
        result = ((result* 31)+((this.authorString == null)? 0 :this.authorString.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.authorReference == null)? 0 :this.authorReference.hashCode()));
        result = ((result* 31)+((this._authorString == null)? 0 :this._authorString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this._time == null)? 0 :this._time.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotation) == false) {
            return false;
        }
        Annotation rhs = ((Annotation) other);
        return ((((((((((this.authorString == rhs.authorString)||((this.authorString!= null)&&this.authorString.equals(rhs.authorString)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.authorReference == rhs.authorReference)||((this.authorReference!= null)&&this.authorReference.equals(rhs.authorReference))))&&((this._authorString == rhs._authorString)||((this._authorString!= null)&&this._authorString.equals(rhs._authorString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this._time == rhs._time)||((this._time!= null)&&this._time.equals(rhs._time))));
    }

}
