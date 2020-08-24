package com.taehyundev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("type=text/html; charset=UTF-8");
		String oper = req.getParameter("operator");
		int X = Integer.parseInt(req.getParameter("x"));
		int Y = Integer.parseInt(req.getParameter("y"));
		
		PrintWriter out = res.getWriter();
		if(oper.equals("plus")) {
			out.println("result = "+(X+Y));
		}else if(oper.equals("minus")) {
			out.println("result = "+(X-Y));
		}
	}
}
