
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mailStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERRORED"/>
 *     &lt;enumeration value="RETRY"/>
 *     &lt;enumeration value="SENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mailStatusEnum")
@XmlEnum
public enum MailStatusEnum {

    ERRORED,
    RETRY,
    SENT;

    public String value() {
        return name();
    }

    public static MailStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
