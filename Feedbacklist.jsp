<%@page import="java.util.Iterator"%>
<%@page import="com.foodplazza.pojo.Feedback"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FeedbackList</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
	<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
	<link href="style123.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<%List<Feedback>l=(List)session.getAttribute("fdlist"); %>

 <jsp:include page="AdminHeader.jsp"></jsp:include>
 
 <div id="templatemo_container">
   <form class="main">
    <table border="1">
    <caption><br><h1>FeedbackList</h1></caption>
    
    <tr>
    <th>Name</th>
    <th>EmailId</th>
    <th>Review</th>
    <th>Rank</th>
    <th>Suggestion</th>
    </tr>
    
    <%Iterator<Feedback>itr=l.iterator();
    while(itr.hasNext()){
    	Feedback fed=itr.next();%>
    	
    	<tr>
        <td><%=fed.getName()%></td>
        <td><%=fed.getEmailId()%></td>
    	<td><%=fed.getReview()%></td>
    	<td><%=fed.getRank1()%></td>
    	<td><%=fed.getSuggestion()%></td>
    	</tr>
   <%}%>
   
    </table>
   
   </form>
 </div>
 <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>