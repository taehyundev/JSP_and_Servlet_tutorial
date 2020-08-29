# Session 객체란?

세션 객체란 servletContext와 다르게 한 프로세스 단위로 값을 공유하고 다른 프로세스 사이에서는 다른 세션 객체가 적용된다. 크롬과 엣지 브라우저가 서로 값을 공유하지않지만, 크롬끼리는 값을 공유할 수 있다.(엄밀히 말하면 Session ID가 같기 떄문이다.)

>서블릿 Context는 서블릿 간 문맥을 연결할 수 있도록 한다는 의미로 해석하면 좋을 듯

```java
HttpSession session = req.getSession();
//저장소 선언
/*
	session.setAttribute("name", "value");
	session.getAttribute("name");
	setAttribute를 통해서 저장소에 저장
	getAttribute를 통해서 저장소에서 name이름의 value를 가지고 옴
*/
```

