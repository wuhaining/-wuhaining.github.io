
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for renewalPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="renewalPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="numberOfTimesRenewed" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType"/>
 *       &lt;/all>
 *       &lt;attribute name="renewalDuration" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="renewalDurationType" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}valueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renewalPolicyType", propOrder = {

})
public class RenewalPolicyType {

    @XmlElement(required = true)
    protected ParameterType numberOfTimesRenewed;
    @XmlAttribute(required = true)
    protected String renewalDuration;
    @XmlAttribute
    protected ValueType renewalDurationType;

    /**
     * Gets the value of the numberOfTimesRenewed property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getNumberOfTimesRenewed() {
        return numberOfTimesRenewed;
    }

    /**
     * Sets the value of the numberOfTimesRenewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setNumberOfTimesRenewed(ParameterType value) {
        this.numberOfTimesRenewed = value;
    }

    /**
     * Gets the value of the renewalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalDuration() {
        return renewalDuration;
    }

    /**
     * Sets the value of the renewalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalDuration(String value) {
        this.renewalDuration = value;
    }

    /**
     * Gets the value of the renewalDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getRenewalDurationType() {
        return renewalDurationType;
    }

    /**
     * Sets the value of the renewalDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setRenewalDurationType(ValueType value) {
        this.renewalDurationType = value;
    }

}
