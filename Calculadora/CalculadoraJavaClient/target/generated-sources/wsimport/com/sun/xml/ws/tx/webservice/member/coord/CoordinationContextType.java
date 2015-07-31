
package com.sun.xml.ws.tx.webservice.member.coord;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.xmlsoap.schemas.ws._2004._08.addressing.EndpointReferenceType;


/**
 * <p>Clase Java para CoordinationContextType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CoordinationContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;anyAttribute namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/10/wscoor}Expires" minOccurs="0"/>
 *         &lt;element name="CoordinationType" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="RegistrationService" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}EndpointReferenceType"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinationContextType", propOrder = {
    "identifier",
    "expires",
    "coordinationType",
    "registrationService"
})
@XmlSeeAlso({
    com.sun.xml.ws.tx.webservice.member.coord.CreateCoordinationContextType.CurrentContext.class,
    CoordinationContext.class
})
public class CoordinationContextType {

    @XmlElement(name = "Identifier", required = true)
    protected CoordinationContextType.Identifier identifier;
    @XmlElement(name = "Expires")
    protected Expires expires;
    @XmlElement(name = "CoordinationType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String coordinationType;
    @XmlElement(name = "RegistrationService", required = true)
    protected EndpointReferenceType registrationService;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link CoordinationContextType.Identifier }
     *     
     */
    public CoordinationContextType.Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinationContextType.Identifier }
     *     
     */
    public void setIdentifier(CoordinationContextType.Identifier value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad expires.
     * 
     * @return
     *     possible object is
     *     {@link Expires }
     *     
     */
    public Expires getExpires() {
        return expires;
    }

    /**
     * Define el valor de la propiedad expires.
     * 
     * @param value
     *     allowed object is
     *     {@link Expires }
     *     
     */
    public void setExpires(Expires value) {
        this.expires = value;
    }

    /**
     * Obtiene el valor de la propiedad coordinationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinationType() {
        return coordinationType;
    }

    /**
     * Define el valor de la propiedad coordinationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinationType(String value) {
        this.coordinationType = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationService.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getRegistrationService() {
        return registrationService;
    }

    /**
     * Define el valor de la propiedad registrationService.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setRegistrationService(EndpointReferenceType value) {
        this.registrationService = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;anyAttribute namespace='##other'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Identifier {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Obtiene el valor de la propiedad value.
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
         * Define el valor de la propiedad value.
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
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
