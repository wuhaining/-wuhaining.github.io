
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="processTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BPEL"/>
 *     &lt;enumeration value="OWF"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "processTypeEnum")
@XmlEnum
public enum ProcessTypeEnum {

    BPEL,
    OWF,
    OTHER;

    public String value() {
        return name();
    }

    public static ProcessTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
