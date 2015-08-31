
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for includeApproversType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="includeApproversType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="everyone"/>
 *     &lt;enumeration value="firstAndLast"/>
 *     &lt;enumeration value="last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "includeApproversType")
@XmlEnum
public enum IncludeApproversType {

    @XmlEnumValue("everyone")
    EVERYONE("everyone"),
    @XmlEnumValue("firstAndLast")
    FIRST_AND_LAST("firstAndLast"),
    @XmlEnumValue("last")
    LAST("last");
    private final String value;

    IncludeApproversType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeApproversType fromValue(String v) {
        for (IncludeApproversType c: IncludeApproversType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
