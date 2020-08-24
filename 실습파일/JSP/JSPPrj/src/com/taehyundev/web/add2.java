package com.taehyundev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class add2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String []n = req.getParameterValues("num");
		int result = 0;
		for(int i=0; i<n.length; i++) {
			result +=Integer.parseInt(n[i]);
		}
		PrintWriter out = res.getWriter();
		out.println("result = " + result);
	
	}
}
