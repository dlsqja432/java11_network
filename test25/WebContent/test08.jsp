<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹의 객체 전달과 스코프(Scope) 알기</title>
</head>
<body>
<h2>웹의 객체 전달과 스코프(Scope) 알기</h2>
<%
	ArrayList<String> list = new ArrayList<>();
	list.add("이정희");
	list.add("이원석");
	list.add("장인범");
	list.add("이예린");
	list.add("금강선");
	request.setAttribute("list", list);
	
	Set<String> set = new HashSet<>();
	set.add("조대신");
	set.add("강원기");
	set.add("윤명진");
	set.add("김창섭");
	request.setAttribute("set", set);
	
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "김동연");
	map.put(2, "김민식");
	map.put(3, "김민아");
	map.put(4, "김윤정");
	map.put(5, "김응원");
	map.put(6, "김필규");
	request.setAttribute("map", map);
	
	RequestDispatcher rd = request.getRequestDispatcher("test09.jsp");	// 목적지 지정
	rd.forward(request, response);	// 데이터 전달
	response.sendRedirect("test09.jsp");	// 데이터 이동(화면 이동x) : URL은 test08.jsp이지만 
%>
<h2>객체 데이터 전달하기</h2>
</body>
</html>