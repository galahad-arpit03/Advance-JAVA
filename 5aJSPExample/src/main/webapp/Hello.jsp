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
        
        //String num1 = request.getParameter("number1");
       	//String num2 = request.getParameter("number2");
        //String num3 = request.getParameter("number3");
        
        
        int n1 = Integer.parseInt(request.getParameter("number1"));
        int n2 = Integer.parseInt(request.getParameter("number2"));
        int n3 = Integer.parseInt(request.getParameter("number3"));
        
        // calculate the average
        double avg = (n1 + n2 + n3) / 3.0;
        out.println("<h1>The average is"+avg+" </h1>");
        %>
    
</body>
</html>
