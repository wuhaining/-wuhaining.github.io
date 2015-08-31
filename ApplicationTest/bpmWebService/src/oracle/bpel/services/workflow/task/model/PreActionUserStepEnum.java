
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preActionUserStepEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="preActionUserStepEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIEW_DETAILS"/>
 *     &lt;enumeration value="PROVIDE_COMMENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "preActionUserStepEnum")
@XmlEnum
public enum PreActionUserStepEnum {

    VIEW_DETAILS,
    PROVIDE_COMMENTS;

    public String value() {
        return name();
    }

    public static PreActionUserStepEnum fromValue(String v) {
        return valueOf(v);
    }

}
