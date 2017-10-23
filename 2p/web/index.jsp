<%-- 
    Document   : index
    Created on : 11-oct-2017, 10:19:47
    Author     : 5e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Css/stylo.css">
        <title>Hello!</title>
    </head>
    <body>
        <h1>Ejercicios Con JSP</h1>
        
        <% if(java.util.Calendar.getInstance().get(java.util.Calendar.AM_PM) == java.util.Calendar.AM){%>
        <p>Good Morning, Welcome</p>
        <%}else{%>
        <p>Good Evening, Welcome</p>
        <%}%>
        
        <ol>
            <li><a href="Factorial.jsp">Número Factorial</a></li>
            <li><a href="Sucesiones.jsp">Sucesiones</a></li>
        </oll> 
    </body>
</html>
