
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for earlyCompletionInheritType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="earlyCompletionInheritType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="root"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "earlyCompletionInheritType")
@XmlEnum
public enum EarlyCompletionInheritType {

    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    EarlyCompletionInheritType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarlyCompletionInheritType fromValue(String v) {
        for (EarlyCompletionInheritType c: EarlyCompletionInheritType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
