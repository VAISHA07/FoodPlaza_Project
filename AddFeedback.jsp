<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
<link href="templatemo-style.css" rel="style.sheet" type="text/css">
<script src="Validation.js"></script>
</head>
<body>
<jsp:include page="UserHeader.jsp"></jsp:include>
<div id="templatemo_container">
<form action="feedback" method="post" onsubmit="return AddFeedValidation()" class="main">
<table border="1">
 <caption><h1>Add Feedback</h1></caption>

<tr>
<td>Name : </td>
<td><input type="text" name="cname" id="cname"></td>
<td><span id="cnameerror" style="color:red"></span></td>
</tr>

<tr>
<td>Review : </td>
<td><input type="text" name="review" id="review"></td>
<td><span id="reviewerror" style="color:red"></span></td>
</tr>

<tr>
<td>Rate :  </td>
<td><input type="number" name="rank" id="rank"></td>
<td><span id="rankerror" style="color:red"></span></td>
</tr>

<tr>
<td>Suggestion : </td> 
<td><input type="text" name="sug" id="sug"></td>
<td><span id="sugerror" style="color:red"></span></td>
</tr>
</table>
<br>
<input type="submit" value="AddFeedback" name="action">
<input type="reset" value="Clear"> 

</form>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>