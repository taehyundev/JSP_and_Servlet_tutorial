# 이클립스를 이용해서 간단한 웹 띄우기

Dynamic Web Project로 프로젝트를 구성하게되면 WebContent 폴더와 Java Resources/src 폴더가 생기는 것을 볼 수 있다.

WebContent 폴더안에 index.html 파일을 만들고 Ctrl + F11 을 입력하여 실행시키면 자동으로 톰캣을 찾아서 웹을 띄워준다.

> index.htm 파일이 최상위경로로 위치하게끔 프로젝트 의 Properties에 들어가서 Web Project Settings에서
>
> Context root 를 '/' 로 해준다. 그러면 localhost:8080/index.html 로 최상위의 형태로 나오게 된다.



* 웹을 띄우는 인터넷 정하기
  * Window > Web Brower > 띄운 웹을 확인할 익스플로러



* 서블릿을 사용하여 웹을 띄우는 방법

  Java Resources/src 폴더 안에 서블릿 class 파일을 만들어준다.

  > 서블릿 클래스는 HttpServlet을 상속 받는다. service를 오버라이딩 하여서 
  >
  > PrintWriter 객체를 만들어 화면에 출력될 메세지를 뽑아낼 수 있다.

  

  ( apache-tomcat-9.0.37/webapps/ROOT/WEB-INF ) 아파치에서 web.xml 파일이 있는 곳의 위치에서

  web.xml 파일을 복사해서 WEB-INF에 붙여넣어준다.



​	서블릿 클래스를 지정하고 서블릿 맵핑을 시켜준다.(아래와 같이 작성)

```xml
<servlet>
    <servlet-name>na</servlet-name>
    <servlet-class>com.taehyundev.web.Nana</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>na</servlet-name>
	<url-pattern>/hello</url-pattern>
</servlet-mapping>
```



servlet-name : 서블릿을 구분 시켜주는 별칭(?) - 좀더 정확한 개념은 나중에

servlet-class : 서블릿 클래스가 위치한 곳 src 폴더를 기준으로

servlet-mapping : 웹의 url 위치에 맵핑 시켜주기위해서 사용

url-pattern : 해당 url에서 맵핑된 서블릿 클래스의 코드가 출력됨

