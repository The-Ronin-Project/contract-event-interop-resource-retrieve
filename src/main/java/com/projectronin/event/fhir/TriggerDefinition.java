
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
 * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "type",
    "_type",
    "name",
    "_name",
    "timingTiming",
    "timingReference",
    "timingDate",
    "_timingDate",
    "timingDateTime",
    "_timingDateTime",
    "data",
    "condition"
})
@Generated("jsonschema2pojo")
public class TriggerDefinition {

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
     * The type of triggering event.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of triggering event.")
    private TriggerDefinition.Type type;
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
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing timingTiming;
    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("timingReference")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference timingReference;
    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDate")
    @JsonPropertyDescription("The timing of the event (if this is a periodic trigger).")
    private String timingDate;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDate;
    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDateTime")
    @JsonPropertyDescription("The timing of the event (if this is a periodic trigger).")
    private String timingDateTime;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timingDateTime;
    /**
     * The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.")
    private List<DataRequirement> data = new ArrayList<DataRequirement>();
    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.")
    private Expression condition;

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
     * The type of triggering event.
     * 
     */
    @JsonProperty("type")
    public TriggerDefinition.Type getType() {
        return type;
    }

    /**
     * The type of triggering event.
     * 
     */
    @JsonProperty("type")
    public void setType(TriggerDefinition.Type type) {
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
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public Timing getTimingTiming() {
        return timingTiming;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timingTiming")
    public void setTimingTiming(Timing timingTiming) {
        this.timingTiming = timingTiming;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("timingReference")
    public Reference getTimingReference() {
        return timingReference;
    }

    /**
     * A reference from one resource to another.
     * 
     */
    @JsonProperty("timingReference")
    public void setTimingReference(Reference timingReference) {
        this.timingReference = timingReference;
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDate")
    public String getTimingDate() {
        return timingDate;
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDate")
    public void setTimingDate(String timingDate) {
        this.timingDate = timingDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    public Element get_timingDate() {
        return _timingDate;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDate")
    public void set_timingDate(Element _timingDate) {
        this._timingDate = _timingDate;
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDateTime")
    public String getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     * 
     */
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(String timingDateTime) {
        this.timingDateTime = timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public Element get_timingDateTime() {
        return _timingDateTime;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timingDateTime")
    public void set_timingDateTime(Element _timingDateTime) {
        this._timingDateTime = _timingDateTime;
    }

    /**
     * The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.
     * 
     */
    @JsonProperty("data")
    public List<DataRequirement> getData() {
        return data;
    }

    /**
     * The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.
     * 
     */
    @JsonProperty("data")
    public void setData(List<DataRequirement> data) {
        this.data = data;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("condition")
    public Expression getCondition() {
        return condition;
    }

    /**
     * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TriggerDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("timingTiming");
        sb.append('=');
        sb.append(((this.timingTiming == null)?"<null>":this.timingTiming));
        sb.append(',');
        sb.append("timingReference");
        sb.append('=');
        sb.append(((this.timingReference == null)?"<null>":this.timingReference));
        sb.append(',');
        sb.append("timingDate");
        sb.append('=');
        sb.append(((this.timingDate == null)?"<null>":this.timingDate));
        sb.append(',');
        sb.append("_timingDate");
        sb.append('=');
        sb.append(((this._timingDate == null)?"<null>":this._timingDate));
        sb.append(',');
        sb.append("timingDateTime");
        sb.append('=');
        sb.append(((this.timingDateTime == null)?"<null>":this.timingDateTime));
        sb.append(',');
        sb.append("_timingDateTime");
        sb.append('=');
        sb.append(((this._timingDateTime == null)?"<null>":this._timingDateTime));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.timingTiming == null)? 0 :this.timingTiming.hashCode()));
        result = ((result* 31)+((this._timingDateTime == null)? 0 :this._timingDateTime.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.timingReference == null)? 0 :this.timingReference.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.timingDate == null)? 0 :this.timingDate.hashCode()));
        result = ((result* 31)+((this._timingDate == null)? 0 :this._timingDate.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.timingDateTime == null)? 0 :this.timingDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerDefinition) == false) {
            return false;
        }
        TriggerDefinition rhs = ((TriggerDefinition) other);
        return (((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.timingTiming == rhs.timingTiming)||((this.timingTiming!= null)&&this.timingTiming.equals(rhs.timingTiming))))&&((this._timingDateTime == rhs._timingDateTime)||((this._timingDateTime!= null)&&this._timingDateTime.equals(rhs._timingDateTime))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.timingReference == rhs.timingReference)||((this.timingReference!= null)&&this.timingReference.equals(rhs.timingReference))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.timingDate == rhs.timingDate)||((this.timingDate!= null)&&this.timingDate.equals(rhs.timingDate))))&&((this._timingDate == rhs._timingDate)||((this._timingDate!= null)&&this._timingDate.equals(rhs._timingDate))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.timingDateTime == rhs.timingDateTime)||((this.timingDateTime!= null)&&this.timingDateTime.equals(rhs.timingDateTime))));
    }


    /**
     * The type of triggering event.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        NAMED_EVENT("named-event"),
        PERIODIC("periodic"),
        DATA_CHANGED("data-changed"),
        DATA_ADDED("data-added"),
        DATA_MODIFIED("data-modified"),
        DATA_REMOVED("data-removed"),
        DATA_ACCESSED("data-accessed"),
        DATA_ACCESS_ENDED("data-access-ended");
        private final String value;
        private final static Map<String, TriggerDefinition.Type> CONSTANTS = new HashMap<String, TriggerDefinition.Type>();

        static {
            for (TriggerDefinition.Type c: values()) {
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
        public static TriggerDefinition.Type fromValue(String value) {
            TriggerDefinition.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
