<%@page import="com.foodplazza.pojo.Food"%>
<%@page import="com.foodplazza.Dao.FoodImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateFood</title>
<meta charset="ISO-8859-1">
<title>UpdateCustomer</title>
<script type="text/javascript" src="Validation.js"></script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="AdminHeader.jsp"></jsp:include>
<%FoodImpl fd = new FoodImpl();
 int id=Integer.parseInt(request.getParameter("foodid"));
 Food f=fd.searchFoodById(id);
%>

<div id="templatemo_container">
<form action="fOOd" method="post" onsubmit="return UpdateFoodValidation()" class="main">
<table border="1">

<caption>Update Food</caption>
<tr>
<td>FoodId : </td>
<td><input type="number" name="fid" id="fid" value="<%=f.getFoodid()%>"/></td>
<td><span id="fiderror" style="color:red"></span></td>
</tr>

<tr>
<td>FoodName : </td>
<td><input type="text" name="fname" id="fname" value="<%=f.getFoodname()%>"/></td>
<td><span id="fnameerror" style="color:red"></span></td>
</tr>

<tr>
<td>FoodType : </td>
<td><input type="text" name="ftype" id="ftype" value="<%=f.getFoodtype()%>"/></td>
<td><span id="ftypeerror" style="color:red"></span></td>
</tr>

<tr>
<td>Quantity : </td>
<td><input type="number" name="fquan" id="fquan" value="<%=f.getFoodquantity()%>"/></td>
<td><span id="fquanerror" style="color:red"></span></td>
</tr>

<tr>
<td>Price : </td>
<td><input type="number" name="fprice" id="fprice" value="<%=f.getFoodprice()%>"/></td>
<td><span id="fpriceerror" style="color:red"></span></td>
</tr>
</table>

<br>
<input type="submit" value="UpdateFood" name="action">
<input type="reset" value="Clear"> 
</form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>