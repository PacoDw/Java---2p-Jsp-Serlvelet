<%-- 
    Document   : visitor
    Created on : 11-oct-2017, 10:36:36
    Author     : 5e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int count = 0; %>
        <h1>Welcome to my page!</h1>
        <% count++; %>
        You are my <%= count %> visitor.
    </body>
</html>
