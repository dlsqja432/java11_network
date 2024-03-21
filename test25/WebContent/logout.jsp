<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 처리</title>
</head>
<body>
<%
	String sId = (String)session.getAttribute("sId");
	if(sId != null) {
		session.invalidate();
	}
	response.sendRedirect("test11.jsp");
%>
</body>
</html>