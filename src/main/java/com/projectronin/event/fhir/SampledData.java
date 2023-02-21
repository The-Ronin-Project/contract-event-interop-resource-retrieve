
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "origin",
    "period",
    "_period",
    "factor",
    "_factor",
    "lowerLimit",
    "_lowerLimit",
    "upperLimit",
    "_upperLimit",
    "dimensions",
    "_dimensions",
    "data",
    "_data"
})
@Generated("jsonschema2pojo")
public class SampledData {

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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity origin;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double period;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_period")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _period;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double factor;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _factor;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("lowerLimit")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double lowerLimit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lowerLimit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _lowerLimit;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("upperLimit")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double upperLimit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_upperLimit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _upperLimit;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("dimensions")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double dimensions;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dimensions")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _dimensions;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("A sequence of Unicode characters")
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
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("origin")
    public Quantity getOrigin() {
        return origin;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * (Required)
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(Quantity origin) {
        this.origin = origin;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("period")
    public Double getPeriod() {
        return period;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Double period) {
        this.period = period;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_period")
    public Element get_period() {
        return _period;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_period")
    public void set_period(Element _period) {
        this._period = _period;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public Element get_factor() {
        return _factor;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_factor")
    public void set_factor(Element _factor) {
        this._factor = _factor;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("lowerLimit")
    public Double getLowerLimit() {
        return lowerLimit;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("lowerLimit")
    public void setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lowerLimit")
    public Element get_lowerLimit() {
        return _lowerLimit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_lowerLimit")
    public void set_lowerLimit(Element _lowerLimit) {
        this._lowerLimit = _lowerLimit;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("upperLimit")
    public Double getUpperLimit() {
        return upperLimit;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("upperLimit")
    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_upperLimit")
    public Element get_upperLimit() {
        return _upperLimit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_upperLimit")
    public void set_upperLimit(Element _upperLimit) {
        this._upperLimit = _upperLimit;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("dimensions")
    public Double getDimensions() {
        return dimensions;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("dimensions")
    public void setDimensions(Double dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dimensions")
    public Element get_dimensions() {
        return _dimensions;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_dimensions")
    public void set_dimensions(Element _dimensions) {
        this._dimensions = _dimensions;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * A sequence of Unicode characters
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
        sb.append(SampledData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("_period");
        sb.append('=');
        sb.append(((this._period == null)?"<null>":this._period));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("_factor");
        sb.append('=');
        sb.append(((this._factor == null)?"<null>":this._factor));
        sb.append(',');
        sb.append("lowerLimit");
        sb.append('=');
        sb.append(((this.lowerLimit == null)?"<null>":this.lowerLimit));
        sb.append(',');
        sb.append("_lowerLimit");
        sb.append('=');
        sb.append(((this._lowerLimit == null)?"<null>":this._lowerLimit));
        sb.append(',');
        sb.append("upperLimit");
        sb.append('=');
        sb.append(((this.upperLimit == null)?"<null>":this.upperLimit));
        sb.append(',');
        sb.append("_upperLimit");
        sb.append('=');
        sb.append(((this._upperLimit == null)?"<null>":this._upperLimit));
        sb.append(',');
        sb.append("dimensions");
        sb.append('=');
        sb.append(((this.dimensions == null)?"<null>":this.dimensions));
        sb.append(',');
        sb.append("_dimensions");
        sb.append('=');
        sb.append(((this._dimensions == null)?"<null>":this._dimensions));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this._lowerLimit == null)? 0 :this._lowerLimit.hashCode()));
        result = ((result* 31)+((this.lowerLimit == null)? 0 :this.lowerLimit.hashCode()));
        result = ((result* 31)+((this._factor == null)? 0 :this._factor.hashCode()));
        result = ((result* 31)+((this._period == null)? 0 :this._period.hashCode()));
        result = ((result* 31)+((this._upperLimit == null)? 0 :this._upperLimit.hashCode()));
        result = ((result* 31)+((this.upperLimit == null)? 0 :this.upperLimit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this._dimensions == null)? 0 :this._dimensions.hashCode()));
        result = ((result* 31)+((this.dimensions == null)? 0 :this.dimensions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SampledData) == false) {
            return false;
        }
        SampledData rhs = ((SampledData) other);
        return ((((((((((((((((this._data == rhs._data)||((this._data!= null)&&this._data.equals(rhs._data)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this._lowerLimit == rhs._lowerLimit)||((this._lowerLimit!= null)&&this._lowerLimit.equals(rhs._lowerLimit))))&&((this.lowerLimit == rhs.lowerLimit)||((this.lowerLimit!= null)&&this.lowerLimit.equals(rhs.lowerLimit))))&&((this._factor == rhs._factor)||((this._factor!= null)&&this._factor.equals(rhs._factor))))&&((this._period == rhs._period)||((this._period!= null)&&this._period.equals(rhs._period))))&&((this._upperLimit == rhs._upperLimit)||((this._upperLimit!= null)&&this._upperLimit.equals(rhs._upperLimit))))&&((this.upperLimit == rhs.upperLimit)||((this.upperLimit!= null)&&this.upperLimit.equals(rhs.upperLimit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this._dimensions == rhs._dimensions)||((this._dimensions!= null)&&this._dimensions.equals(rhs._dimensions))))&&((this.dimensions == rhs.dimensions)||((this.dimensions!= null)&&this.dimensions.equals(rhs.dimensions))));
    }

}
