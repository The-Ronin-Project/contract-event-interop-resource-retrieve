
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "path",
    "_path",
    "searchParam",
    "_searchParam",
    "valueSet",
    "code"
})
@Generated("jsonschema2pojo")
public class DataRequirement_CodeFilter {

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
    @JsonProperty("path")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String path;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _path;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("searchParam")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String searchParam;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchParam")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _searchParam;
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    @JsonPropertyDescription("A URI that is a reference to a canonical URL on a FHIR resource")
    private String valueSet;
    /**
     * The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes.")
    private List<Coding> code = new ArrayList<Coding>();

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
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public Element get_path() {
        return _path;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_path")
    public void set_path(Element _path) {
        this._path = _path;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("searchParam")
    public String getSearchParam() {
        return searchParam;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("searchParam")
    public void setSearchParam(String searchParam) {
        this.searchParam = searchParam;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchParam")
    public Element get_searchParam() {
        return _searchParam;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_searchParam")
    public void set_searchParam(Element _searchParam) {
        this._searchParam = _searchParam;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    public String getValueSet() {
        return valueSet;
    }

    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     * 
     */
    @JsonProperty("valueSet")
    public void setValueSet(String valueSet) {
        this.valueSet = valueSet;
    }

    /**
     * The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes.
     * 
     */
    @JsonProperty("code")
    public List<Coding> getCode() {
        return code;
    }

    /**
     * The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes.
     * 
     */
    @JsonProperty("code")
    public void setCode(List<Coding> code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataRequirement_CodeFilter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("_path");
        sb.append('=');
        sb.append(((this._path == null)?"<null>":this._path));
        sb.append(',');
        sb.append("searchParam");
        sb.append('=');
        sb.append(((this.searchParam == null)?"<null>":this.searchParam));
        sb.append(',');
        sb.append("_searchParam");
        sb.append('=');
        sb.append(((this._searchParam == null)?"<null>":this._searchParam));
        sb.append(',');
        sb.append("valueSet");
        sb.append('=');
        sb.append(((this.valueSet == null)?"<null>":this.valueSet));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.valueSet == null)? 0 :this.valueSet.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.searchParam == null)? 0 :this.searchParam.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._searchParam == null)? 0 :this._searchParam.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._path == null)? 0 :this._path.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataRequirement_CodeFilter) == false) {
            return false;
        }
        DataRequirement_CodeFilter rhs = ((DataRequirement_CodeFilter) other);
        return ((((((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.valueSet == rhs.valueSet)||((this.valueSet!= null)&&this.valueSet.equals(rhs.valueSet))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.searchParam == rhs.searchParam)||((this.searchParam!= null)&&this.searchParam.equals(rhs.searchParam))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._searchParam == rhs._searchParam)||((this._searchParam!= null)&&this._searchParam.equals(rhs._searchParam))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._path == rhs._path)||((this._path!= null)&&this._path.equals(rhs._path))));
    }

}
