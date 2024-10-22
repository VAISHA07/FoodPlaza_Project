<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.foodplazza.pojo.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList</title>
<link href="templatemo-style.css" rel="style.sheet" type="text/css">
 <script src="Validation.js" type="text/javascript"></script>
</head>
<body>
<%List<Customer>l=(List)session.getAttribute("cslist"); %>
<jsp:include page="AdminHeader.jsp"></jsp:include>
<div id="templatemo_container" class="parent">
   <form class="main">
   <table border="2">
   <caption><h1>CustomerList</h1></caption>
   <tr>
   <th>Name</th>
   <th>EmailId</th>
   <th>Password</th>
   <th>Address</th>
   <th>ContactNo</th>
   <th colspan="2">Action</th>
   </tr>
   
   <%Iterator<Customer>itr=l.iterator();
     while(itr.hasNext()){
    	 Customer cs=itr.next();%>
    	 <tr>
    	 <td><%=cs.getCName()%></td>
    	<td><%=cs.getCEmailid()%></td>
    	<td><%=cs.getCPassword()%></td>
    	<td><%=cs.getCAddr()%></td>
    	<td><%=cs.getCMobNo()%></td>
    	<td><a href="customer?action=delete&emailId=<%=cs.getCEmailid()%>">Delete</a></td>
    	 </tr>
    <%}%>
   </table>
   </form>
   </div>
   <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>