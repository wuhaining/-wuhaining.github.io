
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sortOrderEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sortOrderEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASCENDING"/>
 *     &lt;enumeration value="DESCENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sortOrderEnum", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery")
@XmlEnum
public enum SortOrderEnum {

    ASCENDING,
    DESCENDING;

    public String value() {
        return name();
    }

    public static SortOrderEnum fromValue(String v) {
        return valueOf(v);
    }

}
