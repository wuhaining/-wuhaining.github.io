
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="metadataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "metadataTypeEnum")
@XmlEnum
public enum MetadataTypeEnum {

    DATE,
    STRING,
    NUMBER;

    public String value() {
        return name();
    }

    public static MetadataTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
