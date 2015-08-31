
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for EvidenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvidenceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromSignedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toSignedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="signaturePolicy" type="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}PolicyEnumType" minOccurs="0"/>
 *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signatureStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskOutcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}PolicyEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceRequestType", propOrder = {
    "workflowContext",
    "userName",
    "fromSignedDate",
    "toSignedDate",
    "taskNumber",
    "signaturePolicy",
    "signedDate",
    "signatureStatus",
    "verifiedDate",
    "taskOutcome",
    "operator"
})
public class EvidenceRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    protected String userName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromSignedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toSignedDate;
    protected Integer taskNumber;
    protected PolicyEnumType signaturePolicy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signedDate;
    protected String signatureStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verifiedDate;
    @XmlElement(required = true)
    protected String taskOutcome;
    protected PolicyEnumType operator;

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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the fromSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromSignedDate() {
        return fromSignedDate;
    }

    /**
     * Sets the value of the fromSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromSignedDate(XMLGregorianCalendar value) {
        this.fromSignedDate = value;
    }

    /**
     * Gets the value of the toSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToSignedDate() {
        return toSignedDate;
    }

    /**
     * Sets the value of the toSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToSignedDate(XMLGregorianCalendar value) {
        this.toSignedDate = value;
    }

    /**
     * Gets the value of the taskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskNumber(Integer value) {
        this.taskNumber = value;
    }

    /**
     * Gets the value of the signaturePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyEnumType }
     *     
     */
    public PolicyEnumType getSignaturePolicy() {
        return signaturePolicy;
    }

    /**
     * Sets the value of the signaturePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyEnumType }
     *     
     */
    public void setSignaturePolicy(PolicyEnumType value) {
        this.signaturePolicy = value;
    }

    /**
     * Gets the value of the signedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
    }

    /**
     * Gets the value of the signatureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureStatus() {
        return signatureStatus;
    }

    /**
     * Sets the value of the signatureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureStatus(String value) {
        this.signatureStatus = value;
    }

    /**
     * Gets the value of the verifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerifiedDate() {
        return verifiedDate;
    }

    /**
     * Sets the value of the verifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerifiedDate(XMLGregorianCalendar value) {
        this.verifiedDate = value;
    }

    /**
     * Gets the value of the taskOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOutcome() {
        return taskOutcome;
    }

    /**
     * Sets the value of the taskOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOutcome(String value) {
        this.taskOutcome = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyEnumType }
     *     
     */
    public PolicyEnumType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyEnumType }
     *     
     */
    public void setOperator(PolicyEnumType value) {
        this.operator = value;
    }

}
