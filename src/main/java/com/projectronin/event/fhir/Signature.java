
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "type",
    "when",
    "_when",
    "who",
    "onBehalfOf",
    "targetFormat",
    "_targetFormat",
    "sigFormat",
    "_sigFormat",
    "data",
    "_data"
})
@Generated("jsonschema2pojo")
public class Signature {

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
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.")
    private List<Coding> type = new ArrayList<Coding>();
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("when")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String when;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_when")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _when;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("who")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference who;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference onBehalfOf;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("targetFormat")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String targetFormat;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetFormat")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _targetFormat;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("sigFormat")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String sigFormat;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sigFormat")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sigFormat;
    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("A stream of bytes")
    private String data;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _data;

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
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public List<Coding> getType() {
        return type;
    }

    /**
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(List<Coding> type) {
        this.type = type;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("when")
    public String getWhen() {
        return when;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("when")
    public void setWhen(String when) {
        this.when = when;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_when")
    public Element get_when() {
        return _when;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_when")
    public void set_when(Element _when) {
        this._when = _when;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("who")
    public Reference getWho() {
        return who;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("who")
    public void setWho(Reference who) {
        this.who = who;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    public Reference getOnBehalfOf() {
        return onBehalfOf;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Reference onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("targetFormat")
    public String getTargetFormat() {
        return targetFormat;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("targetFormat")
    public void setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetFormat")
    public Element get_targetFormat() {
        return _targetFormat;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_targetFormat")
    public void set_targetFormat(Element _targetFormat) {
        this._targetFormat = _targetFormat;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("sigFormat")
    public String getSigFormat() {
        return sigFormat;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("sigFormat")
    public void setSigFormat(String sigFormat) {
        this.sigFormat = sigFormat;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sigFormat")
    public Element get_sigFormat() {
        return _sigFormat;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sigFormat")
    public void set_sigFormat(Element _sigFormat) {
        this._sigFormat = _sigFormat;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    public Element get_data() {
        return _data;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_data")
    public void set_data(Element _data) {
        this._data = _data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Signature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("_when");
        sb.append('=');
        sb.append(((this._when == null)?"<null>":this._when));
        sb.append(',');
        sb.append("who");
        sb.append('=');
        sb.append(((this.who == null)?"<null>":this.who));
        sb.append(',');
        sb.append("onBehalfOf");
        sb.append('=');
        sb.append(((this.onBehalfOf == null)?"<null>":this.onBehalfOf));
        sb.append(',');
        sb.append("targetFormat");
        sb.append('=');
        sb.append(((this.targetFormat == null)?"<null>":this.targetFormat));
        sb.append(',');
        sb.append("_targetFormat");
        sb.append('=');
        sb.append(((this._targetFormat == null)?"<null>":this._targetFormat));
        sb.append(',');
        sb.append("sigFormat");
        sb.append('=');
        sb.append(((this.sigFormat == null)?"<null>":this.sigFormat));
        sb.append(',');
        sb.append("_sigFormat");
        sb.append('=');
        sb.append(((this._sigFormat == null)?"<null>":this._sigFormat));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("_data");
        sb.append('=');
        sb.append(((this._data == null)?"<null>":this._data));
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
        result = ((result* 31)+((this._data == null)? 0 :this._data.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.onBehalfOf == null)? 0 :this.onBehalfOf.hashCode()));
        result = ((result* 31)+((this.sigFormat == null)? 0 :this.sigFormat.hashCode()));
        result = ((result* 31)+((this._sigFormat == null)? 0 :this._sigFormat.hashCode()));
        result = ((result* 31)+((this._when == null)? 0 :this._when.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this._targetFormat == null)? 0 :this._targetFormat.hashCode()));
        result = ((result* 31)+((this.targetFormat == null)? 0 :this.targetFormat.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.who == null)? 0 :this.who.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Signature) == false) {
            return false;
        }
        Signature rhs = ((Signature) other);
        return ((((((((((((((this._data == rhs._data)||((this._data!= null)&&this._data.equals(rhs._data)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.onBehalfOf == rhs.onBehalfOf)||((this.onBehalfOf!= null)&&this.onBehalfOf.equals(rhs.onBehalfOf))))&&((this.sigFormat == rhs.sigFormat)||((this.sigFormat!= null)&&this.sigFormat.equals(rhs.sigFormat))))&&((this._sigFormat == rhs._sigFormat)||((this._sigFormat!= null)&&this._sigFormat.equals(rhs._sigFormat))))&&((this._when == rhs._when)||((this._when!= null)&&this._when.equals(rhs._when))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this._targetFormat == rhs._targetFormat)||((this._targetFormat!= null)&&this._targetFormat.equals(rhs._targetFormat))))&&((this.targetFormat == rhs.targetFormat)||((this.targetFormat!= null)&&this.targetFormat.equals(rhs.targetFormat))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.who == rhs.who)||((this.who!= null)&&this.who.equals(rhs.who))));
    }

}
