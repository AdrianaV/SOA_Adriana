/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.calculadorajavaclient;

/**
 *
 * @author ANYTA
 */
public class App
{
  public static void main( String[] args )
  {
    try {
      //Primero accedemos a un objeto Service
      sw.Hola_Service service = new sw.Hola_Service();
      //a traves de el accedemos al Port
      sw.Hola port = service.getHolaPort();
      java.lang.String name = "amigos de los Servicios Web";
      //utilizamos el Port para llamar al WS a traves del SEI
      java.lang.String result = port.hello(name);
      System.out.println("Result = "+result);
    } catch (Exception ex) {
      // TODO handle custom exceptions here
    }
  }
}
