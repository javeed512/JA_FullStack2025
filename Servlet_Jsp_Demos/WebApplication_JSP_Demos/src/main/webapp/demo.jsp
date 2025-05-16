<%@ page language="java"  import="java.util.*,java.io.*,java.sql.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome to JSP Page</h1>
 

  <%
    String str = new String("javeed");
    
     int x = 99;
     
     	out.print(str);
     	out.print("X value is : "+x);
     	
     	List  list = new ArrayList();
     	
     
    
   %> 
   
  
   
   <%!
   
	public void m1(){
		
		
	}
	
	static String city = "mumbai";
	
	 int eid = 0;
   
   
   %>
   
   

</body>
</html>