
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for actionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}actionNameType" />
 *       &lt;attribute name="recipient" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}recipientType" />
 *       &lt;attribute name="adhocRecipients" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wordMLXSLT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xslt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionType", propOrder = {
    "value"
})
public class ActionType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected ActionNameType name;
    @XmlAttribute(required = true)
    protected RecipientType recipient;
    @XmlAttribute
    protected String adhocRecipients;
    @XmlAttribute
    protected String wordMLXSLT;
    @XmlAttribute
    protected String xslt;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ActionNameType }
     *     
     */
    public ActionNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionNameType }
     *     
     */
    public void setName(ActionNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setRecipient(RecipientType value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the adhocRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdhocRecipients() {
        return adhocRecipients;
    }

    /**
     * Sets the value of the adhocRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdhocRecipients(String value) {
        this.adhocRecipients = value;
    }

    /**
     * Gets the value of the wordMLXSLT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordMLXSLT() {
        return wordMLXSLT;
    }

    /**
     * Sets the value of the wordMLXSLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordMLXSLT(String value) {
        this.wordMLXSLT = value;
    }

    /**
     * Gets the value of the xslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXslt() {
        return xslt;
    }

    /**
     * Sets the value of the xslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXslt(String value) {
        this.xslt = value;
    }

}
