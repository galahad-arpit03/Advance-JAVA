<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
    <%
        int n1 = Integer.parseInt(request.getParameter("number1"));
      
        for(int i = 0 ;i<=10;i++){
        	int k = i*n1;
        out.println("<h1>" +n1+ " * " +i+ " = " +k+  "</h1>");
        	
        }
        %>
    
</body>
</html>
