<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserHeader</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%String uEmail=(String)session.getAttribute("uEmail"); %>
<div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_menu">
        <ul>
        	<li class="current"></li>
        	<li><a href="fOOd"><b>FoodList</b></a></li>
            <li><a href="cart"><b>CartList</b></a></li>
            <li><a href="AddFeedback.jsp"><b>AddFeedback</b></a></li>
            <li><a href="ChangePassword.jsp"><b>Change Password</b></a></li>
            <li><a href="UpdateCustomer.jsp?emailId=<%=uEmail%>"><b>Edit Profile</b></a></li>
            <li><a href="login"><b>LogOut</b></a></li>
        </ul>
    </div>
    </div>
</body>
</html>