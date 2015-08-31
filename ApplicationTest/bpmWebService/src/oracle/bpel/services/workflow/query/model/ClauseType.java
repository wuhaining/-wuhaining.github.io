
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oracle.bpel.services.workflow.task.model.IdentityType;


/**
 * <p>Java class for clauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}columnType" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateOperationEnum"/>
 *         &lt;choice>
 *           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="valueList" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}valueListType" minOccurs="0"/>
 *           &lt;element name="columnValue" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}columnType" minOccurs="0"/>
 *           &lt;element name="identityTypeValue" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" minOccurs="0"/>
 *           &lt;element name="identityTypeValueList" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}identityTypeValueListType" minOccurs="0"/>
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
@XmlType(name = "clauseType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "column",
    "operator",
    "value",
    "dateValue",
    "valueList",
    "columnValue",
    "identityTypeValue",
    "identityTypeValueList"
})
public class ClauseType {

    protected ColumnType column;
    @XmlElement(required = true)
    protected PredicateOperationEnum operator;
    protected String value;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValue;
    protected ValueListType valueList;
    protected ColumnType columnValue;
    protected IdentityType identityTypeValue;
    protected IdentityTypeValueListType identityTypeValueList;
    @XmlAttribute
    protected PredicateJoinOperatorEnum joinOperator;
    @XmlAttribute
    protected Boolean ignoreCase;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnType }
     *     
     */
    public ColumnType getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnType }
     *     
     */
    public void setColumn(ColumnType value) {
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
     * Gets the value of the columnValue property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnType }
     *     
     */
    public ColumnType getColumnValue() {
        return columnValue;
    }

    /**
     * Sets the value of the columnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnType }
     *     
     */
    public void setColumnValue(ColumnType value) {
        this.columnValue = value;
    }

    /**
     * Gets the value of the identityTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getIdentityTypeValue() {
        return identityTypeValue;
    }

    /**
     * Sets the value of the identityTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setIdentityTypeValue(IdentityType value) {
        this.identityTypeValue = value;
    }

    /**
     * Gets the value of the identityTypeValueList property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTypeValueListType }
     *     
     */
    public IdentityTypeValueListType getIdentityTypeValueList() {
        return identityTypeValueList;
    }

    /**
     * Sets the value of the identityTypeValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTypeValueListType }
     *     
     */
    public void setIdentityTypeValueList(IdentityTypeValueListType value) {
        this.identityTypeValueList = value;
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
