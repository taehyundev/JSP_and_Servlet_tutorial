package com.taehyundev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		//requset 입력도구 , response 출력도구
		String temp = req.getParameter("n");
		//기본값
		int cnt = 100;
		if(temp != null && !temp.equals(""))
			cnt = Integer.parseInt(temp);
		for(int i=0; i<cnt;i++)
			out.println((i+1)+" : Hello ~~~<br>");
	}
}

