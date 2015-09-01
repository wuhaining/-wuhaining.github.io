
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sharePayloadConfigurationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sharePayloadConfigurationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USE_SYSTEM_WIDE_GLOBAL_CONFIGURATION"/>
 *     &lt;enumeration value="ENABLE"/>
 *     &lt;enumeration value="DISABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sharePayloadConfigurationTypeEnum")
@XmlEnum
public enum SharePayloadConfigurationTypeEnum {

    USE_SYSTEM_WIDE_GLOBAL_CONFIGURATION,
    ENABLE,
    DISABLE;

    public String value() {
        return name();
    }

    public static SharePayloadConfigurationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
