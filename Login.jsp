<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FoodPlazaLogin</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script src="Validation.js"></script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>

<div id="templatemo_container">
<form name="form" action="login" method="post" onsubmit="return LoginValidation">

<h1>Login</h1>
<table border="1">

<tr>
<td>Select : </td>
<td><select name="type" id="type">
<option>Select</option>
<option value="admin">Admin</option>
<option value="user">User</option>
</select></td>
<td><span id="selecterror" style="color:red"></span></td>
</tr>

<tr>
<td>EmailID : </td>
<td><input type="email" name="email" id="email"/></td>
<td><span id="emailerror" style="color:red"></span></td>
</tr>

<tr>
<td>Password :  </td>
<td><input type="password" name="pass" id="pass"/></td>
<td><span id="passerror" style="color:red"></span></td>
</tr>
</table>


<input type="submit" value="Login" name="action" />
<input type="reset" value="Clear" /> 



</form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>