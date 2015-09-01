
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type is deprecatd. Use clauseType instead.
 * 
 * <p>Java class for predicateClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predicateClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateOperationEnum"/>
 *         &lt;choice>
 *           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="valueList" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}valueListType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="joinOperator" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateJoinOperatorEnum" />
 *       &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predicateClauseType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "column",
    "operator",
    "value",
    "dateValue",
    "valueList"
})
public class PredicateClauseType {

    protected String column;
    @XmlElement(required = true)
    protected PredicateOperationEnum operator;
    protected String value;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValue;
    protected ValueListType valueList;
    @XmlAttribute
    protected PredicateJoinOperatorEnum joinOperator;
    @XmlAttribute
    protected Boolean ignoreCase;

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
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateOperationEnum }
     *     
     */
    public PredicateOperationEnum getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateOperationEnum }
     *     
     */
    public void setOperator(PredicateOperationEnum value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link ValueListType }
     *     
     */
    public ValueListType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueListType }
     *     
     */
    public void setValueList(ValueListType value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the joinOperator property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateJoinOperatorEnum }
     *     
     */
    public PredicateJoinOperatorEnum getJoinOperator() {
        return joinOperator;
    }

    /**
     * Sets the value of the joinOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateJoinOperatorEnum }
     *     
     */
    public void setJoinOperator(PredicateJoinOperatorEnum value) {
        this.joinOperator = value;
    }

    /**
     * Gets the value of the ignoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

}
