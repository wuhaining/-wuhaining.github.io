
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forEachCompletionConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forEachCompletionConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="firstResponder" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}firstResponderType"/>
 *         &lt;element name="allResponders" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parallelCompletionCriteriaType"/>
 *         &lt;element name="vote" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parallelCompletionCriteriaType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forEachCompletionConditionType", propOrder = {
    "firstResponder",
    "allResponders",
    "vote"
})
public class ForEachCompletionConditionType {

    protected FirstResponderType firstResponder;
    protected ParallelCompletionCriteriaType allResponders;
    protected ParallelCompletionCriteriaType vote;

    /**
     * Gets the value of the firstResponder property.
     * 
     * @return
     *     possible object is
     *     {@link FirstResponderType }
     *     
     */
    public FirstResponderType getFirstResponder() {
        return firstResponder;
    }

    /**
     * Sets the value of the firstResponder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstResponderType }
     *     
     */
    public void setFirstResponder(FirstResponderType value) {
        this.firstResponder = value;
    }

    /**
     * Gets the value of the allResponders property.
     * 
     * @return
     *     possible object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public ParallelCompletionCriteriaType getAllResponders() {
        return allResponders;
    }

    /**
     * Sets the value of the allResponders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public void setAllResponders(ParallelCompletionCriteriaType value) {
        this.allResponders = value;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public ParallelCompletionCriteriaType getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public void setVote(ParallelCompletionCriteriaType value) {
        this.vote = value;
    }

}
