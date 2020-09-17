<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>YOGAYO 회원가입</title>
	<script src="https://kit.fontawesome.com/ae58912594.js" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/update.css">
</head>

<body>
	<jsp:include page="header/header_black.jsp" />
	<main>
		<section id="step_1">
			<span class="welcome">회원정보 수정</span> <span class="step_1">정보를 수정해주세요</span>
			<div class="sign-up-form">
				<form action="update" method="POST">

					<label for="">이메일</label>
					<input type="text" name="userId" id="email" value="${user.id}" readonly /> <br />
					<label for="">이름</label>
					<input type="text" name="userName" id="name" placeholder="${user.name }"
						value="${user.name }" /><br />
					<label for="">생년월일</label>
					<input type="date" value="${user.bDate }" name="userBirthDay" id="birthDay" placeholder="" /><br />
					<label for="">성별</label>
					<select name="gender" id="gender">
						<option value="M" id="male">남성</option>
						<option value="F" id="female">여성</option>
					</select> <br />
					<label for="">비밀번호</label><input type="password" name="password1" id="pwd1"
						placeholder="6자 이상" /><br />
					<label for="">비밀번호 확인</label><input type="password" name="password2" id="pwd2"
						placeholder="6자 이상" />
					<div class="alert-pwd alert"></div>
					<br />
			</div>
			<input type="submit" value="수정하기">
		</section>
	</main>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/update_valid_check.js"></script>
	<script type="text/javascript">

		var gender = "${user.gender}"

		var male = document.getElementById("male");
		var female = document.getElementById("female");


		if (gender === 'F') {
			female.setAttribute("selected", "selected")
		}

	</script>
	<script>


		function nameVaildCheck() {
			if ($("#name").val().length != 0 && $("#name").val().length > 2)
				return true;
			else
				return false;
		}
		function birthdayVaildCheck() {
			if ($("#birthDay").val().length != 0)
				return true;

			else
				return false;
		}
		function password1VaildCheck() {
			if ($("#pwd1").val().length > 6)
				return true;
			else
				return false;
		}
		function password2VaildCheck() {
			if (password1VaildCheck() && $("#pwd2").val() === $("#pwd1").val())
				return true;
			else
				return false;
		}

	</script>
</body>

</html>