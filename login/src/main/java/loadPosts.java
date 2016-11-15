/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import edu.byui.login.FileHandler;
import edu.byui.login.Post;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "loadPosts", urlPatterns = {"/loadPosts"})
public class loadPosts extends HttpServlet {
    File file;
    ArrayList<Post> postSaved = new ArrayList<Post>();
    String usernameGlobal = "";

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
            out.println("<title>Servlet loadPosts</title>");            
            out.println("</head>");
            out.println("<body>");
           
            HttpSession session = request.getSession(true);
            String username = (String)session.getAttribute("username");

            String post = request.getParameter("post");
            out.println("<h1> Welcom " + username + "</h1>"); 
            out.print("<button onclick=\"window.location.href='createPost.jsp'\">Create a Post</button>");
            out.print("<button onclick=\"window.location.href='logout'\">Log out</button>");
            //out.println("<div>" + post + "</div>");
            
            FileHandler filetoAdd = new FileHandler();
            
            if(!(post == null)){
            
          try {
                
            String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
            file = new File(webInfPath + "/posts.txt");
            file.createNewFile();

            filetoAdd.writeToFile(file, post , username);

          } catch (IOException e) { 
               e.printStackTrace();
          }
                                
            }
           try {
                
            String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
            file = new File(webInfPath + "/posts.txt");
               BufferedReader reader = new BufferedReader(new FileReader(file));

               String line;

               while ((line = reader.readLine()) != null) {
                    Post postToDisplay = new Post();
                    postToDisplay.setPost(line);
                    postSaved.add(postToDisplay);
               }

          } catch (IOException e) { 
               e.printStackTrace();
          }
          
           
        for (int i = postSaved.size() -1; i >= 0; i--) {
         
         out.println("<h1>" + postSaved.get(i).getPost() + "</h1>");  
        //out.println("<font size=\"6\">" + "hola" + "</font>");  
         
        }
           
        postSaved.clear();
         // return list;
          

            
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
