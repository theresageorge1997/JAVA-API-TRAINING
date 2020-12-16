package Ustlogin;
import java.io.*;
import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException{
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		
		if(user.equals("venkat") && pass.equals("venkat"))
			pw.println("Login is Success.....");
		else
			pw.println("Login is Failed.....");
		pw.close();
	}

}
