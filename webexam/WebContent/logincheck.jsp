<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
<h1>로그인 완료</h1>
<%
	request.setCharacterEncoding("UTF-8");
	String lId = request.getParameter("id");
	String lPw = request.getParameter("pw");
	
	String id = (String) application.getAttribute("id");
	String pw = (String) application.getAttribute("pw");
	if(lId.equals(id) && lPw.equals(pw)) {
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		response.sendRedirect("index.jsp");
	} else {
		response.sendRedirect("loginfail.jsp");
	}
%>
</body>
</html>