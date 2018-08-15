<%-- 
    Document   : newjsp
    Created on : 2018/08/15, 13:55:23
    Author     : guest1Day
--%>

<%@page import="javax.jms.Session"%>
<%@page import="java.text.AttributedCharacterIterator.Attribute"%>
<%@page import="java.util.Date"%>
<%@page  import="javax.servlet.http.HttpSession"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
        HttpSession ss = request.getSession();      
        
      
        out.println("前回は" +ss.getAttribute("Data")+"にログインしました");
        Date time = new Date();
        ss.setAttribute("Data", time.toString());
        out.println("今回は" +ss.getAttribute("Data")+"にログインしました");      
            
             
//         Cookie[] cs = (Cookie[])ss.getAttribute("Data");
//
//    if (cs != null) {
//       for (int i = 0; i < cs.length; i++) {
//            if (cs[i].getName().equals("Data")) {
//                out.print("最後のログインは、" + cs[i].getValue());
//                break;
//            }}}        
   
    


    %>
    </body>
</html>
