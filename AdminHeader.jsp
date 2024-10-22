<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminHeader</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script src="Validation.js"></script>
</head>
<body>

<%String aEmail=(String)session.getAttribute("aEmail"); %>
  <div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
      <!-- end of header -->
      
   <div id="templatemo_menu">
        <ul>
        	
            <li><a href="AddFood.jsp"><b>AddFood</b></a></li>
            <li><a href="fOOd"><b>FoodList</b></a></li>
            <li><a href="customer"><b>CustomerList</b></a></li>
            <li><a href="feedback"><b>FeedbackList</b></a></li>
            <li ><a href="ChangePassword.jsp"><b>Change Password</b></a></li>
             <li><a href="login"><b>LogOut</b></a></li>
        </ul>
    </div>
  
 
</div>

</body>
</html>