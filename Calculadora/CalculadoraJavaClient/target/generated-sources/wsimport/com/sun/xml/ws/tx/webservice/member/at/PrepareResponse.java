
package com.sun.xml.ws.tx.webservice.member.at;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="vote" type="{http://schemas.xmlsoap.org/ws/2004/10/wsat}Vote" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PrepareResponse")
public class PrepareResponse {

    @XmlAttribute(name = "vote")
    protected Vote vote;

    /**
     * Obtiene el valor de la propiedad vote.
     * 
     * @return
     *     possible object is
     *     {@link Vote }
     *     
     */
    public Vote getVote() {
        return vote;
    }

    /**
     * Define el valor de la propiedad vote.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote }
     *     
     */
    public void setVote(Vote value) {
        this.vote = value;
    }

}
