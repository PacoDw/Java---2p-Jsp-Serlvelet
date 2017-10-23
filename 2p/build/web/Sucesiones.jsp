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
        </div>
        </div>
        <div> 
            <h3>Cuarta Formula Fibonacci</h3>
            <p>Resultado: <%= sus.getFibonacci() %> </p> 
        </div>
        <div> 
            <h3>Quinta Formula primos</h3>
            <p>Resultado: <%= sus.getPrimos() %> </p> 
        </div>
        <div> 
            <h3>Sexta Formula Collatz</h3>
            <p>Resultado: <%= sus.getCollatz() %> </p> 
        </div>
        <div> 
            <h3>Septima Formula Permutación</h3>
            <% String numN = request.getParameter("num-n");%>
            <% String numR = request.getParameter("num-r");%>
            <form method="get">
                Ingresa un número: 
                <input type="number" name="num-n" placeholder="Ingresa un número" required/>
                <input type="number" name="num-r" placeholder="Ingresa un número" required/>
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
            </form>
            <% if(numN != null && numR != null){%>
            <p>Resultado: <%= sus.getPermutacion(numN, numR) %> </p> 
            <% } %> 
        </div>
        <div> 
            <h3>Octava Formula Permutación</h3>
            <% String num_N = request.getParameter("num-n-c");%>
            <% String num_R = request.getParameter("num-r-c");%>
            <form method="get">
                Ingresa un número: 
                <input type="number" name="num-n-c" placeholder="Ingresa un número" required/>
                <input type="number" name="num-r-c" placeholder="Ingresa un número" required/>
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
            </form>
            <% if(num_N != null && num_R != null){%>
            <p>Resultado: <%= sus.getCombinacion(num_N, num_R) %> </p> 
            <% } %> 
        </div>
    </body>
</html>
