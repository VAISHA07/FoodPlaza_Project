<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
</head>
<body>

   <% 
   String uEmail=(String)session.getAttribute("uEmail");
   String aEmail=(String)session.getAttribute("aEmail");
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

<div id="templatemo_container" >
<form class="main">
<table>
<tr>
<td><h1>Failed</h1></td>
</tr>
</table>
</form>

</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>