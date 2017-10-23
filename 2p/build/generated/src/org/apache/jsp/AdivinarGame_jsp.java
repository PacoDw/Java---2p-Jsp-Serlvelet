package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class AdivinarGame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int answer = 0; 
 int numGuesses = 0; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/stylo.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <h1>Number Guess Game!</h1>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 String guess = request.getParameter("guess");
        
        if(guess == null)  { 
      out.write("\n");
      out.write("            Welcome to the Number Guess game.<p>\n");
      out.write("            ");
 answer = Math.abs(new Random().nextInt() % 100) +1;
           numGuesses = 0;
           
        } else {

            int value = Integer.parseInt("guess");
            if(value == answer) { 
      out.write("\n");
      out.write("            \n");
      out.write("            Congratulations! You got it.<br>\n");
      out.write("            And after just ");
      out.print( numGuesses );
      out.write(" tries. <p>\n");
      out.write("               \n");
      out.write("                Care to <a href=\"ngScriptlet.jsp\">try again</a>?<p>\n");
      out.write("                \n");
      out.write("            ");
} else { 
      out.write("\n");
      out.write("                Good guess, but nope. Try\n");
      out.write("                ");
 numGuesses++;
                
                if(value < answer) { 
      out.write("\n");
      out.write("                <b>higher</b>.<p>\n");
      out.write("               ");
 } else if(value > answer) { 
      out.write("\n");
      out.write("                <b>lower</b>.<p>\n");
      out.write("              ");
  }
             }
        } 
      out.write("\n");
      out.write("                I´m thinnking of a number between 1 and 100.<p>\n");
      out.write("        \n");
      out.write("        <form method=get>\n");
      out.write("           What’s your guess? <input type=text name=guess>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
