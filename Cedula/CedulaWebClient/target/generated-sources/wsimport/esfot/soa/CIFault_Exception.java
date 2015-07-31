
package esfot.soa;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CIFault", targetNamespace = "http://soa.esfot/")
public class CIFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CIFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CIFault_Exception(String message, CIFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CIFault_Exception(String message, CIFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: esfot.soa.CIFault
     */
    public CIFault getFaultInfo() {
        return faultInfo;
    }

}
