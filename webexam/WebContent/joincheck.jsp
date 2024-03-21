<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("nmae");
	String phone = request.getParameter("phone");
	String birth = request.getParameter("birth");
	String email = request.getParameter("email");
	
	application.setAttribute("id", id);
	application.setAttribute("pw", pw);
	application.setAttribute("name", name);
	application.setAttribute("phone", phone);
	application.setAttribute("birth", birth);
	application.setAttribute("email", email);
%>
<h1>회원가입이 완료되었습니다.</h1><br>
<a href="index.jsp"><button>로그인 화면으로 이동</button></a>
</body>
</html>