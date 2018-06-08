<%-- 
    Document   : sisoku kadai
    Created on : 2018/06/07, 15:28:13
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
        <%int num1=10;
          int num2=5;
          
          int tasu=num1+num2;
          int hiku=num1-num2;
          int kake=num1*num2;
          int waru=num1/num2;
          int amari=num1%num2;
                  
        out.print(tasu);
        out.print(hiku);
        out.print(kake);
        out.print(waru);
        out.print(amari);
        
        
        
        
        %>
    </body>
</html>
