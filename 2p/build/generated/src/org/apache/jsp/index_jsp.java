package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <title>Hello!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Ejercicios Con JSP</h1>\n");
      out.write("        \n");
      out.write("        ");
 if(java.util.Calendar.getInstance().get(java.util.Calendar.AM_PM) == java.util.Calendar.AM){
      out.write("\n");
      out.write("        <p>Good Morning, Welcome</p>\n");
      out.write("        ");
}else{
      out.write("\n");
      out.write("        <p>Good Evening, Welcome</p>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        <ol>\n");
      out.write("            <li><a href=\"Factorial.jsp\">Número Factorial</a></li>\n");
      out.write("            <li><a href=\"tablax.html\">Tabla X</a></li>\n");
      out.write("            <li><a href=\"trianguloPascal.html\">Triangulo Pascal</a></li>\n");
      out.write("            <li><a href=\"trianguloPascalLinea.html\">Triangulo Pascal por linea</a></li>-->\n");
      out.write("        </oll> \n");
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
