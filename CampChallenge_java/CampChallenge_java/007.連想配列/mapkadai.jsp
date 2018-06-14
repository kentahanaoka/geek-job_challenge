<%-- 
    Document   : mapkadai
    Created on : 2018/06/14, 14:37:40
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ page import="java.util.*" %>
    
    <%
     HashMap<String,String> prof=
                  new HashMap<String,String>();
     
prof.put("1","AAA");
prof.put("hello","world");
prof.put("soeda","33");
prof.put("20","20");
    

out.print(prof.size());
out.print(prof.get(""));


    
%>
    
    
    
    <body>
        <h1></h1>
    </body>
</html>
