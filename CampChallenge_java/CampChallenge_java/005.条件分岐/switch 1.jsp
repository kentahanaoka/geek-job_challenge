<%-- 
    Document   : hairetu
    Created on : 2018/06/13, 13:40:14
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
 int type=888
         ;
 
switch(type){
    case 1:
        out.print("one");
        break;
    case 2:
        out.print("two");
        break;
    default:
        out.print("想定外");
        
        
        
}
    
    
    
    
     %>       
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
