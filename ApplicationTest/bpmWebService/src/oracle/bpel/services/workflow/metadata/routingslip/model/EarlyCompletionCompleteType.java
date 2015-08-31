
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for earlyCompletionCompleteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="earlyCompletionCompleteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="root"/>
 *     &lt;enumeration value="current"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "earlyCompletionCompleteType")
@XmlEnum
public enum EarlyCompletionCompleteType {

    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("current")
    CURRENT("current");
    private final String value;

    EarlyCompletionCompleteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarlyCompletionCompleteType fromValue(String v) {
        for (EarlyCompletionCompleteType c: EarlyCompletionCompleteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
