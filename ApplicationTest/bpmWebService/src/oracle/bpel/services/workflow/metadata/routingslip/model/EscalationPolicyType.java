
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for escalationPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="escalationPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="numberOfTimesEscalated" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" minOccurs="0"/>
 *         &lt;element name="titleOfLastUser" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" minOccurs="0"/>
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
@XmlType(name = "escalationPolicyType", propOrder = {

})
public class EscalationPolicyType {

    protected ParameterType numberOfTimesEscalated;
    protected ParameterType titleOfLastUser;
    @XmlAttribute(required = true)
    protected String renewalDuration;
    @XmlAttribute
    protected ValueType renewalDurationType;

    /**
     * Gets the value of the numberOfTimesEscalated property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getNumberOfTimesEscalated() {
        return numberOfTimesEscalated;
    }

    /**
     * Sets the value of the numberOfTimesEscalated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setNumberOfTimesEscalated(ParameterType value) {
        this.numberOfTimesEscalated = value;
    }

    /**
     * Gets the value of the titleOfLastUser property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getTitleOfLastUser() {
        return titleOfLastUser;
    }

    /**
     * Sets the value of the titleOfLastUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setTitleOfLastUser(ParameterType value) {
        this.titleOfLastUser = value;
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
