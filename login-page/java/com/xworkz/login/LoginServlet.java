package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		System.out.println("created LoginServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userFromReq = req.getParameter("userName");
		String passwordFromReq = req.getParameter("password");
		System.out.println(userFromReq);
		System.out.println(passwordFromReq);

		// super.doPost(req, resp);

		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Login Successfully.......");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Login Successfull for "+userFromReq);
		writer.println("<b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
	}

}
