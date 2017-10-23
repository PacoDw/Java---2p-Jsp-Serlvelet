<%-- 
    Document   : Sucesiones
    Created on : 21/10/2017, 03:05:53 PM
    Author     : PacoD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Css/stylo.css">

        <title>Sucesiones</title>
    </head>
    <body>
    <%! FDPM.Math.SucesionesClass sus = new  FDPM.Math.SucesionesClass(); %>
    <%@page import = "FDPM.Math.*" %>
        <h1>Sucesiones</h1>
        <div> 
            <h3>Primera Formula</h3>
            <p>Resultado: <%= sus.formulaOne() %> </p> 
        </div>
        <div> 
            <h3>Segunda Formula n^2</h3>
            <p>Resultado: <%= sus.formulaTwo() %> </p> 
        </div>
        <div> 
            <h3>Tercera Formula 1/n^2</h3>
            <p>Resultado: <%= sus.formulaThree() %> </p> 
            <%  %>
        </div>
    </body>
</html>
