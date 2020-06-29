package com.revature.servletdemo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletNumeroUno extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In the doGet() method of ServletNumeroUno class");
		resp.setContentType("text/html");
		resp.getWriter().write(
				"<html>" +
                "<body>" +
                "<p>" +
                "Welcome to the get place" +
                "</p>" +
                "</body>" +
                "</html>");
	}
}
