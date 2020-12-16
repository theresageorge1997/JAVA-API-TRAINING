 package Ust;

import java.io.*;
import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Basic extends HttpServlet {
	private String message;
	
	public void init() throws ServletException{
		// Do Required initialization
		message = "This is my First Servlet";
	}
	
	public void doGet( HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		
		//Server Response Content Type 
		response.setContentType("text/html");
		
		//Actual Logic Goes here
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message +"</h1>");
		
	}

}
