package com.taehyundev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class calc extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");

		String oper = req.getParameter("oper");
		
		int v = Integer.parseInt(req.getParameter("x"));
		
		PrintWriter out = res.getWriter();
		ServletContext application = req.getServletContext();
		if(oper.equals("=")) {
			int x = (Integer)application.getAttribute("value");
			int y = v;
			String operator = (String)application.getAttribute("op");
			
			int result =0;
			if(operator.equals("+"))
				result = x+y;
			else
				result = x-y;

			out.printf("result %d\n", result);
		}
		else {
			application.setAttribute("value", v);
			application.setAttribute("op", oper);	
		}
	}
}
