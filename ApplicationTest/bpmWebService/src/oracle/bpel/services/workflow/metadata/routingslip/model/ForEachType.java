
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forEachType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forEachType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/routingSlip}participantsType">
 *       &lt;sequence>
 *         &lt;element name="completionCondition" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}forEachCompletionConditionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="counterName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collection" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parallel" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="collaboration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="skipCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="systemStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forEachType", propOrder = {
    "completionCondition"
})
public class ForEachType
    extends ParticipantsType
{

    @XmlElement(required = true)
    protected ForEachCompletionConditionType completionCondition;
    @XmlAttribute(required = true)
    protected String counterName;
    @XmlAttribute(required = true)
    protected String collection;
    @XmlAttribute(required = true)
    protected boolean parallel;
    @XmlAttribute
    protected Boolean collaboration;
    @XmlAttribute
    protected String skipCondition;
    @XmlAttribute
    protected String systemStatus;

    /**
     * Gets the value of the completionCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ForEachCompletionConditionType }
     *     
     */
    public ForEachCompletionConditionType getCompletionCondition() {
        return completionCondition;
    }

    /**
     * Sets the value of the completionCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForEachCompletionConditionType }
     *     
     */
    public void setCompletionCondition(ForEachCompletionConditionType value) {
        this.completionCondition = value;
    }

    /**
     * Gets the value of the counterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterName() {
        return counterName;
    }

    /**
     * Sets the value of the counterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterName(String value) {
        this.counterName = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
    }

    /**
     * Gets the value of the parallel property.
     * 
     */
    public boolean isParallel() {
        return parallel;
    }

    /**
     * Sets the value of the parallel property.
     * 
     */
    public void setParallel(boolean value) {
        this.parallel = value;
    }

    /**
     * Gets the value of the collaboration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollaboration() {
        return collaboration;
    }

    /**
     * Sets the value of the collaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollaboration(Boolean value) {
        this.collaboration = value;
    }

    /**
     * Gets the value of the skipCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipCondition() {
        return skipCondition;
    }

    /**
     * Sets the value of the skipCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipCondition(String value) {
        this.skipCondition = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemStatus(String value) {
        this.systemStatus = value;
    }

}
