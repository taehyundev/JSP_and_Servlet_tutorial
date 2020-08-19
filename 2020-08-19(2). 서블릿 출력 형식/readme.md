# 서블릿 출력 형식

> 브라우저에 컨텐츠 형식을 알려주지 않은 경우 자의적인 해석을 하게된다.
>
> 그렇기 때문엡 서블릿 출력형식을 지정해 주어야한다.

```java
@WebServlet("/hello")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		for(int i=0; i<10;i++)
			out.println((i+1)+" : Hello ~~~<br>");
	}
}
```

* res에서 문자인코딩을 UTF-8로 설정하고 contentType을 text/html; charset=UTF-8로 설정해준다.

  이렇게 하게되면, html에서의 줄바꿈 태그 또한 어느 브라우저에서나 정상 작동하게 된다.