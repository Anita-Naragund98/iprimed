package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet {
	
	public LifeCycleServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("invoked service");
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
