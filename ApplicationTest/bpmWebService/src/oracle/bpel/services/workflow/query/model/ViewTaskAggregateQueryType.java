
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewTaskAggregateQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewTaskAggregateQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultGroupByColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraPredicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defaultOrderByCount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="defaultAscendingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewTaskAggregateQueryType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "viewId",
    "defaultGroupByColumn",
    "extraPredicate"
})
public class ViewTaskAggregateQueryType {

    @XmlElement(required = true)
    protected String viewId;
    @XmlElement(required = true)
    protected String defaultGroupByColumn;
    protected PredicateType extraPredicate;
    @XmlAttribute
    protected Boolean defaultOrderByCount;
    @XmlAttribute
    protected Boolean defaultAscendingOrder;

    /**
     * Gets the value of the viewId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * Sets the value of the viewId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewId(String value) {
        this.viewId = value;
    }

    /**
     * Gets the value of the defaultGroupByColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGroupByColumn() {
        return defaultGroupByColumn;
    }

    /**
     * Sets the value of the defaultGroupByColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGroupByColumn(String value) {
        this.defaultGroupByColumn = value;
    }

    /**
     * Gets the value of the extraPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateType }
     *     
     */
    public PredicateType getExtraPredicate() {
        return extraPredicate;
    }

    /**
     * Sets the value of the extraPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateType }
     *     
     */
    public void setExtraPredicate(PredicateType value) {
        this.extraPredicate = value;
    }

    /**
     * Gets the value of the defaultOrderByCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultOrderByCount() {
        return defaultOrderByCount;
    }

    /**
     * Sets the value of the defaultOrderByCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultOrderByCount(Boolean value) {
        this.defaultOrderByCount = value;
    }

    /**
     * Gets the value of the defaultAscendingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAscendingOrder() {
        return defaultAscendingOrder;
    }

    /**
     * Sets the value of the defaultAscendingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAscendingOrder(Boolean value) {
        this.defaultAscendingOrder = value;
    }

}
