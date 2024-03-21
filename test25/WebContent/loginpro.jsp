<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = "user1";
	String userName = "장인범";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	if(id.equals(userId) && name.equals(userName)) { 
		session.setAttribute("sId", id);
		session.setAttribute("sName", name);
		response.sendRedirect("test11.jsp");
	} else {
		response.sendRedirect("loginfail.jsp");
	}
%>
</body>
</html>