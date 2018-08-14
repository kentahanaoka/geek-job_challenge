<%-- 
    Document   : query_string_output
    Created on : 2018/08/13, 13:17:01
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
        
        request.setCharacterEncoding("UTF-8");
     out.print("総額");
     out.println(request.getParameter("total"));
     out.print("個数");
     out.println(request.getParameter("count"));
     out.print("種類");
     out.println(request.getParameter("example")); 
     out.print("単価");
      
   int t = Integer.parseInt(request.getParameter("total"));
   int c = Integer.parseInt(request.getParameter("count"));
   out.print(t/c);

   if (t<3000){out.print("今回のポイントは0ポイントです");}
    else if(t>=5000){out.print("今回のポイントは"+(t*0.05)+"です");}
    else{out.print("今回のポイントは"+(t*0.04)+"です");}
           %>
    </body>
</html>
