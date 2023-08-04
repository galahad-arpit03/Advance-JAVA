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
   
				String ss=" ";
				    
					out.print("<h1><b>Fibonacci Series is</b></h1><br>");
					int a=0,b=0,c=1;
				    for(int i=1;i<=no1;i++)
				    {
					a=b;
					b=c;
					c=a+b;
					ss+=a+"  ";
					//out.print("<h1>"+a+" ");
				    }out.print("<h1>"+ss+"</h1>");
					
		
				%>
		<a href="UI.html">GO BACK</a>
</body>
</html>