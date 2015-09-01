
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for substateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="substateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACQUIRED"/>
 *     &lt;enumeration value="ADHOC_ROUTED"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="DELEGATED"/>
 *     &lt;enumeration value="ESCALATED"/>
 *     &lt;enumeration value="INFO_SUBMITTED"/>
 *     &lt;enumeration value="PUSHED_BACK"/>
 *     &lt;enumeration value="REASSIGNED"/>
 *     &lt;enumeration value="RELEASED"/>
 *     &lt;enumeration value="RENEWED"/>
 *     &lt;enumeration value="RESUMED"/>
 *     &lt;enumeration value="ROUTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "substateEnum")
@XmlEnum
public enum SubstateEnum {

    ACQUIRED,
    ADHOC_ROUTED,
    ASSIGNED,
    DELEGATED,
    ESCALATED,
    INFO_SUBMITTED,
    PUSHED_BACK,
    REASSIGNED,
    RELEASED,
    RENEWED,
    RESUMED,
    ROUTED;

    public String value() {
        return name();
    }

    public static SubstateEnum fromValue(String v) {
        return valueOf(v);
    }

}
