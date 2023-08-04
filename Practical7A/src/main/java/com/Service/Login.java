package com.Service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	String name = req.getParameter("uname");
    	String pass = req.getParameter("pwd");
    	
    	if(name.equals("Amit") && pass.equals("123456"))
    	{
    		RequestDispatcher rd = req.getRequestDispatcher("welcome");
    		rd.forward(req, res);
    	}
    	
    	else if(!name.equals("Amit") && !pass.equals("123456")){
    		out.print("** Invalid Username and Password **");
    		RequestDispatcher rd = req.getRequestDispatcher("UI.html");
    		rd.include(req , res);
    		
    	}
    	
    	else if(!name.equals("Abhay") && pass.equals("123456")) {
    		out.print(" ** Invalid Username **");
    		RequestDispatcher rd = req.getRequestDispatcher("UI.html");
    		rd.include(req, res);
    	}
    	
    	else {
    		out.print(" ** Invalid Password **");
    		RequestDispatcher rd = req.getRequestDispatcher("UI.html");
    		rd.include(req, res);
    	}
    	
    	
    }
}