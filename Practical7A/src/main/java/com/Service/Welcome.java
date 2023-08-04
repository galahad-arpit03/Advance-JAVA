package com.Service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		String uname=req.getParameter("uname");
		PrintWriter ww= res.getWriter();
		ww.print("Welcome "+uname);
		ww.print("</p><a href='UI.html'>GO Back</a>");
		
	}
}
