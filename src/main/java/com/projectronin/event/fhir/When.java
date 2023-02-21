
package com.projectronin.event.fhir;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum When {

    MORN("MORN"),
    MORN_EARLY("MORN.early"),
    MORN_LATE("MORN.late"),
    NOON("NOON"),
    AFT("AFT"),
    AFT_EARLY("AFT.early"),
    AFT_LATE("AFT.late"),
    EVE("EVE"),
    EVE_EARLY("EVE.early"),
    EVE_LATE("EVE.late"),
    NIGHT("NIGHT"),
    PHS("PHS"),
    HS("HS"),
    WAKE("WAKE"),
    C("C"),
    CM("CM"),
    CD("CD"),
    CV("CV"),
    AC("AC"),
    ACM("ACM"),
    ACD("ACD"),
    ACV("ACV"),
    PC("PC"),
    PCM("PCM"),
    PCD("PCD"),
    PCV("PCV");
    private final String value;
    private final static Map<String, When> CONSTANTS = new HashMap<String, When>();

    static {
        for (When c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    When(String value) {
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
    public static When fromValue(String value) {
        When constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
