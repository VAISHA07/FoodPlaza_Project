<%@page import="java.util.Iterator"%>
<%@page import="com.foodplazza.pojo.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CartList</title>
<meta name="keywords" content=""/>
<meta name="description" content=""/>
<link href="templatemo-style.css" rel="style.sheet" type="text/css">
<link href="style123.css" rel="style.sheet" type="text/css">
</head>
<body>
<jsp:include page="UserHeader.jsp"></jsp:include>

<%List<Cart>l=(List)session.getAttribute("clist");
  
%>

<div id="templatemo_container">
<form action="order" method="post" class="main">
<table border="1">
<caption><h1>CartList</h1></caption>
<tr>
<th>CartId : </th>
<th>FoodId : </th>
<th>EmailId : </th>
<th>FoodName : </th>
<th>Quantity : </th>
<th>Price : </th>
<th>TotalPrice : </th>
<th colspan="2">Action</th>
</tr>

<%Iterator<Cart>itr=l.iterator();
  while(itr.hasNext()){
	Cart  c=itr.next();
  
%>
<tr>
<td><%=c.getCartId() %></td>
<td><%=c.getFoodId()%></td>
<td><%=c.getEmailId()%></td>
<td><%=c.getFoodName()%></td>
<td><%=c.getQuantity()%></td>
<td><%=c.getPrice()%></td>
<td><%=c.getTotalPrice()%></td>
<td><a href="cart?action=delete&cartId=<%=c.getCartId()%>">Delete</a></td>
</tr>
<%} %>
</table>
<input type="submit" value="PlaceOrder">
</form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>