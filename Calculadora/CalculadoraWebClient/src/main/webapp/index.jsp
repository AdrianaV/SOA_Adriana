<%-- 
    Document   : index
    Created on : 26/06/2015, 0:16:55
    Author     : ANYTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo!</h1>
        <%
            try {
                sw.Hola_Service service = new sw.Hola_Service();
                sw.Hola port = service.getHolaPort();
                String name = "amigos de los Servicios Web";
                String result = port.hello(name);
                out.println("Result = " + result);
            } catch (Exception ex) {
        // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
