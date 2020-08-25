<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>YOGAYO | 회원가입</title>
<script src="https://kit.fontawesome.com/ae58912594.js"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/sign-up.css">
</head>
<body>
	<main>
		<section id="step_1">
			<header>
				<a href="/"><div class="logo-wrapper">
						<span>YOGAYO</span>
						<div class="box-div"></div>
					</div> </a>
			</header>
			<span class="welcome">좋아요! 이제 간단한 두 단계만 거치면 YOGAYO와 함께 하실 수
				있습니다.</span> <span class="step_1">1. 회원가입을 위한 정보를 입력해주세요.</span>
			<div class="sign-up-form">
				<form action="sign-up" method="POST">
					<input type="hidden" name="interest_1" id="interest_1"
						value="false"> <input type="hidden" name="interest_2"
						id="interest_2" value="false"> <input type="hidden"
						name="interest_3" id="interest_3" value="false"> <input
						type="hidden" name="interest_4" id="interest_4" value="false">
					<input type="hidden" name="interest_5" id="interest_5"
						value="false"> <input type="hidden" name="interest_6"
						id="interest_6" value="false"> <input type="hidden"
						name="interest_7" id="interest_7" value="false"> <input
						type="hidden" name="interest_8" id="interest_8" value="false">
					<input type="hidden" name="interest_9" id="interest_9"
						value="false"> <input type="hidden" name="interest_10"
						id="interest_10" value="false"> <input type="hidden"
						name="interest_11" id="interest_11" value="false"> <input
						type="hidden" name="interest_12" id="interest_12" value="false">
					<input type="hidden" name="interest_13" id="interest_13"
						value="false"> <input type="hidden" name="interest_14"
						id="interest_14" value="false"> <input type="hidden"
						name="interest_15" id="interest_15" value="false"> <input
						type="hidden" name="interest_16" id="interest_16" value="false">
					<input type="hidden" name="interest_17" id="interest_17"
						value="false"> <input type="hidden" name="interest_18"
						id="interest_18" value="false"> <input type="hidden"
						name="interest_19" id="interest_19" value="false"> <input
						type="hidden" name="interest_20" id="interest_20" value="false">
					<input type="hidden" name="interest_21" id="interest_21"
						value="false"> <input type="hidden" name="interest_22"
						id="interest_22" value="false"> <input type="hidden"
						name="interest_23" id="interest_23" value="false"> 
						
						
						
						<label for="">이메일</label>
						<input type="text" name="id" id="email" placeholder="johndoe@example.com" /> <br /> 
						
						<label for="">이름</label>
						<input type="text" name="name" id="name" placeholder="3자 이상" /><br /> 
						
						<label for="">생년월일</label> <input type="date" name="bDate" id="birthDay" placeholder="" /><br /> <label for="">성별</label>
						<select name="gender" id="gender">
						<option value="M">남성</option>
						<option value="F">여성</option>
					</select> <br /> 
					<label for="">비밀번호</label><input type="password" name="pwd" id="pwd1" placeholder="7자 이상" /><br /> 
					<label for="">비밀번호 확인</label><input type="password" name="password2" id="pwd2" placeholder="7자 이상" />
					<div class="alert-pwd alert"></div>
					<br />
			</div>
			<div class="down-btn" onclick="goToStep2()">
				<i class="fas fa-arrow-down"></i>
			</div>
		</section>
		<section id="step_2">
			<div class="up-btn" onclick="goToStep1()">
				<i class="fas fa-arrow-up"></i>
			</div>
			<span class="step_1">2. 우리에게 당신의 관심사를 모두 알려주세요.</span> <span
				class="step_1">YOGAYO만의 맞춤 코스를 추천해드리겠습니다.</span>
			<div class="interests">
				<span class="interest_1 interest">저강도의</span> <span
					class="interest_2 interest">체력 단련</span> <span
					class="interest_3 interest">영적인 경험</span> <span
					class="interest_4 interest">체중 감량</span> <span
					class="interest_5 interest">균형</span> <span
					class="interest_6 interest">유연성</span> <span
					class="interest_7 interest">임신중에 할 수 있는</span> <span
					class="interest_8 interest">근력 개선</span> <span
					class="interest_9 interest">스트레스 감소</span> <span
					class="interest_10 interest">기분 및 행동 개선</span> <span
					class="interest_11 interest">만성 요통</span> <span
					class="interest_12 interest">우울증</span> <span
					class="interest_13 interest">아이를 위한</span> <span
					class="interest_14 interest">정신건강</span> <span
					class="interest_15 interest">내적 평화</span> <span
					class="interest_16 interest">명상 훈련</span> <span
					class="interest_17 interest">고강도의</span> <span
					class="interest_18 interest">현대 요가</span> <span
					class="interest_19 interest">호흡법</span> <span
					class="interest_20 interest">관절염</span> <span
					class="interest_21 interest">불면증</span> <span
					class="interest_22 interest">친구와 같이 하는</span> <span
					class="interest_23 interest" onclick="alert()">천식</span>
			</div>


			<div id="signUpBtn">
				<input type="submit" value="가입하기" disabled="disabled" id="submitBtn"
					class="submitBtn">
			</div>
			</form>

		</section>
	</main>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/sign_up_vaild_check.js"></script>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/sign_up_interests.js"></script>
	<script>
		var signUpBtn = document.getElementById("signUpBtn");
		var submitBtn = document.getElementById("submitBtn");
		var emailCheck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

		function emailVaildCheck() {
			if (emailCheck.test($("#email").val()))
				return true;
			else
				return false;
		}

		function nameVaildCheck() {
			if ($("#name").val().length != 0 && $("#name").val().length > 1)
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

		function goToStep2() {

			if (emailVaildCheck() && nameVaildCheck() && birthdayVaildCheck()
					&& password1VaildCheck() && password2VaildCheck()) {
				$('.down-btn i').css({
					color : "green",
					"border" : "1px solid green"
				});
				window.scrollTo({
					top : 1080,
					behavior : "smooth"
				});
			} else {
				$('.down-btn i').css({
					color : "red",
					"border" : "1px solid red"
				});
			}

		}

		function goToStep1() {
			window.scrollTo({
				top : 0,
				behavior : "smooth"
			});
		}

		function infoAllVaildCheck() {
			if (emailVaildCheck() && nameVaildCheck() && birthdayVaildCheck()
					&& password1VaildCheck() && password2VaildCheck()) {
				return true;
			} else {
				return false;
			}

		}

		document.addEventListener("mouseover", function() {
			console.log(infoAllVaildCheck())
			if (infoAllVaildCheck()) {
				submitBtn.removeAttribute("disabled");
				submitBtn.classList.remove("invaild");
				submitBtn.classList.add("vaild");
			} else {
				submitBtn.classList.remove("vaild");
				submitBtn.setAttribute("disabled", "disabled");
			}
		})
	</script>
	<script type="text/javascript">
		var idList = new Array();

		//idList = "${idList}";

		<c:forEach items="${idList}" var="id">
		idList.push("${id}");
		</c:forEach>

		
		
		//idList에 담아옴
		alert(idList[0])
		
		
		;
	</script>
</body>
</html>
