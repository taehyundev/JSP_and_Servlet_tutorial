# 사용자 입력을 통한 GET 요청



* form에서 hello로 get요청을 보낸다. n이라는 변수에 값을 넣으면 hello의 쿼리스트링 형태로 나타나게된다.

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="hello" method="get">
		<input type="text" name="n" placeholder="input"><br>
		<input type="submit" value="입력">
	</form>
</body>
</html>
```

