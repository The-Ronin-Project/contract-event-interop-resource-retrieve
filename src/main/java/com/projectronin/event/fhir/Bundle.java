
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
 * A container for a collection of resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "id",
    "meta",
    "implicitRules",
    "_implicitRules",
    "language",
    "_language",
    "identifier",
    "type",
    "_type",
    "timestamp",
    "_timestamp",
    "total",
    "_total",
    "link",
    "entry",
    "signature"
})
@Generated("jsonschema2pojo")
public class Bundle {

    /**
     * This is a Bundle resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a Bundle resource")
    private Object resourceType;
    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.")
    private String id;
    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.")
    private Meta meta;
    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    @JsonPropertyDescription("String of characters used to identify a name or a resource")
    private String implicitRules;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _implicitRules;
    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents")
    private String language;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _language;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates the purpose of this bundle - how it is intended to be used.")
    private Bundle.Type type;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_type")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _type;
    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("An instant in time - known at least to the second")
    private String timestamp;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _timestamp;
    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("An integer with a value that is not negative (e.g. >= 0)")
    private Double total;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _total;
    /**
     * A series of links that provide context to this bundle.
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("A series of links that provide context to this bundle.")
    private List<Bundle_Link> link = new ArrayList<Bundle_Link>();
    /**
     * An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).
     * 
     */
    @JsonProperty("entry")
    @JsonPropertyDescription("An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).")
    private List<Bundle_Entry> entry = new ArrayList<Bundle_Entry>();
    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("signature")
    @JsonPropertyDescription("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.")
    private Signature signature;

    /**
     * This is a Bundle resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public Object getResourceType() {
        return resourceType;
    }

    /**
     * This is a Bundle resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Any combination of letters, numerals, &quot;-&quot; and &quot;.&quot;, with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    public String getImplicitRules() {
        return implicitRules;
    }

    /**
     * String of characters used to identify a name or a resource
     * 
     */
    @JsonProperty("implicitRules")
    public void setImplicitRules(String implicitRules) {
        this.implicitRules = implicitRules;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    public Element get_implicitRules() {
        return _implicitRules;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_implicitRules")
    public void set_implicitRules(Element _implicitRules) {
        this._implicitRules = _implicitRules;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public Element get_language() {
        return _language;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_language")
    public void set_language(Element _language) {
        this._language = _language;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     * 
     */
    @JsonProperty("type")
    public Bundle.Type getType() {
        return type;
    }

    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     * 
     */
    @JsonProperty("type")
    public void setType(Bundle.Type type) {
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
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * An instant in time - known at least to the second
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    public Element get_timestamp() {
        return _timestamp;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_timestamp")
    public void set_timestamp(Element _timestamp) {
        this._timestamp = _timestamp;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    /**
     * An integer with a value that is not negative (e.g. &gt;= 0)
     * 
     */
    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    public Element get_total() {
        return _total;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_total")
    public void set_total(Element _total) {
        this._total = _total;
    }

    /**
     * A series of links that provide context to this bundle.
     * 
     */
    @JsonProperty("link")
    public List<Bundle_Link> getLink() {
        return link;
    }

    /**
     * A series of links that provide context to this bundle.
     * 
     */
    @JsonProperty("link")
    public void setLink(List<Bundle_Link> link) {
        this.link = link;
    }

    /**
     * An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).
     * 
     */
    @JsonProperty("entry")
    public List<Bundle_Entry> getEntry() {
        return entry;
    }

    /**
     * An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).
     * 
     */
    @JsonProperty("entry")
    public void setEntry(List<Bundle_Entry> entry) {
        this.entry = entry;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("signature")
    public Signature getSignature() {
        return signature;
    }

    /**
     * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
     * 
     */
    @JsonProperty("signature")
    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("implicitRules");
        sb.append('=');
        sb.append(((this.implicitRules == null)?"<null>":this.implicitRules));
        sb.append(',');
        sb.append("_implicitRules");
        sb.append('=');
        sb.append(((this._implicitRules == null)?"<null>":this._implicitRules));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("_language");
        sb.append('=');
        sb.append(((this._language == null)?"<null>":this._language));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("_type");
        sb.append('=');
        sb.append(((this._type == null)?"<null>":this._type));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("_timestamp");
        sb.append('=');
        sb.append(((this._timestamp == null)?"<null>":this._timestamp));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("_total");
        sb.append('=');
        sb.append(((this._total == null)?"<null>":this._total));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("entry");
        sb.append('=');
        sb.append(((this.entry == null)?"<null>":this.entry));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this._language == null)? 0 :this._language.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this._type == null)? 0 :this._type.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this._implicitRules == null)? 0 :this._implicitRules.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.entry == null)? 0 :this.entry.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        result = ((result* 31)+((this._total == null)? 0 :this._total.hashCode()));
        result = ((result* 31)+((this.implicitRules == null)? 0 :this.implicitRules.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._timestamp == null)? 0 :this._timestamp.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle) == false) {
            return false;
        }
        Bundle rhs = ((Bundle) other);
        return ((((((((((((((((((this._language == rhs._language)||((this._language!= null)&&this._language.equals(rhs._language)))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this._type == rhs._type)||((this._type!= null)&&this._type.equals(rhs._type))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this._implicitRules == rhs._implicitRules)||((this._implicitRules!= null)&&this._implicitRules.equals(rhs._implicitRules))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.entry == rhs.entry)||((this.entry!= null)&&this.entry.equals(rhs.entry))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))))&&((this._total == rhs._total)||((this._total!= null)&&this._total.equals(rhs._total))))&&((this.implicitRules == rhs.implicitRules)||((this.implicitRules!= null)&&this.implicitRules.equals(rhs.implicitRules))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._timestamp == rhs._timestamp)||((this._timestamp!= null)&&this._timestamp.equals(rhs._timestamp))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }


    /**
     * Indicates the purpose of this bundle - how it is intended to be used.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        DOCUMENT("document"),
        MESSAGE("message"),
        TRANSACTION("transaction"),
        TRANSACTION_RESPONSE("transaction-response"),
        BATCH("batch"),
        BATCH_RESPONSE("batch-response"),
        HISTORY("history"),
        SEARCHSET("searchset"),
        COLLECTION("collection");
        private final String value;
        private final static Map<String, Bundle.Type> CONSTANTS = new HashMap<String, Bundle.Type>();

        static {
            for (Bundle.Type c: values()) {
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
        public static Bundle.Type fromValue(String value) {
            Bundle.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
