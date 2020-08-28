<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>course player</title>

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
	$(document).ready(
			function() {
				window.onload = function() {
					$("#pop1").hide()
					$("#pop2").css("visibility", "hidden")
					$("#pop3").hide()
				}

/* 				var mySlider = new rSlider({
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
				}) */
				
				
				
				

				$(".end-btn").click(function() {
					$("#pop1").show()
					$(".play-button").click()
				})

				var num = document.getElementsByClassName("pop3-top-input")
				var display = document
						.getElementsByClassName("main-bottom-btn2")

				$(display).click(function() {
					$("#pop3").show()
				})

				$(".pop3-bottom").click(function() {
					$("#pop3").hide()
					$(display).text(num[0].value + " kg")
				})
				
				
				
				
				

				

				function getParam(sname) {

					var params = location.search.substr(location.search
							.indexOf("?") + 1);

					var sval = "";

					params = params.split("&");

					for (var i = 0; i < params.length; i++) {

						temp = params[i].split("=");

						if ([ temp[0] ] == sname) {
							sval = temp[1];
						}

					}

					return sval;

				}
				
				


			});
</script>
</head>
<body>


	<form action="feed" method="POST" enctype="multipart/form-data" name="feed" id="feed">
		<input type="hidden" name="course" value="" id="course"> 
		<input type="hidden" name="slevel" value="" id="slevel">
		<input type="hidden" name="dlevel" value="" id="dlevel">
		<input type="hidden" name="context" value="" id="context"> 
		<input type="hidden" name="weight" value="" id="weight">



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
						<div class="container">
							<label for="file" class="main-bottom-btn1">사진 업로드</label> <input
								type="file" id="file" name="file"
								onchange="setThumbnail(event);" />
						</div>
						<div class="main-bottom-btn2">몸무게</div>
					</div>
				</div>
				<div class="userImageContainer">
					<div class="userImage img1">
						<div class="btnContainer btn1">
							<i class="fas fa-image" id="icon"></i>
						</div>
					</div>
				</div>
				<script>
				
				var userImages = document.querySelectorAll(".userImage");
				var btns = document.querySelectorAll(".btnContainer");
				
				
				function setThumbnailMulti(event) { 
					
					for (var image of event.target.files) { 
					no =1;
						var reader = new FileReader(); 
						reader.onload = function(event) {
							console.log(no);
							//console.log(className);
							className = "." + userImages[no-1].classList[1];
							console.log(userImages[no-1].classList[1]);
							var img = document.createElement("img"); 
							img.setAttribute("src", event.target.result); 
							document.querySelector(className).appendChild(img);
							no++;
							}; 
							
							console.log(image); 
							reader.readAsDataURL(image);
					};
					};				
					function setThumbnail(event, no) {
						var reader = new FileReader();
						reader.onload = function(event) {
							var img = document.createElement("img");
							img.setAttribute("src", event.target.result);
							document.querySelector(".userImage").appendChild(img);
							document.querySelector("#icon").style.display = "none";
						};
						reader.readAsDataURL(event.target.files[0]);
					}
				</script>
				<div class="pop2-btn" id="submit" onmouseover="submit();">게시하기</div>
			</div>
		</div>
		<div id="pop3">
			<div class="pop3-top">
				<input type="text" class="pop3-top-input" placeholder="여기에 입력" />
				<div class="pop3-top-txt">kg</div>
			</div>
			<div class="pop3-bottom">입력</div>
		</div>
	</form>
	<script type="text/javascript">
	
		var form = document.feed;
		var course = document.getElementById("course");
		var slevel = document.getElementById("slevel");
		var dlevel = document.getElementById("dlevel");
		var context = document.getElementById("context");
		var weight = document.getElementById("weight");
		//var file = document.file;
		var num = document.getElementsByClassName("pop3-top-input")
		
		
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
		
		

		function getParam(sname) {
			var params = location.search.substr(location.search.indexOf("?") + 1);
			var sval = "";
			params = params.split("&");

			for (var i = 0; i < params.length; i++) {
				temp = params[i].split("=");
				if ([ temp[0] ] == sname) {
							sval = temp[1];
				}
			}
					return sval;
		}

	function submit(){
		
		console.log(getParam("course"));
		console.log((mySlider.values.end + 1));
		console.log((mySlider2.values.end + 1));
		console.log($(".main-top-text").val());
		console.log(num[0].value);
		
		
		course.setAttribute("value", getParam("course"));
		
		slevel.setAttribute("value", mySlider.values.end + 1);
		dlevel.setAttribute("value", (mySlider2.values.end + 1));
		context.setAttribute("value", $(".main-top-text").val());
		weight.setAttribute("value", num[0].value);
		
		console.log(course);
		console.log(slevel);
		console.log(dlevel);
		console.log(context);
		console.log(weight);
		console.log(form);
		
		form.submit();
	}
	
	
	</script>
</body>
</html>
