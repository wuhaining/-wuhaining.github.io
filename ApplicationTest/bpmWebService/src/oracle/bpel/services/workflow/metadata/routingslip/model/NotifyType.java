
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notifyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notifyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/routingSlip}genericParticipantType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="user" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="group" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="address" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}addressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="email" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}emailType"/>
 *           &lt;element name="voice" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}voiceType"/>
 *           &lt;element name="sms" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}smsType"/>
 *           &lt;element name="fax" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}faxType"/>
 *           &lt;element name="pager" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}pagerType"/>
 *         &lt;/choice>
 *         &lt;element name="properties" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}propertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifyType", propOrder = {
    "userOrGroupOrAddress",
    "email",
    "voice",
    "sms",
    "fax",
    "pager",
    "properties"
})
public class NotifyType
    extends GenericParticipantType
{

    @XmlElementRefs({
        @XmlElementRef(name = "group", namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", type = JAXBElement.class),
        @XmlElementRef(name = "user", namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", type = JAXBElement.class),
        @XmlElementRef(name = "address", namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userOrGroupOrAddress;
    protected EmailType email;
    protected VoiceType voice;
    protected SmsType sms;
    protected FaxType fax;
    protected PagerType pager;
    protected PropertiesType properties;

    /**
     * Gets the value of the userOrGroupOrAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userOrGroupOrAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserOrGroupOrAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserOrGroupOrAddress() {
        if (userOrGroupOrAddress == null) {
            userOrGroupOrAddress = new ArrayList<JAXBElement<?>>();
        }
        return this.userOrGroupOrAddress;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the voice property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceType }
     *     
     */
    public VoiceType getVoice() {
        return voice;
    }

    /**
     * Sets the value of the voice property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceType }
     *     
     */
    public void setVoice(VoiceType value) {
        this.voice = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link SmsType }
     *     
     */
    public SmsType getSms() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsType }
     *     
     */
    public void setSms(SmsType value) {
        this.sms = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link FaxType }
     *     
     */
    public FaxType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxType }
     *     
     */
    public void setFax(FaxType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link PagerType }
     *     
     */
    public PagerType getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagerType }
     *     
     */
    public void setPager(PagerType value) {
        this.pager = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

}
