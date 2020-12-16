package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleLoginDetails {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
				
				
				res.setContentType("text/html");
				PrintWriter printer = res.getWriter();
				
				String name = req.getParameter("uname");
				String age = req.getParameter("uage");
				
				printer.println("Welcome to Servlets, find your details here:");
				printer.println("Name:"+ name);
				printer.println("Age:"+age);
				
				printer.close();
			}

}
