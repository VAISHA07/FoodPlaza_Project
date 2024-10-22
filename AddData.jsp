<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
<script src="Validation.js"></script>
</head>
<body>
<table>
 <%
   int quan=Integer.parseInt(request.getParameter("q"));
  String fname=request.getParameter("fname");
  int price=Integer.parseInt(request.getParameter("price"));
  int updateQuan=0;
  int total=0;
  
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/basicdb","root","vAt@0711");
  PreparedStatement ps=con.prepareStatement("select * from Cart_FP where FoodName=? ");
  ps.setString(1,fname);
  ResultSet rs=ps.executeQuery();
  if(rs.next()){
	  int quan1=rs.getInt("quantity");
	  updateQuan=quan+quan1;
	 }
  if(updateQuan>0){
	  total=updateQuan*price;
	  PreparedStatement ps1=con.prepareStatement("update Cart_FP set Quantity=?,TotalPrice=? where FoodName=?");
      ps1.setInt(1, updateQuan);
      ps1.setInt(2,total);
      ps1.setString(3, fname);
      int row=ps1.executeUpdate();
  }
  %>

</table>
</body>
</html>