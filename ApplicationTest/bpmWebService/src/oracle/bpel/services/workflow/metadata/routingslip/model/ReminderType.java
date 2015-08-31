
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reminderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reminderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="reminderDuration" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recurrence" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}recurrenceType" />
 *       &lt;attribute name="relativeDate" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}relativeDateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reminderType")
public class ReminderType {

    @XmlAttribute(required = true)
    protected String reminderDuration;
    @XmlAttribute(required = true)
    protected String recurrence;
    @XmlAttribute(required = true)
    protected RelativeDateType relativeDate;

    /**
     * Gets the value of the reminderDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderDuration() {
        return reminderDuration;
    }

    /**
     * Sets the value of the reminderDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderDuration(String value) {
        this.reminderDuration = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrence(String value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the relativeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateType }
     *     
     */
    public RelativeDateType getRelativeDate() {
        return relativeDate;
    }

    /**
     * Sets the value of the relativeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateType }
     *     
     */
    public void setRelativeDate(RelativeDateType value) {
        this.relativeDate = value;
    }

}
