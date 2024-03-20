<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>회원 가입</h1>
	<hr>
	<form action="test06.jsp" method="post">
		<p><strong style="color:red">*</strong> 은 필수 입력 요소입니다.</p>
		<fieldset>
			<legend>기본 정보</legend>
			<table>
				<tbody>
					<tr>
						<th><label for="id">* 아이디</label></th>
						<td>
							<p>영문 소문자로 시작하면서 숫자를 혼합한 6글자 이상 12글자 이내로 조합</p>
							<input type="text" name="id" id="id" placeholder="아이디 입력" pattern="[a-z0-9]{6,}" maxlength="12" autofocus required>
							<button type="button" style="background-color: aqua; border:none;">아이디 중복 확인</button>
						</td>
					</tr>
					<tr>
						<th><label for="pw">* 비밀번호</label></th>
						<td>
							<p>비밀번호는 최소 8글자 이상 12글자 이내로 입력</p>
							<input type="password" name="pw" id="pw" placeholder="비밀번호 입력" pattern="[a-zA-Z0-9]{8,12}" required>
						</td>
					</tr>
					<tr>
						<th><label for="pwch">* 비밀번호 확인</label></th>
						<td><input type="password" name="pwch" id="pwch" placeholder="비밀번호 입력 확인" required></td>
					</tr>
					<tr>
						<th><label for="name">* 이름 입력</label></th>
						<td><input type="text" name="name" id="name" placeholder="이름 입력" required></td>
					</tr>
					<tr>
						<th><label for="phone">* 전화번호</label></th>
						<td><input type="text" name="phone" id="phone" placeholder="전화번호 입력" required></td>
					</tr>
					<tr>
						<th><label for="email">* 이메일</label></th>
						<td><input type="text" name="email" id="email" placeholder="이메일 입력" required></td>
					</tr>
				</tbody>
			</table>
		</fieldset>
		
		<fieldset>
			<legend>추가 정보</legend>
			<table>
				<tbody>
					<tr>
						<th><label for="birth">생년월일</label></th>
						<td><input type="date" name="birth" id="birth"></td>
					</tr>
					<tr>
						<th><label for="age">나이</label></th>
						<td><input type="number" name="age" id="age" min="0" max="150" step="1"></td>
					</tr>
					<tr>
						<th><label for="color">좋아하는 색</label></th>
						<td><input type="color" name="color" id="color"></td>
					</tr>
					<tr>
						<th><label>성별</label></th>
						<td>
							<input type="radio" name="gender" id="gender1" value="1" checked>
							<label for="gender1">남</label>
							<input type="radio" name="gender" id="gender2" value="2">
							<label for="gender2">여</label>
						</td>
					</tr>
					<tr>
						<th><label>청약지역</label></th>
						<td>
							<input type="checkbox" name="area" id="area1" value="1" checked>
							<label for="area1">수도권</label><br>
							<input type="checkbox" name="area" id="area2" value="2">
							<label for="area2">충청</label>
							<input type="checkbox" name="area" id="area3" value="3">
							<label for="area3">호남</label><br>
							<input type="checkbox" name="area" id="area4" value="4">
							<label for="area4">영남</label>
							<input type="checkbox" name="area" id="area5" value="5">
							<label for="area5">기타</label>
						</td>
					</tr>
					<tr>
						<th><label for="purpose">가입 목적</label></th>
						<td>
							<select name="purpose" id="purpose">
								<option value="1" selected>옵션1</option>
								<option value="2">옵션2</option>
								<option value="3">옵션3</option>
								<option value="4">옵션4</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<label for="memo">하고 싶은 말</label><br>
							<textarea name="memo" id="memo" rows="10" cols="80"></textarea>
						</td>
					</tr>
				</tbody>
			</table>
		</fieldset>
		<button type="submit">회원가입</button>&emsp;&emsp;&emsp;
		<button type="reset">삭제</button>
	</form>
</body>
</html>