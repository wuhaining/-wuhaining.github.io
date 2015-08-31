
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOOPERATION"/>
 *     &lt;enumeration value="REASSIGN"/>
 *     &lt;enumeration value="DELEGATE"/>
 *     &lt;enumeration value="SETOUTCOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionTypeEnum")
@XmlEnum
public enum ActionTypeEnum {

    NOOPERATION,
    REASSIGN,
    DELEGATE,
    SETOUTCOME;

    public String value() {
        return name();
    }

    public static ActionTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
