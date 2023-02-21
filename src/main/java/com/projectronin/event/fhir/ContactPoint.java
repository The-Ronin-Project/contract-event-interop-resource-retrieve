
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
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "system",
    "_system",
    "value",
    "_value",
    "use",
    "_use",
    "rank",
    "_rank",
    "period"
})
@Generated("jsonschema2pojo")
public class ContactPoint {

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
     * Telecommunications form for contact point - what communications system is required to make use of the contact.
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("Telecommunications form for contact point - what communications system is required to make use of the contact.")
    private ContactPoint.System system;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_system")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _system;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String value;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_value")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _value;
    /**
     * Identifies the purpose for the contact point.
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("Identifies the purpose for the contact point.")
    private ContactPoint.Use use;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _use;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("rank")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double rank;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rank")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _rank;
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
     * Telecommunications form for contact point - what communications system is required to make use of the contact.
     * 
     */
    @JsonProperty("system")
    public ContactPoint.System getSystem() {
        return system;
    }

    /**
     * Telecommunications form for contact point - what communications system is required to make use of the contact.
     * 
     */
    @JsonProperty("system")
    public void setSystem(ContactPoint.System system) {
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
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
     * Identifies the purpose for the contact point.
     * 
     */
    @JsonProperty("use")
    public ContactPoint.Use getUse() {
        return use;
    }

    /**
     * Identifies the purpose for the contact point.
     * 
     */
    @JsonProperty("use")
    public void setUse(ContactPoint.Use use) {
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
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("rank")
    public Double getRank() {
        return rank;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("rank")
    public void setRank(Double rank) {
        this.rank = rank;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rank")
    public Element get_rank() {
        return _rank;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_rank")
    public void set_rank(Element _rank) {
        this._rank = _rank;
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
        sb.append(ContactPoint.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("_system");
        sb.append('=');
        sb.append(((this._system == null)?"<null>":this._system));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("_value");
        sb.append('=');
        sb.append(((this._value == null)?"<null>":this._value));
        sb.append(',');
        sb.append("use");
        sb.append('=');
        sb.append(((this.use == null)?"<null>":this.use));
        sb.append(',');
        sb.append("_use");
        sb.append('=');
        sb.append(((this._use == null)?"<null>":this._use));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("_rank");
        sb.append('=');
        sb.append(((this._rank == null)?"<null>":this._rank));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this._system == null)? 0 :this._system.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this._value == null)? 0 :this._value.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._rank == null)? 0 :this._rank.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactPoint) == false) {
            return false;
        }
        ContactPoint rhs = ((ContactPoint) other);
        return ((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this._system == rhs._system)||((this._system!= null)&&this._system.equals(rhs._system))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this._value == rhs._value)||((this._value!= null)&&this._value.equals(rhs._value))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._rank == rhs._rank)||((this._rank!= null)&&this._rank.equals(rhs._rank))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * Telecommunications form for contact point - what communications system is required to make use of the contact.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum System {

        PHONE("phone"),
        FAX("fax"),
        EMAIL("email"),
        PAGER("pager"),
        URL("url"),
        SMS("sms"),
        OTHER("other");
        private final String value;
        private final static Map<String, ContactPoint.System> CONSTANTS = new HashMap<String, ContactPoint.System>();

        static {
            for (ContactPoint.System c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        System(String value) {
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
        public static ContactPoint.System fromValue(String value) {
            ContactPoint.System constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Identifies the purpose for the contact point.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Use {

        HOME("home"),
        WORK("work"),
        TEMP("temp"),
        OLD("old"),
        MOBILE("mobile");
        private final String value;
        private final static Map<String, ContactPoint.Use> CONSTANTS = new HashMap<String, ContactPoint.Use>();

        static {
            for (ContactPoint.Use c: values()) {
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
        public static ContactPoint.Use fromValue(String value) {
            ContactPoint.Use constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
