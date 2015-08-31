
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.PrincipleRefType;


/**
 * <p>Java class for viewGranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewGranteeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/common}principleRefType">
 *       &lt;attribute name="grantType" use="required" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}grantTypeEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewGranteeType")
public class ViewGranteeType
    extends PrincipleRefType
{

    @XmlAttribute(required = true)
    protected GrantTypeEnum grantType;

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
