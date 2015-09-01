
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="ALERTED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="ERRORED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="INFO_REQUESTED"/>
 *     &lt;enumeration value="OUTCOME_UPDATED"/>
 *     &lt;enumeration value="STALE"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="WITHDRAWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stateEnum")
@XmlEnum
public enum StateEnum {

    ASSIGNED,
    ALERTED,
    COMPLETED,
    ERRORED,
    EXPIRED,
    INFO_REQUESTED,
    OUTCOME_UPDATED,
    STALE,
    SUSPENDED,
    WITHDRAWN;

    public String value() {
        return name();
    }

    public static StateEnum fromValue(String v) {
        return valueOf(v);
    }

}
