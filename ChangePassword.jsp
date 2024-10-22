<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Change Password</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script src="Validation.js"></script>
	<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
	<link href="style123.css" rel="stylesheet" type="text/css"/>
</head>
<body>

 <%String uEmail=(String)session.getAttribute("uEmail");
   String aEmail=(String)session.getAttribute("aEmail");
 %>
  <c:if test="${ uEmail!=null && aEmail==null}">
   <jsp:include page="UserHeader.jsp"></jsp:include>
   </c:if>
   
   <c:if test="${ uEmail==null && aEmail!=null}">
   <jsp:include page="AdminHeader.jsp"></jsp:include>
   </c:if>
   
   <div id="templatemo_container" class="parent">
   <form action="vs" method="post" onsubmit="return ChangePassValidation()" class="main">
   <table border="1">
   <caption><h1>Change Password</h1></caption>
   <tr>
   <td>EmailId : </td>
   <td><input type="email" name="email" id="email"/></td>
   <td><span id="emailerror" style="color:red"></span></td>
   </tr>
   
   <tr>
   <td>Old Password : </td>
   <td><input type="password" name="pass" id="pass"/></td>
   <td><span id="passerror" style="color:red"></span></td>
   </tr>
   
   <tr>
   <td>New Password : </td>
   <td><input type="password" name="npass" id="npass"/></td>
   <td><span id="npasserror" style="color:red"></span></td>
   </tr>
   
   <tr>
   <td>Confirm Password : </td>
   <td><input type="password" name="cpass" id="cpass"/></td>
   <td><span id="cpasserror" style="color:red"></span></td>
   </tr>
   </table>
   <br>
   <input type="submit" value="Changepass" name="action">
<input type="reset" value="Clear">
</form>
   </div>
   <jsp:include page="Footer.jsp" ></jsp:include>

</body>
</html>