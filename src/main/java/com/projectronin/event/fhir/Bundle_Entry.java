
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
    "link",
    "fullUrl",
    "_fullUrl",
    "resource",
    "search",
    "request",
    "response"
})
@Generated("jsonschema2pojo")
public class Bundle_Entry {

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
     * A series of links that provide context to this entry.
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("A series of links that provide context to this entry.")
    private List<Bundle_Link> link = new ArrayList<Bundle_Link>();
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("fullUrl")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String fullUrl;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fullUrl")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _fullUrl;
    @JsonProperty("resource")
    private Object resource;
    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("search")
    @JsonPropertyDescription("A container for a collection of resources.")
    private Bundle_Search search;
    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A container for a collection of resources.")
    private Bundle_Request request;
    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("A container for a collection of resources.")
    private Bundle_Response response;

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
     * A series of links that provide context to this entry.
     * 
     */
    @JsonProperty("link")
    public List<Bundle_Link> getLink() {
        return link;
    }

    /**
     * A series of links that provide context to this entry.
     * 
     */
    @JsonProperty("link")
    public void setLink(List<Bundle_Link> link) {
        this.link = link;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("fullUrl")
    public String getFullUrl() {
        return fullUrl;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("fullUrl")
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fullUrl")
    public Element get_fullUrl() {
        return _fullUrl;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_fullUrl")
    public void set_fullUrl(Element _fullUrl) {
        this._fullUrl = _fullUrl;
    }

    @JsonProperty("resource")
    public Object getResource() {
        return resource;
    }

    @JsonProperty("resource")
    public void setResource(Object resource) {
        this.resource = resource;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("search")
    public Bundle_Search getSearch() {
        return search;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("search")
    public void setSearch(Bundle_Search search) {
        this.search = search;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("request")
    public Bundle_Request getRequest() {
        return request;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Bundle_Request request) {
        this.request = request;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("response")
    public Bundle_Response getResponse() {
        return response;
    }

    /**
     * A container for a collection of resources.
     * 
     */
    @JsonProperty("response")
    public void setResponse(Bundle_Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle_Entry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("fullUrl");
        sb.append('=');
        sb.append(((this.fullUrl == null)?"<null>":this.fullUrl));
        sb.append(',');
        sb.append("_fullUrl");
        sb.append('=');
        sb.append(((this._fullUrl == null)?"<null>":this._fullUrl));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("search");
        sb.append('=');
        sb.append(((this.search == null)?"<null>":this.search));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.search == null)? 0 :this.search.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.fullUrl == null)? 0 :this.fullUrl.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._fullUrl == null)? 0 :this._fullUrl.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle_Entry) == false) {
            return false;
        }
        Bundle_Entry rhs = ((Bundle_Entry) other);
        return (((((((((((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.search == rhs.search)||((this.search!= null)&&this.search.equals(rhs.search))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.fullUrl == rhs.fullUrl)||((this.fullUrl!= null)&&this.fullUrl.equals(rhs.fullUrl))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._fullUrl == rhs._fullUrl)||((this._fullUrl!= null)&&this._fullUrl.equals(rhs._fullUrl))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
