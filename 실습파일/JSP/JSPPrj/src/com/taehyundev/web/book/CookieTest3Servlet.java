package com.taehyundev.web.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie3")
public class CookieTest3Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		int cnt = 0;
		Cookie[] list = req.getCookies();
		for(int i=0;i<list.length && list !=null; i++) {
			if(list[i].getName().equals("count")) {
				cnt = Integer.parseInt(list[i].getValue());
			}
		}
		cnt++;
		Cookie c1 = new Cookie("count", Integer.toString(cnt));
		c1.setMaxAge(60*60*24*10);
		resp.addCookie(c1);
		
		out.println("<h1>¹æ¹®È½¼ö : "+cnt+"</h1>");
		out.close();
	}
}
