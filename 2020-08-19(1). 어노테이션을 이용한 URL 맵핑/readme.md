# 어노테이션을 이용한 URL 맵핑

> web.xml을 이용한 URL 맵핑말고도 어노테이션을 이용한 URL 맵핑 이 있다.

```java
package com.taehyundev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//아래의 부분
@WebServlet("/hello")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("Hello ~~~");
	}
}
```

1. @webServlet을 이용해서 맵핑을 한다.

2. metadata-complete를 false로 셋팅해준다.