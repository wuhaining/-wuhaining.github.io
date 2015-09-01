
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.task.model.CollectionTargetType;


/**
 * <p>Java class for taskSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskSequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskSequenceRecord"/>
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}parallel"/>
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskSequenceGroup"/>
 *         &lt;/choice>
 *         &lt;element name="flexString1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexString12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actions" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}actionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}collectionTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskSequenceTypes" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskSequenceTypesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pattern" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}patternType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isAggregated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskSequenceType", propOrder = {
    "children",
    "flexString1",
    "flexString2",
    "flexString3",
    "flexString4",
    "flexString5",
    "flexString6",
    "flexString7",
    "flexString8",
    "flexString9",
    "flexString10",
    "flexString11",
    "flexString12",
    "actions",
    "collectionTarget",
    "taskSequenceTypes"
})
public class TaskSequenceType {

    @XmlElements({
        @XmlElement(name = "taskSequenceRecord", type = TaskSequenceRecordType.class),
        @XmlElement(name = "parallel", type = ParallelType.class),
        @XmlElement(name = "taskSequenceGroup", type = TaskSequenceType.class)
    })
    protected List<Object> children;
    protected String flexString1;
    protected String flexString2;
    protected String flexString3;
    protected String flexString4;
    protected String flexString5;
    protected String flexString6;
    protected String flexString7;
    protected String flexString8;
    protected String flexString9;
    protected String flexString10;
    protected String flexString11;
    protected String flexString12;
    protected List<ActionsType> actions;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task")
    protected List<CollectionTargetType> collectionTarget;
    protected List<TaskSequenceTypesType> taskSequenceTypes;
    @XmlAttribute
    protected String id;
    @XmlAttribute(required = true)
    protected String sequenceNumber;
    @XmlAttribute
    protected String label;
    @XmlAttribute
    protected PatternType pattern;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String displayName;
    @XmlAttribute
    protected Boolean isAggregated;

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskSequenceRecordType }
     * {@link ParallelType }
     * {@link TaskSequenceType }
     * 
     * 
     */
    public List<Object> getChildren() {
        if (children == null) {
            children = new ArrayList<Object>();
        }
        return this.children;
    }

    /**
     * Gets the value of the flexString1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString1() {
        return flexString1;
    }

    /**
     * Sets the value of the flexString1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString1(String value) {
        this.flexString1 = value;
    }

    /**
     * Gets the value of the flexString2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString2() {
        return flexString2;
    }

    /**
     * Sets the value of the flexString2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString2(String value) {
        this.flexString2 = value;
    }

    /**
     * Gets the value of the flexString3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString3() {
        return flexString3;
    }

    /**
     * Sets the value of the flexString3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString3(String value) {
        this.flexString3 = value;
    }

    /**
     * Gets the value of the flexString4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString4() {
        return flexString4;
    }

    /**
     * Sets the value of the flexString4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString4(String value) {
        this.flexString4 = value;
    }

    /**
     * Gets the value of the flexString5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString5() {
        return flexString5;
    }

    /**
     * Sets the value of the flexString5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString5(String value) {
        this.flexString5 = value;
    }

    /**
     * Gets the value of the flexString6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString6() {
        return flexString6;
    }

    /**
     * Sets the value of the flexString6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString6(String value) {
        this.flexString6 = value;
    }

    /**
     * Gets the value of the flexString7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString7() {
        return flexString7;
    }

    /**
     * Sets the value of the flexString7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString7(String value) {
        this.flexString7 = value;
    }

    /**
     * Gets the value of the flexString8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString8() {
        return flexString8;
    }

    /**
     * Sets the value of the flexString8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString8(String value) {
        this.flexString8 = value;
    }

    /**
     * Gets the value of the flexString9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString9() {
        return flexString9;
    }

    /**
     * Sets the value of the flexString9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString9(String value) {
        this.flexString9 = value;
    }

    /**
     * Gets the value of the flexString10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString10() {
        return flexString10;
    }

    /**
     * Sets the value of the flexString10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString10(String value) {
        this.flexString10 = value;
    }

    /**
     * Gets the value of the flexString11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString11() {
        return flexString11;
    }

    /**
     * Sets the value of the flexString11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString11(String value) {
        this.flexString11 = value;
    }

    /**
     * Gets the value of the flexString12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexString12() {
        return flexString12;
    }

    /**
     * Sets the value of the flexString12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexString12(String value) {
        this.flexString12 = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionsType }
     * 
     * 
     */
    public List<ActionsType> getActions() {
        if (actions == null) {
            actions = new ArrayList<ActionsType>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the collectionTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionTargetType }
     * 
     * 
     */
    public List<CollectionTargetType> getCollectionTarget() {
        if (collectionTarget == null) {
            collectionTarget = new ArrayList<CollectionTargetType>();
        }
        return this.collectionTarget;
    }

    /**
     * Gets the value of the taskSequenceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskSequenceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskSequenceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskSequenceTypesType }
     * 
     * 
     */
    public List<TaskSequenceTypesType> getTaskSequenceTypes() {
        if (taskSequenceTypes == null) {
            taskSequenceTypes = new ArrayList<TaskSequenceTypesType>();
        }
        return this.taskSequenceTypes;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link PatternType }
     *     
     */
    public PatternType getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatternType }
     *     
     */
    public void setPattern(PatternType value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAggregated() {
        return isAggregated;
    }

    /**
     * Sets the value of the isAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAggregated(Boolean value) {
        this.isAggregated = value;
    }

}
