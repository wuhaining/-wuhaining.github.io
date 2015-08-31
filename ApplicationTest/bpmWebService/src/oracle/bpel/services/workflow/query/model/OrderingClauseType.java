
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderingClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderingClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="aggregateColumnAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="sortOrder" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}sortOrderEnum"/>
 *         &lt;element name="nullFirst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderingClauseType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "column",
    "table",
    "aggregateColumnAlias",
    "sortOrder",
    "nullFirst"
})
public class OrderingClauseType {

    protected String column;
    protected String table;
    protected String aggregateColumnAlias;
    @XmlElement(required = true)
    protected SortOrderEnum sortOrder;
    protected boolean nullFirst;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the aggregateColumnAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateColumnAlias() {
        return aggregateColumnAlias;
    }

    /**
     * Sets the value of the aggregateColumnAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateColumnAlias(String value) {
        this.aggregateColumnAlias = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderEnum }
     *     
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderEnum }
     *     
     */
    public void setSortOrder(SortOrderEnum value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the nullFirst property.
     * 
     */
    public boolean isNullFirst() {
        return nullFirst;
    }

    /**
     * Sets the value of the nullFirst property.
     * 
     */
    public void setNullFirst(boolean value) {
        this.nullFirst = value;
    }

}
