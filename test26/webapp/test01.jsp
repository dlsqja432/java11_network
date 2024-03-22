<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String title = "표현식과 표현언어";
	String[] jongwoo = {"까다로움", "꾸준함", "개웃김", "착함"};
	Map<String, String> cho = new HashMap<>();
	cho.put("name", "조대신");
	cho.put("age", "69");
	cho.put("nick", "조교주");
	
	request.setAttribute("tt", title);
	request.setAttribute("jg", jongwoo);
	request.setAttribute("ch", cho);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어(Expression Language)</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<h2>표현식(Expression)</h2>
<p><%=title %> : <%=request.getAttribute("tt") %></p>
<div>
<%
	String[] jg = (String[])request.getAttribute("jg");
	for(String s : jg) {
%>
	<span><%=s %></span>
<% } %>
</div><br>
<div>
<%
	Map<String, String> ch = new HashMap<>();
	ch = (Map<String, String>) request.getAttribute("ch");
	Collection<String> val = ch.values();
	for(String s : val) {
%>
	<span><%=s %></span>
<% } %>
</div>
<h2>표현언어(Expression Language)</h2>
<p>${tt }</p>
<div>
<c:forEach var="s" items="${jg }">
	<span>${s }</span>
</c:forEach>
</div><br>
<c:forEach var="map" items="${ch }">
	<span>${map.key }</span> : <span>${map.value }</span>
</c:forEach>
</body>
</html>