<%@page import="com.foodplazza.pojo.Food"%>
<%@page import="com.foodplazza.Dao.FoodImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add To Cart</title>
<script type="text/javascript" src="Validation.js"></script>
<script type="text/javascript" src="cart.js"></script>
<link href="style123.css" rel="stylesheet" type="text/javascript">
</head>
<body>
<jsp:include page="UserHeader.jsp"></jsp:include>
<%FoodImpl fd=new FoodImpl();
  Food food=new Food();
  int foodId = Integer.parseInt(request.getParameter("foodId"));
  food=fd.searchFoodById(foodId);
  String emailId=(String)session.getAttribute("uEmail");
  
  String fName = request.getParameter("fname");
  session.setAttribute("fName", fName);
  
%>

<div id="templatemo_container">
<form action="cart" method="post" onsubmit="return AddCartValidation()" class="main">
<table border="1">
<caption>Add to Cart</caption>

<tr>
<td>Existing FoodID : </td>
<td><input type="number" name="fid" value="<%=food.getFoodid()%>" ></td>
<td><span id="fiderror" style="color:red"></span></td>
</tr>

<tr>
<td>EmailID : </td>
<td><input type="email" name="emailid" id="email" value="<%=emailId%>"></td>
<td><span id="emailerror" style="color:red"></span></td>
</tr>

<tr>
<td>FoodName : </td>
<td><input type="text" name="fname" id="fname" value="<%=food.getFoodname()%>"></td>
<td><span id="fnameerror" style="color:red"></span></td>
</tr>

<tr>
<td>Quantity : </td>
<td><input type="number" name="fquan" id="fquan" onkeypress="searchdata(this.value)"></td>
<td><span id="fquanerror" style="color:red"></span></td>
</tr>

<tr>
<td>Price : </td>
<td><input type="number" name="price" id="price" value="<%=food.getFoodprice()%>"></td>
<td><span id="priceerror" style="color:red"></span></td>
</tr>

<tr>
<td>TotalPrice : </td>
<td><input type="number" name="tprice" id="tprice" onclick="total()"></td>
<td><span id="tpriceerror" style="color:red"></span></td>
</tr>


</table>
<br>
<input type="submit" value="AddToCart" name="action">
<input type="reset" value="Clear"> 

</form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>