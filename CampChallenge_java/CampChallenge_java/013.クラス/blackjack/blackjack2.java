/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "blackjack2", urlPatterns = {"/blackjack2"})
public class blackjack2 extends HttpServlet {

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
          
        user u=new user();        
        Dealer D=new Dealer();
      
        D.setcard(D.deal());

       // out.print(D.myCard.toString());
        
        u.setcard(D.deal());
        
        //out.print(u.myCard.toString());
        
        
      
        while(D.checkSum()==true){ D.setcard(D.hit());
        }
        
        while(u.checkSum()==true){u.setcard(D.hit());
        }
        //else if(){}
        //while(D.checkSum()==true){{u.setcard(D.hit());}
        
        out.print(D.myCard.toString());
        out.print(u.myCard.toString());
        
        int num=D.open();
        
        int num2=u.open();
        
        if(num>=21){num=0;}
        if(num2>=21){num2=0;}
        
        out.println("ディーラーの点数は"+num+"点です");
//        int num2=u.open();
        
        out.println("ユーザーの点数は"+num2+"点ですよって");
         
         
         


         if(num>num2){out.println("ディラーの勝ちです！");}
         else if(num==num2){out.println("同点です");}
         else {out.println("ユーザーの勝ちです！");}
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet blackjack2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet blackjack2 at " + request.getContextPath() + "</h1>");
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
