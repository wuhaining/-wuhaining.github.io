
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for callbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callbackType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackTypeType" />
 *       &lt;attribute name="disconnectedMode" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}disconnectedModeTypeEnum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callbackType", propOrder = {
    "value"
})
public class CallbackType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected CallbackTypeType type;
    @XmlAttribute
    protected DisconnectedModeTypeEnum disconnectedMode;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CallbackTypeType }
     *     
     */
    public CallbackTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallbackTypeType }
     *     
     */
    public void setType(CallbackTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the disconnectedMode property.
     * 
     * @return
     *     possible object is
     *     {@link DisconnectedModeTypeEnum }
     *     
     */
    public DisconnectedModeTypeEnum getDisconnectedMode() {
        return disconnectedMode;
    }

    /**
     * Sets the value of the disconnectedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisconnectedModeTypeEnum }
     *     
     */
    public void setDisconnectedMode(DisconnectedModeTypeEnum value) {
        this.disconnectedMode = value;
    }

}
