<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int no1=Integer.parseInt(request.getParameter("no1"));
				    
					out.print("<h1><b>Table of Given Number is as follows</b></h1><br>");
				    for(int i=1;i<=10;i++)
				    {
					
					out.print("<h1><b>"+no1+"*"+i+"="+no1*i+"</b></h1><br>");
					
				}
				%>
</body>
</html>