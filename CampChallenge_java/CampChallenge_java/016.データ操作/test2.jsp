<%-- 
    Document   : test2
    Created on : 2018/08/10, 11:27:42
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");

out.print(request.getParameter("Name"));
out.print(request.getParameter("gender"));
out.print(request.getParameter("hobby"));


%>
        
        <h1>Hello World!</h1>
    </body>
</html>
