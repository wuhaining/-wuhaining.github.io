
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalGroupListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalGroupListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="name" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType"/>
 *           &lt;element name="allowEmptyApprovalGroup" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" minOccurs="0"/>
 *           &lt;element name="responseType" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}responseType" minOccurs="0"/>
 *           &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="ruleset" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}rulesetType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalGroupListType", propOrder = {
    "name",
    "allowEmptyApprovalGroup",
    "responseType",
    "ruleName",
    "ruleset"
})
public class ApprovalGroupListType {

    protected ParameterType name;
    protected ParameterType allowEmptyApprovalGroup;
    protected ResponseType responseType;
    protected List<String> ruleName;
    protected RulesetType ruleset;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setName(ParameterType value) {
        this.name = value;
    }

    /**
     * Gets the value of the allowEmptyApprovalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getAllowEmptyApprovalGroup() {
        return allowEmptyApprovalGroup;
    }

    /**
     * Sets the value of the allowEmptyApprovalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setAllowEmptyApprovalGroup(ParameterType value) {
        this.allowEmptyApprovalGroup = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponseType(ResponseType value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRuleName() {
        if (ruleName == null) {
            ruleName = new ArrayList<String>();
        }
        return this.ruleName;
    }

    /**
     * Gets the value of the ruleset property.
     * 
     * @return
     *     possible object is
     *     {@link RulesetType }
     *     
     */
    public RulesetType getRuleset() {
        return ruleset;
    }

    /**
     * Sets the value of the ruleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesetType }
     *     
     */
    public void setRuleset(RulesetType value) {
        this.ruleset = value;
    }

}
