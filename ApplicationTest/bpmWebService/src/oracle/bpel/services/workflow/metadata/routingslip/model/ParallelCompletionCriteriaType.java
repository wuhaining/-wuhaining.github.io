
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parallelCompletionCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parallelCompletionCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultOutcome" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType"/>
 *         &lt;element name="percentageOfOutcome" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" minOccurs="0"/>
 *         &lt;element name="outcomePercentage" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}outcomePercentageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parallelCompletionCriteriaType", propOrder = {
    "defaultOutcome",
    "percentageOfOutcome",
    "outcomePercentage"
})
public class ParallelCompletionCriteriaType {

    @XmlElement(required = true)
    protected ParameterType defaultOutcome;
    protected ParameterType percentageOfOutcome;
    protected List<OutcomePercentageType> outcomePercentage;

    /**
     * Gets the value of the defaultOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getDefaultOutcome() {
        return defaultOutcome;
    }

    /**
     * Sets the value of the defaultOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setDefaultOutcome(ParameterType value) {
        this.defaultOutcome = value;
    }

    /**
     * Gets the value of the percentageOfOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getPercentageOfOutcome() {
        return percentageOfOutcome;
    }

    /**
     * Sets the value of the percentageOfOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setPercentageOfOutcome(ParameterType value) {
        this.percentageOfOutcome = value;
    }

    /**
     * Gets the value of the outcomePercentage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomePercentage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomePercentage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomePercentageType }
     * 
     * 
     */
    public List<OutcomePercentageType> getOutcomePercentage() {
        if (outcomePercentage == null) {
            outcomePercentage = new ArrayList<OutcomePercentageType>();
        }
        return this.outcomePercentage;
    }

}
