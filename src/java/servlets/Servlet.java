/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edmayen
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        //el elemento de tecnologia puede tener varios
        //valores por ello lo procesamos como un arreglo
        String[] tecnologias = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        //el componente de musica, indica que se pueden
        //seleccionar multiples elementos, por ello
        //lo procesamos como un arreglo
        String[] musica = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parametros procesados por el Servlet:</h1>");
        out.println("<table border='1'>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Usuario");
        out.println("</td>");
        out.println("<td>");
        out.println(usuario);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Password");
        out.println("</td>");
        out.println("<td>");
        out.println(password);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Tecnologias");
        out.println("</td>");
        out.println("<td>");
        for(String tecnologia : tecnologias)
        {
            out.println(tecnologia);
            out.println(" / ");
        }
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Genero");
        out.println("</td>");
        out.println("<td>");
        out.println(genero);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Ocupación");
        out.println("</td>");
        out.println("<td>");
        out.println(ocupacion);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Música Favorita");
        out.println("</td>");
        out.println("<td>");
        if(musica != null)
        {
            for(String m : musica)
            {
                out.println(m);
                out.println(" / ");
            }
        }
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Comentarios");
        out.println("</td>");
        out.println("<td>");
        out.println(comentarios);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("</table>");
        
        
        out.println("</body>");
        out.println("</html>");
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
