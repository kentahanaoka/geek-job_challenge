<%-- 
    Document   : 入力フォーム
    Created on : 2018/08/15, 15:30:42
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
  
    <form action="出力.jsp" method="post">
   <%HttpSession sc = request.getSession();
      %>  
    名前<input type="text" name=<%="Name"%>  value= <%=sc.getAttribute("n")%>>
         <input type="radio" name="gender" value="男" >男性
         <input type="radio" name="gender" value="女">女性
     趣味<input type="text" name=<%="hobby"%> value=<%=sc.getAttribute("h")%>>
         <input type="submit" name="btnSubmit">

        
    </form>
   
                </body>
</html>
