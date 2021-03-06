
package esfot.soa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculadora", targetNamespace = "http://soa.esfot/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param x
     * @param y
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Suma")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Suma", targetNamespace = "http://soa.esfot/", className = "esfot.soa.Suma")
    @ResponseWrapper(localName = "SumaResponse", targetNamespace = "http://soa.esfot/", className = "esfot.soa.SumaResponse")
    @Action(input = "http://soa.esfot/Calculadora/SumaRequest", output = "http://soa.esfot/Calculadora/SumaResponse")
    public Integer suma(
        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y);

}
