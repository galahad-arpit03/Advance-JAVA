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
      
    int res = 1, i;
    for (i=2; i<=n1; i++){
     res *= i;
    }
    out.println("<h1>" +res+ "<h1>");
  	%>
    <a href="index.html">Go Back</a>
    
</body>
</html>
