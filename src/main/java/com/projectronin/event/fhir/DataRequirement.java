
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
    "type",
    "_type",
    "profile",
    "subjectCodeableConcept",
    "subjectReference",
    "mustSupport",
    "_mustSupport",
    "codeFilter",
    "dateFilter",
    "limit",
    "_limit",
    "sort"
})
@Generated("jsonschema2pojo")
public class DataRequirement {

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
    @JsonProperty("type")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * The profile of the required data, specified as the uri of the profile definition.
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("The profile of the required data, specified as the uri of the profile definition.")
    private List<String> profile = new ArrayList<String>();
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept subjectCodeableConcept;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference subjectReference;
    /**
     * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. 
     * 
     * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     * 
     */
    @JsonProperty("mustSupport")
    @JsonPropertyDescription("Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. \n\nThe value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).")
    private List<String> mustSupport = new ArrayList<String>();
    /**
     * Extensions for mustSupport
     * 
     */
    @JsonProperty("_mustSupport")
    @JsonPropertyDescription("Extensions for mustSupport")
    private List<Element> _mustSupport = new ArrayList<Element>();
    /**
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("codeFilter")
    @JsonPropertyDescription("Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.")
    private List<DataRequirement_CodeFilter> codeFilter = new ArrayList<DataRequirement_CodeFilter>();
    /**
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("dateFilter")
    @JsonPropertyDescription("Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.")
    private List<DataRequirement_DateFilter> dateFilter = new ArrayList<DataRequirement_DateFilter>();
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double limit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_limit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _limit;
    /**
     * Specifies the order of the results to be returned.
     * 
     */
    @JsonProperty("sort")
    @JsonPropertyDescription("Specifies the order of the results to be returned.")
    private List<DataRequirement_Sort> sort = new ArrayList<DataRequirement_Sort>();

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
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
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
     * The profile of the required data, specified as the uri of the profile definition.
     * 
     */
    @JsonProperty("profile")
    public List<String> getProfile() {
        return profile;
    }

    /**
     * The profile of the required data, specified as the uri of the profile definition.
     * 
     */
    @JsonProperty("profile")
    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public CodeableConcept getSubjectCodeableConcept() {
        return subjectCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
        this.subjectCodeableConcept = subjectCodeableConcept;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public Reference getSubjectReference() {
        return subjectReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("subjectReference")
    public void setSubjectReference(Reference subjectReference) {
        this.subjectReference = subjectReference;
    }

    /**
     * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. 
     * 
     * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     * 
     */
    @JsonProperty("mustSupport")
    public List<String> getMustSupport() {
        return mustSupport;
    }

    /**
     * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. 
     * 
     * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     * 
     */
    @JsonProperty("mustSupport")
    public void setMustSupport(List<String> mustSupport) {
        this.mustSupport = mustSupport;
    }

    /**
     * Extensions for mustSupport
     * 
     */
    @JsonProperty("_mustSupport")
    public List<Element> get_mustSupport() {
        return _mustSupport;
    }

    /**
     * Extensions for mustSupport
     * 
     */
    @JsonProperty("_mustSupport")
    public void set_mustSupport(List<Element> _mustSupport) {
        this._mustSupport = _mustSupport;
    }

    /**
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("codeFilter")
    public List<DataRequirement_CodeFilter> getCodeFilter() {
        return codeFilter;
    }

    /**
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("codeFilter")
    public void setCodeFilter(List<DataRequirement_CodeFilter> codeFilter) {
        this.codeFilter = codeFilter;
    }

    /**
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("dateFilter")
    public List<DataRequirement_DateFilter> getDateFilter() {
        return dateFilter;
    }

    /**
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
     * 
     */
    @JsonProperty("dateFilter")
    public void setDateFilter(List<DataRequirement_DateFilter> dateFilter) {
        this.dateFilter = dateFilter;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("limit")
    public Double getLimit() {
        return limit;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_limit")
    public Element get_limit() {
        return _limit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_limit")
    public void set_limit(Element _limit) {
        this._limit = _limit;
    }

    /**
     * Specifies the order of the results to be returned.
     * 
     */
    @JsonProperty("sort")
    public List<DataRequirement_Sort> getSort() {
        return sort;
    }

    /**
     * Specifies the order of the results to be returned.
     * 
     */
    @JsonProperty("sort")
    public void setSort(List<DataRequirement_Sort> sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataRequirement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("subjectCodeableConcept");
        sb.append('=');
        sb.append(((this.subjectCodeableConcept == null)?"<null>":this.subjectCodeableConcept));
        sb.append(',');
        sb.append("subjectReference");
        sb.append('=');
        sb.append(((this.subjectReference == null)?"<null>":this.subjectReference));
        sb.append(',');
        sb.append("mustSupport");
        sb.append('=');
        sb.append(((this.mustSupport == null)?"<null>":this.mustSupport));
        sb.append(',');
        sb.append("_mustSupport");
        sb.append('=');
        sb.append(((this._mustSupport == null)?"<null>":this._mustSupport));
        sb.append(',');
        sb.append("codeFilter");
        sb.append('=');
        sb.append(((this.codeFilter == null)?"<null>":this.codeFilter));
        sb.append(',');
        sb.append("dateFilter");
        sb.append('=');
        sb.append(((this.dateFilter == null)?"<null>":this.dateFilter));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
        sb.append(',');
        sb.append("_limit");
        sb.append('=');
        sb.append(((this._limit == null)?"<null>":this._limit));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
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
        result = ((result* 31)+((this._limit == null)? 0 :this._limit.hashCode()));
        result = ((result* 31)+((this.subjectCodeableConcept == null)? 0 :this.subjectCodeableConcept.hashCode()));
        result = ((result* 31)+((this.mustSupport == null)? 0 :this.mustSupport.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._mustSupport == null)? 0 :this._mustSupport.hashCode()));
        result = ((result* 31)+((this.sort == null)? 0 :this.sort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.subjectReference == null)? 0 :this.subjectReference.hashCode()));
        result = ((result* 31)+((this.codeFilter == null)? 0 :this.codeFilter.hashCode()));
        result = ((result* 31)+((this.dateFilter == null)? 0 :this.dateFilter.hashCode()));
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataRequirement) == false) {
            return false;
        }
        DataRequirement rhs = ((DataRequirement) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._limit == rhs._limit)||((this._limit!= null)&&this._limit.equals(rhs._limit))))&&((this.subjectCodeableConcept == rhs.subjectCodeableConcept)||((this.subjectCodeableConcept!= null)&&this.subjectCodeableConcept.equals(rhs.subjectCodeableConcept))))&&((this.mustSupport == rhs.mustSupport)||((this.mustSupport!= null)&&this.mustSupport.equals(rhs.mustSupport))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._mustSupport == rhs._mustSupport)||((this._mustSupport!= null)&&this._mustSupport.equals(rhs._mustSupport))))&&((this.sort == rhs.sort)||((this.sort!= null)&&this.sort.equals(rhs.sort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.subjectReference == rhs.subjectReference)||((this.subjectReference!= null)&&this.subjectReference.equals(rhs.subjectReference))))&&((this.codeFilter == rhs.codeFilter)||((this.codeFilter!= null)&&this.codeFilter.equals(rhs.codeFilter))))&&((this.dateFilter == rhs.dateFilter)||((this.dateFilter!= null)&&this.dateFilter.equals(rhs.dateFilter))))&&((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
