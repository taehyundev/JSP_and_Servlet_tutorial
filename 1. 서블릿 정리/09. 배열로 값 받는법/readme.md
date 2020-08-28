# 여러개의 input 데이터 배열로 받기

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="add2" method="post">
	<div>
		<input type="text" name="num" />
		<input type="text" name="num" />
		<input type="text" name="num" />
		<input type="text" name="num" />
	</div>
	<div>
		<input type="submit" value="덧셈">
	</div>
</form>
</body>
</html>
```

위와 같은 여러개의 input[type=text]로 구성되어 있을 때, 하나의 name으로 묶어서 전달을하면 된다.

서블릿에서의 소스는

```java
String []n = req.getParameterValues("num");
```

위와같이 배열로 getParameterValues로 name이 num인 파라미터의 집합체를 가지고 오게된다.

