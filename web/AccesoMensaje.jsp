<%-- 
    Document   : AccesoMensaje
    Created on : 28/06/2021, 05:43:22 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu del sistema</h1>
        <% String msg=(String)session.getAttribute("msg"); %>
        
        <h3>
            Mensaje <%= msg%>
        </h3>
        
        <h3>
            <a href="AccesoVista.jsp">Volver a Intentar</a>
        </h3>
        </body>
</html>
