
package com.sun.xml.ws.tx.webservice.member.at;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Vote.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Vote">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VoteCommit"/>
 *     &lt;enumeration value="VoteRollback"/>
 *     &lt;enumeration value="VoteReadOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Vote")
@XmlEnum
public enum Vote {

    @XmlEnumValue("VoteCommit")
    VOTE_COMMIT("VoteCommit"),
    @XmlEnumValue("VoteRollback")
    VOTE_ROLLBACK("VoteRollback"),
    @XmlEnumValue("VoteReadOnly")
    VOTE_READ_ONLY("VoteReadOnly");
    private final String value;

    Vote(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Vote fromValue(String v) {
        for (Vote c: Vote.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
