
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parallelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parallelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/routingSlip}genericParticipantType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="firstResponder" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}firstResponderType"/>
 *           &lt;element name="allResponders" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parallelCompletionCriteriaType"/>
 *           &lt;element name="vote" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parallelCompletionCriteriaType"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}resource"/>
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}routingSlip"/>
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}list"/>
 *         &lt;/choice>
 *         &lt;element name="properties" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}propertiesType" minOccurs="0"/>
 *         &lt;element name="assignmentContext" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}assignmentContextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dynamicAssignment" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}dynamicAssignmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expirationDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collaboration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parallelType", propOrder = {
    "firstResponder",
    "allResponders",
    "vote",
    "resourceOrRoutingSlip",
    "properties",
    "assignmentContext",
    "dynamicAssignment"
})
public class ParallelType
    extends GenericParticipantType
{

    protected FirstResponderType firstResponder;
    protected ParallelCompletionCriteriaType allResponders;
    protected ParallelCompletionCriteriaType vote;
    @XmlElements({
        @XmlElement(name = "resource", type = ResourceType.class),
        @XmlElement(name = "list", type = ListType.class),
        @XmlElement(name = "routingSlip", type = RoutingSlip.class)
    })
    protected List<Object> resourceOrRoutingSlip;
    protected PropertiesType properties;
    protected List<AssignmentContextType> assignmentContext;
    protected DynamicAssignmentType dynamicAssignment;
    @XmlAttribute
    protected String expirationDuration;
    @XmlAttribute
    protected Boolean collaboration;

    /**
     * Gets the value of the firstResponder property.
     * 
     * @return
     *     possible object is
     *     {@link FirstResponderType }
     *     
     */
    public FirstResponderType getFirstResponder() {
        return firstResponder;
    }

    /**
     * Sets the value of the firstResponder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstResponderType }
     *     
     */
    public void setFirstResponder(FirstResponderType value) {
        this.firstResponder = value;
    }

    /**
     * Gets the value of the allResponders property.
     * 
     * @return
     *     possible object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public ParallelCompletionCriteriaType getAllResponders() {
        return allResponders;
    }

    /**
     * Sets the value of the allResponders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public void setAllResponders(ParallelCompletionCriteriaType value) {
        this.allResponders = value;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public ParallelCompletionCriteriaType getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParallelCompletionCriteriaType }
     *     
     */
    public void setVote(ParallelCompletionCriteriaType value) {
        this.vote = value;
    }

    /**
     * Gets the value of the resourceOrRoutingSlip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceOrRoutingSlip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceOrRoutingSlip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * {@link ListType }
     * {@link RoutingSlip }
     * 
     * 
     */
    public List<Object> getResourceOrRoutingSlip() {
        if (resourceOrRoutingSlip == null) {
            resourceOrRoutingSlip = new ArrayList<Object>();
        }
        return this.resourceOrRoutingSlip;
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

    /**
     * Gets the value of the assignmentContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentContextType }
     * 
     * 
     */
    public List<AssignmentContextType> getAssignmentContext() {
        if (assignmentContext == null) {
            assignmentContext = new ArrayList<AssignmentContextType>();
        }
        return this.assignmentContext;
    }

    /**
     * Gets the value of the dynamicAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAssignmentType }
     *     
     */
    public DynamicAssignmentType getDynamicAssignment() {
        return dynamicAssignment;
    }

    /**
     * Sets the value of the dynamicAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAssignmentType }
     *     
     */
    public void setDynamicAssignment(DynamicAssignmentType value) {
        this.dynamicAssignment = value;
    }

    /**
     * Gets the value of the expirationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDuration() {
        return expirationDuration;
    }

    /**
     * Sets the value of the expirationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDuration(String value) {
        this.expirationDuration = value;
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

}
