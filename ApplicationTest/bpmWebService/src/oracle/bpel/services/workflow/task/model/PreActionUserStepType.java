
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preActionUserStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preActionUserStepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userStep" type="{http://xmlns.oracle.com/bpel/workflow/task}preActionUserStepEnum"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preActionUserStepType", propOrder = {
    "userStep",
    "outcome"
})
public class PreActionUserStepType {

    @XmlElement(required = true)
    protected PreActionUserStepEnum userStep;
    @XmlElement(required = true)
    protected String outcome;

    /**
     * Gets the value of the userStep property.
     * 
     * @return
     *     possible object is
     *     {@link PreActionUserStepEnum }
     *     
     */
    public PreActionUserStepEnum getUserStep() {
        return userStep;
    }

    /**
     * Sets the value of the userStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreActionUserStepEnum }
     *     
     */
    public void setUserStep(PreActionUserStepEnum value) {
        this.userStep = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcome(String value) {
        this.outcome = value;
    }

}
