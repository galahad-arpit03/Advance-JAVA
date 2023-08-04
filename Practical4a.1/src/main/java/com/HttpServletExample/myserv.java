package com.HttpServletExample;
    import java.io.IOException;
	import java.io.PrintWriter;

	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	public class myserv extends HttpServlet{

		 
		    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

			protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		    	System.out.println("Do post Method");
				res.setContentType("text/html");
				
				PrintWriter out = res.getWriter();
				String sname = req.getParameter("uname");
				int age = Integer.parseInt(req.getParameter("age"));
				
				
				out.print("<html><body>");
				out.print("<h1><b>This is Servlet Page</b></h1><br>");
				out.print("<h1><b>Your User Name is :" + sname+"</b></h1><br>");
				out.print("<h1><b>Your Age is :" + age +"</b></h1><br>");
				out.print("</body></html>");
			}

			public void destroy() {
				System.out.println("Dopost is destroyed");
			}

	}


