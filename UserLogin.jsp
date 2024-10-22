<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLoginHeader</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script src="Validation.js"></script>
</head>
<body>

<%String uEmail=(String)session.getAttribute("uEmail");
 session.setAttribute("email", uEmail);
 %>
 
 <jsp:include page="UserHeader.jsp"></jsp:include>
 <jsp:include page="index1.jsp"></jsp:include>
 <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>