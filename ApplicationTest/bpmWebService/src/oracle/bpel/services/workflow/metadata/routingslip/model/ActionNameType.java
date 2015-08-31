
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGN"/>
 *     &lt;enumeration value="ALERT"/>
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="EXPIRE"/>
 *     &lt;enumeration value="INFO_REQUEST"/>
 *     &lt;enumeration value="OUTCOME_UPDATE"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="WITHDRAW"/>
 *     &lt;enumeration value="RESUME"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="ALL_OTHER_ACTIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionNameType")
@XmlEnum
public enum ActionNameType {

    ASSIGN,
    ALERT,
    COMPLETE,
    ERROR,
    EXPIRE,
    INFO_REQUEST,
    OUTCOME_UPDATE,
    SUSPEND,
    WITHDRAW,
    RESUME,
    UPDATE,
    ALL_OTHER_ACTIONS;

    public String value() {
        return name();
    }

    public static ActionNameType fromValue(String v) {
        return valueOf(v);
    }

}
