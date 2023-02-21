
package com.projectronin.event.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Indicates how the medication is/was taken or should be taken by the patient.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "extension",
    "modifierExtension",
    "sequence",
    "_sequence",
    "text",
    "_text",
    "additionalInstruction",
    "patientInstruction",
    "_patientInstruction",
    "timing",
    "asNeededBoolean",
    "_asNeededBoolean",
    "asNeededCodeableConcept",
    "site",
    "route",
    "method",
    "doseAndRate",
    "maxDosePerPeriod",
    "maxDosePerAdministration",
    "maxDosePerLifetime"
})
@Generated("jsonschema2pojo")
public class Dosage {

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
     * A whole number
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("A whole number")
    private Double sequence;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _sequence;
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
     * Supplemental instructions to the patient on how to take the medication  (e.g. &quot;with meals&quot; or&quot;take half to one hour before food&quot;) or warnings for the patient about the medication (e.g. &quot;may cause drowsiness&quot; or &quot;avoid exposure of skin to direct sunlight or sunlamps&quot;).
     * 
     */
    @JsonProperty("additionalInstruction")
    @JsonPropertyDescription("Supplemental instructions to the patient on how to take the medication  (e.g. \"with meals\" or\"take half to one hour before food\") or warnings for the patient about the medication (e.g. \"may cause drowsiness\" or \"avoid exposure of skin to direct sunlight or sunlamps\").")
    private List<CodeableConcept> additionalInstruction = new ArrayList<CodeableConcept>();
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String patientInstruction;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _patientInstruction;
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timing")
    @JsonPropertyDescription("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.")
    private Timing timing;
    /**
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * 
     */
    @JsonProperty("asNeededBoolean")
    @JsonPropertyDescription("Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).")
    private Boolean asNeededBoolean;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _asNeededBoolean;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept asNeededCodeableConcept;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept site;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept route;
    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.")
    private CodeableConcept method;
    /**
     * The amount of medication administered.
     * 
     */
    @JsonProperty("doseAndRate")
    @JsonPropertyDescription("The amount of medication administered.")
    private List<Dosage_DoseAndRate> doseAndRate = new ArrayList<Dosage_DoseAndRate>();
    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerPeriod")
    @JsonPropertyDescription("A relationship of two Quantity values - expressed as a numerator and a denominator.")
    private Ratio maxDosePerPeriod;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerAdministration")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxDosePerAdministration;
    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerLifetime")
    @JsonPropertyDescription("A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.")
    private Quantity maxDosePerLifetime;

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
     * A whole number
     * 
     */
    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    /**
     * A whole number
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public Element get_sequence() {
        return _sequence;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_sequence")
    public void set_sequence(Element _sequence) {
        this._sequence = _sequence;
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
     * Supplemental instructions to the patient on how to take the medication  (e.g. &quot;with meals&quot; or&quot;take half to one hour before food&quot;) or warnings for the patient about the medication (e.g. &quot;may cause drowsiness&quot; or &quot;avoid exposure of skin to direct sunlight or sunlamps&quot;).
     * 
     */
    @JsonProperty("additionalInstruction")
    public List<CodeableConcept> getAdditionalInstruction() {
        return additionalInstruction;
    }

    /**
     * Supplemental instructions to the patient on how to take the medication  (e.g. &quot;with meals&quot; or&quot;take half to one hour before food&quot;) or warnings for the patient about the medication (e.g. &quot;may cause drowsiness&quot; or &quot;avoid exposure of skin to direct sunlight or sunlamps&quot;).
     * 
     */
    @JsonProperty("additionalInstruction")
    public void setAdditionalInstruction(List<CodeableConcept> additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public String getPatientInstruction() {
        return patientInstruction;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(String patientInstruction) {
        this.patientInstruction = patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public Element get_patientInstruction() {
        return _patientInstruction;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_patientInstruction")
    public void set_patientInstruction(Element _patientInstruction) {
        this._patientInstruction = _patientInstruction;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timing")
    public Timing getTiming() {
        return timing;
    }

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     * 
     */
    @JsonProperty("timing")
    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    /**
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * 
     */
    @JsonProperty("asNeededBoolean")
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * 
     */
    @JsonProperty("asNeededBoolean")
    public void setAsNeededBoolean(Boolean asNeededBoolean) {
        this.asNeededBoolean = asNeededBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    public Element get_asNeededBoolean() {
        return _asNeededBoolean;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_asNeededBoolean")
    public void set_asNeededBoolean(Element _asNeededBoolean) {
        this._asNeededBoolean = _asNeededBoolean;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("asNeededCodeableConcept")
    public void setAsNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
        this.asNeededCodeableConcept = asNeededCodeableConcept;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("site")
    public void setSite(CodeableConcept site) {
        this.site = site;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("route")
    public void setRoute(CodeableConcept route) {
        this.route = route;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     * 
     */
    @JsonProperty("method")
    public void setMethod(CodeableConcept method) {
        this.method = method;
    }

    /**
     * The amount of medication administered.
     * 
     */
    @JsonProperty("doseAndRate")
    public List<Dosage_DoseAndRate> getDoseAndRate() {
        return doseAndRate;
    }

    /**
     * The amount of medication administered.
     * 
     */
    @JsonProperty("doseAndRate")
    public void setDoseAndRate(List<Dosage_DoseAndRate> doseAndRate) {
        this.doseAndRate = doseAndRate;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerPeriod")
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     * 
     */
    @JsonProperty("maxDosePerPeriod")
    public void setMaxDosePerPeriod(Ratio maxDosePerPeriod) {
        this.maxDosePerPeriod = maxDosePerPeriod;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerAdministration")
    public Quantity getMaxDosePerAdministration() {
        return maxDosePerAdministration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerAdministration")
    public void setMaxDosePerAdministration(Quantity maxDosePerAdministration) {
        this.maxDosePerAdministration = maxDosePerAdministration;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerLifetime")
    public Quantity getMaxDosePerLifetime() {
        return maxDosePerLifetime;
    }

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     * 
     */
    @JsonProperty("maxDosePerLifetime")
    public void setMaxDosePerLifetime(Quantity maxDosePerLifetime) {
        this.maxDosePerLifetime = maxDosePerLifetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dosage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("sequence");
        sb.append('=');
        sb.append(((this.sequence == null)?"<null>":this.sequence));
        sb.append(',');
        sb.append("_sequence");
        sb.append('=');
        sb.append(((this._sequence == null)?"<null>":this._sequence));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("_text");
        sb.append('=');
        sb.append(((this._text == null)?"<null>":this._text));
        sb.append(',');
        sb.append("additionalInstruction");
        sb.append('=');
        sb.append(((this.additionalInstruction == null)?"<null>":this.additionalInstruction));
        sb.append(',');
        sb.append("patientInstruction");
        sb.append('=');
        sb.append(((this.patientInstruction == null)?"<null>":this.patientInstruction));
        sb.append(',');
        sb.append("_patientInstruction");
        sb.append('=');
        sb.append(((this._patientInstruction == null)?"<null>":this._patientInstruction));
        sb.append(',');
        sb.append("timing");
        sb.append('=');
        sb.append(((this.timing == null)?"<null>":this.timing));
        sb.append(',');
        sb.append("asNeededBoolean");
        sb.append('=');
        sb.append(((this.asNeededBoolean == null)?"<null>":this.asNeededBoolean));
        sb.append(',');
        sb.append("_asNeededBoolean");
        sb.append('=');
        sb.append(((this._asNeededBoolean == null)?"<null>":this._asNeededBoolean));
        sb.append(',');
        sb.append("asNeededCodeableConcept");
        sb.append('=');
        sb.append(((this.asNeededCodeableConcept == null)?"<null>":this.asNeededCodeableConcept));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("doseAndRate");
        sb.append('=');
        sb.append(((this.doseAndRate == null)?"<null>":this.doseAndRate));
        sb.append(',');
        sb.append("maxDosePerPeriod");
        sb.append('=');
        sb.append(((this.maxDosePerPeriod == null)?"<null>":this.maxDosePerPeriod));
        sb.append(',');
        sb.append("maxDosePerAdministration");
        sb.append('=');
        sb.append(((this.maxDosePerAdministration == null)?"<null>":this.maxDosePerAdministration));
        sb.append(',');
        sb.append("maxDosePerLifetime");
        sb.append('=');
        sb.append(((this.maxDosePerLifetime == null)?"<null>":this.maxDosePerLifetime));
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
        result = ((result* 31)+((this.maxDosePerLifetime == null)? 0 :this.maxDosePerLifetime.hashCode()));
        result = ((result* 31)+((this.additionalInstruction == null)? 0 :this.additionalInstruction.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.timing == null)? 0 :this.timing.hashCode()));
        result = ((result* 31)+((this.modifierExtension == null)? 0 :this.modifierExtension.hashCode()));
        result = ((result* 31)+((this.doseAndRate == null)? 0 :this.doseAndRate.hashCode()));
        result = ((result* 31)+((this.sequence == null)? 0 :this.sequence.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this._sequence == null)? 0 :this._sequence.hashCode()));
        result = ((result* 31)+((this._patientInstruction == null)? 0 :this._patientInstruction.hashCode()));
        result = ((result* 31)+((this.asNeededBoolean == null)? 0 :this.asNeededBoolean.hashCode()));
        result = ((result* 31)+((this.maxDosePerPeriod == null)? 0 :this.maxDosePerPeriod.hashCode()));
        result = ((result* 31)+((this.maxDosePerAdministration == null)? 0 :this.maxDosePerAdministration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this._text == null)? 0 :this._text.hashCode()));
        result = ((result* 31)+((this._asNeededBoolean == null)? 0 :this._asNeededBoolean.hashCode()));
        result = ((result* 31)+((this.patientInstruction == null)? 0 :this.patientInstruction.hashCode()));
        result = ((result* 31)+((this.asNeededCodeableConcept == null)? 0 :this.asNeededCodeableConcept.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dosage) == false) {
            return false;
        }
        Dosage rhs = ((Dosage) other);
        return ((((((((((((((((((((((this.maxDosePerLifetime == rhs.maxDosePerLifetime)||((this.maxDosePerLifetime!= null)&&this.maxDosePerLifetime.equals(rhs.maxDosePerLifetime)))&&((this.additionalInstruction == rhs.additionalInstruction)||((this.additionalInstruction!= null)&&this.additionalInstruction.equals(rhs.additionalInstruction))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.timing == rhs.timing)||((this.timing!= null)&&this.timing.equals(rhs.timing))))&&((this.modifierExtension == rhs.modifierExtension)||((this.modifierExtension!= null)&&this.modifierExtension.equals(rhs.modifierExtension))))&&((this.doseAndRate == rhs.doseAndRate)||((this.doseAndRate!= null)&&this.doseAndRate.equals(rhs.doseAndRate))))&&((this.sequence == rhs.sequence)||((this.sequence!= null)&&this.sequence.equals(rhs.sequence))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this._sequence == rhs._sequence)||((this._sequence!= null)&&this._sequence.equals(rhs._sequence))))&&((this._patientInstruction == rhs._patientInstruction)||((this._patientInstruction!= null)&&this._patientInstruction.equals(rhs._patientInstruction))))&&((this.asNeededBoolean == rhs.asNeededBoolean)||((this.asNeededBoolean!= null)&&this.asNeededBoolean.equals(rhs.asNeededBoolean))))&&((this.maxDosePerPeriod == rhs.maxDosePerPeriod)||((this.maxDosePerPeriod!= null)&&this.maxDosePerPeriod.equals(rhs.maxDosePerPeriod))))&&((this.maxDosePerAdministration == rhs.maxDosePerAdministration)||((this.maxDosePerAdministration!= null)&&this.maxDosePerAdministration.equals(rhs.maxDosePerAdministration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this._text == rhs._text)||((this._text!= null)&&this._text.equals(rhs._text))))&&((this._asNeededBoolean == rhs._asNeededBoolean)||((this._asNeededBoolean!= null)&&this._asNeededBoolean.equals(rhs._asNeededBoolean))))&&((this.patientInstruction == rhs.patientInstruction)||((this.patientInstruction!= null)&&this.patientInstruction.equals(rhs.patientInstruction))))&&((this.asNeededCodeableConcept == rhs.asNeededCodeableConcept)||((this.asNeededCodeableConcept!= null)&&this.asNeededCodeableConcept.equals(rhs.asNeededCodeableConcept))));
    }

}
