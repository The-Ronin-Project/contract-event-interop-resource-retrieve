
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
 * A container for a collection of resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "method",
    "_method",
    "url",
    "_url",
    "ifNoneMatch",
    "_ifNoneMatch",
    "ifModifiedSince",
    "_ifModifiedSince",
    "ifMatch",
    "_ifMatch",
    "ifNoneExist",
    "_ifNoneExist"
})
@Generated("jsonschema2pojo")
public class Bundle_Request {

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
     * In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.")
    private Bundle_Request.Method method;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _method;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneMatch")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String ifNoneMatch;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneMatch")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _ifNoneMatch;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("ifModifiedSince")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String ifModifiedSince;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifModifiedSince")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _ifModifiedSince;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifMatch")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String ifMatch;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifMatch")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _ifMatch;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneExist")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String ifNoneExist;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneExist")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _ifNoneExist;

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
     * In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
     * 
     */
    @JsonProperty("method")
    public Bundle_Request.Method getMethod() {
        return method;
    }

    /**
     * In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
     * 
     */
    @JsonProperty("method")
    public void setMethod(Bundle_Request.Method method) {
        this.method = method;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    public Element get_method() {
        return _method;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_method")
    public void set_method(Element _method) {
        this._method = _method;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneMatch")
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneMatch")
    public void setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneMatch")
    public Element get_ifNoneMatch() {
        return _ifNoneMatch;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneMatch")
    public void set_ifNoneMatch(Element _ifNoneMatch) {
        this._ifNoneMatch = _ifNoneMatch;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("ifModifiedSince")
    public String getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("ifModifiedSince")
    public void setIfModifiedSince(String ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifModifiedSince")
    public Element get_ifModifiedSince() {
        return _ifModifiedSince;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifModifiedSince")
    public void set_ifModifiedSince(Element _ifModifiedSince) {
        this._ifModifiedSince = _ifModifiedSince;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifMatch")
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifMatch")
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifMatch")
    public Element get_ifMatch() {
        return _ifMatch;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifMatch")
    public void set_ifMatch(Element _ifMatch) {
        this._ifMatch = _ifMatch;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneExist")
    public String getIfNoneExist() {
        return ifNoneExist;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("ifNoneExist")
    public void setIfNoneExist(String ifNoneExist) {
        this.ifNoneExist = ifNoneExist;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneExist")
    public Element get_ifNoneExist() {
        return _ifNoneExist;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_ifNoneExist")
    public void set_ifNoneExist(Element _ifNoneExist) {
        this._ifNoneExist = _ifNoneExist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle_Request.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("_method");
        sb.append('=');
        sb.append(((this._method == null)?"<null>":this._method));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("ifNoneMatch");
        sb.append('=');
        sb.append(((this.ifNoneMatch == null)?"<null>":this.ifNoneMatch));
        sb.append(',');
        sb.append("_ifNoneMatch");
        sb.append('=');
        sb.append(((this._ifNoneMatch == null)?"<null>":this._ifNoneMatch));
        sb.append(',');
        sb.append("ifModifiedSince");
        sb.append('=');
        sb.append(((this.ifModifiedSince == null)?"<null>":this.ifModifiedSince));
        sb.append(',');
        sb.append("_ifModifiedSince");
        sb.append('=');
        sb.append(((this._ifModifiedSince == null)?"<null>":this._ifModifiedSince));
        sb.append(',');
        sb.append("ifMatch");
        sb.append('=');
        sb.append(((this.ifMatch == null)?"<null>":this.ifMatch));
        sb.append(',');
        sb.append("_ifMatch");
        sb.append('=');
        sb.append(((this._ifMatch == null)?"<null>":this._ifMatch));
        sb.append(',');
        sb.append("ifNoneExist");
        sb.append('=');
        sb.append(((this.ifNoneExist == null)?"<null>":this.ifNoneExist));
        sb.append(',');
        sb.append("_ifNoneExist");
        sb.append('=');
        sb.append(((this._ifNoneExist == null)?"<null>":this._ifNoneExist));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._ifNoneExist == null)? 0 :this._ifNoneExist.hashCode()));
        result = ((result* 31)+((this.ifModifiedSince == null)? 0 :this.ifModifiedSince.hashCode()));
        result = ((result* 31)+((this._ifModifiedSince == null)? 0 :this._ifModifiedSince.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.ifNoneMatch == null)? 0 :this.ifNoneMatch.hashCode()));
        result = ((result* 31)+((this.ifMatch == null)? 0 :this.ifMatch.hashCode()));
        result = ((result* 31)+((this._method == null)? 0 :this._method.hashCode()));
        result = ((result* 31)+((this.ifNoneExist == null)? 0 :this.ifNoneExist.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._ifNoneMatch == null)? 0 :this._ifNoneMatch.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this._ifMatch == null)? 0 :this._ifMatch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle_Request) == false) {
            return false;
        }
        Bundle_Request rhs = ((Bundle_Request) other);
        return ((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._ifNoneExist == rhs._ifNoneExist)||((this._ifNoneExist!= null)&&this._ifNoneExist.equals(rhs._ifNoneExist))))&&((this.ifModifiedSince == rhs.ifModifiedSince)||((this.ifModifiedSince!= null)&&this.ifModifiedSince.equals(rhs.ifModifiedSince))))&&((this._ifModifiedSince == rhs._ifModifiedSince)||((this._ifModifiedSince!= null)&&this._ifModifiedSince.equals(rhs._ifModifiedSince))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.ifNoneMatch == rhs.ifNoneMatch)||((this.ifNoneMatch!= null)&&this.ifNoneMatch.equals(rhs.ifNoneMatch))))&&((this.ifMatch == rhs.ifMatch)||((this.ifMatch!= null)&&this.ifMatch.equals(rhs.ifMatch))))&&((this._method == rhs._method)||((this._method!= null)&&this._method.equals(rhs._method))))&&((this.ifNoneExist == rhs.ifNoneExist)||((this.ifNoneExist!= null)&&this.ifNoneExist.equals(rhs.ifNoneExist))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._ifNoneMatch == rhs._ifNoneMatch)||((this._ifNoneMatch!= null)&&this._ifNoneMatch.equals(rhs._ifNoneMatch))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this._ifMatch == rhs._ifMatch)||((this._ifMatch!= null)&&this._ifMatch.equals(rhs._ifMatch))));
    }


    /**
     * In a transaction or batch, this is the HTTP action to be executed for this entry. In a history bundle, this indicates the HTTP action that occurred.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Method {

        GET("GET"),
        HEAD("HEAD"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE"),
        PATCH("PATCH");
        private final String value;
        private final static Map<String, Bundle_Request.Method> CONSTANTS = new HashMap<String, Bundle_Request.Method>();

        static {
            for (Bundle_Request.Method c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Method(String value) {
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
        public static Bundle_Request.Method fromValue(String value) {
            Bundle_Request.Method constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
