<%-- 
    Document   : query_string_input
    Created on : 2018/08/13, 13:24:13
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
        <form action="query_string_output.jsp?" method="get">
            
            総額<input type="number" name="total">
            数量<input type="number" name="count">
      　　　
         
            種類<select name="example">
<option value="雑貨">雑貨</option>
<option value="生鮮食品">生鮮食品</option>
<option value="その他">その他</option>
</select>
            
             <input type="submit" name="btnSubmit">
      
                           
        </form>
    </body>
</html>
