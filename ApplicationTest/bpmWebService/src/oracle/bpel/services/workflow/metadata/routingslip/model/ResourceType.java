
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for resourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}valueType" />
 *       &lt;attribute name="isGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="identityType" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}resourceIdentityType" />
 *       &lt;attribute name="systemAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceType", propOrder = {
    "value"
})
public class ResourceType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected ValueType type;
    @XmlAttribute
    protected Boolean isGroup;
    @XmlAttribute
    protected ResourceIdentityType identityType;
    @XmlAttribute
    protected String systemAttribute;

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
     *     {@link ValueType }
     *     
     */
    public ValueType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setType(ValueType value) {
        this.type = value;
    }

    /**
     * Gets the value of the isGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroup(Boolean value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceIdentityType }
     *     
     */
    public ResourceIdentityType getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceIdentityType }
     *     
     */
    public void setIdentityType(ResourceIdentityType value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the systemAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemAttribute() {
        return systemAttribute;
    }

    /**
     * Sets the value of the systemAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemAttribute(String value) {
        this.systemAttribute = value;
    }

}
