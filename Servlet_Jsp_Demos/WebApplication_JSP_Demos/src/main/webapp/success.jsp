<%@ page language="java"  import="com.hexaware.entity.Employee"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Success JSP page</h1>


<% 

	



Employee emp = (Employee)   session.getAttribute("e1");

	out.print("IN JSP" + emp);


%>



</body>
</html>