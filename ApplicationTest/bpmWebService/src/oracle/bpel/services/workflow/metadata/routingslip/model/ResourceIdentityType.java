
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceIdentityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="application_role"/>
 *     &lt;enumeration value="position"/>
 *     &lt;enumeration value="logicalPeopleGroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceIdentityType")
@XmlEnum
public enum ResourceIdentityType {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("application_role")
    APPLICATION_ROLE("application_role"),
    @XmlEnumValue("position")
    POSITION("position"),
    @XmlEnumValue("logicalPeopleGroup")
    LOGICAL_PEOPLE_GROUP("logicalPeopleGroup");
    private final String value;

    ResourceIdentityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceIdentityType fromValue(String v) {
        for (ResourceIdentityType c: ResourceIdentityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
