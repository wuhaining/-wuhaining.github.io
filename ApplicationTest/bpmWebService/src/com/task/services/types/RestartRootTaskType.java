
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for restartRootTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restartRootTaskType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}taskServiceContextTaskBaseType">
 *       &lt;sequence>
 *         &lt;element name="restartContext" type="{http://xmlns.oracle.com/bpel/workflow/taskService}restartContextType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restartRootTaskType", propOrder = {
    "restartContext"
})
public class RestartRootTaskType
    extends TaskServiceContextTaskBaseType
{

    @XmlElement(required = true)
    protected RestartContextType restartContext;

    /**
     * Gets the value of the restartContext property.
     * 
     * @return
     *     possible object is
     *     {@link RestartContextType }
     *     
     */
    public RestartContextType getRestartContext() {
        return restartContext;
    }

    /**
     * Sets the value of the restartContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestartContextType }
     *     
     */
    public void setRestartContext(RestartContextType value) {
        this.restartContext = value;
    }

}
