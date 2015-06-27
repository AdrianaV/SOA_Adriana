
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
@WebService(name = "HolaMundo", targetNamespace = "http://soa.esfot/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HolaMundo {


    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Saluda")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Saluda", targetNamespace = "http://soa.esfot/", className = "esfot.soa.Saluda")
    @ResponseWrapper(localName = "SaludaResponse", targetNamespace = "http://soa.esfot/", className = "esfot.soa.SaludaResponse")
    @Action(input = "http://soa.esfot/HolaMundo/SaludaRequest", output = "http://soa.esfot/HolaMundo/SaludaResponse")
    public String saluda(
        @WebParam(name = "Nombre", targetNamespace = "")
        String nombre);

}
