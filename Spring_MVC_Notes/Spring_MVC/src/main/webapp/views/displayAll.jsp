<%@ page language="java"   isELIgnored="false"  import="java.util.* , com.hexaware.springmvc.entity.*"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

hello



<h1>Display  All  Employees Page</h1>

<% 

  List<Employee>  list = (List<Employee>)	session.getAttribute("empList");

	


%>

EL Expression: <br>

${empList}


<br>

<table border=1  style='background-color:yellow'>

<tr> <th>EID</th>  <th>ENAME</th>    <th>SALARY</th>    <th>DOJ</th>   </tr>


<%  for(Employee emp:list){   %>

	

 <tr>  <td> <%= emp.getEid() %>  </td> <td> <%= emp.getEname() %>  </td> 
 			 <td>  <%= emp.getSalary() %>  </td>  <td> <%= emp.getDoj() %>   </td>    </tr> 

		


<%  } %>
</table>




</body>
</html>