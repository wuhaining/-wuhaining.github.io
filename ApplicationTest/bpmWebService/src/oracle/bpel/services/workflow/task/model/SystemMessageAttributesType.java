
package oracle.bpel.services.workflow.task.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for systemMessageAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemMessageAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textAttribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAttribute1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute5" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute6" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute7" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute8" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute9" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateAttribute10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numberAttribute1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute7" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute8" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute9" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numberAttribute10" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedTextAttribute20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedFormAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedURLAttribute10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute5" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute6" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute7" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute8" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute9" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedDateAttribute10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute7" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute8" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute9" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="protectedNumberAttribute10" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="flexfieldMappings" type="{http://xmlns.oracle.com/bpel/workflow/task}flexfieldMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemMessageAttributesType", propOrder = {
    "textAttribute1",
    "textAttribute2",
    "textAttribute3",
    "textAttribute4",
    "textAttribute5",
    "textAttribute6",
    "textAttribute7",
    "textAttribute8",
    "textAttribute9",
    "textAttribute10",
    "textAttribute11",
    "textAttribute12",
    "textAttribute13",
    "textAttribute14",
    "textAttribute15",
    "textAttribute16",
    "textAttribute17",
    "textAttribute18",
    "textAttribute19",
    "textAttribute20",
    "formAttribute1",
    "formAttribute2",
    "formAttribute3",
    "formAttribute4",
    "formAttribute5",
    "formAttribute6",
    "formAttribute7",
    "formAttribute8",
    "formAttribute9",
    "formAttribute10",
    "urlAttribute1",
    "urlAttribute2",
    "urlAttribute3",
    "urlAttribute4",
    "urlAttribute5",
    "urlAttribute6",
    "urlAttribute7",
    "urlAttribute8",
    "urlAttribute9",
    "urlAttribute10",
    "dateAttribute1",
    "dateAttribute2",
    "dateAttribute3",
    "dateAttribute4",
    "dateAttribute5",
    "dateAttribute6",
    "dateAttribute7",
    "dateAttribute8",
    "dateAttribute9",
    "dateAttribute10",
    "numberAttribute1",
    "numberAttribute2",
    "numberAttribute3",
    "numberAttribute4",
    "numberAttribute5",
    "numberAttribute6",
    "numberAttribute7",
    "numberAttribute8",
    "numberAttribute9",
    "numberAttribute10",
    "protectedTextAttribute1",
    "protectedTextAttribute2",
    "protectedTextAttribute3",
    "protectedTextAttribute4",
    "protectedTextAttribute5",
    "protectedTextAttribute6",
    "protectedTextAttribute7",
    "protectedTextAttribute8",
    "protectedTextAttribute9",
    "protectedTextAttribute10",
    "protectedTextAttribute11",
    "protectedTextAttribute12",
    "protectedTextAttribute13",
    "protectedTextAttribute14",
    "protectedTextAttribute15",
    "protectedTextAttribute16",
    "protectedTextAttribute17",
    "protectedTextAttribute18",
    "protectedTextAttribute19",
    "protectedTextAttribute20",
    "protectedFormAttribute1",
    "protectedFormAttribute2",
    "protectedFormAttribute3",
    "protectedFormAttribute4",
    "protectedFormAttribute5",
    "protectedFormAttribute6",
    "protectedFormAttribute7",
    "protectedFormAttribute8",
    "protectedFormAttribute9",
    "protectedFormAttribute10",
    "protectedURLAttribute1",
    "protectedURLAttribute2",
    "protectedURLAttribute3",
    "protectedURLAttribute4",
    "protectedURLAttribute5",
    "protectedURLAttribute6",
    "protectedURLAttribute7",
    "protectedURLAttribute8",
    "protectedURLAttribute9",
    "protectedURLAttribute10",
    "protectedDateAttribute1",
    "protectedDateAttribute2",
    "protectedDateAttribute3",
    "protectedDateAttribute4",
    "protectedDateAttribute5",
    "protectedDateAttribute6",
    "protectedDateAttribute7",
    "protectedDateAttribute8",
    "protectedDateAttribute9",
    "protectedDateAttribute10",
    "protectedNumberAttribute1",
    "protectedNumberAttribute2",
    "protectedNumberAttribute3",
    "protectedNumberAttribute4",
    "protectedNumberAttribute5",
    "protectedNumberAttribute6",
    "protectedNumberAttribute7",
    "protectedNumberAttribute8",
    "protectedNumberAttribute9",
    "protectedNumberAttribute10",
    "flexfieldMappings"
})
public class SystemMessageAttributesType {

    protected String textAttribute1;
    protected String textAttribute2;
    protected String textAttribute3;
    protected String textAttribute4;
    protected String textAttribute5;
    protected String textAttribute6;
    protected String textAttribute7;
    protected String textAttribute8;
    protected String textAttribute9;
    protected String textAttribute10;
    protected String textAttribute11;
    protected String textAttribute12;
    protected String textAttribute13;
    protected String textAttribute14;
    protected String textAttribute15;
    protected String textAttribute16;
    protected String textAttribute17;
    protected String textAttribute18;
    protected String textAttribute19;
    protected String textAttribute20;
    protected String formAttribute1;
    protected String formAttribute2;
    protected String formAttribute3;
    protected String formAttribute4;
    protected String formAttribute5;
    protected String formAttribute6;
    protected String formAttribute7;
    protected String formAttribute8;
    protected String formAttribute9;
    protected String formAttribute10;
    protected String urlAttribute1;
    protected String urlAttribute2;
    protected String urlAttribute3;
    protected String urlAttribute4;
    protected String urlAttribute5;
    protected String urlAttribute6;
    protected String urlAttribute7;
    protected String urlAttribute8;
    protected String urlAttribute9;
    protected String urlAttribute10;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute3;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute4;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute6;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute7;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute8;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute9;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttribute10;
    protected Double numberAttribute1;
    protected Double numberAttribute2;
    protected Double numberAttribute3;
    protected Double numberAttribute4;
    protected Double numberAttribute5;
    protected Double numberAttribute6;
    protected Double numberAttribute7;
    protected Double numberAttribute8;
    protected Double numberAttribute9;
    protected Double numberAttribute10;
    protected String protectedTextAttribute1;
    protected String protectedTextAttribute2;
    protected String protectedTextAttribute3;
    protected String protectedTextAttribute4;
    protected String protectedTextAttribute5;
    protected String protectedTextAttribute6;
    protected String protectedTextAttribute7;
    protected String protectedTextAttribute8;
    protected String protectedTextAttribute9;
    protected String protectedTextAttribute10;
    protected String protectedTextAttribute11;
    protected String protectedTextAttribute12;
    protected String protectedTextAttribute13;
    protected String protectedTextAttribute14;
    protected String protectedTextAttribute15;
    protected String protectedTextAttribute16;
    protected String protectedTextAttribute17;
    protected String protectedTextAttribute18;
    protected String protectedTextAttribute19;
    protected String protectedTextAttribute20;
    protected String protectedFormAttribute1;
    protected String protectedFormAttribute2;
    protected String protectedFormAttribute3;
    protected String protectedFormAttribute4;
    protected String protectedFormAttribute5;
    protected String protectedFormAttribute6;
    protected String protectedFormAttribute7;
    protected String protectedFormAttribute8;
    protected String protectedFormAttribute9;
    protected String protectedFormAttribute10;
    protected String protectedURLAttribute1;
    protected String protectedURLAttribute2;
    protected String protectedURLAttribute3;
    protected String protectedURLAttribute4;
    protected String protectedURLAttribute5;
    protected String protectedURLAttribute6;
    protected String protectedURLAttribute7;
    protected String protectedURLAttribute8;
    protected String protectedURLAttribute9;
    protected String protectedURLAttribute10;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute3;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute4;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute6;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute7;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute8;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute9;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protectedDateAttribute10;
    protected Double protectedNumberAttribute1;
    protected Double protectedNumberAttribute2;
    protected Double protectedNumberAttribute3;
    protected Double protectedNumberAttribute4;
    protected Double protectedNumberAttribute5;
    protected Double protectedNumberAttribute6;
    protected Double protectedNumberAttribute7;
    protected Double protectedNumberAttribute8;
    protected Double protectedNumberAttribute9;
    protected Double protectedNumberAttribute10;
    protected List<FlexfieldMappingType> flexfieldMappings;

    /**
     * Gets the value of the textAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute1() {
        return textAttribute1;
    }

    /**
     * Sets the value of the textAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute1(String value) {
        this.textAttribute1 = value;
    }

    /**
     * Gets the value of the textAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute2() {
        return textAttribute2;
    }

    /**
     * Sets the value of the textAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute2(String value) {
        this.textAttribute2 = value;
    }

    /**
     * Gets the value of the textAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute3() {
        return textAttribute3;
    }

    /**
     * Sets the value of the textAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute3(String value) {
        this.textAttribute3 = value;
    }

    /**
     * Gets the value of the textAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute4() {
        return textAttribute4;
    }

    /**
     * Sets the value of the textAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute4(String value) {
        this.textAttribute4 = value;
    }

    /**
     * Gets the value of the textAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute5() {
        return textAttribute5;
    }

    /**
     * Sets the value of the textAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute5(String value) {
        this.textAttribute5 = value;
    }

    /**
     * Gets the value of the textAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute6() {
        return textAttribute6;
    }

    /**
     * Sets the value of the textAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute6(String value) {
        this.textAttribute6 = value;
    }

    /**
     * Gets the value of the textAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute7() {
        return textAttribute7;
    }

    /**
     * Sets the value of the textAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute7(String value) {
        this.textAttribute7 = value;
    }

    /**
     * Gets the value of the textAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute8() {
        return textAttribute8;
    }

    /**
     * Sets the value of the textAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute8(String value) {
        this.textAttribute8 = value;
    }

    /**
     * Gets the value of the textAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute9() {
        return textAttribute9;
    }

    /**
     * Sets the value of the textAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute9(String value) {
        this.textAttribute9 = value;
    }

    /**
     * Gets the value of the textAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute10() {
        return textAttribute10;
    }

    /**
     * Sets the value of the textAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute10(String value) {
        this.textAttribute10 = value;
    }

    /**
     * Gets the value of the textAttribute11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute11() {
        return textAttribute11;
    }

    /**
     * Sets the value of the textAttribute11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute11(String value) {
        this.textAttribute11 = value;
    }

    /**
     * Gets the value of the textAttribute12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute12() {
        return textAttribute12;
    }

    /**
     * Sets the value of the textAttribute12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute12(String value) {
        this.textAttribute12 = value;
    }

    /**
     * Gets the value of the textAttribute13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute13() {
        return textAttribute13;
    }

    /**
     * Sets the value of the textAttribute13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute13(String value) {
        this.textAttribute13 = value;
    }

    /**
     * Gets the value of the textAttribute14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute14() {
        return textAttribute14;
    }

    /**
     * Sets the value of the textAttribute14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute14(String value) {
        this.textAttribute14 = value;
    }

    /**
     * Gets the value of the textAttribute15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute15() {
        return textAttribute15;
    }

    /**
     * Sets the value of the textAttribute15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute15(String value) {
        this.textAttribute15 = value;
    }

    /**
     * Gets the value of the textAttribute16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute16() {
        return textAttribute16;
    }

    /**
     * Sets the value of the textAttribute16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute16(String value) {
        this.textAttribute16 = value;
    }

    /**
     * Gets the value of the textAttribute17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute17() {
        return textAttribute17;
    }

    /**
     * Sets the value of the textAttribute17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute17(String value) {
        this.textAttribute17 = value;
    }

    /**
     * Gets the value of the textAttribute18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute18() {
        return textAttribute18;
    }

    /**
     * Sets the value of the textAttribute18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute18(String value) {
        this.textAttribute18 = value;
    }

    /**
     * Gets the value of the textAttribute19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute19() {
        return textAttribute19;
    }

    /**
     * Sets the value of the textAttribute19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute19(String value) {
        this.textAttribute19 = value;
    }

    /**
     * Gets the value of the textAttribute20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAttribute20() {
        return textAttribute20;
    }

    /**
     * Sets the value of the textAttribute20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAttribute20(String value) {
        this.textAttribute20 = value;
    }

    /**
     * Gets the value of the formAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute1() {
        return formAttribute1;
    }

    /**
     * Sets the value of the formAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute1(String value) {
        this.formAttribute1 = value;
    }

    /**
     * Gets the value of the formAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute2() {
        return formAttribute2;
    }

    /**
     * Sets the value of the formAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute2(String value) {
        this.formAttribute2 = value;
    }

    /**
     * Gets the value of the formAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute3() {
        return formAttribute3;
    }

    /**
     * Sets the value of the formAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute3(String value) {
        this.formAttribute3 = value;
    }

    /**
     * Gets the value of the formAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute4() {
        return formAttribute4;
    }

    /**
     * Sets the value of the formAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute4(String value) {
        this.formAttribute4 = value;
    }

    /**
     * Gets the value of the formAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute5() {
        return formAttribute5;
    }

    /**
     * Sets the value of the formAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute5(String value) {
        this.formAttribute5 = value;
    }

    /**
     * Gets the value of the formAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute6() {
        return formAttribute6;
    }

    /**
     * Sets the value of the formAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute6(String value) {
        this.formAttribute6 = value;
    }

    /**
     * Gets the value of the formAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute7() {
        return formAttribute7;
    }

    /**
     * Sets the value of the formAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute7(String value) {
        this.formAttribute7 = value;
    }

    /**
     * Gets the value of the formAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute8() {
        return formAttribute8;
    }

    /**
     * Sets the value of the formAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute8(String value) {
        this.formAttribute8 = value;
    }

    /**
     * Gets the value of the formAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute9() {
        return formAttribute9;
    }

    /**
     * Sets the value of the formAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute9(String value) {
        this.formAttribute9 = value;
    }

    /**
     * Gets the value of the formAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAttribute10() {
        return formAttribute10;
    }

    /**
     * Sets the value of the formAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAttribute10(String value) {
        this.formAttribute10 = value;
    }

    /**
     * Gets the value of the urlAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute1() {
        return urlAttribute1;
    }

    /**
     * Sets the value of the urlAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute1(String value) {
        this.urlAttribute1 = value;
    }

    /**
     * Gets the value of the urlAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute2() {
        return urlAttribute2;
    }

    /**
     * Sets the value of the urlAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute2(String value) {
        this.urlAttribute2 = value;
    }

    /**
     * Gets the value of the urlAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute3() {
        return urlAttribute3;
    }

    /**
     * Sets the value of the urlAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute3(String value) {
        this.urlAttribute3 = value;
    }

    /**
     * Gets the value of the urlAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute4() {
        return urlAttribute4;
    }

    /**
     * Sets the value of the urlAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute4(String value) {
        this.urlAttribute4 = value;
    }

    /**
     * Gets the value of the urlAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute5() {
        return urlAttribute5;
    }

    /**
     * Sets the value of the urlAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute5(String value) {
        this.urlAttribute5 = value;
    }

    /**
     * Gets the value of the urlAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute6() {
        return urlAttribute6;
    }

    /**
     * Sets the value of the urlAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute6(String value) {
        this.urlAttribute6 = value;
    }

    /**
     * Gets the value of the urlAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute7() {
        return urlAttribute7;
    }

    /**
     * Sets the value of the urlAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute7(String value) {
        this.urlAttribute7 = value;
    }

    /**
     * Gets the value of the urlAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute8() {
        return urlAttribute8;
    }

    /**
     * Sets the value of the urlAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute8(String value) {
        this.urlAttribute8 = value;
    }

    /**
     * Gets the value of the urlAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute9() {
        return urlAttribute9;
    }

    /**
     * Sets the value of the urlAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute9(String value) {
        this.urlAttribute9 = value;
    }

    /**
     * Gets the value of the urlAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAttribute10() {
        return urlAttribute10;
    }

    /**
     * Sets the value of the urlAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAttribute10(String value) {
        this.urlAttribute10 = value;
    }

    /**
     * Gets the value of the dateAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute1() {
        return dateAttribute1;
    }

    /**
     * Sets the value of the dateAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute1(XMLGregorianCalendar value) {
        this.dateAttribute1 = value;
    }

    /**
     * Gets the value of the dateAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute2() {
        return dateAttribute2;
    }

    /**
     * Sets the value of the dateAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute2(XMLGregorianCalendar value) {
        this.dateAttribute2 = value;
    }

    /**
     * Gets the value of the dateAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute3() {
        return dateAttribute3;
    }

    /**
     * Sets the value of the dateAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute3(XMLGregorianCalendar value) {
        this.dateAttribute3 = value;
    }

    /**
     * Gets the value of the dateAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute4() {
        return dateAttribute4;
    }

    /**
     * Sets the value of the dateAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute4(XMLGregorianCalendar value) {
        this.dateAttribute4 = value;
    }

    /**
     * Gets the value of the dateAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute5() {
        return dateAttribute5;
    }

    /**
     * Sets the value of the dateAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute5(XMLGregorianCalendar value) {
        this.dateAttribute5 = value;
    }

    /**
     * Gets the value of the dateAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute6() {
        return dateAttribute6;
    }

    /**
     * Sets the value of the dateAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute6(XMLGregorianCalendar value) {
        this.dateAttribute6 = value;
    }

    /**
     * Gets the value of the dateAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute7() {
        return dateAttribute7;
    }

    /**
     * Sets the value of the dateAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute7(XMLGregorianCalendar value) {
        this.dateAttribute7 = value;
    }

    /**
     * Gets the value of the dateAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute8() {
        return dateAttribute8;
    }

    /**
     * Sets the value of the dateAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute8(XMLGregorianCalendar value) {
        this.dateAttribute8 = value;
    }

    /**
     * Gets the value of the dateAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute9() {
        return dateAttribute9;
    }

    /**
     * Sets the value of the dateAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute9(XMLGregorianCalendar value) {
        this.dateAttribute9 = value;
    }

    /**
     * Gets the value of the dateAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttribute10() {
        return dateAttribute10;
    }

    /**
     * Sets the value of the dateAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttribute10(XMLGregorianCalendar value) {
        this.dateAttribute10 = value;
    }

    /**
     * Gets the value of the numberAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute1() {
        return numberAttribute1;
    }

    /**
     * Sets the value of the numberAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute1(Double value) {
        this.numberAttribute1 = value;
    }

    /**
     * Gets the value of the numberAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute2() {
        return numberAttribute2;
    }

    /**
     * Sets the value of the numberAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute2(Double value) {
        this.numberAttribute2 = value;
    }

    /**
     * Gets the value of the numberAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute3() {
        return numberAttribute3;
    }

    /**
     * Sets the value of the numberAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute3(Double value) {
        this.numberAttribute3 = value;
    }

    /**
     * Gets the value of the numberAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute4() {
        return numberAttribute4;
    }

    /**
     * Sets the value of the numberAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute4(Double value) {
        this.numberAttribute4 = value;
    }

    /**
     * Gets the value of the numberAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute5() {
        return numberAttribute5;
    }

    /**
     * Sets the value of the numberAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute5(Double value) {
        this.numberAttribute5 = value;
    }

    /**
     * Gets the value of the numberAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute6() {
        return numberAttribute6;
    }

    /**
     * Sets the value of the numberAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute6(Double value) {
        this.numberAttribute6 = value;
    }

    /**
     * Gets the value of the numberAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute7() {
        return numberAttribute7;
    }

    /**
     * Sets the value of the numberAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute7(Double value) {
        this.numberAttribute7 = value;
    }

    /**
     * Gets the value of the numberAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute8() {
        return numberAttribute8;
    }

    /**
     * Sets the value of the numberAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute8(Double value) {
        this.numberAttribute8 = value;
    }

    /**
     * Gets the value of the numberAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute9() {
        return numberAttribute9;
    }

    /**
     * Sets the value of the numberAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute9(Double value) {
        this.numberAttribute9 = value;
    }

    /**
     * Gets the value of the numberAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberAttribute10() {
        return numberAttribute10;
    }

    /**
     * Sets the value of the numberAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberAttribute10(Double value) {
        this.numberAttribute10 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute1() {
        return protectedTextAttribute1;
    }

    /**
     * Sets the value of the protectedTextAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute1(String value) {
        this.protectedTextAttribute1 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute2() {
        return protectedTextAttribute2;
    }

    /**
     * Sets the value of the protectedTextAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute2(String value) {
        this.protectedTextAttribute2 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute3() {
        return protectedTextAttribute3;
    }

    /**
     * Sets the value of the protectedTextAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute3(String value) {
        this.protectedTextAttribute3 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute4() {
        return protectedTextAttribute4;
    }

    /**
     * Sets the value of the protectedTextAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute4(String value) {
        this.protectedTextAttribute4 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute5() {
        return protectedTextAttribute5;
    }

    /**
     * Sets the value of the protectedTextAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute5(String value) {
        this.protectedTextAttribute5 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute6() {
        return protectedTextAttribute6;
    }

    /**
     * Sets the value of the protectedTextAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute6(String value) {
        this.protectedTextAttribute6 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute7() {
        return protectedTextAttribute7;
    }

    /**
     * Sets the value of the protectedTextAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute7(String value) {
        this.protectedTextAttribute7 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute8() {
        return protectedTextAttribute8;
    }

    /**
     * Sets the value of the protectedTextAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute8(String value) {
        this.protectedTextAttribute8 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute9() {
        return protectedTextAttribute9;
    }

    /**
     * Sets the value of the protectedTextAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute9(String value) {
        this.protectedTextAttribute9 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute10() {
        return protectedTextAttribute10;
    }

    /**
     * Sets the value of the protectedTextAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute10(String value) {
        this.protectedTextAttribute10 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute11() {
        return protectedTextAttribute11;
    }

    /**
     * Sets the value of the protectedTextAttribute11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute11(String value) {
        this.protectedTextAttribute11 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute12() {
        return protectedTextAttribute12;
    }

    /**
     * Sets the value of the protectedTextAttribute12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute12(String value) {
        this.protectedTextAttribute12 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute13() {
        return protectedTextAttribute13;
    }

    /**
     * Sets the value of the protectedTextAttribute13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute13(String value) {
        this.protectedTextAttribute13 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute14() {
        return protectedTextAttribute14;
    }

    /**
     * Sets the value of the protectedTextAttribute14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute14(String value) {
        this.protectedTextAttribute14 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute15() {
        return protectedTextAttribute15;
    }

    /**
     * Sets the value of the protectedTextAttribute15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute15(String value) {
        this.protectedTextAttribute15 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute16() {
        return protectedTextAttribute16;
    }

    /**
     * Sets the value of the protectedTextAttribute16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute16(String value) {
        this.protectedTextAttribute16 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute17() {
        return protectedTextAttribute17;
    }

    /**
     * Sets the value of the protectedTextAttribute17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute17(String value) {
        this.protectedTextAttribute17 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute18() {
        return protectedTextAttribute18;
    }

    /**
     * Sets the value of the protectedTextAttribute18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute18(String value) {
        this.protectedTextAttribute18 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute19() {
        return protectedTextAttribute19;
    }

    /**
     * Sets the value of the protectedTextAttribute19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute19(String value) {
        this.protectedTextAttribute19 = value;
    }

    /**
     * Gets the value of the protectedTextAttribute20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedTextAttribute20() {
        return protectedTextAttribute20;
    }

    /**
     * Sets the value of the protectedTextAttribute20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedTextAttribute20(String value) {
        this.protectedTextAttribute20 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute1() {
        return protectedFormAttribute1;
    }

    /**
     * Sets the value of the protectedFormAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute1(String value) {
        this.protectedFormAttribute1 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute2() {
        return protectedFormAttribute2;
    }

    /**
     * Sets the value of the protectedFormAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute2(String value) {
        this.protectedFormAttribute2 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute3() {
        return protectedFormAttribute3;
    }

    /**
     * Sets the value of the protectedFormAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute3(String value) {
        this.protectedFormAttribute3 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute4() {
        return protectedFormAttribute4;
    }

    /**
     * Sets the value of the protectedFormAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute4(String value) {
        this.protectedFormAttribute4 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute5() {
        return protectedFormAttribute5;
    }

    /**
     * Sets the value of the protectedFormAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute5(String value) {
        this.protectedFormAttribute5 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute6() {
        return protectedFormAttribute6;
    }

    /**
     * Sets the value of the protectedFormAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute6(String value) {
        this.protectedFormAttribute6 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute7() {
        return protectedFormAttribute7;
    }

    /**
     * Sets the value of the protectedFormAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute7(String value) {
        this.protectedFormAttribute7 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute8() {
        return protectedFormAttribute8;
    }

    /**
     * Sets the value of the protectedFormAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute8(String value) {
        this.protectedFormAttribute8 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute9() {
        return protectedFormAttribute9;
    }

    /**
     * Sets the value of the protectedFormAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute9(String value) {
        this.protectedFormAttribute9 = value;
    }

    /**
     * Gets the value of the protectedFormAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedFormAttribute10() {
        return protectedFormAttribute10;
    }

    /**
     * Sets the value of the protectedFormAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedFormAttribute10(String value) {
        this.protectedFormAttribute10 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute1() {
        return protectedURLAttribute1;
    }

    /**
     * Sets the value of the protectedURLAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute1(String value) {
        this.protectedURLAttribute1 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute2() {
        return protectedURLAttribute2;
    }

    /**
     * Sets the value of the protectedURLAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute2(String value) {
        this.protectedURLAttribute2 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute3() {
        return protectedURLAttribute3;
    }

    /**
     * Sets the value of the protectedURLAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute3(String value) {
        this.protectedURLAttribute3 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute4() {
        return protectedURLAttribute4;
    }

    /**
     * Sets the value of the protectedURLAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute4(String value) {
        this.protectedURLAttribute4 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute5() {
        return protectedURLAttribute5;
    }

    /**
     * Sets the value of the protectedURLAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute5(String value) {
        this.protectedURLAttribute5 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute6() {
        return protectedURLAttribute6;
    }

    /**
     * Sets the value of the protectedURLAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute6(String value) {
        this.protectedURLAttribute6 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute7() {
        return protectedURLAttribute7;
    }

    /**
     * Sets the value of the protectedURLAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute7(String value) {
        this.protectedURLAttribute7 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute8() {
        return protectedURLAttribute8;
    }

    /**
     * Sets the value of the protectedURLAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute8(String value) {
        this.protectedURLAttribute8 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute9() {
        return protectedURLAttribute9;
    }

    /**
     * Sets the value of the protectedURLAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute9(String value) {
        this.protectedURLAttribute9 = value;
    }

    /**
     * Gets the value of the protectedURLAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedURLAttribute10() {
        return protectedURLAttribute10;
    }

    /**
     * Sets the value of the protectedURLAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedURLAttribute10(String value) {
        this.protectedURLAttribute10 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute1() {
        return protectedDateAttribute1;
    }

    /**
     * Sets the value of the protectedDateAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute1(XMLGregorianCalendar value) {
        this.protectedDateAttribute1 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute2() {
        return protectedDateAttribute2;
    }

    /**
     * Sets the value of the protectedDateAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute2(XMLGregorianCalendar value) {
        this.protectedDateAttribute2 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute3() {
        return protectedDateAttribute3;
    }

    /**
     * Sets the value of the protectedDateAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute3(XMLGregorianCalendar value) {
        this.protectedDateAttribute3 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute4() {
        return protectedDateAttribute4;
    }

    /**
     * Sets the value of the protectedDateAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute4(XMLGregorianCalendar value) {
        this.protectedDateAttribute4 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute5() {
        return protectedDateAttribute5;
    }

    /**
     * Sets the value of the protectedDateAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute5(XMLGregorianCalendar value) {
        this.protectedDateAttribute5 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute6() {
        return protectedDateAttribute6;
    }

    /**
     * Sets the value of the protectedDateAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute6(XMLGregorianCalendar value) {
        this.protectedDateAttribute6 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute7() {
        return protectedDateAttribute7;
    }

    /**
     * Sets the value of the protectedDateAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute7(XMLGregorianCalendar value) {
        this.protectedDateAttribute7 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute8() {
        return protectedDateAttribute8;
    }

    /**
     * Sets the value of the protectedDateAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute8(XMLGregorianCalendar value) {
        this.protectedDateAttribute8 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute9() {
        return protectedDateAttribute9;
    }

    /**
     * Sets the value of the protectedDateAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute9(XMLGregorianCalendar value) {
        this.protectedDateAttribute9 = value;
    }

    /**
     * Gets the value of the protectedDateAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtectedDateAttribute10() {
        return protectedDateAttribute10;
    }

    /**
     * Sets the value of the protectedDateAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtectedDateAttribute10(XMLGregorianCalendar value) {
        this.protectedDateAttribute10 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute1() {
        return protectedNumberAttribute1;
    }

    /**
     * Sets the value of the protectedNumberAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute1(Double value) {
        this.protectedNumberAttribute1 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute2() {
        return protectedNumberAttribute2;
    }

    /**
     * Sets the value of the protectedNumberAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute2(Double value) {
        this.protectedNumberAttribute2 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute3() {
        return protectedNumberAttribute3;
    }

    /**
     * Sets the value of the protectedNumberAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute3(Double value) {
        this.protectedNumberAttribute3 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute4() {
        return protectedNumberAttribute4;
    }

    /**
     * Sets the value of the protectedNumberAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute4(Double value) {
        this.protectedNumberAttribute4 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute5() {
        return protectedNumberAttribute5;
    }

    /**
     * Sets the value of the protectedNumberAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute5(Double value) {
        this.protectedNumberAttribute5 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute6() {
        return protectedNumberAttribute6;
    }

    /**
     * Sets the value of the protectedNumberAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute6(Double value) {
        this.protectedNumberAttribute6 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute7() {
        return protectedNumberAttribute7;
    }

    /**
     * Sets the value of the protectedNumberAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute7(Double value) {
        this.protectedNumberAttribute7 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute8() {
        return protectedNumberAttribute8;
    }

    /**
     * Sets the value of the protectedNumberAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute8(Double value) {
        this.protectedNumberAttribute8 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute9() {
        return protectedNumberAttribute9;
    }

    /**
     * Sets the value of the protectedNumberAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute9(Double value) {
        this.protectedNumberAttribute9 = value;
    }

    /**
     * Gets the value of the protectedNumberAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProtectedNumberAttribute10() {
        return protectedNumberAttribute10;
    }

    /**
     * Sets the value of the protectedNumberAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProtectedNumberAttribute10(Double value) {
        this.protectedNumberAttribute10 = value;
    }

    /**
     * Gets the value of the flexfieldMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexfieldMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexfieldMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexfieldMappingType }
     * 
     * 
     */
    public List<FlexfieldMappingType> getFlexfieldMappings() {
        if (flexfieldMappings == null) {
            flexfieldMappings = new ArrayList<FlexfieldMappingType>();
        }
        return this.flexfieldMappings;
    }

}
