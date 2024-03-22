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
<title>GET 전송 결과</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<h2>GET 전송 결과</h2>
<%
	request.setAttribute("tName", request.getParameter("tName"));
%>
<div>
	<p>pName : ${pName }</p>
	<p>rName : ${rName }</p>
	<p>sName : ${sName }</p>
	<p>aName : ${aName }</p>
	<p>tName : ${tName }</p>
	<p>파라미터로 들어온 데이터는 EL로 인식하지 못하기 때문에 getParameter로 값을 불러와야 사용 가능함</p>
</div>
</body>
</html>