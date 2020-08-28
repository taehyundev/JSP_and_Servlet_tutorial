# 2개 이상의 submit 작동 시키는 법

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
	<input type="text" name="x" placeholder="x">
	<input type="text" name="y" placeholder="y">
	<input type="submit" name="operator" value="plus">
	<input type="submit" name="operator" value="minus">
</form>
</body>
</html>
```



위의 html 소스에서 submit 2개가 작동 하기 위해서는 2개의 submit의 name을 같게 해준다.

그리고 value를 입력해주면, submit을 누르게되면 operator=plus가 된다. 그럼

```java
String oper = req.getParameter("operator");
```

위와 같은 소스로 operator를 받게되면 oper.equals("plus") 나 oper.equals("minus") 로 어떤 submit이 동작했는지 확인할 수 있다.