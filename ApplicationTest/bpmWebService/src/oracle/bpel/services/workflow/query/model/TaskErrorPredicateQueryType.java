
package oracle.bpel.services.workflow.query.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskErrorPredicateQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskErrorPredicateQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateType"/>
 *         &lt;element name="ordering" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOrderingType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="startRow" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="endRow" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskErrorPredicateQueryType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "predicate",
    "ordering"
})
public class TaskErrorPredicateQueryType {

    @XmlElement(required = true)
    protected PredicateType predicate;
    protected TaskOrderingType ordering;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startRow;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger endRow;

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateType }
     *     
     */
    public PredicateType getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateType }
     *     
     */
    public void setPredicate(PredicateType value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOrderingType }
     *     
     */
    public TaskOrderingType getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOrderingType }
     *     
     */
    public void setOrdering(TaskOrderingType value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRow(BigInteger value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRow(BigInteger value) {
        this.endRow = value;
    }

}
