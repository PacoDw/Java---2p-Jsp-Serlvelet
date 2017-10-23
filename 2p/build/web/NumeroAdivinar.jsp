<%-- 
    Document   : AdivinarGame
    Created on : 11-oct-2017, 10:49:11
    Author     : 5e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Juego adivina un número</h1>
    <body>
        <%@ page import = "java.util.*" %>
        
        <%! int answer = 0; %>
        <%! int numGuesses = 0; %>
        
        <% String guess = request.getParameter("guess");
        
        if(guess == null)  { %>
            Bienvenido al juego adivina un número.<p>
            <% answer = Math.abs(new Random().nextInt() % 100) +1;
           numGuesses = 0;
           
        } else {

            int value = Integer.parseInt("guess");
            if(value == answer) { %>
            
            Felicidades! Lo hiciste.<br>
            después de solo <%= numGuesses %> intentos. <p>
               
                Care to <a href="ngScriptlet.jsp">try again</a>?<p>
                
            <%} else { %>
                Buen intento, pero no. Trata
                <% numGuesses++;
                
                if(value < answer) { %>
                <b>más alto</b>.<p>
               <% } else if(value > answer) { %>
                <b>más abjo</b>.<p>
              <%  }
             }
        } %>
                Estoy pensando un número de 1 al 100.<p>
        
        <form method=get>
           Cúal es tu intento? <input type=text name=guess>
        
    </body>
</html>
