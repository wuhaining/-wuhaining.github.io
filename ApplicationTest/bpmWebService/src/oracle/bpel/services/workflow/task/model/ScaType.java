
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentComponentInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentComponentInstanceRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerProperties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invokedComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scaType", propOrder = {
    "applicationName",
    "componentName",
    "compositeDN",
    "compositeInstanceId",
    "compositeName",
    "compositeVersion",
    "ecId",
    "parentComponentInstanceId",
    "parentComponentInstanceRefId",
    "headerProperties",
    "invokedComponent",
    "compositeCreatedTime"
})
public class ScaType {

    protected String applicationName;
    protected String componentName;
    protected String compositeDN;
    protected String compositeInstanceId;
    protected String compositeName;
    protected String compositeVersion;
    protected String ecId;
    protected String parentComponentInstanceId;
    protected String parentComponentInstanceRefId;
    protected String headerProperties;
    protected String invokedComponent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar compositeCreatedTime;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the compositeDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeDN() {
        return compositeDN;
    }

    /**
     * Sets the value of the compositeDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeDN(String value) {
        this.compositeDN = value;
    }

    /**
     * Gets the value of the compositeInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeInstanceId() {
        return compositeInstanceId;
    }

    /**
     * Sets the value of the compositeInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeInstanceId(String value) {
        this.compositeInstanceId = value;
    }

    /**
     * Gets the value of the compositeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeName() {
        return compositeName;
    }

    /**
     * Sets the value of the compositeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeName(String value) {
        this.compositeName = value;
    }

    /**
     * Gets the value of the compositeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeVersion() {
        return compositeVersion;
    }

    /**
     * Sets the value of the compositeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeVersion(String value) {
        this.compositeVersion = value;
    }

    /**
     * Gets the value of the ecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcId() {
        return ecId;
    }

    /**
     * Sets the value of the ecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcId(String value) {
        this.ecId = value;
    }

    /**
     * Gets the value of the parentComponentInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentComponentInstanceId() {
        return parentComponentInstanceId;
    }

    /**
     * Sets the value of the parentComponentInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentComponentInstanceId(String value) {
        this.parentComponentInstanceId = value;
    }

    /**
     * Gets the value of the parentComponentInstanceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentComponentInstanceRefId() {
        return parentComponentInstanceRefId;
    }

    /**
     * Sets the value of the parentComponentInstanceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentComponentInstanceRefId(String value) {
        this.parentComponentInstanceRefId = value;
    }

    /**
     * Gets the value of the headerProperties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderProperties() {
        return headerProperties;
    }

    /**
     * Sets the value of the headerProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderProperties(String value) {
        this.headerProperties = value;
    }

    /**
     * Gets the value of the invokedComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokedComponent() {
        return invokedComponent;
    }

    /**
     * Sets the value of the invokedComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokedComponent(String value) {
        this.invokedComponent = value;
    }

    /**
     * Gets the value of the compositeCreatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompositeCreatedTime() {
        return compositeCreatedTime;
    }

    /**
     * Sets the value of the compositeCreatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompositeCreatedTime(XMLGregorianCalendar value) {
        this.compositeCreatedTime = value;
    }

}
