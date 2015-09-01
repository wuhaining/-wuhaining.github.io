
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allowInitiatorEditParticipants"/>
 *     &lt;enumeration value="allowParticipantsEditParticipants"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionsType")
@XmlEnum
public enum ActionsType {

    @XmlEnumValue("allowInitiatorEditParticipants")
    ALLOW_INITIATOR_EDIT_PARTICIPANTS("allowInitiatorEditParticipants"),
    @XmlEnumValue("allowParticipantsEditParticipants")
    ALLOW_PARTICIPANTS_EDIT_PARTICIPANTS("allowParticipantsEditParticipants");
    private final String value;

    ActionsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionsType fromValue(String v) {
        for (ActionsType c: ActionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
