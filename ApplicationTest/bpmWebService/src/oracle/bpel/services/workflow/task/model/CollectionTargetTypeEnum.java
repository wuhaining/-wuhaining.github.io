
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectionTargetTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="collectionTargetTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="AGGREGATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "collectionTargetTypeEnum")
@XmlEnum
public enum CollectionTargetTypeEnum {

    PRIMARY,
    AGGREGATED;

    public String value() {
        return name();
    }

    public static CollectionTargetTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
