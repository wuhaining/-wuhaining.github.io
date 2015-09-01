
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disconnectedModeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="disconnectedModeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="server"/>
 *     &lt;enumeration value="client"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "disconnectedModeTypeEnum")
@XmlEnum
public enum DisconnectedModeTypeEnum {

    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    DisconnectedModeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisconnectedModeTypeEnum fromValue(String v) {
        for (DisconnectedModeTypeEnum c: DisconnectedModeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
