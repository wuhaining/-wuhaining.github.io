
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EvidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvidenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evidenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskSubStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskOutcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wfType" type="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}WFTypeEnumType"/>
 *         &lt;element name="certIssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}PolicyEnumType"/>
 *         &lt;element name="plainText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plainTextEnc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "EvidenceType", propOrder = {
    "evidenceId",
    "taskId",
    "taskNumber",
    "taskVersion",
    "taskPriority",
    "taskTitle",
    "taskStatus",
    "taskSubStatus",
    "taskOutcome",
    "wfType",
    "certIssuerName",
    "certificateId",
    "policy",
    "plainText",
    "plainTextEnc",
    "signature",
    "createDate",
    "signedDate",
    "updatableEvidenceAttributes"
})
public class EvidenceType {

    @XmlElement(required = true)
    protected String evidenceId;
    @XmlElement(required = true)
    protected String taskId;
    protected int taskNumber;
    protected int taskVersion;
    protected int taskPriority;
    @XmlElement(required = true)
    protected String taskTitle;
    @XmlElement(required = true)
    protected String taskStatus;
    @XmlElement(required = true)
    protected String taskSubStatus;
    @XmlElement(required = true)
    protected String taskOutcome;
    @XmlElement(required = true)
    protected WFTypeEnumType wfType;
    protected String certIssuerName;
    protected String certificateId;
    @XmlElement(required = true)
    protected PolicyEnumType policy;
    @XmlElement(required = true)
    protected String plainText;
    @XmlElement(required = true)
    protected String plainTextEnc;
    @XmlElement(required = true)
    protected String signature;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signedDate;
    @XmlElement(name = "UpdatableEvidenceAttributes", required = true)
    protected UpdatableEvidenceAttributesType updatableEvidenceAttributes;

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
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskNumber property.
     * 
     */
    public int getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     */
    public void setTaskNumber(int value) {
        this.taskNumber = value;
    }

    /**
     * Gets the value of the taskVersion property.
     * 
     */
    public int getTaskVersion() {
        return taskVersion;
    }

    /**
     * Sets the value of the taskVersion property.
     * 
     */
    public void setTaskVersion(int value) {
        this.taskVersion = value;
    }

    /**
     * Gets the value of the taskPriority property.
     * 
     */
    public int getTaskPriority() {
        return taskPriority;
    }

    /**
     * Sets the value of the taskPriority property.
     * 
     */
    public void setTaskPriority(int value) {
        this.taskPriority = value;
    }

    /**
     * Gets the value of the taskTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * Sets the value of the taskTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskTitle(String value) {
        this.taskTitle = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the taskSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskSubStatus() {
        return taskSubStatus;
    }

    /**
     * Sets the value of the taskSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskSubStatus(String value) {
        this.taskSubStatus = value;
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
     * Gets the value of the wfType property.
     * 
     * @return
     *     possible object is
     *     {@link WFTypeEnumType }
     *     
     */
    public WFTypeEnumType getWfType() {
        return wfType;
    }

    /**
     * Sets the value of the wfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFTypeEnumType }
     *     
     */
    public void setWfType(WFTypeEnumType value) {
        this.wfType = value;
    }

    /**
     * Gets the value of the certIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertIssuerName() {
        return certIssuerName;
    }

    /**
     * Sets the value of the certIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertIssuerName(String value) {
        this.certIssuerName = value;
    }

    /**
     * Gets the value of the certificateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Sets the value of the certificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateId(String value) {
        this.certificateId = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyEnumType }
     *     
     */
    public PolicyEnumType getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyEnumType }
     *     
     */
    public void setPolicy(PolicyEnumType value) {
        this.policy = value;
    }

    /**
     * Gets the value of the plainText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Sets the value of the plainText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Gets the value of the plainTextEnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainTextEnc() {
        return plainTextEnc;
    }

    /**
     * Sets the value of the plainTextEnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainTextEnc(String value) {
        this.plainTextEnc = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
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
