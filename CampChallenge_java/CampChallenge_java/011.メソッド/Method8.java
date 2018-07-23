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

/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/Method8"})
public class Method8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     String[] userprofile(int num){
     String name[]={"1","技育太郎","東京","男","プログラマー"};
     String name1[]={"2","技育花子","北海道","女","システムエンジニア"};
     String name2[]={"3","技育三郎","大阪","男","Webエンジニア"};        
     
     
       
     String num2=String.valueOf(num);
         
          
       
     
     
     if(num2.equals(name[0])){
     return name;
     }else if(num2.equals(name1[0])){
     return name1;
     }else if(num2.equals(name2[0])){
     return name2;
     }else{ return null;}
     }
     
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
          // String[] ary=  userprofile(2);
          
          int total=0;
          
          for (int i = 1; i <= 4; i++) {
          
          out.print(userprofile(1)[i]+"\r\n""\r\n");
         
          }
         for (int a = 1; a <= 4; a++) {
         out.print(userprofile(2)[a]);
          }
          
         for (int c= 1; c<= 4; c++) {
         out.print(userprofile(3)[c]);
          }
            
    
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Method8</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Method8 at " + request.getContextPath() + "</h1>");
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
