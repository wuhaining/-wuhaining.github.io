
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}filter"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}filterPredicate"/>
 *       &lt;/choice>
 *       &lt;attribute name="unaryOperator" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}UnaryOperatorEnumType" fixed="NOT" />
 *       &lt;attribute name="logicalOperator" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}LogicalOperatorEnumType" default="AND" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "filterOrFilterPredicate"
})
public class FilterType {

    @XmlElements({
        @XmlElement(name = "filterPredicate", type = FilterPredicateType.class),
        @XmlElement(name = "filter", type = FilterType.class)
    })
    protected List<Object> filterOrFilterPredicate;
    @XmlAttribute
    protected UnaryOperatorEnumType unaryOperator;
    @XmlAttribute
    protected LogicalOperatorEnumType logicalOperator;

    /**
     * Gets the value of the filterOrFilterPredicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterOrFilterPredicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterOrFilterPredicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterPredicateType }
     * {@link FilterType }
     * 
     * 
     */
    public List<Object> getFilterOrFilterPredicate() {
        if (filterOrFilterPredicate == null) {
            filterOrFilterPredicate = new ArrayList<Object>();
        }
        return this.filterOrFilterPredicate;
    }

    /**
     * Gets the value of the unaryOperator property.
     * 
     * @return
     *     possible object is
     *     {@link UnaryOperatorEnumType }
     *     
     */
    public UnaryOperatorEnumType getUnaryOperator() {
        if (unaryOperator == null) {
            return UnaryOperatorEnumType.NOT;
        } else {
            return unaryOperator;
        }
    }

    /**
     * Sets the value of the unaryOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaryOperatorEnumType }
     *     
     */
    public void setUnaryOperator(UnaryOperatorEnumType value) {
        this.unaryOperator = value;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperatorEnumType }
     *     
     */
    public LogicalOperatorEnumType getLogicalOperator() {
        if (logicalOperator == null) {
            return LogicalOperatorEnumType.AND;
        } else {
            return logicalOperator;
        }
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperatorEnumType }
     *     
     */
    public void setLogicalOperator(LogicalOperatorEnumType value) {
        this.logicalOperator = value;
    }

}
