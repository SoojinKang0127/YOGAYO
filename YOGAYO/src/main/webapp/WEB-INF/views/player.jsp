<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>course player</title>

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/player.css"  media="all and (min-width:740px) and (max-width:2000px)">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/player_vertical_mobile.css" media="all and (min-width:300px) and (max-width:599px)">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/player_mobile_horizontal.css" media="all and (min-width:600px) and (max-width:739px)">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/player-rSlider.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/player-rSlider.min_mobile-horizontal.css" media="all and (min-width:600px) and (max-width:739px)">

	<script src="https://kit.fontawesome.com/7bad96e258.js" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.ajax-cross-origin.min.js"></script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/player-rSlider.min.js"></script>

	<script>
		var uNum = encodeURIComponent("${uvo.uNum}");
		var crsNum = encodeURIComponent("${crsNum}");
		timeArr = new Array();
		timeArr.push('${pose1.time}' * 100);
		timeArr.push('${pose2.time}' * 100);
		timeArr.push('${pose3.time}' * 100);
		timeArr.push('${pose4.time}' * 100);
		timeArr.push('${pose5.time}' * 100);
		timeArr.push('${pose6.time}' * 100);
		timeArr.push('${pose7.time}' * 100);
		timeArr.push('${pose8.time}' * 100);

		audioArr = new Array();
		audioArr.push('${pageContext.request.contextPath}/${pose1.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose2.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose3.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose4.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose5.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose6.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose7.audioPath}')
		audioArr.push('${pageContext.request.contextPath}/${pose8.audioPath}')
		console.log(audioArr)

		poseArr=new Array();
		poseArr.push('${pose1.img_Path}')
		poseArr.push('${pose2.img_Path}')
		poseArr.push('${pose3.img_Path}')
		poseArr.push('${pose4.img_Path}')
		poseArr.push('${pose5.img_Path}')
		poseArr.push('${pose6.img_Path}')
		poseArr.push('${pose7.img_Path}')
		poseArr.push('${pose8.img_Path}')

		pnumArr=new Array();
		pnumArr.push(${pose1.pNum})
		pnumArr.push(${pose2.pNum})
		pnumArr.push(${pose3.pNum})
		pnumArr.push(${pose4.pNum})
		pnumArr.push(${pose5.pNum})
		pnumArr.push(${pose6.pNum})
		pnumArr.push(${pose7.pNum})
		pnumArr.push(${pose8.pNum})

		
		$(document).ready(function () {
			window.onload = function () {
				$("#pop1").hide()
				$("#pop2").css("visibility", "hidden")
				$("#pop3").hide()
			}

			$(".end-btn").click(function () {
				$("#pop1").show()
				$(".play-button").click()
			})

			var num = document.getElementsByClassName("pop3-top-input")
			var display = document
				.getElementsByClassName("main-bottom-btn2")

			$(display).click(function () {
				$("#pop3").show()
			})

			$(".pop3-bottom").click(function () {
				$("#pop3").hide()
				$(display).text(num[0].value + " kg")
			})

			$('.user-image').css({'background-image': 'url("${pageContext.request.contextPath}/${author.img}")'});
			$('body').append('<audio id="audio" src=' + audioArr[0] + ' allow="autoplay"></audio>')
			audio = document.getElementById('audio').play();
		});
	</script>
</head>

<body>

	<form action="feedupload" method="POST" enctype="multipart/form-data"
		name="feed" id="feed">
		<input type="hidden" name="course" value="" id="course"> <input
			type="hidden" name="slevel" value="" id="slevel"> <input
			type="hidden" name="dlevel" value="" id="dlevel"> <input
			type="hidden" name="context" value="" id="context"> <input
			type="hidden" name="weight" value="" id="weight">

		<div class="all-wrapper">
			<header class="header">
				<div class="header-wrapper">
					<div class="logo-wrapper">
						<a href="${pageContext.request.contextPath}/main"> <span>YOGAYO</span>
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
							<div class="course-image"><div class="gumandimage_wrapper"><div class="cam"><video id="gum" height="100%" width="150%"></video></div><div class="pose_big_img_wrapper"><img id="pose_big_img"></div></div></div>
						</div>
						<div class="info-wrapper">
							<div class="course-title">${course.title}</div>
							<div class="course-info">
								<div class="main-course-title"></div>
								<div class="main-course-info">
									<div class="rightwrapper">
										<span>누적 플레이 수</span> <span class="accumulate-number">
											${playTotal}회</span> <span>•</span> <span class="reg-date"> <fmt:formatDate
												value="${regDate}" pattern="yyyy.MM.dd" /></span>
									</div>
									<div class="leftwrapper">
										<span class="like"><i class="${like}"></i></span> <span
											class="like-number">${likeCount}</span>
									</div>
								</div>
							</div>
							<div class="user-info">
								<div class="user-image"></div>
								<div class="user-detail">
									<div class="user-name">${author.name}</div>
									<div class="user-introduction">안녕하세요!</div>
								</div>
							</div>
						</div>
					</div>
					<div class="course-list">
						<div class="list-header">
							<div class="list-header-title">${course.title}</div>
							<div class="list-header-count">코스 1/8</div>
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
											<image src="${pose1.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose1.title}</div>
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
											<image src="${pose2.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose2.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>3</div>
										</div>
										<div class="order-image">
											<image src="${pose3.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose3.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>4</div>
										</div>
										<div class="order-image">
											<image src="${pose4.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose4.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>5</div>
										</div>
										<div class="order-image">
											<image src="${pose5.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose5.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>6</div>
										</div>
										<div class="order-image">
											<image src="${pose6.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose6.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>7</div>
										</div>
										<div class="order-image">
											<image src="${pose7.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose7.title}</div>
											<div></div>
										</div>
									</div>
								</li>
								<li class="order-li">
									<div class="order-progress-bar"></div>
									<div class="order-wrapper">
										<div class="order-number">
											<div>8</div>
										</div>
										<div class="order-image">
											<image src="${pose8.img_Path}"> </image>
										</div>
										<div class="order-title">
											<div>${pose8.title}</div>
											<div></div>
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
				<div class="pop2-btn" id="submit" onclick="submit();">게시하기</div>
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
	<script>
		var userImages = document.querySelectorAll(".userImage");
		var btns = document.querySelectorAll(".btnContainer");
		

		function setThumbnailMulti(event) {

			for (var image of event.target.files) {
				no = 1;
				var reader = new FileReader();
				reader.onload = function (event) {
					console.log(no);
					//console.log(className);
					className = "." + userImages[no - 1].classList[1];
					console.log(userImages[no - 1].classList[1]);
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
			reader.onload = function (event) {
				var img = document.createElement("img");
				img.setAttribute("src", event.target.result);
				document.querySelector(".userImage").appendChild(img);
				document.querySelector("#icon").style.display = "none";
			};
			reader.readAsDataURL(event.target.files[0]);
		}
	</script>
	<script type="text/javascript">
	
		for (var i = 0; i < timeArr.length; i++) {
			minute = parseInt(timeArr[i] / 6000)
			second = parseInt((timeArr[i] % 6000) / 100)
			if (second < 10)
				second = "0" + second
			var timer = document.querySelector(
				"div.scroll-overflow > ul > li:nth-child(" +
				(i + 1) +
				") > div.order-wrapper > div.order-title > div:nth-child(2)"
			)
			console.log(timer)
			timer.innerText = minute + ":" + second
		}

		var form = document.feed;
		var course = document.getElementById("course");
		var slevel = document.getElementById("slevel");
		var dlevel = document.getElementById("dlevel");
		var context = document.getElementById("context");
		var weight = document.getElementById("weight");
		var num = document.getElementsByClassName("pop3-top-input")


		var mySlider = new rSlider({
			target: "#slider1",
			values: [1, 2, 3, 4, 5],
			range: false,
			set: [5],
			tooltip: false,
		})

		var mySlider2 = new rSlider({
			target: "#slider2",
			values: [1, 2, 3, 4, 5],
			range: false,
			set: [5],
			tooltip: false,
		})



		function getParam(sname) {
			var params = location.search.substr(location.search.indexOf("?") + 1);
			var sval = "";
			params = params.split("&");

			for (var i = 0; i < params.length; i++) {
				temp = params[i].split("=");
				if ([temp[0]] == sname) {
					sval = temp[1];
				}
			}
			return sval;
		}

		function submit() {


			alert("후기를 등록하였습니다.")
			course.setAttribute("value", getParam("course"));
			slevel.setAttribute("value", mySlider.values.end + 1);
			dlevel.setAttribute("value", (mySlider2.values.end + 1));
			context.setAttribute("value", $(".main-top-text").val());
			weight.setAttribute("value", num[0].value);

			form.submit();
		}
	
	</script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/adapter-latest.js"></script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/ga.js"></script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/capture.js"></script>
	<!-- <iframe src = "http://52.78.54.179:5000/index; " allow = "camera https://localhost:8080;"></iframe> -->
	<!-- <iframe src = "http://52.78.54.179:5000/index;" allow = "camera *;"></iframe> -->
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/player.js"></script>
</body>

</html>