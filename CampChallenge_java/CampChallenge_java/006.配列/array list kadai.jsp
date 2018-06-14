<%-- 
    Document   : array list kadai
    Created on : 2018/06/13, 15:28:27
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ page import="java.util.ArrayList"%>
    <%
    ArrayList<String>datas=new ArrayList <String>();
    
datas.add("10");
datas.add("100");
datas.add("soeda");
datas.add("hayashi");
datas.add("-20");
datas.add("128");
datas.add("END");

out.print(datas.get(0));
out.print(datas.get(1));
out.print(datas.get(2));
out.print(datas.get(3));
out.print(datas.get(4));
out.print(datas.get(5));
out.print(datas.get(6));





out.print(datas.get(1));
    
    
    
    
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
