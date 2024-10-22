<%@page import="com.foodplazza.pojo.Order"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
<meta name="keywords" content=""/>
<meta name="description" content=""/>
<link href="templatemo-style.css" rel="stylesheet" type="text/css">
<link href="style123.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="Validation.js"></script>
<style>
    .bill-container {
        width: 20%;
        margin: 0 auto;
        border: 1px solid #ccc;
        padding: 20px;
        border-radius: 10px;
        background-color: #f9f9f9;
    }
    .bill-header {
        text-align: center;
        margin-bottom: 20px;
    }
    .bill-row {
        display: flex;
        justify-content: space-between;
        padding: 10px 0;
    }
    .bill-row:nth-child(even) {
        background-color: #f1f1f1;
    }
    .bill-label {
        font-weight: bold;
    }
</style>
</head>
<body>
   <% 
   String uEmail = (String)session.getAttribute("uEmail");
   String aEmail = (String)session.getAttribute("aEmail");
   %>
   
   <c:if test="${uEmail == null && aEmail == null}">
   <jsp:include page="Header.jsp"></jsp:include>
   </c:if>
   
   <c:if test="${uEmail != null && aEmail == null}">
   <jsp:include page="UserHeader.jsp"></jsp:include>
   </c:if>
   
   <c:if test="${uEmail == null && aEmail != null}">
   <jsp:include page="AdminHeader.jsp"></jsp:include>
   </c:if>
   
   <div id="templatemo_container">
       <div class="bill-container">
           <div class="bill-header">
               <h2>Order Details</h2><br>
               <h3>Your Order is Ready</h3>
           </div>
           <form class="main">
               <% Order od = (Order) request.getAttribute("order"); %>
               <div class="bill-row">
                   <span class="bill-label">Order ID:</span>
                   <span><%= od.getOrderId() %></span>
               </div>
               <div class="bill-row">
                   <span class="bill-label">Email ID:</span>
                   <span><%= od.getEmailId() %></span>
               </div>
               <div class="bill-row">
                   <span class="bill-label">Total Price:</span>
                   <span><%= od.getTotalPrice() %></span>
               </div>
               <div class="bill-row">
                   <span class="bill-label">Date:</span>
                   <span><%= od.getDate() %></span>
               </div>
           </form>
       </div>
   </div>
   <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
