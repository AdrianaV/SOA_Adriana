/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaesfot.holamundowebclient;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import esfot.soa.HolaMundo_Service;

/**
 *
 * @author ANYTA
 */
@WebServlet(name = "Holaaaa", urlPatterns = {"/Hola"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaMundo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HolaMundo desde "
                    + request.getContextPath() + "</h1>");
            try { // Obtenemos el Port
                esfot.soa.HolaMundo_Service service = new esfot.soa.HolaMundo_Service();
                esfot.soa.HolaMundo port =service.getHolaMundoPort(); //service.getHolaMundoPort();
//                java.lang.String name = "amigos de los Servicios Web";
                String cadena = request.getParameter("x");
// Llamamos a la operación correspondiente del SEI
                java.lang.String result = port.saluda(cadena);
                out.println("Result = " + result);
            } catch (Exception ex) {
// Manejo de excepciones
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
