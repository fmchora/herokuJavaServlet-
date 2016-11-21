package chris.zappapp.postapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Chris
 */
@WebServlet(urlPatterns = {"/createPost"})
public class createPost extends HttpServlet {

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
            out.println("<title>Servlet createPost</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String name = request.getParameter("name");
            String subject = request.getParameter("subject");
            String comment = request.getParameter("comment");
            
            Post post = new Post();
            
            post.setName(name);
            post.setSubject(subject);
            post.setComment(comment);
            
            request.setAttribute("post" , post);
            
            //out.print(post.getName());
            //out.print(post.getSubject());
            //out.print(post.getComment());
            
//            String fileName = "post.txt";
//            File file = new File("fileName");
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            FileWriter fw  = new FileWriter(file, true);
//            BufferedWriter bw;
//            try(bw(fw)){
//            fw.write("stuff");
//            fw.flush();
//            fw.close();
//            }

            if(post.getName()==null || post.getSubject()==null){
                RequestDispatcher dispatcher = request.getRequestDispatcher("welcomePage.jsp");
                dispatcher.forward(request, response);
            }else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("viewPost.jsp");
                dispatcher.forward(request, response);
                out.println("<c:redirect url=\"window.location.href='viewPost'\">");
            }
            
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
