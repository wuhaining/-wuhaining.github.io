
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="viewTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INBOX"/>
 *     &lt;enumeration value="VIEW"/>
 *     &lt;enumeration value="STANDARD_VIEW"/>
 *     &lt;enumeration value="PROCESS_VIEW"/>
 *     &lt;enumeration value="STANDARD_PROCESS_VIEW"/>
 *     &lt;enumeration value="REPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "viewTypeEnum")
@XmlEnum
public enum ViewTypeEnum {

    INBOX,
    VIEW,
    STANDARD_VIEW,
    PROCESS_VIEW,
    STANDARD_PROCESS_VIEW,
    REPORT;

    public String value() {
        return name();
    }

    public static ViewTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
