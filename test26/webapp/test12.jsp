<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.kh.dto.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 - forward2</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<%
	request.setAttribute("memberObj", new Member(1, "jung", "1004", "정성하"));
	request.setAttribute("strObj", "장인범");
	request.setAttribute("intObj", 95);
%>
<jsp:forward page="test12_result.jsp" >
	<jsp:param value="1212" name="num1"/>
	<jsp:param value="7979" name="num2"/>
</jsp:forward>
</body>
</html>