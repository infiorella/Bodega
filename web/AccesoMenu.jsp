<%-- 
    Document   : AccesoMenu
    Created on : 28/06/2021, 05:43:32 PM
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
        <h1>Menu Principal</h1>
        <% Object[]fil=(Object[])session.getAttribute("fil");%>
        
        <h3>
            Codigo: <%=fil[0]%>
            Nombre <%=fil[1]%>
        </h3>
    </body>
</html>
