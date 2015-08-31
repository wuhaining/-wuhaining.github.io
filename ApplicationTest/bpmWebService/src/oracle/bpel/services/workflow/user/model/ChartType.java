
package oracle.bpel.services.workflow.user.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupByColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "chartType", propOrder = {
    "groupByColumn",
    "selectValues"
})
public class ChartType {

    @XmlElement(required = true)
    protected String groupByColumn;
    protected ChartType.SelectValues selectValues;
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
     * Gets the value of the selectValues property.
     * 
     * @return
     *     possible object is
     *     {@link ChartType.SelectValues }
     *     
     */
    public ChartType.SelectValues getSelectValues() {
        return selectValues;
    }

    /**
     * Sets the value of the selectValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartType.SelectValues }
     *     
     */
    public void setSelectValues(ChartType.SelectValues value) {
        this.selectValues = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SelectValues {

        protected List<String> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

    }

}
