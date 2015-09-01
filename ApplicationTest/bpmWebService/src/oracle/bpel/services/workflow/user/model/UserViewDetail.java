
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oracle.bpel.services.workflow.common.model.PrincipleRefType;
import oracle.bpel.services.workflow.query.model.PredicateType;
import oracle.bpel.services.workflow.query.model.TaskOptionalInfoType;
import oracle.bpel.services.workflow.query.model.TaskOrderingType;
import oracle.bpel.services.workflow.query.model.TaskPredicateType;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owner" type="{http://xmlns.oracle.com/bpel/workflow/common}principleRefType"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="presentationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;sequence>
 *             &lt;element name="viewColumns" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}columnListType"/>
 *             &lt;element name="viewOptionalInfo" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOptionalInfoType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="viewPredicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskPredicateType"/>
 *         &lt;element name="viewHistoryPredicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateType" minOccurs="0"/>
 *         &lt;element name="viewOrdering" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOrderingType"/>
 *         &lt;element name="grantees" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}viewGranteeListType"/>
 *         &lt;element name="chart" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}chartType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="viewType" use="required" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}viewTypeEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "owner",
    "hidden",
    "description",
    "createdDate",
    "updatedDate",
    "presentationId",
    "viewColumns",
    "viewOptionalInfo",
    "viewPredicate",
    "viewHistoryPredicate",
    "viewOrdering",
    "grantees",
    "chart"
})
@XmlRootElement(name = "userViewDetail")
public class UserViewDetail {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected PrincipleRefType owner;
    protected boolean hidden;
    @XmlElement(required = true)
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected String presentationId;
    protected ColumnListType viewColumns;
    protected TaskOptionalInfoType viewOptionalInfo;
    @XmlElement(required = true)
    protected TaskPredicateType viewPredicate;
    protected PredicateType viewHistoryPredicate;
    @XmlElement(required = true)
    protected TaskOrderingType viewOrdering;
    @XmlElement(required = true)
    protected ViewGranteeListType grantees;
    protected ChartType chart;
    @XmlAttribute(required = true)
    protected ViewTypeEnum viewType;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipleRefType }
     *     
     */
    public PrincipleRefType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipleRefType }
     *     
     */
    public void setOwner(PrincipleRefType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

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
     * Gets the value of the viewColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnListType }
     *     
     */
    public ColumnListType getViewColumns() {
        return viewColumns;
    }

    /**
     * Sets the value of the viewColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnListType }
     *     
     */
    public void setViewColumns(ColumnListType value) {
        this.viewColumns = value;
    }

    /**
     * Gets the value of the viewOptionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public TaskOptionalInfoType getViewOptionalInfo() {
        return viewOptionalInfo;
    }

    /**
     * Sets the value of the viewOptionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public void setViewOptionalInfo(TaskOptionalInfoType value) {
        this.viewOptionalInfo = value;
    }

    /**
     * Gets the value of the viewPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link TaskPredicateType }
     *     
     */
    public TaskPredicateType getViewPredicate() {
        return viewPredicate;
    }

    /**
     * Sets the value of the viewPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskPredicateType }
     *     
     */
    public void setViewPredicate(TaskPredicateType value) {
        this.viewPredicate = value;
    }

    /**
     * Gets the value of the viewHistoryPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateType }
     *     
     */
    public PredicateType getViewHistoryPredicate() {
        return viewHistoryPredicate;
    }

    /**
     * Sets the value of the viewHistoryPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateType }
     *     
     */
    public void setViewHistoryPredicate(PredicateType value) {
        this.viewHistoryPredicate = value;
    }

    /**
     * Gets the value of the viewOrdering property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOrderingType }
     *     
     */
    public TaskOrderingType getViewOrdering() {
        return viewOrdering;
    }

    /**
     * Sets the value of the viewOrdering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOrderingType }
     *     
     */
    public void setViewOrdering(TaskOrderingType value) {
        this.viewOrdering = value;
    }

    /**
     * Gets the value of the grantees property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGranteeListType }
     *     
     */
    public ViewGranteeListType getGrantees() {
        return grantees;
    }

    /**
     * Sets the value of the grantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGranteeListType }
     *     
     */
    public void setGrantees(ViewGranteeListType value) {
        this.grantees = value;
    }

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link ChartType }
     *     
     */
    public ChartType getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartType }
     *     
     */
    public void setChart(ChartType value) {
        this.chart = value;
    }

    /**
     * Gets the value of the viewType property.
     * 
     * @return
     *     possible object is
     *     {@link ViewTypeEnum }
     *     
     */
    public ViewTypeEnum getViewType() {
        return viewType;
    }

    /**
     * Sets the value of the viewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewTypeEnum }
     *     
     */
    public void setViewType(ViewTypeEnum value) {
        this.viewType = value;
    }

}
