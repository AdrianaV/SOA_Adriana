/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.holamundojavaclient;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/**
 *
 * @author ANYTA
 */
public class App {
    
    public static void main( String[] args )
  {
    try {
      //Primero accedemos a un objeto Service
      esfot.soa.HolaMundo_Service service = new esfot.soa.HolaMundo_Service();
      //a traves de el accedemos al Port
      esfot.soa.HolaMundo port = service.getHolaMundoPort();
      java.lang.String name = "amigos de los Servicios Web";
      //utilizamos el Port para llamar al WS a traves del SEI
      java.lang.String result = port.saluda(name);
      System.out.println("Result = "+result);
    } catch (Exception ex) {
      // TODO handle custom exceptions here
    }
  }
    
}
