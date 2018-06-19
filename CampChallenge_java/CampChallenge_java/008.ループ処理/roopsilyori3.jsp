<%-- 
    Document   : roopsilyori3
    Created on : 2018/06/19, 13:25:45
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
int answer=0;
for(int i=1;i<100;i++){
answer=answer+i;
    
    
}
out.print(answer);


    
    %>
    <body>
        <h1></h1>
    </body>
</html>
