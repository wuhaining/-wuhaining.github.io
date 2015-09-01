
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for UpdateEvidenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateEvidenceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element name="evidenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdatableEvidenceAttributes" type="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}UpdatableEvidenceAttributesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateEvidenceRequestType", propOrder = {
    "workflowContext",
    "evidenceId",
    "updatableEvidenceAttributes"
})
public class UpdateEvidenceRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(required = true)
    protected String evidenceId;
    @XmlElement(name = "UpdatableEvidenceAttributes", required = true)
    protected UpdatableEvidenceAttributesType updatableEvidenceAttributes;

    /**
     * Gets the value of the workflowContext property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowContextType }
     *     
     */
    public WorkflowContextType getWorkflowContext() {
        return workflowContext;
    }

    /**
     * Sets the value of the workflowContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowContextType }
     *     
     */
    public void setWorkflowContext(WorkflowContextType value) {
        this.workflowContext = value;
    }

    /**
     * Gets the value of the evidenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidenceId() {
        return evidenceId;
    }

    /**
     * Sets the value of the evidenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidenceId(String value) {
        this.evidenceId = value;
    }

    /**
     * Gets the value of the updatableEvidenceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatableEvidenceAttributesType }
     *     
     */
    public UpdatableEvidenceAttributesType getUpdatableEvidenceAttributes() {
        return updatableEvidenceAttributes;
    }

    /**
     * Sets the value of the updatableEvidenceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatableEvidenceAttributesType }
     *     
     */
    public void setUpdatableEvidenceAttributes(UpdatableEvidenceAttributesType value) {
        this.updatableEvidenceAttributes = value;
    }

}
