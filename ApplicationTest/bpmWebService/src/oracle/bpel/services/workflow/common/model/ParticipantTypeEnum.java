
package oracle.bpel.services.workflow.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for participantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="participantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="GROUP"/>
 *     &lt;enumeration value="APPROLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "participantTypeEnum")
@XmlEnum
public enum ParticipantTypeEnum {

    USER,
    GROUP,
    APPROLE;

    public String value() {
        return name();
    }

    public static ParticipantTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
