package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	
	public RegistrationServlet() {
		System.out.println("Created RegistrationServlet");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("invoked service of registration");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Life Cycle</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>This is a Life cycle a Servlet</h1>\r\n" + 
				"<form action=\"cycleAction\" method=\"post\">\r\n" + 
				"<input type=\"submit\" value=\"service\"/>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
		
	}

}
