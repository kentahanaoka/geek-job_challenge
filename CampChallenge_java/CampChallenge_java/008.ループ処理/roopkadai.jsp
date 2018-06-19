<%-- 
    Document   : roopkadai
    Created on : 2018/06/14, 15:16:11
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
  long answer=1;
   for (int i=0;i<20;i++){
   answer=answer*8;
   }
     out.print(answer);
     
      %>
      
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
