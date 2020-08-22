# 서블릿 필터

> 필터는 클라이언트로부터 서블릿이 요청되어 수행될 때 필터링 기능을 제공하기 위한 기술입니다. 

* UTF -8로 셋팅하는 것을 서블릿 필터를 따로 구현하여 좀 더 편리하고 가독성을 높여 보았다.



* webServlet과 마찬가지로 어노테이션로 처리할 수 있고 @WebFilter("")로 설정하면된다.

> web.xml 파일에 추가를 하는 것 또한 servlet설정과 매우 비슷하다.

chain.doFilter(request,response)

* doFilter 요청과 응답쌍이 체인을 통과할 때마다 컨테이너에서 호출된다. 체인을 따라서 계속 다음 존재하는 필터로 이동하는 것

```java
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("before filter");
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request,response);
		System.out.println("after filter");
		
	}

}
```

