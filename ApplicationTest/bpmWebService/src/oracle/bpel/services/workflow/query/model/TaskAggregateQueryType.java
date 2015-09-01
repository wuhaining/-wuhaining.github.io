
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskAggregateQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskAggregateQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupByColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="predicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskPredicateType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orderByCount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ascendingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskAggregateQueryType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "groupByColumn",
    "predicate"
})
public class TaskAggregateQueryType {

    @XmlElement(required = true)
    protected String groupByColumn;
    @XmlElement(required = true)
    protected TaskPredicateType predicate;
    @XmlAttribute
    protected Boolean orderByCount;
    @XmlAttribute
    protected Boolean ascendingOrder;

    /**
     * Gets the value of the groupByColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupByColumn() {
        return groupByColumn;
    }

    /**
     * Sets the value of the groupByColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupByColumn(String value) {
        this.groupByColumn = value;
    }

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link TaskPredicateType }
     *     
     */
    public TaskPredicateType getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskPredicateType }
     *     
     */
    public void setPredicate(TaskPredicateType value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the orderByCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderByCount() {
        return orderByCount;
    }

    /**
     * Sets the value of the orderByCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderByCount(Boolean value) {
        this.orderByCount = value;
    }

    /**
     * Gets the value of the ascendingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * Sets the value of the ascendingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAscendingOrder(Boolean value) {
        this.ascendingOrder = value;
    }

}
