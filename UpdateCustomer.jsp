<%@page import="com.foodplazza.pojo.Customer"%>
<%@page import="com.foodplazza.Dao.CustomerImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateCustomer</title>
<script type="text/javascript" src="Validation.js"></script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="UserHeader.jsp"></jsp:include>

<% CustomerImpl cd=new CustomerImpl();
String EmailId=(String)session.getAttribute("uEmail");
Customer c=cd.searchbyEmaildID(EmailId);
%>

<div id="templatemo_container">
<form action="customer" method="post" onsubmit="return UpdateCustValidation()" class="main">

<table border="1">
<caption>UPDATE CUSTOMER</caption>
<tr>
<td>Name : </td>
<td><input type="text" name="cname" id="cname"></td>
<td><span id="cnameerror" style="color:red"></span></td>
</tr>

 <tr>
<td>Address : </td> 
<td><input type="text" name="addr" id="addr"></td>
<td><span id="addrerror" style="color:red"></span></td>
</tr>

<tr>
<td>Contact No :  </td>
<td><input type="number" name="cNo" id="cNo"></td>
<td><span id="cNOerror" style="color:red"></span></td>
</tr>
</table>
<br>
<input type="submit" value="UpdateCustomer" name="action">
<input type="reset" value="Clear"> 
</form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>