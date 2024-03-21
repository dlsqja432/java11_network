<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
<%
	String sId = (String)session.getAttribute("id");
	String sName = (String)session.getAttribute("name");
	if(sId != null) {
%>
<h1>로그인 성공</h1>
<a href="logout.jsp"><button>로그아웃</button></a>&ensp;&ensp;&ensp;&ensp;
<a href="mypage.jsp"><button>회원정보</button></a>
<% } else { %>
<form action="logincheck.jsp" method="post">
	<fieldset>
		<legend>로그인</legend>
		<table>
			<tbody>
				<tr>
					<th><label for="id">아이디</label></th>
					<td><input type="text" name="id" id="id" autofocus></td>
				</tr>
				<tr>
					<th><label for="pw">비밀번호</label></th>
					<td><input type="password" name="pw" id="pw"></td>
					<td><button type="submit">로그인</button></td>
				</tr>
			</tbody>
		</table>
	</fieldset>
</form>
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
<a href="join.jsp">
	<button>&ensp;&ensp;&ensp;회원 가입&ensp;&ensp;&ensp;</button>
</a>
<% } %>
</body>
</html>