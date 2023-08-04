<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<% int no1=Integer.parseInt(request.getParameter("no1"));
   
				    
					out.print("<h1><b>Factorial of Given Number</b></h1><br>");
					int fact=1;
				    for(int i=1;i<=no1;i++)
				    {
					fact=fact*i;
				    }
					out.print("<h1><b>Factorial of "+no1+" is "+fact+"</b></h1><br>");
		
				%>
		<a href="UI.html">GO BACK</a>
</body>
</html>