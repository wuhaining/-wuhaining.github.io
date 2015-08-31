
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sharePayloadConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sharePayloadConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}sharePayloadConfigurationTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharePayloadConfigurationType", propOrder = {
    "type"
})
public class SharePayloadConfigurationType {

    @XmlElement(required = true)
    protected SharePayloadConfigurationTypeEnum type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SharePayloadConfigurationTypeEnum }
     *     
     */
    public SharePayloadConfigurationTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharePayloadConfigurationTypeEnum }
     *     
     */
    public void setType(SharePayloadConfigurationTypeEnum value) {
        this.type = value;
    }

}
