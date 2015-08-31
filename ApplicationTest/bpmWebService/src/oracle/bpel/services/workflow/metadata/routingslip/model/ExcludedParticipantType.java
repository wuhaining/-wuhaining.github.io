
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for excludedParticipantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="excludedParticipantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="previousLaneParticipant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "excludedParticipantType")
@XmlEnum
public enum ExcludedParticipantType {

    @XmlEnumValue("previousLaneParticipant")
    PREVIOUS_LANE_PARTICIPANT("previousLaneParticipant");
    private final String value;

    ExcludedParticipantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExcludedParticipantType fromValue(String v) {
        for (ExcludedParticipantType c: ExcludedParticipantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
