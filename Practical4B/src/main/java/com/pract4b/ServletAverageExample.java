package com.pract4b;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletAverageExample extends HttpServlet {
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
				    int no2=Integer.parseInt(req.getParameter("no2"));
				    int no3=Integer.parseInt(req.getParameter("no3"));
				    
				    double avg=(no1+no2+no3)/3;
					
					out.print("<html><body>");
					out.print("<h1><b>This is Servlet Page</b></h1><br>");
					out.print("<h1><b>Average of 3 Numbers is :"+avg+"</b></h1><br>");
					out.print("</body></html>");
				}

				public void destroy() {
					System.out.println("Dopost is destroyed");
				}

}
