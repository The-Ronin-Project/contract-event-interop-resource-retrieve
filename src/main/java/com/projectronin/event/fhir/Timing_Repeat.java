
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
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "boundsDuration",
    "boundsRange",
    "boundsPeriod",
    "count",
    "_count",
    "countMax",
    "_countMax",
    "duration",
    "_duration",
    "durationMax",
    "_durationMax",
    "durationUnit",
    "_durationUnit",
    "frequency",
    "_frequency",
    "frequencyMax",
    "_frequencyMax",
    "period",
    "_period",
    "periodMax",
    "_periodMax",
    "periodUnit",
    "_periodUnit",
    "dayOfWeek",
    "_dayOfWeek",
    "timeOfDay",
    "_timeOfDay",
    "when",
    "_when",
    "offset",
    "_offset"
})
@Generated("jsonschema2pojo")
public class Timing_Repeat {

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
     * A length of time.
     * 
     */
    @JsonProperty("boundsDuration")
    @JsonPropertyDescription("A length of time.")
    private Duration boundsDuration;
    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("boundsRange")
    @JsonPropertyDescription("A set of ordered Quantities defined by a low and high limit.")
    private Range boundsRange;
    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("boundsPeriod")
    @JsonPropertyDescription("A time period defined by a start and end date and optionally time.")
    private Period boundsPeriod;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double count;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _count;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("countMax")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double countMax;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_countMax")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _countMax;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double duration;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _duration;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("durationMax")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double durationMax;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationMax")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _durationMax;
    /**
     * The units of time for the duration, in UCUM units.
     * 
     */
    @JsonProperty("durationUnit")
    @JsonPropertyDescription("The units of time for the duration, in UCUM units.")
    private Timing_Repeat.DurationUnit durationUnit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationUnit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _durationUnit;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequency")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double frequency;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequency")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _frequency;
    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequencyMax")
    @JsonPropertyDescription("An integer with a value that is positive (e.g. >0)")
    private Double frequencyMax;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequencyMax")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _frequencyMax;
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
    @JsonProperty("periodMax")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double periodMax;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodMax")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _periodMax;
    /**
     * The units of time for the period in UCUM units.
     * 
     */
    @JsonProperty("periodUnit")
    @JsonPropertyDescription("The units of time for the period in UCUM units.")
    private Timing_Repeat.PeriodUnit periodUnit;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodUnit")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _periodUnit;
    /**
     * If one or more days of week is provided, then the action happens only on the specified day(s).
     * 
     */
    @JsonProperty("dayOfWeek")
    @JsonPropertyDescription("If one or more days of week is provided, then the action happens only on the specified day(s).")
    private List<String> dayOfWeek = new ArrayList<String>();
    /**
     * Extensions for dayOfWeek
     * 
     */
    @JsonProperty("_dayOfWeek")
    @JsonPropertyDescription("Extensions for dayOfWeek")
    private List<Element> _dayOfWeek = new ArrayList<Element>();
    /**
     * Specified time of day for action to take place.
     * 
     */
    @JsonProperty("timeOfDay")
    @JsonPropertyDescription("Specified time of day for action to take place.")
    private List<String> timeOfDay = new ArrayList<String>();
    /**
     * Extensions for timeOfDay
     * 
     */
    @JsonProperty("_timeOfDay")
    @JsonPropertyDescription("Extensions for timeOfDay")
    private List<Element> _timeOfDay = new ArrayList<Element>();
    /**
     * An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.
     * 
     */
    @JsonProperty("when")
    @JsonPropertyDescription("An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.")
    private List<When> when = new ArrayList<When>();
    /**
     * Extensions for when
     * 
     */
    @JsonProperty("_when")
    @JsonPropertyDescription("Extensions for when")
    private List<Element> _when = new ArrayList<Element>();
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double offset;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _offset;

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
     * A length of time.
     * 
     */
    @JsonProperty("boundsDuration")
    public Duration getBoundsDuration() {
        return boundsDuration;
    }

    /**
     * A length of time.
     * 
     */
    @JsonProperty("boundsDuration")
    public void setBoundsDuration(Duration boundsDuration) {
        this.boundsDuration = boundsDuration;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("boundsRange")
    public Range getBoundsRange() {
        return boundsRange;
    }

    /**
     * A set of ordered Quantities defined by a low and high limit.
     * 
     */
    @JsonProperty("boundsRange")
    public void setBoundsRange(Range boundsRange) {
        this.boundsRange = boundsRange;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("boundsPeriod")
    public Period getBoundsPeriod() {
        return boundsPeriod;
    }

    /**
     * A time period defined by a start and end date and optionally time.
     * 
     */
    @JsonProperty("boundsPeriod")
    public void setBoundsPeriod(Period boundsPeriod) {
        this.boundsPeriod = boundsPeriod;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("count")
    public Double getCount() {
        return count;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("count")
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    public Element get_count() {
        return _count;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_count")
    public void set_count(Element _count) {
        this._count = _count;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("countMax")
    public Double getCountMax() {
        return countMax;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("countMax")
    public void setCountMax(Double countMax) {
        this.countMax = countMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_countMax")
    public Element get_countMax() {
        return _countMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_countMax")
    public void set_countMax(Element _countMax) {
        this._countMax = _countMax;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    public Element get_duration() {
        return _duration;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_duration")
    public void set_duration(Element _duration) {
        this._duration = _duration;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("durationMax")
    public Double getDurationMax() {
        return durationMax;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("durationMax")
    public void setDurationMax(Double durationMax) {
        this.durationMax = durationMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationMax")
    public Element get_durationMax() {
        return _durationMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationMax")
    public void set_durationMax(Element _durationMax) {
        this._durationMax = _durationMax;
    }

    /**
     * The units of time for the duration, in UCUM units.
     * 
     */
    @JsonProperty("durationUnit")
    public Timing_Repeat.DurationUnit getDurationUnit() {
        return durationUnit;
    }

    /**
     * The units of time for the duration, in UCUM units.
     * 
     */
    @JsonProperty("durationUnit")
    public void setDurationUnit(Timing_Repeat.DurationUnit durationUnit) {
        this.durationUnit = durationUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationUnit")
    public Element get_durationUnit() {
        return _durationUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_durationUnit")
    public void set_durationUnit(Element _durationUnit) {
        this._durationUnit = _durationUnit;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequency")
    public Double getFrequency() {
        return frequency;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequency")
    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequency")
    public Element get_frequency() {
        return _frequency;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequency")
    public void set_frequency(Element _frequency) {
        this._frequency = _frequency;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequencyMax")
    public Double getFrequencyMax() {
        return frequencyMax;
    }

    /**
     * An integer with a value that is positive (e.g. &gt;0)
     * 
     */
    @JsonProperty("frequencyMax")
    public void setFrequencyMax(Double frequencyMax) {
        this.frequencyMax = frequencyMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequencyMax")
    public Element get_frequencyMax() {
        return _frequencyMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_frequencyMax")
    public void set_frequencyMax(Element _frequencyMax) {
        this._frequencyMax = _frequencyMax;
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
    @JsonProperty("periodMax")
    public Double getPeriodMax() {
        return periodMax;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("periodMax")
    public void setPeriodMax(Double periodMax) {
        this.periodMax = periodMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodMax")
    public Element get_periodMax() {
        return _periodMax;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodMax")
    public void set_periodMax(Element _periodMax) {
        this._periodMax = _periodMax;
    }

    /**
     * The units of time for the period in UCUM units.
     * 
     */
    @JsonProperty("periodUnit")
    public Timing_Repeat.PeriodUnit getPeriodUnit() {
        return periodUnit;
    }

    /**
     * The units of time for the period in UCUM units.
     * 
     */
    @JsonProperty("periodUnit")
    public void setPeriodUnit(Timing_Repeat.PeriodUnit periodUnit) {
        this.periodUnit = periodUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodUnit")
    public Element get_periodUnit() {
        return _periodUnit;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_periodUnit")
    public void set_periodUnit(Element _periodUnit) {
        this._periodUnit = _periodUnit;
    }

    /**
     * If one or more days of week is provided, then the action happens only on the specified day(s).
     * 
     */
    @JsonProperty("dayOfWeek")
    public List<String> getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * If one or more days of week is provided, then the action happens only on the specified day(s).
     * 
     */
    @JsonProperty("dayOfWeek")
    public void setDayOfWeek(List<String> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Extensions for dayOfWeek
     * 
     */
    @JsonProperty("_dayOfWeek")
    public List<Element> get_dayOfWeek() {
        return _dayOfWeek;
    }

    /**
     * Extensions for dayOfWeek
     * 
     */
    @JsonProperty("_dayOfWeek")
    public void set_dayOfWeek(List<Element> _dayOfWeek) {
        this._dayOfWeek = _dayOfWeek;
    }

    /**
     * Specified time of day for action to take place.
     * 
     */
    @JsonProperty("timeOfDay")
    public List<String> getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Specified time of day for action to take place.
     * 
     */
    @JsonProperty("timeOfDay")
    public void setTimeOfDay(List<String> timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * Extensions for timeOfDay
     * 
     */
    @JsonProperty("_timeOfDay")
    public List<Element> get_timeOfDay() {
        return _timeOfDay;
    }

    /**
     * Extensions for timeOfDay
     * 
     */
    @JsonProperty("_timeOfDay")
    public void set_timeOfDay(List<Element> _timeOfDay) {
        this._timeOfDay = _timeOfDay;
    }

    /**
     * An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.
     * 
     */
    @JsonProperty("when")
    public List<When> getWhen() {
        return when;
    }

    /**
     * An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.
     * 
     */
    @JsonProperty("when")
    public void setWhen(List<When> when) {
        this.when = when;
    }

    /**
     * Extensions for when
     * 
     */
    @JsonProperty("_when")
    public List<Element> get_when() {
        return _when;
    }

    /**
     * Extensions for when
     * 
     */
    @JsonProperty("_when")
    public void set_when(List<Element> _when) {
        this._when = _when;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("offset")
    public Double getOffset() {
        return offset;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    public Element get_offset() {
        return _offset;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_offset")
    public void set_offset(Element _offset) {
        this._offset = _offset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Timing_Repeat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("boundsDuration");
        sb.append('=');
        sb.append(((this.boundsDuration == null)?"<null>":this.boundsDuration));
        sb.append(',');
        sb.append("boundsRange");
        sb.append('=');
        sb.append(((this.boundsRange == null)?"<null>":this.boundsRange));
        sb.append(',');
        sb.append("boundsPeriod");
        sb.append('=');
        sb.append(((this.boundsPeriod == null)?"<null>":this.boundsPeriod));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("_count");
        sb.append('=');
        sb.append(((this._count == null)?"<null>":this._count));
        sb.append(',');
        sb.append("countMax");
        sb.append('=');
        sb.append(((this.countMax == null)?"<null>":this.countMax));
        sb.append(',');
        sb.append("_countMax");
        sb.append('=');
        sb.append(((this._countMax == null)?"<null>":this._countMax));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("_duration");
        sb.append('=');
        sb.append(((this._duration == null)?"<null>":this._duration));
        sb.append(',');
        sb.append("durationMax");
        sb.append('=');
        sb.append(((this.durationMax == null)?"<null>":this.durationMax));
        sb.append(',');
        sb.append("_durationMax");
        sb.append('=');
        sb.append(((this._durationMax == null)?"<null>":this._durationMax));
        sb.append(',');
        sb.append("durationUnit");
        sb.append('=');
        sb.append(((this.durationUnit == null)?"<null>":this.durationUnit));
        sb.append(',');
        sb.append("_durationUnit");
        sb.append('=');
        sb.append(((this._durationUnit == null)?"<null>":this._durationUnit));
        sb.append(',');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("_frequency");
        sb.append('=');
        sb.append(((this._frequency == null)?"<null>":this._frequency));
        sb.append(',');
        sb.append("frequencyMax");
        sb.append('=');
        sb.append(((this.frequencyMax == null)?"<null>":this.frequencyMax));
        sb.append(',');
        sb.append("_frequencyMax");
        sb.append('=');
        sb.append(((this._frequencyMax == null)?"<null>":this._frequencyMax));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("_period");
        sb.append('=');
        sb.append(((this._period == null)?"<null>":this._period));
        sb.append(',');
        sb.append("periodMax");
        sb.append('=');
        sb.append(((this.periodMax == null)?"<null>":this.periodMax));
        sb.append(',');
        sb.append("_periodMax");
        sb.append('=');
        sb.append(((this._periodMax == null)?"<null>":this._periodMax));
        sb.append(',');
        sb.append("periodUnit");
        sb.append('=');
        sb.append(((this.periodUnit == null)?"<null>":this.periodUnit));
        sb.append(',');
        sb.append("_periodUnit");
        sb.append('=');
        sb.append(((this._periodUnit == null)?"<null>":this._periodUnit));
        sb.append(',');
        sb.append("dayOfWeek");
        sb.append('=');
        sb.append(((this.dayOfWeek == null)?"<null>":this.dayOfWeek));
        sb.append(',');
        sb.append("_dayOfWeek");
        sb.append('=');
        sb.append(((this._dayOfWeek == null)?"<null>":this._dayOfWeek));
        sb.append(',');
        sb.append("timeOfDay");
        sb.append('=');
        sb.append(((this.timeOfDay == null)?"<null>":this.timeOfDay));
        sb.append(',');
        sb.append("_timeOfDay");
        sb.append('=');
        sb.append(((this._timeOfDay == null)?"<null>":this._timeOfDay));
        sb.append(',');
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("_when");
        sb.append('=');
        sb.append(((this._when == null)?"<null>":this._when));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("_offset");
        sb.append('=');
        sb.append(((this._offset == null)?"<null>":this._offset));
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
        result = ((result* 31)+((this.boundsRange == null)? 0 :this.boundsRange.hashCode()));
        result = ((result* 31)+((this._periodUnit == null)? 0 :this._periodUnit.hashCode()));
        result = ((result* 31)+((this.frequencyMax == null)? 0 :this.frequencyMax.hashCode()));
        result = ((result* 31)+((this.countMax == null)? 0 :this.countMax.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this._frequency == null)? 0 :this._frequency.hashCode()));
        result = ((result* 31)+((this._frequencyMax == null)? 0 :this._frequencyMax.hashCode()));
        result = ((result* 31)+((this._countMax == null)? 0 :this._countMax.hashCode()));
        result = ((result* 31)+((this.periodUnit == null)? 0 :this.periodUnit.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.frequency == null)? 0 :this.frequency.hashCode()));
        result = ((result* 31)+((this.boundsDuration == null)? 0 :this.boundsDuration.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this._count == null)? 0 :this._count.hashCode()));
        result = ((result* 31)+((this.dayOfWeek == null)? 0 :this.dayOfWeek.hashCode()));
        result = ((result* 31)+((this._durationUnit == null)? 0 :this._durationUnit.hashCode()));
        result = ((result* 31)+((this._offset == null)? 0 :this._offset.hashCode()));
        result = ((result* 31)+((this._duration == null)? 0 :this._duration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.boundsPeriod == null)? 0 :this.boundsPeriod.hashCode()));
        result = ((result* 31)+((this.durationUnit == null)? 0 :this.durationUnit.hashCode()));
        result = ((result* 31)+((this._durationMax == null)? 0 :this._durationMax.hashCode()));
        result = ((result* 31)+((this._dayOfWeek == null)? 0 :this._dayOfWeek.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this._periodMax == null)? 0 :this._periodMax.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.periodMax == null)? 0 :this.periodMax.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this._when == null)? 0 :this._when.hashCode()));
        result = ((result* 31)+((this.durationMax == null)? 0 :this.durationMax.hashCode()));
        result = ((result* 31)+((this._timeOfDay == null)? 0 :this._timeOfDay.hashCode()));
        result = ((result* 31)+((this._period == null)? 0 :this._period.hashCode()));
        result = ((result* 31)+((this.timeOfDay == null)? 0 :this.timeOfDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timing_Repeat) == false) {
            return false;
        }
        Timing_Repeat rhs = ((Timing_Repeat) other);
        return (((((((((((((((((((((((((((((((((((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension)))&&((this.boundsRange == rhs.boundsRange)||((this.boundsRange!= null)&&this.boundsRange.equals(rhs.boundsRange))))&&((this._periodUnit == rhs._periodUnit)||((this._periodUnit!= null)&&this._periodUnit.equals(rhs._periodUnit))))&&((this.frequencyMax == rhs.frequencyMax)||((this.frequencyMax!= null)&&this.frequencyMax.equals(rhs.frequencyMax))))&&((this.countMax == rhs.countMax)||((this.countMax!= null)&&this.countMax.equals(rhs.countMax))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this._frequency == rhs._frequency)||((this._frequency!= null)&&this._frequency.equals(rhs._frequency))))&&((this._frequencyMax == rhs._frequencyMax)||((this._frequencyMax!= null)&&this._frequencyMax.equals(rhs._frequencyMax))))&&((this._countMax == rhs._countMax)||((this._countMax!= null)&&this._countMax.equals(rhs._countMax))))&&((this.periodUnit == rhs.periodUnit)||((this.periodUnit!= null)&&this.periodUnit.equals(rhs.periodUnit))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.frequency == rhs.frequency)||((this.frequency!= null)&&this.frequency.equals(rhs.frequency))))&&((this.boundsDuration == rhs.boundsDuration)||((this.boundsDuration!= null)&&this.boundsDuration.equals(rhs.boundsDuration))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this._count == rhs._count)||((this._count!= null)&&this._count.equals(rhs._count))))&&((this.dayOfWeek == rhs.dayOfWeek)||((this.dayOfWeek!= null)&&this.dayOfWeek.equals(rhs.dayOfWeek))))&&((this._durationUnit == rhs._durationUnit)||((this._durationUnit!= null)&&this._durationUnit.equals(rhs._durationUnit))))&&((this._offset == rhs._offset)||((this._offset!= null)&&this._offset.equals(rhs._offset))))&&((this._duration == rhs._duration)||((this._duration!= null)&&this._duration.equals(rhs._duration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.boundsPeriod == rhs.boundsPeriod)||((this.boundsPeriod!= null)&&this.boundsPeriod.equals(rhs.boundsPeriod))))&&((this.durationUnit == rhs.durationUnit)||((this.durationUnit!= null)&&this.durationUnit.equals(rhs.durationUnit))))&&((this._durationMax == rhs._durationMax)||((this._durationMax!= null)&&this._durationMax.equals(rhs._durationMax))))&&((this._dayOfWeek == rhs._dayOfWeek)||((this._dayOfWeek!= null)&&this._dayOfWeek.equals(rhs._dayOfWeek))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this._periodMax == rhs._periodMax)||((this._periodMax!= null)&&this._periodMax.equals(rhs._periodMax))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.periodMax == rhs.periodMax)||((this.periodMax!= null)&&this.periodMax.equals(rhs.periodMax))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this._when == rhs._when)||((this._when!= null)&&this._when.equals(rhs._when))))&&((this.durationMax == rhs.durationMax)||((this.durationMax!= null)&&this.durationMax.equals(rhs.durationMax))))&&((this._timeOfDay == rhs._timeOfDay)||((this._timeOfDay!= null)&&this._timeOfDay.equals(rhs._timeOfDay))))&&((this._period == rhs._period)||((this._period!= null)&&this._period.equals(rhs._period))))&&((this.timeOfDay == rhs.timeOfDay)||((this.timeOfDay!= null)&&this.timeOfDay.equals(rhs.timeOfDay))));
    }


    /**
     * The units of time for the duration, in UCUM units.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DurationUnit {

        S("s"),
        MIN("min"),
        H("h"),
        D("d"),
        WK("wk"),
        MO("mo"),
        A("a");
        private final String value;
        private final static Map<String, Timing_Repeat.DurationUnit> CONSTANTS = new HashMap<String, Timing_Repeat.DurationUnit>();

        static {
            for (Timing_Repeat.DurationUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DurationUnit(String value) {
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
        public static Timing_Repeat.DurationUnit fromValue(String value) {
            Timing_Repeat.DurationUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The units of time for the period in UCUM units.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PeriodUnit {

        S("s"),
        MIN("min"),
        H("h"),
        D("d"),
        WK("wk"),
        MO("mo"),
        A("a");
        private final String value;
        private final static Map<String, Timing_Repeat.PeriodUnit> CONSTANTS = new HashMap<String, Timing_Repeat.PeriodUnit>();

        static {
            for (Timing_Repeat.PeriodUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PeriodUnit(String value) {
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
        public static Timing_Repeat.PeriodUnit fromValue(String value) {
            Timing_Repeat.PeriodUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
