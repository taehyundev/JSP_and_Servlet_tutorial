# Application 객체란?

서블릿들을 실행시킨 직후 바로 소멸되기에 그 당시 사용한 값들이나 결과 값들을 넘겨 받거나 하는 행위가 불가. 따라서 '서블릿 Context'라는 저장소를 통해 값들을 저장하고 불러올 수도 있음.

>서블릿 Context는 서블릿 간 문맥을 연결할 수 있도록 한다는 의미로 해석하면 좋을 듯

```java
ServletContext application = request.getServletContext();
//저장소 선언
/*
	application.setAttribute("name", "value");
	application.getAttribute("name");
	setAttribute를 통해서 저장소에 저장
	getAttribute를 통해서 저장소에서 name이름의 value를 가지고 옴
*/
```

