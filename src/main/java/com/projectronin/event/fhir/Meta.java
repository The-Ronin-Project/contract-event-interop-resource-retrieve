
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "versionId",
    "_versionId",
    "lastUpdated",
    "_lastUpdated",
    "source",
    "_source",
    "profile",
    "security",
    "tag"
})
@Generated("jsonschema2pojo")
public class Meta {

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("versionId")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String versionId;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionId")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _versionId;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastUpdated")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String lastUpdated;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lastUpdated;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String source;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _source;
    /**
     * A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].")
    private List<String> profile = new ArrayList<String>();
    /**
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
     * 
     */
    @JsonProperty("security")
    @JsonPropertyDescription("Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.")
    private List<Coding> security = new ArrayList<Coding>();
    /**
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
     * 
     */
    @JsonProperty("tag")
    @JsonPropertyDescription("Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.")
    private List<Coding> tag = new ArrayList<Coding>();

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
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("versionId")
    public String getVersionId() {
        return versionId;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("versionId")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionId")
    public Element get_versionId() {
        return _versionId;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_versionId")
    public void set_versionId(Element _versionId) {
        this._versionId = _versionId;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    public Element get_lastUpdated() {
        return _lastUpdated;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lastUpdated")
    public void set_lastUpdated(Element _lastUpdated) {
        this._lastUpdated = _lastUpdated;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    public Element get_source() {
        return _source;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_source")
    public void set_source(Element _source) {
        this._source = _source;
    }

    /**
     * A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
     * 
     */
    @JsonProperty("profile")
    public List<String> getProfile() {
        return profile;
    }

    /**
     * A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
     * 
     */
    @JsonProperty("profile")
    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    /**
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
     * 
     */
    @JsonProperty("security")
    public List<Coding> getSecurity() {
        return security;
    }

    /**
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
     * 
     */
    @JsonProperty("security")
    public void setSecurity(List<Coding> security) {
        this.security = security;
    }

    /**
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
     * 
     */
    @JsonProperty("tag")
    public List<Coding> getTag() {
        return tag;
    }

    /**
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
     * 
     */
    @JsonProperty("tag")
    public void setTag(List<Coding> tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Meta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("versionId");
        sb.append('=');
        sb.append(((this.versionId == null)?"<null>":this.versionId));
        sb.append(',');
        sb.append("_versionId");
        sb.append('=');
        sb.append(((this._versionId == null)?"<null>":this._versionId));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("_lastUpdated");
        sb.append('=');
        sb.append(((this._lastUpdated == null)?"<null>":this._lastUpdated));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("_source");
        sb.append('=');
        sb.append(((this._source == null)?"<null>":this._source));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
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
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.versionId == null)? 0 :this.versionId.hashCode()));
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this._versionId == null)? 0 :this._versionId.hashCode()));
        result = ((result* 31)+((this._lastUpdated == null)? 0 :this._lastUpdated.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this._source == null)? 0 :this._source.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return ((((((((((((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.versionId == rhs.versionId)||((this.versionId!= null)&&this.versionId.equals(rhs.versionId))))&&((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security))))&&((this._versionId == rhs._versionId)||((this._versionId!= null)&&this._versionId.equals(rhs._versionId))))&&((this._lastUpdated == rhs._lastUpdated)||((this._lastUpdated!= null)&&this._lastUpdated.equals(rhs._lastUpdated))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this._source == rhs._source)||((this._source!= null)&&this._source.equals(rhs._source))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))));
    }

}
