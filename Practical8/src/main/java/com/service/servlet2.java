package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		//Getting all the Cookies
		Cookie[] c = req.getCookies();
		
		boolean f = false;
		String uname = " ";
		if(c == null) {
			out.print("<h2>You are new user go to home page and submit your name</h2>");
			return;
		}
		
		else {
			//for(Cookie c:cookies
			for(int i=0 ; i<c.length ; i++)
			{
				String tname = c[i].getName();
				if(tname.equals("user_name")) {
					f = true;
					uname = URLDecoder.decode(c[i].getValue(), "UTF-8");
					
					break;
				}
			}
		}
		
		if(f) {
			out.print("<h2><b>Hello , " + uname + " Welcome back to Website </b></h2>");
			out.print("<h2>Thank You</h2>");
		}
		else {
			out.print("<h2>You are new user go to home page and submit your name</h2>");
		}
		
		
		
        //String name = req.getParameter("name");		
		//out.print("<h2><b>Hello , " + name + "Welcome back to Website </b></h2>");
		out.print("<h2><a href='UI.html'>Go to UI Page</a></h2>");
		
		out.print("</body></html>");
	}
}