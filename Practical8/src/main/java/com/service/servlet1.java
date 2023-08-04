package com.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.print("<html><body>");
		
		
		out.print("<h2><b>Hello , " + name + " Welcome to Website</b></h2>");
		out.print("<h2><a href='servlet2'>Go to Servlet 2</a></h2>");
		//create a cookie
		Cookie c = new Cookie("user_name" ,URLEncoder.encode(name,"UTF-8"));
		res.addCookie(c);
	
		out.print("</body></html>");
	}
}
