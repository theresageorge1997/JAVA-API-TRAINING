package UstGeneric;

import java.io.*;
import javax.servlet.*;

public class DemoGeneric extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) 
	throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter printer = res.getWriter();
		printer.print("<html>");
		printer.print("<body>");
		printer.print("<h2> Generic Servlet Example</h2>");
		printer.print("<p> Welcome to UST Global </p>");
		printer.print("</body>");
		printer.print("</html>");	
	}
}
