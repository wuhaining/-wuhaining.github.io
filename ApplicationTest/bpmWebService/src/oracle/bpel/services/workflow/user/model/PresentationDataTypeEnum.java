
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presentationDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="presentationDataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TASK"/>
 *     &lt;enumeration value="PROCESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "presentationDataTypeEnum")
@XmlEnum
public enum PresentationDataTypeEnum {

    TASK,
    PROCESS;

    public String value() {
        return name();
    }

    public static PresentationDataTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
