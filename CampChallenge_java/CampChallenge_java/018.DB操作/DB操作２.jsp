<%-- 
    Document   : DB操作２
    Created on : 2018/09/12, 14:16:22
    Author     : guest1Day
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%  
Connection db_con = null;
PreparedStatement db_st = null;

 Class.forName("com.mysql.jdbc.Driver").newInstance();  
 db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "GEEKTARO", "password");
 
 db_st = db_con.prepareStatement("select * from sample where age = ?");
 db_st.setInt(1, 37);

 
  
if (db_con != null){
    try {
    db_con.close();
     } 
    catch (Exception e_con) {
      System.out.println(e_con.getMessage());
    }
}
%>
    </body>
</html>
