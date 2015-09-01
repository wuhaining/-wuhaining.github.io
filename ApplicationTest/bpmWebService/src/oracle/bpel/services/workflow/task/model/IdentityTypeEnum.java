
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="identityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="application_role"/>
 *     &lt;enumeration value="position"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "identityTypeEnum")
@XmlEnum
public enum IdentityTypeEnum {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("application_role")
    APPLICATION_ROLE("application_role"),
    @XmlEnumValue("position")
    POSITION("position");
    private final String value;

    IdentityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityTypeEnum fromValue(String v) {
        for (IdentityTypeEnum c: IdentityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
