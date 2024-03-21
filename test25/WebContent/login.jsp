<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h2>로그인</h2>
<form action="loginpro.jsp" method="post">
	<input type="text" name="id" id="id" placeholder="아이디 입력" autofocus><br><br>
	<input type="text" name="name" id="name" placeholder="이름 입력"><br><br>
	<button type="submit">로그인</button>&ensp;&ensp;&ensp;
	<button type="reset">초기화</button>
</form>
</body>
</html>