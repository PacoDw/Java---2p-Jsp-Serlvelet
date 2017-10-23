/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import FDPM.Math.TrianguloPascalClass;

/**
 *
 * @author 5e
 */
@WebServlet(name = "tPascal", urlPatterns = {"/tPascal"})
public class tPascal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Triangulo de Pascal</title>");    
            out.println("<link rel=\"stylesheet\" href=\"Css/stylo.css\">"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Triangulo de pascal del nùmero " + request.getParameter("num") + "</h1>");
            
             TrianguloPascalClass tabla = new TrianguloPascalClass(Integer.parseInt(request.getParameter("num")));
                             
            out.println("<div id='div-table'>");
            out.println("<table><tbody>");
                //Mostramos la piramide o matriz
                for(int r = 0; r < tabla.getSize(); r++)
                {
                    out.println("<tr>");

                    for(int c = 0; c < (tabla.getSize()*2)-1; c++)
                        out.println("<td>" + tabla.getTable()[r][c] + "</td>");
                    
                    out.println("</tr>");
                }
                    
              
            out.println("</tbody></table></div>");
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
