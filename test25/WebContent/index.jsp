<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
%>
<html>
<head>
<meta charset="UTF-8">
<%
	String title = "메인 페이지";
%>
<title><%=title %></title>
</head>
<body>
	<h2>메인 페이지</h2>
	<hr>
	<nav>
		<ul>
			<li><a href="test01.jsp">JSP 페이지의 기본 구성 요소</a></li>
			<li><a href="test02.jsp?name='장인범'&age=29&point=80">GET 데이터 전송</a></li>
			<li><a href="test03.jsp">POST 데이터 전송</a></li>
			<li><a href=""></a></li>
			<li><a href="test05.jsp">회원 가입 예제</a>
		</ul>
	</nav>
</body>
</html>