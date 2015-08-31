
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.PrincipleRefType;


/**
 * <p>Java class for viewGrantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewGrantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grantee" type="{http://xmlns.oracle.com/bpel/workflow/common}principleRefType"/>
 *         &lt;element name="grantedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grantedDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viewOwner" type="{http://xmlns.oracle.com/bpel/workflow/common}principleRefType"/>
 *         &lt;element name="originalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="grantType" use="required" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}grantTypeEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewGrantType", propOrder = {
    "viewId",
    "grantee",
    "grantedName",
    "grantedDescription",
    "hidden",
    "viewOwner",
    "originalName",
    "originalDescription"
})
public class ViewGrantType {

    @XmlElement(required = true)
    protected String viewId;
    @XmlElement(required = true)
    protected PrincipleRefType grantee;
    @XmlElement(required = true)
    protected String grantedName;
    @XmlElement(required = true)
    protected String grantedDescription;
    protected boolean hidden;
    @XmlElement(required = true)
    protected PrincipleRefType viewOwner;
    @XmlElement(required = true)
    protected String originalName;
    @XmlElement(required = true)
    protected String originalDescription;
    @XmlAttribute(required = true)
    protected GrantTypeEnum grantType;

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
     * Gets the value of the grantee property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipleRefType }
     *     
     */
    public PrincipleRefType getGrantee() {
        return grantee;
    }

    /**
     * Sets the value of the grantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipleRefType }
     *     
     */
    public void setGrantee(PrincipleRefType value) {
        this.grantee = value;
    }

    /**
     * Gets the value of the grantedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantedName() {
        return grantedName;
    }

    /**
     * Sets the value of the grantedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantedName(String value) {
        this.grantedName = value;
    }

    /**
     * Gets the value of the grantedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantedDescription() {
        return grantedDescription;
    }

    /**
     * Sets the value of the grantedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantedDescription(String value) {
        this.grantedDescription = value;
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
     * Gets the value of the viewOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipleRefType }
     *     
     */
    public PrincipleRefType getViewOwner() {
        return viewOwner;
    }

    /**
     * Sets the value of the viewOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipleRefType }
     *     
     */
    public void setViewOwner(PrincipleRefType value) {
        this.viewOwner = value;
    }

    /**
     * Gets the value of the originalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalName(String value) {
        this.originalName = value;
    }

    /**
     * Gets the value of the originalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Sets the value of the originalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDescription(String value) {
        this.originalDescription = value;
    }

    /**
     * Gets the value of the grantType property.
     * 
     * @return
     *     possible object is
     *     {@link GrantTypeEnum }
     *     
     */
    public GrantTypeEnum getGrantType() {
        return grantType;
    }

    /**
     * Sets the value of the grantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantTypeEnum }
     *     
     */
    public void setGrantType(GrantTypeEnum value) {
        this.grantType = value;
    }

}
