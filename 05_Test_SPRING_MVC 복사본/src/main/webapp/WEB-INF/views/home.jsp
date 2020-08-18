
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>YOGAYO</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
	<main>
		<div class="content">
			<header>
				<div class="logo-wrapper">
					<span>YOGAYO</span>
					<div class="box-div"></div>
				</div>
			</header>
			<div class="login-form-wrapper" id="login-wrapper">
				<div class="login-form">
					<span>로그인</span>
					<div class="form-row">
						<form action="" method="post">
							<input type="text" name="userId"
								placeholder="이메일 (example@gmail.com)" /><br />
							<input type="password" name="password" placeholder="비밀번호" /><br />
							<input type="submit" value="로그인" />
						</form>
					</div>
					<div class="withgoogle">
						<div></div>
						<div></div>
						<div></div>
					</div>
					<a href="sign-up">
					<div class="sign-up-btn">회원가입</div>
					</a>
				</div>
			</div>

			<span class="text" id="text">요가를 할 때 몸과 마음에서는 어떤 일이
				일어날까요?</span>
			<div class="start-btn" id="start-btn" onclick="startBtn();">
				시작하기</div>
		</div>
		<div class="background-cover"></div>
		<div class="background"></div>
	</main>
	<script>
		var text = document.getElementById("text");
		var start_btn = document.getElementById("start-btn");
		var login_form = document.getElementById("login-wrapper");

		function startBtn() {
			text.setAttribute("class", "hiding");
			start_btn.setAttribute("class", "hiding");
			login_form.setAttribute("class", "showing");
		}
	</script>
</body>
</html>