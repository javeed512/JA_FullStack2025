<%@ page  import="com.hexaware.springmvc.entity.*"  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Success.jsp page</h1>

Employee Details Added to Database: <br>

<%

 Employee emp = (Employee)   session.getAttribute("emp");
 
	out.print(emp);
 
 %>


</body>
</html>