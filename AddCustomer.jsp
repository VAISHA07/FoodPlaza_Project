<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registertation</title>
<link href="templatemo-style.css" rel="style.sheet" type="text/css">
<script src="Validation.js"></script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="templatemo_container" class="parent">
<form action="customer" method="post" onsubmit="return AddCustValidation()" class="main">
<h3>Welcome to FoodPlaza ..Join Us by registering yourself</h3>
<table border="1">
<tr>
<td>Name : </td>
<td><input type="text" name="cname" id="cname"></td>
<td><span id="cnameerror" style="color:red"></span></td>
</tr>

<tr>
<td>EmailID : </td>
<td><input type="email" name="email" id="email"></td>
<td><span id="emailerror" style="color:red"></span></td>
</tr>

<tr>
<td>Password :  </td>
<td><input type="password" name="pass" id="pass"></td>
<td><span id="passerror" style="color:red"></span></td>
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
<input type="submit" value="AddCustomer" name="action">
<input type="reset" value="Clear"> 


</form>
</div>

<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>