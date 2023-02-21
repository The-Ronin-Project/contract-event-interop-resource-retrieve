
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * For referring to data content defined in other formats.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "contentType",
    "_contentType",
    "language",
    "_language",
    "data",
    "_data",
    "url",
    "_url",
    "size",
    "_size",
    "hash",
    "_hash",
    "title",
    "_title",
    "creation",
    "_creation"
})
@Generated("jsonschema2pojo")
public class Attachment {

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String contentType;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _contentType;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String language;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _language;
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
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double size;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_size")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _size;
    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("hash")
    @JsonPropertyDescription("A stream of bytes")
    private String hash;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hash")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _hash;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String title;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _title;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("creation")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String creation;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_creation")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _creation;

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
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public Element get_contentType() {
        return _contentType;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_contentType")
    public void set_contentType(Element _contentType) {
        this._contentType = _contentType;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public Element get_language() {
        return _language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public void set_language(Element _language) {
        this._language = _language;
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
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("size")
    public Double getSize() {
        return size;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("size")
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_size")
    public Element get_size() {
        return _size;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_size")
    public void set_size(Element _size) {
        this._size = _size;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * A stream of bytes
     * 
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hash")
    public Element get_hash() {
        return _hash;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_hash")
    public void set_hash(Element _hash) {
        this._hash = _hash;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public Element get_title() {
        return _title;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_title")
    public void set_title(Element _title) {
        this._title = _title;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("creation")
    public String getCreation() {
        return creation;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("creation")
    public void setCreation(String creation) {
        this.creation = creation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_creation")
    public Element get_creation() {
        return _creation;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_creation")
    public void set_creation(Element _creation) {
        this._creation = _creation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attachment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("_contentType");
        sb.append('=');
        sb.append(((this._contentType == null)?"<null>":this._contentType));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("_language");
        sb.append('=');
        sb.append(((this._language == null)?"<null>":this._language));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("_data");
        sb.append('=');
        sb.append(((this._data == null)?"<null>":this._data));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("_url");
        sb.append('=');
        sb.append(((this._url == null)?"<null>":this._url));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("_size");
        sb.append('=');
        sb.append(((this._size == null)?"<null>":this._size));
        sb.append(',');
        sb.append("hash");
        sb.append('=');
        sb.append(((this.hash == null)?"<null>":this.hash));
        sb.append(',');
        sb.append("_hash");
        sb.append('=');
        sb.append(((this._hash == null)?"<null>":this._hash));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("_title");
        sb.append('=');
        sb.append(((this._title == null)?"<null>":this._title));
        sb.append(',');
        sb.append("creation");
        sb.append('=');
        sb.append(((this.creation == null)?"<null>":this.creation));
        sb.append(',');
        sb.append("_creation");
        sb.append('=');
        sb.append(((this._creation == null)?"<null>":this._creation));
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
        result = ((result* 31)+((this._language == null)? 0 :this._language.hashCode()));
        result = ((result* 31)+((this._data == null)? 0 :this._data.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this._hash == null)? 0 :this._hash.hashCode()));
        result = ((result* 31)+((this._title == null)? 0 :this._title.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._contentType == null)? 0 :this._contentType.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this._size == null)? 0 :this._size.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this._creation == null)? 0 :this._creation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._url == null)? 0 :this._url.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.hash == null)? 0 :this.hash.hashCode()));
        result = ((result* 31)+((this.creation == null)? 0 :this.creation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attachment) == false) {
            return false;
        }
        Attachment rhs = ((Attachment) other);
        return (((((((((((((((((((this._language == rhs._language)||((this._language!= null)&&this._language.equals(rhs._language)))&&((this._data == rhs._data)||((this._data!= null)&&this._data.equals(rhs._data))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this._hash == rhs._hash)||((this._hash!= null)&&this._hash.equals(rhs._hash))))&&((this._title == rhs._title)||((this._title!= null)&&this._title.equals(rhs._title))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._contentType == rhs._contentType)||((this._contentType!= null)&&this._contentType.equals(rhs._contentType))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this._size == rhs._size)||((this._size!= null)&&this._size.equals(rhs._size))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this._creation == rhs._creation)||((this._creation!= null)&&this._creation.equals(rhs._creation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._url == rhs._url)||((this._url!= null)&&this._url.equals(rhs._url))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.hash == rhs.hash)||((this.hash!= null)&&this.hash.equals(rhs.hash))))&&((this.creation == rhs.creation)||((this.creation!= null)&&this.creation.equals(rhs.creation))));
    }

}
