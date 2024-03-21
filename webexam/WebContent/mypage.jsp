<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
<%
	String name = (String) application.getAttribute("id");
	String phone = (String) application.getAttribute("phone");
	String birth = (String) application.getAttribute("birth");
	String email = (String) application.getAttribute("email");
%>
<fieldset>
	<legend>회원 정보</legend>
	<table>
		<tbody>
			<tr>
				<th>이름</th>
				<td><%=name %></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><%=phone %></td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><%=birth %></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><%=email %></td>
			</tr>
		</tbody>
	</table>
</fieldset>
<a href="index.jsp"><button>로그인 화면으로 돌아가기</button></a>
</body>
</html>