
package com.sun.xml.ws.tx.webservice.member.at;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Outcome.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Outcome">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Commit"/>
 *     &lt;enumeration value="Rollback"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Outcome")
@XmlEnum
public enum Outcome {

    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback");
    private final String value;

    Outcome(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Outcome fromValue(String v) {
        for (Outcome c: Outcome.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
