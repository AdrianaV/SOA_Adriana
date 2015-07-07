/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.ws.WebServiceRef;
import esfot.soa.ValidaWS_Service;
import esfot.soa.ObtenerProvincia;
import java.lang.String;
import esfot.soa.ValidaWS;
import java.lang.Integer;
import java.lang.Boolean;

/**
 *
 * @author ANYTA
 */
@WebServlet(name = "Cedulaaa", urlPatterns = {"/Cedula"})
public class CedulaServlet extends HttpServlet {

    @WebServiceRef
    private ValidaWS_Service service;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CedulaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CedulaServlet at " + request.getContextPath() + "</h1>");
            
            try { // Obtenemos el Port
                esfot.soa.ValidaWS port = service.getValidaWSPort();
           
                String cedula = request.getParameter("x");
                int ci = Integer.parseInt(cedula);
                
                String provincia;
                
                // Llamamos a la operación correspondiente del SEI
                boolean result = port.verificarCedula(cedula);
                String result1 = port.obtenerProvincia(cedula);
                
                out.println("La cedula es = " + result +" y "+ result1);
            } catch (Exception ex) 
            {
                out.println("Falta Datos");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
