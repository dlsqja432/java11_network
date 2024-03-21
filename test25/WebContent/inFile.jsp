<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String name = (String) pageContext.getAttribute("name");
	String age = (String) pageContext.getAttribute("age");
%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h2>포함되는 파일</h2>
	<div>
		<p>Name : <%=name %></p>
		<p>Age : <%=age %></p>
	</div>
</body>
</html>