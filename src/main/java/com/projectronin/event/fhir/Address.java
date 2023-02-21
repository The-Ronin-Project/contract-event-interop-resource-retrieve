
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
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "use",
    "_use",
    "type",
    "_type",
    "text",
    "_text",
    "line",
    "_line",
    "city",
    "_city",
    "district",
    "_district",
    "state",
    "_state",
    "postalCode",
    "_postalCode",
    "country",
    "_country",
    "period"
})
@Generated("jsonschema2pojo")
public class Address {

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
     * The purpose of this address.
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("The purpose of this address.")
    private Address.Use use;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _use;
    /**
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.")
    private Address.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String text;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _text;
    /**
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.")
    private List<String> line = new ArrayList<String>();
    /**
     * Extensions for line
     * 
     */
    @JsonProperty("_line")
    @JsonPropertyDescription("Extensions for line")
    private List<Element> _line = new ArrayList<Element>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String city;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_city")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _city;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("district")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String district;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_district")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _district;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String state;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_state")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _state;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String postalCode;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_postalCode")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _postalCode;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String country;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_country")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _country;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period period;

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
     * The purpose of this address.
     * 
     */
    @JsonProperty("use")
    public Address.Use getUse() {
        return use;
    }

    /**
     * The purpose of this address.
     * 
     */
    @JsonProperty("use")
    public void setUse(Address.Use use) {
        this.use = use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public Element get_use() {
        return _use;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    public void set_use(Element _use) {
        this._use = _use;
    }

    /**
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     * 
     */
    @JsonProperty("type")
    public Address.Type getType() {
        return type;
    }

    /**
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     * 
     */
    @JsonProperty("type")
    public void setType(Address.Type type) {
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public Element get_text() {
        return _text;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_text")
    public void set_text(Element _text) {
        this._text = _text;
    }

    /**
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
     * 
     */
    @JsonProperty("line")
    public List<String> getLine() {
        return line;
    }

    /**
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
     * 
     */
    @JsonProperty("line")
    public void setLine(List<String> line) {
        this.line = line;
    }

    /**
     * Extensions for line
     * 
     */
    @JsonProperty("_line")
    public List<Element> get_line() {
        return _line;
    }

    /**
     * Extensions for line
     * 
     */
    @JsonProperty("_line")
    public void set_line(List<Element> _line) {
        this._line = _line;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_city")
    public Element get_city() {
        return _city;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_city")
    public void set_city(Element _city) {
        this._city = _city;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_district")
    public Element get_district() {
        return _district;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_district")
    public void set_district(Element _district) {
        this._district = _district;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_state")
    public Element get_state() {
        return _state;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_state")
    public void set_state(Element _state) {
        this._state = _state;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_postalCode")
    public Element get_postalCode() {
        return _postalCode;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_postalCode")
    public void set_postalCode(Element _postalCode) {
        this._postalCode = _postalCode;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_country")
    public Element get_country() {
        return _country;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_country")
    public void set_country(Element _country) {
        this._country = _country;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("use");
        sb.append('=');
        sb.append(((this.use == null)?"<null>":this.use));
        sb.append(',');
        sb.append("_use");
        sb.append('=');
        sb.append(((this._use == null)?"<null>":this._use));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("_line");
        sb.append('=');
        sb.append(((this._line == null)?"<null>":this._line));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("_city");
        sb.append('=');
        sb.append(((this._city == null)?"<null>":this._city));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("_district");
        sb.append('=');
        sb.append(((this._district == null)?"<null>":this._district));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("_state");
        sb.append('=');
        sb.append(((this._state == null)?"<null>":this._state));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("_postalCode");
        sb.append('=');
        sb.append(((this._postalCode == null)?"<null>":this._postalCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("_country");
        sb.append('=');
        sb.append(((this._country == null)?"<null>":this._country));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._city == null)? 0 :this._city.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this._postalCode == null)? 0 :this._postalCode.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this._country == null)? 0 :this._country.hashCode()));
        result = ((result* 31)+((this._district == null)? 0 :this._district.hashCode()));
        result = ((result* 31)+((this._state == null)? 0 :this._state.hashCode()));
        result = ((result* 31)+((this.district == null)? 0 :this.district.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this._line == null)? 0 :this._line.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return ((((((((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._city == rhs._city)||((this._city!= null)&&this._city.equals(rhs._city))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this._postalCode == rhs._postalCode)||((this._postalCode!= null)&&this._postalCode.equals(rhs._postalCode))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this._country == rhs._country)||((this._country!= null)&&this._country.equals(rhs._country))))&&((this._district == rhs._district)||((this._district!= null)&&this._district.equals(rhs._district))))&&((this._state == rhs._state)||((this._state!= null)&&this._state.equals(rhs._state))))&&((this.district == rhs.district)||((this.district!= null)&&this.district.equals(rhs.district))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this._line == rhs._line)||((this._line!= null)&&this._line.equals(rhs._line))));
    }


    /**
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        POSTAL("postal"),
        PHYSICAL("physical"),
        BOTH("both");
        private final String value;
        private final static Map<String, Address.Type> CONSTANTS = new HashMap<String, Address.Type>();

        static {
            for (Address.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Address.Type fromValue(String value) {
            Address.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The purpose of this address.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Use {

        HOME("home"),
        WORK("work"),
        TEMP("temp"),
        OLD("old"),
        BILLING("billing");
        private final String value;
        private final static Map<String, Address.Use> CONSTANTS = new HashMap<String, Address.Use>();

        static {
            for (Address.Use c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Use(String value) {
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
        public static Address.Use fromValue(String value) {
            Address.Use constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
