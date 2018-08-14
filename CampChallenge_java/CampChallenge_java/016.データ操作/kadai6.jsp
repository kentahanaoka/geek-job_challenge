<%-- 
    Document   : kadai6
    Created on : 2018/08/14, 15:06:01
    Author     : guest1Day
--%>

<%@page import="java.util.Date"%>
<%@page import= "javax.servlet.http.Cookie"%>
<%@page import= "javax.servlet.http.HttpServletRequest"%>
<%@page import= "javax.servlet.http.HttpServletResponse"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             Date time = new Date();
            
            //String str = String.valueOf(time);
            
            //String encodedDate=URLEncode(str,"UTF-8");
            
            Cookie c = new Cookie("data",time.toString() );
            response.addCookie(c);
            //out.print("前回のアクセスは"+c+"に行いました");
             
            Cookie[] cs = request.getCookies();
            String cookieName = null; 
                                              
       
if (cs != null) {
       for (int i = 0; i < cs.length; i++) {
            if (cs[i].getName().equals("data")) {
                out.print("最後のログインは、" + cs[i].getValue());
                break;
                 
                 
                 
                }
            }
        }
   
        
        
        
        
        
        
        
        %>
        
     </body>
</html>
