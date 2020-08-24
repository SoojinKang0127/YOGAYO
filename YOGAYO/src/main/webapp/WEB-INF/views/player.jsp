<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>TaeGyum</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/player.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/player-rSlider.min.css">

<script src="https://kit.fontawesome.com/7bad96e258.js"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script language=JavaScript
	src="${pageContext.request.contextPath}/resources/js/player-rSlider.min.js"></script>

<script>
	$(document).ready(function() {
		window.onload = function() {
			$("#pop1").hide()
			$("#pop2").css("visibility", "hidden")
			$("#pop3").hide()
		}

		var mySlider = new rSlider({
			target : "#slider1",
			values : [ 1, 2, 3, 4, 5 ],
			range : false,
			set : [ 5 ],
			tooltip : false,
		})

		var mySlider2 = new rSlider({
			target : "#slider2",
			values : [ 1, 2, 3, 4, 5 ],
			range : false,
			set : [ 5 ],
			tooltip : false,
		})

		$(".end-btn").click(function() {
			$("#pop1").show()
			$(".play-button").click()
		})

		var num = document.getElementsByClassName("pop3-top-input")
		var display = document.getElementsByClassName("main-bottom-btn2")

		$(display).click(function() {
			$("#pop3").show()
		})

		$(".pop3-bottom").click(function() {
			$("#pop3").hide()
			$(display).text(num[0].value + " kg")
		})

		
		$(".pop2-btn").click(function() {
			
			
			console.log("만족도 => "+ (mySlider.values.end+1));
			console.log("체감 난이도=> " + (mySlider2.values.end+1));
			console.log("내용 => " + $(".main-top-text").val());
			console.log("몸무게 => " + num[0].value);
			
			var method="POST";
			var path="review";
			
			var form = document.createElement("form");
			form.setAttribute("method", method);
			form.setAttribute("action", path);
			document.body.appendChild(form);
			
			
			var keys = ["crsnum", "slevel", "dlevel", "context", "weight"];
			var values = [0, (mySlider.values.end+1), (mySlider2.values.end+1), $(".main-top-text").val(), num[0].value];
			
			
			
			
			for(var i=0; i<5;i++){
				var hiddenField = document.createElement("input");
				hiddenField.setAttribute("type", "hidden");
				hiddenField.setAttribute("name", keys[i]);
				hiddenField.setAttribute("value", values[i]);
				
				form.appendChild(hiddenField);
			}
			
			form.submit();
			
			




		})

	})
</script>
</head>
<body>
	<div class="all-wrapper">
		<header>
			<div class="header-wrapper">
				<div class="logo-wrapper">
					<a href=""> <span>YOGAYO</span>
						<div class="box-div"></div>
					</a>
				</div>
				<div class="nav_bar"></div>
			</div>
		</header>
		<main>
			<div class="main-wrapper">
				<div class="course-main">
					<div class="image-wrapper">
						<div class="image-progress-bar"></div>
						<div class="course-image"></div>
					</div>
					<div class="info-wrapper">
						<div class="course-title"></div>
						<div class="course-info">
							<div class="main-course-title">코스 A: 허리에 좋은 기초 요가 클래스</div>
							<div class="main-course-info">
								<div class="rightwrapper">
									<span>누적 플레이 수</span> <span class="accumulate-number">
										160회</span> <span>•</span> <span class="reg-date"> 2020.08.19</span>
								</div>
								<div class="leftwrapper">
									<span class="like"><i class="far fa-heart"></i></span> <span
										class="like-number">34</span>
								</div>
							</div>
						</div>
						<div class="user-info">
							<div class="user-image"></div>
							<div class="user-detail">
								<div class="user-name">태겸</div>
								<div class="user-introduction">안녕하세요!</div>
							</div>
						</div>
					</div>
				</div>
				<div class="course-list">
					<div class="list-header">
						<div class="list-header-title">COURSE A</div>
						<div class="list-header-count">코스 1/30</div>
					</div>
					<div class="scroll-overflow">
						<ul class="order-ul">
							<li class="order-li">
								<div class="order-progress-bar"></div>
								<div class="order-wrapper">
									<div class="order-number">
										<div>1</div>
									</div>
									<div class="order-image">
										<image src="boat.webp"> </image>
									</div>
									<div class="order-title">
										<div>배 자세</div>
										<div></div>
									</div>
								</div>
							</li>
							<li class="order-li">
								<div class="order-progress-bar"></div>
								<div class="order-wrapper">
									<div class="order-number">
										<div>2</div>
									</div>
									<div class="order-image">
										<image src="chair.webp"> </image>
									</div>
									<div class="order-title">
										<div>의자 자세</div>
										<div>0:30</div>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<div class="list-footer">
						<div class="play-button">
							<i class="fas fa-pause btn"></i>
						</div>
						<div class="end-btn">운동 종료</div>
					</div>
				</div>
			</div>
		</main>
		<script language=JavaScript
			src="${pageContext.request.contextPath}/resources/js/player.js"></script>
	</div>
	<div id="pop1">
		<div class="pop1-txt">
			<div class="pop1-txt1">주의!</div>
			<div class="pop1-txt2">진행 정보가 소멸 될 수도 있습니다.</div>
		</div>
		<div class="pop1-btn">그래도 종료</div>
	</div>
	<div id="pop2">
		<div class="pop2-content">
			<div class="pop2-welcome">운동 완료! 오늘도 해내셨네요!</div>
			<hr class="pop2-welcome-hr" />
			<div class="pop2-stat">
				<div class="stat-1">
					<div class="stat-1-status">
						<input type="text" id="slider1" />
						<div id="stat-1-circle"></div>
					</div>
					<div class="stat-1-txt">만족도</div>
				</div>
				<div class="stat-2">
					<div class="stat-2-status">
						<input type="text" id="slider2" />
					</div>
					<div class="stat-2-txt">체감 난이도</div>
				</div>
			</div>
			<hr class="pop2-stat-hr" />
			<div class="pop2-main">
				<div class="pop2-main-top">
					<div class="main-top-pic"></div>
					<input type="text" class="main-top-text"
						placeholder="오늘의 운동은 어떠셨나요?" />
				</div>
				<div class="pop2-main-bottom">
					<div class="main-bottom-btn1">사진올리기</div>
					<div class="main-bottom-btn2">몸무게</div>
				</div>
			</div>
			<div class="pop2-btn">게시하기</div>
		</div>
	</div>
	<div id="pop3">
		<div class="pop3-top">
			<input type="text" class="pop3-top-input" placeholder="여기에 입력" />
			<div class="pop3-top-txt">kg</div>
		</div>
		<div class="pop3-bottom">입력</div>
	</div>
</body>
</html>
