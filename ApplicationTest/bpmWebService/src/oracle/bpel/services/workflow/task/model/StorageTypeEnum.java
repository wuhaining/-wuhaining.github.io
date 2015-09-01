
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="storageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TASK"/>
 *     &lt;enumeration value="UCM"/>
 *     &lt;enumeration value="URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "storageTypeEnum")
@XmlEnum
public enum StorageTypeEnum {

    TASK,
    UCM,
    URL;

    public String value() {
        return name();
    }

    public static StorageTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
