<%-- 
    Document   : index
    Created on : 27/06/2015, 2:14:06
    Author     : ANYTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html><!DOCTYPE HTML PUBLIC "−//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http−equiv="Content−Type" content="text/html; charset=UTF−8">
              <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo!</h1>
        <%
            try {
                esfot.soa.HolaMundo_Service service = new esfot.soa.HolaMundo_Service();
                esfot.soa.HolaMundo port = service.getHolaMundoPort();
                String name = "amigos de los Servicios Web";
                String result = port.saluda(name);
                out.println("Result = " + result);
            } catch (Exception ex) {
        // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
