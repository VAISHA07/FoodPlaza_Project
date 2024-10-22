<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<%@page import="com.foodplazza.pojo.Food" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status</title>
<meta name="keywords" content=""/>
<meta name="description" content=""/>
<link href="templatemo-style.css" rel="style.sheet" type="text/css">
<link href="style123.css" rel="style.sheet" type="text/css">
</head>
<body>
<%String uEmail=(String)session.getAttribute("uEmail");
  String aEmail=(String)session.getAttribute("aEmail");

List<Food>l=(List)session.getAttribute("flist");
%>

  <c:if test="${uEmail==null && aEmail==null}">
   <jsp:include page="Header.jsp"></jsp:include>
   </c:if>
   
  <c:if test="${uEmail!=null && aEmail==null}">
   <jsp:include page="UserHeader.jsp"></jsp:include>
   </c:if>
   
   <c:if test="${uEmail==null && aEmail!=null}">
   <jsp:include page="AdminHeader.jsp"></jsp:include>
   </c:if>
   
   <div id="templatemo_container" class="parent">
   <div class="child">
   <form>
   <table border="1">
    <caption>FoodList</caption>
    
    <tr>
    <th>FoodId</th>
    <th>FoodName</th>
    <th>FoodType</th>
    <th>Quantity</th>
    <th>Price</th>
    
    <c:if test="${uEmail==null && aEmail!=null}">
       <th colspan="2">Action</th>
   </c:if>
   
   <c:if test="${uEmail!=null && aEmail==null}">
   <th colspan="1">Action</th>
   </c:if>
   
   </tr>
   <%Iterator<Food>itr=l.iterator();
       while(itr.hasNext()){
          Food fo=itr.next();
   %>
   <tr>
       <td><%=fo.getFoodid()%></td>
       <td><%=fo.getFoodname()%></td>
       <td><%=fo.getFoodtype()%></td>
       <td><%=fo.getFoodquantity()%></td>
       <td><%=fo.getFoodprice()%></td>
      
      <c:if test="${uEmail== null && aEmail!= null}">
      <td><a href="UpdateFood.jsp?foodid=<%=fo.getFoodid()%>">Edit</a></td>
      <td><a href="fOOd?action=delete&foodid=<%=fo.getFoodid()%>">Delete</a></td>
      </c:if>
   
      <c:if test="${uEmail!=null && aEmail==null}">
      <td><a href="AddToCart.jsp?foodId=<%=fo.getFoodid()%>&fname=<%=fo.getFoodname()%>">Add</a></td>
      </c:if>
   </tr>
   <%}%>
  
   </table>
   </form>
   </div>
   </div>
   <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>