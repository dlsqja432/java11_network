<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="org.kh.dto.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 전송 결과</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	// request.setAttribute("no", request.getParameter("no"));
	// request.setAttribute("id", request.getParameter("id"));
	// request.setAttribute("pw", request.getParameter("pw"));
	// request.setAttribute("name", request.getParameter("name"));
	
	// String[] sports = request.getParameterValues("sports");
	// int len = sports.length;
%>
<%@ include file="menu.jsp" %>
<h2>POST 전송 결과</h2>
<div>
	<p>pName : ${pName }</p>
	<p>rName : ${rName }</p>
	<p>sName : ${sName }</p>
	<p>aName : ${aName }</p>
	<p>tName : ${tName }</p>
</div>
<hr>
<h2>POST 전송 결과 2</h2>
<div>
	<p>no : ${param.no }</p>
	<p>id : ${param.id }</p>
	<p>pw : ${param.pw }</p>
	<p>name : ${param.name }</p>
	<p>좋아하는 스포츠</p>
	<ul>
		<c:forEach var="sports" items="${paramValues.sports }">
			<li>${sports }</li>
		</c:forEach>
	</ul>
	
	<p>POST 방식도 마찬가지로 getParameter로 보낸 값을 setAttribute에 저장해야 EL 사용 가능함</p>
	<p>하지만, 변수명 앞에 param을 붙이면 setAttribute로 가져오지 않아도 사용할 수 있음</p>
</div>
</body>
</html>