
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relativeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relativeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="startingPoint"/>
 *     &lt;enumeration value="creator"/>
 *     &lt;enumeration value="absolute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relativeType")
@XmlEnum
public enum RelativeType {

    @XmlEnumValue("startingPoint")
    STARTING_POINT("startingPoint"),
    @XmlEnumValue("creator")
    CREATOR("creator"),
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute");
    private final String value;

    RelativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeType fromValue(String v) {
        for (RelativeType c: RelativeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
