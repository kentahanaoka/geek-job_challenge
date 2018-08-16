<%-- 
    Document   : 出力
    Created on : 2018/08/15, 15:35:54
    Author     : guest1Day
--%>

<%@page import="java.util.jar.Attributes.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.jms.Session"%>
<%@page import="java.text.AttributedCharacterIterator.Attribute"%>
<%@page import="java.util.Date"%>
<%@page  import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="入力フォーム.jsp" method="post">
       
        <%
        request.setCharacterEncoding("UTF-8");
            
        String name = request.getParameter("Name");
        String hobby = request.getParameter("hobby");

        HttpSession sc = request.getSession();

        sc.setAttribute("n", name);
        
        sc.setAttribute("h", hobby);

        out.print("送信が完了" );
            
    
        %>
  
    
        <a href="入力フォーム.jsp">戻る</a>
       </form>
          </body>
</html>
