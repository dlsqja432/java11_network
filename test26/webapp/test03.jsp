<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="org.kh.dto.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<%
	pageContext.setAttribute("pName", "조우진");
	request.setAttribute("rName", "유정환");
	session.setAttribute("sName", "강범준");
	application.setAttribute("aName", "김필규");
%>
<meta charset="UTF-8">
<title>폼 데이터 전송과 표현 언어(EL)</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2>폼 데이터 전성과 표현 언어(EL)</h2>
<hr>
<div>
	<a href="test03_get.jsp?tName=배곤희">GET 전송</a>
</div>
<div>
	<h3>POST 전송</h3>
	<hr>
	<form action="test03_post.jsp" method="post"> 
		<input type="number" size="40" name="no" id="no" value="1" min="1" max="100" required><br><br>
		<input type="text" size="40" name="id" id="id" placeholder="아이디 입력" required><br><br>
		<input type="password" size="40" name="pw" id="pw" placeholder="비밀번호 입력" required><br><br>
		<input type="text" size="40" name="name" id="name" placeholder="이름 입력" required><br><br>
		<div>
			<h4>좋아하는 스포츠 - 2개 이상 선택</h4>
			<input type="checkbox" name="sports" id="sport1" value="축구"><label for="sport1">축구</label>
			<input type="checkbox" name="sports" id="sport2" value="야구"><label for="sport2">야구</label>
			<input type="checkbox" name="sports" id="sport3" value="배구"><label for="sport3">배구</label>
			<input type="checkbox" name="sports" id="sport4" value="농구"><label for="sport4">농구</label>
			<input type="checkbox" name="sports" id="sport5" value="피구"><label for="sport5">피구</label>
		</div>
		<input type="submit" value="회원 추가">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="취소">
	</form>
</div>
</body>
</html>