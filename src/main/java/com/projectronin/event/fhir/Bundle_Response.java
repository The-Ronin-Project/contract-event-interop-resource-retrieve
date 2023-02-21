
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A container for a collection of resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "status",
    "_status",
    "location",
    "_location",
    "etag",
    "_etag",
    "lastModified",
    "_lastModified",
    "outcome"
})
@Generated("jsonschema2pojo")
public class Bundle_Response {

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
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    @JsonPropertyDescription("May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
    private List<Extension> modifierExtension = new ArrayList<Extension>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String location;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_location")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _location;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("etag")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String etag;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_etag")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _etag;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastModified")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String lastModified;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastModified;
    @JsonProperty("outcome")
    private Object outcome;

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
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public List<Extension> getModifierExtension() {
        return modifierExtension;
    }

    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
     * 
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * 
     */
    @JsonProperty("modifierExtension")
    public void setModifierExtension(List<Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_location")
    public Element get_location() {
        return _location;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_location")
    public void set_location(Element _location) {
        this._location = _location;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_etag")
    public Element get_etag() {
        return _etag;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_etag")
    public void set_etag(Element _etag) {
        this._etag = _etag;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    public Element get_lastModified() {
        return _lastModified;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastModified")
    public void set_lastModified(Element _lastModified) {
        this._lastModified = _lastModified;
    }

    @JsonProperty("outcome")
    public Object getOutcome() {
        return outcome;
    }

    @JsonProperty("outcome")
    public void setOutcome(Object outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle_Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("modifierExtension");
        sb.append('=');
        sb.append(((this.modifierExtension == null)?"<null>":this.modifierExtension));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("_location");
        sb.append('=');
        sb.append(((this._location == null)?"<null>":this._location));
        sb.append(',');
        sb.append("etag");
        sb.append('=');
        sb.append(((this.etag == null)?"<null>":this.etag));
        sb.append(',');
        sb.append("_etag");
        sb.append('=');
        sb.append(((this._etag == null)?"<null>":this._etag));
        sb.append(',');
        sb.append("lastModified");
        sb.append('=');
        sb.append(((this.lastModified == null)?"<null>":this.lastModified));
        sb.append(',');
        sb.append("_lastModified");
        sb.append('=');
        sb.append(((this._lastModified == null)?"<null>":this._lastModified));
        sb.append(',');
        sb.append("outcome");
        sb.append('=');
        sb.append(((this.outcome == null)?"<null>":this.outcome));
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
        result = ((result* 31)+((this._location == null)? 0 :this._location.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.etag == null)? 0 :this.etag.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lastModified == null)? 0 :this.lastModified.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._lastModified == null)? 0 :this._lastModified.hashCode()));
        result = ((result* 31)+((this._etag == null)? 0 :this._etag.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle_Response) == false) {
            return false;
        }
        Bundle_Response rhs = ((Bundle_Response) other);
        return (((((((((((((this._location == rhs._location)||((this._location!= null)&&this._location.equals(rhs._location)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.etag == rhs.etag)||((this.etag!= null)&&this.etag.equals(rhs.etag))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lastModified == rhs.lastModified)||((this.lastModified!= null)&&this.lastModified.equals(rhs.lastModified))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._lastModified == rhs._lastModified)||((this._lastModified!= null)&&this._lastModified.equals(rhs._lastModified))))&&((this._etag == rhs._etag)||((this._etag!= null)&&this._etag.equals(rhs._etag))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
