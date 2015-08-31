
package oracle.bpel.services.workflow.query.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskPredicateQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskPredicateQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="presentationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;sequence>
 *             &lt;element name="displayColumnList" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}displayColumnType" minOccurs="0"/>
 *             &lt;element name="optionalInfoList" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOptionalInfoType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="predicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskPredicateType"/>
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
@XmlType(name = "taskPredicateQueryType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "presentationId",
    "displayColumnList",
    "optionalInfoList",
    "predicate",
    "ordering"
})
public class TaskPredicateQueryType {

    protected String presentationId;
    protected DisplayColumnType displayColumnList;
    protected TaskOptionalInfoType optionalInfoList;
    @XmlElement(required = true)
    protected TaskPredicateType predicate;
    protected TaskOrderingType ordering;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startRow;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger endRow;

    /**
     * Gets the value of the presentationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationId() {
        return presentationId;
    }

    /**
     * Sets the value of the presentationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationId(String value) {
        this.presentationId = value;
    }

    /**
     * Gets the value of the displayColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayColumnType }
     *     
     */
    public DisplayColumnType getDisplayColumnList() {
        return displayColumnList;
    }

    /**
     * Sets the value of the displayColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayColumnType }
     *     
     */
    public void setDisplayColumnList(DisplayColumnType value) {
        this.displayColumnList = value;
    }

    /**
     * Gets the value of the optionalInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public TaskOptionalInfoType getOptionalInfoList() {
        return optionalInfoList;
    }

    /**
     * Sets the value of the optionalInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public void setOptionalInfoList(TaskOptionalInfoType value) {
        this.optionalInfoList = value;
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
