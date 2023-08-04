package com.pract5a;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletTableExample extends HttpServlet {
	   /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

				protected void doPost(HttpServletRequest req, HttpServletResponse res) 
					throws IOException {
			    	System.out.println("Do post Method");
					res.setContentType("text/html");
					
					PrintWriter out = res.getWriter();
				    int no1=Integer.parseInt(req.getParameter("no1"));
				    out.print("<html><body>");
					out.print("<h1><b>Table of Given Number is as follows</b></h1><br>");
				    for(int i=1;i<=10;i++)
				    {
					
					out.print("<h1><b>"+no1+"*"+i+"="+no1*i+"</b></h1><br>");
					
				}
				    out.print("</body></html>");}
				public void destroy() {
					System.out.println("Dopost is destroyed");
				}

}
