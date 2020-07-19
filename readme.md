# JSP_tutorial

> Spring FrameWork를 왜 사용하는지를 알기위해서 먼저 JSP와 서블릿에 대해 이해할 생각이다.

## 톰캣설치

* https://tomcat.apache.org/download-90.cgi

  1. 위의 사이트에서  64-bit-Windows zip을 다운해준다.

  2. 압축해제이후 bin 폴더에 있는 startup.bat을 실행시켜준다.
  3. 127.0.0.1/8080 에 접속을 해본다.

  톰캣 페이지가 뜬다면 성공한 것이다.


## 서블릿이란?

서블릿이란 자바를 사용하여 웹을 만들기 위해 필요한 기술입니다. 그런데 좀더 들어가서 설명하자면 

클라이언트가 어떠한 요청을 하면 그에 대한 결과를 다시 전송해주어야 하는데, 이러한 역할을 하는 자바 프로그램입니다. 

### < 서블릿 특징 >

- 클라이언트의 요청에 대해 동적으로 작동하는 웹 어플리케이션 컴포넌트
- html을 사용하여 요청에 응답한다.
- Java Thread를 이용하여 동작한다.
- MVC 패턴에서 Controller로 이용된다.
- HTTP 프로토콜 서비스를 지원하는 javax.servlet.http.HttpServlet 클래스를 상속받는다. UDP보다 속도가 느리다.
- HTML 변경 시 Servlet을 재컴파일해야 하는 단점이 있다.



