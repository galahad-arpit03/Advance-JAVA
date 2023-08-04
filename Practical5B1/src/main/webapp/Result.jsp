<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Average.jsp</title>
</head>
<body bgcolor="pink">
<%
int a=Integer.parseInt(request.getParameter("no1"));
int b=Integer.parseInt(request.getParameter("no2"));
int c=Integer.parseInt(request.getParameter("no3"));
int sum=a+b+c;
double avg=sum/3; 
out.print("<html><body>");
out.print("<h1><b>This is JSP Page</b></h1><br>");
out.print("<h1><b>Sum of 3 Numbers is :"+sum+"</b></h1><br>");
out.print("<h1><b>Average of 3 Numbers is :"+avg+"</b></h1><br>");
out.print("</body></html>");
%>
<a href="UI.html">GO BACK</a>
</body>
</html>