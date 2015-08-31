
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="httpPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="httpsPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayInfoType", propOrder = {
    "applicationName",
    "hostname",
    "httpPort",
    "httpsPort",
    "uri"
})
public class DisplayInfoType {

    @XmlElement(required = true)
    protected String applicationName;
    @XmlElement(required = true)
    protected String hostname;
    @XmlElement(required = true)
    protected String httpPort;
    @XmlElement(required = true)
    protected String httpsPort;
    @XmlElement(required = true)
    protected String uri;

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
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the httpPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpPort() {
        return httpPort;
    }

    /**
     * Sets the value of the httpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpPort(String value) {
        this.httpPort = value;
    }

    /**
     * Gets the value of the httpsPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpsPort() {
        return httpsPort;
    }

    /**
     * Sets the value of the httpsPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpsPort(String value) {
        this.httpsPort = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
