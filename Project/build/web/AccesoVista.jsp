<%-- 
    Document   : AccesoVista
    Created on : 28/06/2021, 05:43:43 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Acceso al Sistema</h1>
        <html:form action="AccesoControl" method="post">
            USUARIO: <html:text property="usu"/>
            CONTRASEÑA: <html:text property="pas"/>
            <html:submit value="Iniciar Sesión" />
        </html:form>
    </body>
</html>
