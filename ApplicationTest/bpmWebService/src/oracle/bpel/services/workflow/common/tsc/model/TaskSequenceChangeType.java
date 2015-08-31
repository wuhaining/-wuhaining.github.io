
package oracle.bpel.services.workflow.common.tsc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taskSequenceChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskSequenceChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anchorChain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeType" type="{http://xmlns.oracle.com/bpel/workflow/common/tsc}changeTypeType"/>
 *         &lt;element name="anchorType" type="{http://xmlns.oracle.com/bpel/workflow/common/tsc}anchorTypeType"/>
 *         &lt;element name="anchorAssignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeAssignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://xmlns.oracle.com/bpel/workflow/common/tsc}responseTypeType"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfTimesModified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskSequenceChangeType", propOrder = {
    "id",
    "correlationId",
    "anchorChain",
    "changeType",
    "anchorType",
    "anchorAssignee",
    "changeAssignee",
    "responseType",
    "updatedBy",
    "updatedDate",
    "sequence",
    "status",
    "numberOfTimesModified"
})
public class TaskSequenceChangeType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String correlationId;
    @XmlElement(required = true)
    protected String anchorChain;
    @XmlElement(required = true)
    protected ChangeTypeType changeType;
    @XmlElement(required = true)
    protected AnchorTypeType anchorType;
    protected String anchorAssignee;
    protected String changeAssignee;
    @XmlElement(required = true)
    protected ResponseTypeType responseType;
    protected String updatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected Integer sequence;
    protected String status;
    protected Integer numberOfTimesModified;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the anchorChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorChain() {
        return anchorChain;
    }

    /**
     * Sets the value of the anchorChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorChain(String value) {
        this.anchorChain = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeTypeType }
     *     
     */
    public ChangeTypeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeTypeType }
     *     
     */
    public void setChangeType(ChangeTypeType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the anchorType property.
     * 
     * @return
     *     possible object is
     *     {@link AnchorTypeType }
     *     
     */
    public AnchorTypeType getAnchorType() {
        return anchorType;
    }

    /**
     * Sets the value of the anchorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorTypeType }
     *     
     */
    public void setAnchorType(AnchorTypeType value) {
        this.anchorType = value;
    }

    /**
     * Gets the value of the anchorAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorAssignee() {
        return anchorAssignee;
    }

    /**
     * Sets the value of the anchorAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorAssignee(String value) {
        this.anchorAssignee = value;
    }

    /**
     * Gets the value of the changeAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeAssignee() {
        return changeAssignee;
    }

    /**
     * Sets the value of the changeAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeAssignee(String value) {
        this.changeAssignee = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeType }
     *     
     */
    public ResponseTypeType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeType }
     *     
     */
    public void setResponseType(ResponseTypeType value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the numberOfTimesModified property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTimesModified() {
        return numberOfTimesModified;
    }

    /**
     * Sets the value of the numberOfTimesModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTimesModified(Integer value) {
        this.numberOfTimesModified = value;
    }

}
