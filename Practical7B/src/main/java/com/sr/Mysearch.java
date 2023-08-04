package com.sr;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Mysearch  extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException ,ServletException{
	
		String sq =req.getParameter("b");
		res.sendRedirect("https://www.google.com/search?q="+sq);
	}
}