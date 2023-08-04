package com.ExampleHttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpExampleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7355046033261073885L;
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	    throws IOException
	    {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<h1>welcome to my page by http servlet</h1>");
		out.print("</body></html>");
	    }
	


}
