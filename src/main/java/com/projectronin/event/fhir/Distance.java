
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
 * A length - a value with a unit that is a physical distance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "value",
    "_value",
    "comparator",
    "_comparator",
    "unit",
    "_unit",
    "system",
    "_system",
    "code",
    "_code"
})
@Generated("jsonschema2pojo")
public class Distance {

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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double value;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _value;
    /**
     * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is &quot;&lt;&quot; , then the real value is &lt; stated value.
     * 
     */
    @JsonProperty("comparator")
    @JsonPropertyDescription("How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value.")
    private Distance.Comparator comparator;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comparator")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _comparator;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String unit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_unit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _unit;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String system;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _system;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String code;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _code;

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
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public Element get_value() {
        return _value;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    public void set_value(Element _value) {
        this._value = _value;
    }

    /**
     * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is &quot;&lt;&quot; , then the real value is &lt; stated value.
     * 
     */
    @JsonProperty("comparator")
    public Distance.Comparator getComparator() {
        return comparator;
    }

    /**
     * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is &quot;&lt;&quot; , then the real value is &lt; stated value.
     * 
     */
    @JsonProperty("comparator")
    public void setComparator(Distance.Comparator comparator) {
        this.comparator = comparator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comparator")
    public Element get_comparator() {
        return _comparator;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_comparator")
    public void set_comparator(Element _comparator) {
        this._comparator = _comparator;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_unit")
    public Element get_unit() {
        return _unit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_unit")
    public void set_unit(Element _unit) {
        this._unit = _unit;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public Element get_system() {
        return _system;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    public void set_system(Element _system) {
        this._system = _system;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public Element get_code() {
        return _code;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_code")
    public void set_code(Element _code) {
        this._code = _code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Distance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
        sb.append(',');
        sb.append("comparator");
        sb.append('=');
        sb.append(((this.comparator == null)?"<null>":this.comparator));
        sb.append(',');
        sb.append("_comparator");
        sb.append('=');
        sb.append(((this._comparator == null)?"<null>":this._comparator));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("_unit");
        sb.append('=');
        sb.append(((this._unit == null)?"<null>":this._unit));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("_system");
        sb.append('=');
        sb.append(((this._system == null)?"<null>":this._system));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("_code");
        sb.append('=');
        sb.append(((this._code == null)?"<null>":this._code));
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
        result = ((result* 31)+((this._comparator == null)? 0 :this._comparator.hashCode()));
        result = ((result* 31)+((this.comparator == null)? 0 :this.comparator.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this._unit == null)? 0 :this._unit.hashCode()));
        result = ((result* 31)+((this._system == null)? 0 :this._system.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this._code == null)? 0 :this._code.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distance) == false) {
            return false;
        }
        Distance rhs = ((Distance) other);
        return (((((((((((((this._comparator == rhs._comparator)||((this._comparator!= null)&&this._comparator.equals(rhs._comparator)))&&((this.comparator == rhs.comparator)||((this.comparator!= null)&&this.comparator.equals(rhs.comparator))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this._unit == rhs._unit)||((this._unit!= null)&&this._unit.equals(rhs._unit))))&&((this._system == rhs._system)||((this._system!= null)&&this._system.equals(rhs._system))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this._code == rhs._code)||((this._code!= null)&&this._code.equals(rhs._code))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is &quot;&lt;&quot; , then the real value is &lt; stated value.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Comparator {

        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        GREATER_THAN_OR_EQUAL(">="),
        GREATER_THAN(">");
        private final String value;
        private final static Map<String, Distance.Comparator> CONSTANTS = new HashMap<String, Distance.Comparator>();

        static {
            for (Distance.Comparator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Comparator(String value) {
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
        public static Distance.Comparator fromValue(String value) {
            Distance.Comparator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
