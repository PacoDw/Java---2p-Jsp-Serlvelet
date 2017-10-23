<%-- 
    Document   : Factorial
    Created on : 11-oct-2017, 11:26:35
    Author     : 5e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Css/stylo.css">
        <title>Número Factorial</title>
    </head>
    <body>
        <% String num_Factorial = request.getParameter("num");%>
        <%! String res = ""; %>
        <%! FDPM.Math.FactorialNum factorial = new  FDPM.Math.FactorialNum(); %>
        
        <h1>Nùmero Factorial</h1>
        
        <form method="get">
            Ingresa un número: 
            <input type="number" name="num" placeholder="Algún numero" required/>
            <input type="reset" value="Reset" />
            <input type="submit" value="Submit" />
        </form>
    
        <% if(num_Factorial != null){%>
            <% res = factorial.getFactorial(num_Factorial); %>
            <p><br>El resultado es: <b><%= res %></b>   </p>
     <% } %>  

    </body>
</html>
