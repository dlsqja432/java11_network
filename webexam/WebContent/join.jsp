<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="joincheck.jsp" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<table>
				<tbody>
					<tr>
						<th><label for="id">아이디</label></th>
						<td>
							<p>아이디는 영문 소문자와 숫자만 입력가능하고 6~12글자만 입력 가능합니다.</p><br>
							<input type="text" name="id" id="id" pattern="[a-z0-9]{6,12}" autofocus required>
						</td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td>
							<p>비밀번호는 영문과 숫자를 포함한 8~12글자만 입력 가능합니다.</p><br>
							<input type="password" name="pw" id="pw" pattern="[a-zA-Z0-9]{8,12}" required>
						</td>
					</tr>
					<tr>
						<th><label for="name">이름</label></th>
						<td><input type="text" name="name" id="name" required></td>
					</tr>
					<tr>
						<th><label for="phone">전화번호</label></th>
						<td><input type="text" name="phone" id="phone" required></td>
					</tr>
					<tr>
						<th><label for="birth">생년월일</label></th>
						<td><input type="date" name="birth" id="birth" required></td>
					</tr>
					<tr>
						<th><label for="email">이메일</label></th>
						<td><input type="text" name="email" id="email" required></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit">입력완료</button>&ensp;&ensp;&ensp;&ensp;
							<button type="reset">초기화</button>
						</td>
					</tr>
				</tbody>
			</table>
		</fieldset>
	</form>
</body>
</html>