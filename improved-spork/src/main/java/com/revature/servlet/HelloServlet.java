package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws IOException, ServletException {
		resp.getWriter().write(" I NEED TO WORK ON MY PROJECT <br> Hello! Goodbye! This is an app. Welcome to Improved Spork!");
	}
}
