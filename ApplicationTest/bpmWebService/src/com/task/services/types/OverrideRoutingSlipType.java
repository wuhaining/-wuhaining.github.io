
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overrideRoutingSlipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overrideRoutingSlipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}taskServiceContextTaskTaskIdBaseType">
 *       &lt;sequence>
 *         &lt;element name="routingSlipURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overrideRoutingSlipType", propOrder = {
    "routingSlipURI"
})
public class OverrideRoutingSlipType
    extends TaskServiceContextTaskTaskIdBaseType
{

    @XmlElement(required = true)
    protected String routingSlipURI;

    /**
     * Gets the value of the routingSlipURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingSlipURI() {
        return routingSlipURI;
    }

    /**
     * Sets the value of the routingSlipURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingSlipURI(String value) {
        this.routingSlipURI = value;
    }

}
