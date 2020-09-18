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
<link rel="stylesheet" type="text/css"   href="${pageContext.request.contextPath}/resources/css/sign-up.css" media="all and (min-width:600px) and (max-width:2000px)">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/sign-up-mobile.css" media="all and (min-width:400px) and (max-width:599px)">
</head>


<body>
<script>
<%Object[] keyword = (Object[]) request.getAttribute("keyword");
			Integer length = (Integer) request.getAttribute("length");%>
	var numArr=new Array();
$(document).ready(function(){
		<%for (int i = 0; i < length; i++) {%>
		numArr.push("<%=keyword[i]%>")
<%}%>
	let randomNums = [];
				while (numArr.length > 0) { // 추출을 원하는 갯수
					let target = numArr.splice(Math.floor(Math.random()* numArr.length), 1)[0];
					randomNums.push(target);
				}
	for(var i=0; i<23;i++){			
	$(".interests").append('<span class="interest">'+randomNums[i]+'</span>')		
	}
			})
</script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/sign_up_interests.js"></script>
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
					<input type="hidden" name="keyword" id="keyword" value="false">
				
						
						
						
						<label for="">이메일</label>
						<input type="text" name="id" id="email" placeholder="johndoe@example.com" /> <br /> 
						<div class="msgContainer"><label for=""></label><span class="emailVaildMsg" >이미 사용중이거나 올바르지 않은 이메일입니다.</span><br /></div>
						<label for="">이름</label>
						<input type="text" name="name" id="name" placeholder="3자 이상" /><br /> 
						
						<label for="">생년월일</label> <input type="date" name="bDate" id="birthDay" placeholder="" /><br /> <label for="">성별</label>
						<select name="gender" id="gender">
						<option value="M">남성</option>
						<option value="F">여성</option>
					</select> <br /> 
					<label for="">숙련도</label> 
				 <select name="profiLevel" id="profiLevel">
					<option value="5">상</option>
					<option value="3" selected>중</option>
					<option value="1">하</option>
				</select> <br /> <label for="">비밀번호</label><input type="password" name="pwd"
					id="pwd1" placeholder="7자 이상" /><br /> <label for="">비밀번호
					확인</label><input type="password" name="password2" id="pwd2"
					placeholder="7자 이상" />
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
		
			
		</div>


		<div id="signUpBtn">
			<input type="submit" value="가입하기" disabled="disabled" id="submitBtn" onclick="alert('회원가입되었습니다.')" 
				class="submitBtn">
		</div>
		</form>

	</section>
	</main>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/sign_up_vaild_check.js"></script>
	<script>
		function goToStep2() {
			
			console.log(emailDuplCheck())
			console.log(nameVaildCheck())
			console.log(birthdayVaildCheck())
			console.log(password1VaildCheck())
			console.log(password2VaildCheck())
			
			
			if (emailDuplCheck() && nameVaildCheck() && birthdayVaildCheck()
					&& password1VaildCheck() && password2VaildCheck()) {
				$('.down-btn i').css({
					color : "green",
					"border" : "1px solid green"
				});
				window.scrollTo({
					top : 1080,
					behavior : "smooth"
				});
				$("#profiLevel").css({
					color : "green",
					"border-bottom" : "2px solid green",
				});
			} else {
				$('.down-btn i').css({
					color : "red",
					"border" : "1px solid red"
				});
				$("#profiLevel").css({
					color : "green",
					"border-bottom" : "2px solid green",
				});
			}
		}

		function goToStep1() {
			window.scrollTo({
				top : 0,
				behavior : "smooth"
			});
		}
	</script>
</body>
</html>
