
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.tsc.model.TaskSequenceChangeType;
import oracle.bpel.services.workflow.task.model.AssignmentContextType;
import oracle.bpel.services.workflow.task.model.CollectionTargetType;
import oracle.bpel.services.workflow.task.model.IdentityType;
import oracle.bpel.services.workflow.task.model.Task;


/**
 * <p>Java class for taskSequenceRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskSequenceRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignees" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}task" minOccurs="0"/>
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
 *         &lt;element name="change" type="{http://xmlns.oracle.com/bpel/workflow/common/tsc}taskSequenceChangeType" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}collectionTarget"/>
 *         &lt;element name="actions" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}actionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignmentContext" type="{http://xmlns.oracle.com/bpel/workflow/task}assignmentContextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pattern" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}patternType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stageDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isFutureTaskSequenceRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dimension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dimensionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chainIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="labelDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskSequenceRecordType", propOrder = {
    "assignees",
    "task",
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
    "change",
    "collectionTarget",
    "actions",
    "assignmentContext"
})
public class TaskSequenceRecordType {

    protected List<IdentityType> assignees;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task")
    protected Task task;
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
    protected TaskSequenceChangeType change;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task", required = true)
    protected CollectionTargetType collectionTarget;
    protected List<ActionsType> actions;
    protected List<AssignmentContextType> assignmentContext;
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
    protected String stage;
    @XmlAttribute
    protected String stageDisplayName;
    @XmlAttribute
    protected Boolean isFutureTaskSequenceRecord;
    @XmlAttribute
    protected String dimension;
    @XmlAttribute
    protected String dimensionIdentifier;
    @XmlAttribute
    protected String chainIdentifier;
    @XmlAttribute
    protected String displayName;
    @XmlAttribute
    protected String labelDisplayName;

    /**
     * Gets the value of the assignees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getAssignees() {
        if (assignees == null) {
            assignees = new ArrayList<IdentityType>();
        }
        return this.assignees;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link Task }
     *     
     */
    public Task getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link Task }
     *     
     */
    public void setTask(Task value) {
        this.task = value;
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
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSequenceChangeType }
     *     
     */
    public TaskSequenceChangeType getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSequenceChangeType }
     *     
     */
    public void setChange(TaskSequenceChangeType value) {
        this.change = value;
    }

    /**
     * Gets the value of the collectionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionTargetType }
     *     
     */
    public CollectionTargetType getCollectionTarget() {
        return collectionTarget;
    }

    /**
     * Sets the value of the collectionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionTargetType }
     *     
     */
    public void setCollectionTarget(CollectionTargetType value) {
        this.collectionTarget = value;
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
     * Gets the value of the assignmentContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentContextType }
     * 
     * 
     */
    public List<AssignmentContextType> getAssignmentContext() {
        if (assignmentContext == null) {
            assignmentContext = new ArrayList<AssignmentContextType>();
        }
        return this.assignmentContext;
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
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the stageDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageDisplayName() {
        return stageDisplayName;
    }

    /**
     * Sets the value of the stageDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageDisplayName(String value) {
        this.stageDisplayName = value;
    }

    /**
     * Gets the value of the isFutureTaskSequenceRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFutureTaskSequenceRecord() {
        return isFutureTaskSequenceRecord;
    }

    /**
     * Sets the value of the isFutureTaskSequenceRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFutureTaskSequenceRecord(Boolean value) {
        this.isFutureTaskSequenceRecord = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimension(String value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the dimensionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionIdentifier() {
        return dimensionIdentifier;
    }

    /**
     * Sets the value of the dimensionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionIdentifier(String value) {
        this.dimensionIdentifier = value;
    }

    /**
     * Gets the value of the chainIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainIdentifier() {
        return chainIdentifier;
    }

    /**
     * Sets the value of the chainIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainIdentifier(String value) {
        this.chainIdentifier = value;
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
     * Gets the value of the labelDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelDisplayName() {
        return labelDisplayName;
    }

    /**
     * Sets the value of the labelDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelDisplayName(String value) {
        this.labelDisplayName = value;
    }

}
