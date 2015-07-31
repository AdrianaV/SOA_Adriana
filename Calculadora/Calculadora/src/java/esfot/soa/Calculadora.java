/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ANYTA
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public Integer Suma(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        int total = x + y;
        //TODO write your implementation code here:
        return total;
    }
}
