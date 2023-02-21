
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
 * A human's name with the ability to identify parts and usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "use",
    "_use",
    "text",
    "_text",
    "family",
    "_family",
    "given",
    "_given",
    "prefix",
    "_prefix",
    "suffix",
    "_suffix",
    "period"
})
@Generated("jsonschema2pojo")
public class HumanName {

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
     * Identifies the purpose for this name.
     * 
     */
    @JsonProperty("use")
    @JsonPropertyDescription("Identifies the purpose for this name.")
    private HumanName.Use use;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_use")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _use;
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("family")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String family;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_family")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _family;
    /**
     * Given name.
     * 
     */
    @JsonProperty("given")
    @JsonPropertyDescription("Given name.")
    private List<String> given = new ArrayList<String>();
    /**
     * Extensions for given
     * 
     */
    @JsonProperty("_given")
    @JsonPropertyDescription("Extensions for given")
    private List<Element> _given = new ArrayList<Element>();
    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.")
    private List<String> prefix = new ArrayList<String>();
    /**
     * Extensions for prefix
     * 
     */
    @JsonProperty("_prefix")
    @JsonPropertyDescription("Extensions for prefix")
    private List<Element> _prefix = new ArrayList<Element>();
    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.")
    private List<String> suffix = new ArrayList<String>();
    /**
     * Extensions for suffix
     * 
     */
    @JsonProperty("_suffix")
    @JsonPropertyDescription("Extensions for suffix")
    private List<Element> _suffix = new ArrayList<Element>();
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
     * Identifies the purpose for this name.
     * 
     */
    @JsonProperty("use")
    public HumanName.Use getUse() {
        return use;
    }

    /**
     * Identifies the purpose for this name.
     * 
     */
    @JsonProperty("use")
    public void setUse(HumanName.Use use) {
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
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_family")
    public Element get_family() {
        return _family;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_family")
    public void set_family(Element _family) {
        this._family = _family;
    }

    /**
     * Given name.
     * 
     */
    @JsonProperty("given")
    public List<String> getGiven() {
        return given;
    }

    /**
     * Given name.
     * 
     */
    @JsonProperty("given")
    public void setGiven(List<String> given) {
        this.given = given;
    }

    /**
     * Extensions for given
     * 
     */
    @JsonProperty("_given")
    public List<Element> get_given() {
        return _given;
    }

    /**
     * Extensions for given
     * 
     */
    @JsonProperty("_given")
    public void set_given(List<Element> _given) {
        this._given = _given;
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
     * 
     */
    @JsonProperty("prefix")
    public List<String> getPrefix() {
        return prefix;
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(List<String> prefix) {
        this.prefix = prefix;
    }

    /**
     * Extensions for prefix
     * 
     */
    @JsonProperty("_prefix")
    public List<Element> get_prefix() {
        return _prefix;
    }

    /**
     * Extensions for prefix
     * 
     */
    @JsonProperty("_prefix")
    public void set_prefix(List<Element> _prefix) {
        this._prefix = _prefix;
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
     * 
     */
    @JsonProperty("suffix")
    public List<String> getSuffix() {
        return suffix;
    }

    /**
     * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(List<String> suffix) {
        this.suffix = suffix;
    }

    /**
     * Extensions for suffix
     * 
     */
    @JsonProperty("_suffix")
    public List<Element> get_suffix() {
        return _suffix;
    }

    /**
     * Extensions for suffix
     * 
     */
    @JsonProperty("_suffix")
    public void set_suffix(List<Element> _suffix) {
        this._suffix = _suffix;
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
        sb.append(HumanName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("family");
        sb.append('=');
        sb.append(((this.family == null)?"<null>":this.family));
        sb.append(',');
        sb.append("_family");
        sb.append('=');
        sb.append(((this._family == null)?"<null>":this._family));
        sb.append(',');
        sb.append("given");
        sb.append('=');
        sb.append(((this.given == null)?"<null>":this.given));
        sb.append(',');
        sb.append("_given");
        sb.append('=');
        sb.append(((this._given == null)?"<null>":this._given));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("_prefix");
        sb.append('=');
        sb.append(((this._prefix == null)?"<null>":this._prefix));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("_suffix");
        sb.append('=');
        sb.append(((this._suffix == null)?"<null>":this._suffix));
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
        result = ((result* 31)+((this.given == null)? 0 :this.given.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._use == null)? 0 :this._use.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this._given == null)? 0 :this._given.hashCode()));
        result = ((result* 31)+((this._family == null)? 0 :this._family.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        result = ((result* 31)+((this._prefix == null)? 0 :this._prefix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this.family == null)? 0 :this.family.hashCode()));
        result = ((result* 31)+((this._suffix == null)? 0 :this._suffix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HumanName) == false) {
            return false;
        }
        HumanName rhs = ((HumanName) other);
        return ((((((((((((((((this.given == rhs.given)||((this.given!= null)&&this.given.equals(rhs.given)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._use == rhs._use)||((this._use!= null)&&this._use.equals(rhs._use))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this._given == rhs._given)||((this._given!= null)&&this._given.equals(rhs._given))))&&((this._family == rhs._family)||((this._family!= null)&&this._family.equals(rhs._family))))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))))&&((this._prefix == rhs._prefix)||((this._prefix!= null)&&this._prefix.equals(rhs._prefix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this.family == rhs.family)||((this.family!= null)&&this.family.equals(rhs.family))))&&((this._suffix == rhs._suffix)||((this._suffix!= null)&&this._suffix.equals(rhs._suffix))));
    }


    /**
     * Identifies the purpose for this name.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Use {

        USUAL("usual"),
        OFFICIAL("official"),
        TEMP("temp"),
        NICKNAME("nickname"),
        ANONYMOUS("anonymous"),
        OLD("old"),
        MAIDEN("maiden");
        private final String value;
        private final static Map<String, HumanName.Use> CONSTANTS = new HashMap<String, HumanName.Use>();

        static {
            for (HumanName.Use c: values()) {
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
        public static HumanName.Use fromValue(String value) {
            HumanName.Use constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
