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
        <link rel="stylesheet" href="Css/stylo.css">
        <title>JSP Page</title>
    </head>
    <h1>Number Guess Game!</h1>
    <body>
        <%@ page import = "java.util.*" %>
        
        <%! int answer = 0; %>
        <%! int numGuesses = 0; %>
        
        <% String guess = request.getParameter("guess");
        
        if(guess == null)  { %>
            Welcome to the Number Guess game.<p>
                
            <% answer = Math.abs(new Random().nextInt() % 100) +1;
           numGuesses = 0;
           
        } else {

            int value = Integer.parseInt(guess);

            if(value == answer) { %>
            
            Congratulations! You got it.<br>
            And after just <%= numGuesses %> tries. <p>
               
                Care to <a href="ngScriptlet.jsp">try again</a>?<p>
                
            <%} else { %>
                Good guess, but nope. Try
                <% numGuesses++;
                
                if(value < answer) { %>
                <b>higher</b>.<p>
               <% } else if(value > answer) { %>
                <b>lower</b>.<p>
              <%  }
             }
        } %>
                I´m thinnking of a number between 1 and 100.<p>
        
        <form method="get">
           What’s your guess? <input type="text" name="guess">
           <input type="submit" value="Submit" >
        </form>
        
    </body>
</html>
