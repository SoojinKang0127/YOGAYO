<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_home.css">
<script src="https://kit.fontawesome.com/54919de5bd.js"
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
<title>ADMIN DASHBOARD</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="top_title">
			<div class="member_title">
				<span class="underline">YOGAYO 일간 현황</span>
			</div>
			<div class="date_wrapper">
				<i class="fas fa-chevron-left"></i><span class="date">2020.09.17</span>
				<i class="fas fa-chevron-right"></i>
			</div>
		</div>
		<div class="dash_board_wrapper">
			<div class="dash_top_stat">
				<ul>
					<li class="course_view_container">
						<div class="header">오늘 코스 조회수</div>
						<div class="course_view value">14</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">2020.09.17. 15:09</div>
							<span>기준</span>
						</div>
					</li>
					<li class="course_new_container">
						<div class="header">오늘 작성 코스</div>
						<div class="course_new value">5</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">2020.09.17. 15:09</div>
							<span>기준</span>
						</div>
					</li>
					<li class="feed_new_container">
						<div class="header">오늘 작성 피드</div>
						<div class="feed_new value">14</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">2020.09.17. 15:09</div>
							<span>기준</span>
						</div>
					</li>
					<li class="member_new_container">
						<div class="header">오늘 가입 회원</div>
						<div class="member_new value">14</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">2020.09.17. 15:09</div>
							<span>기준</span>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="chart_section">
			<div class="charts_wrapper">
				<div class="first_chart chart">
					<canvas id="first_chart_"></canvas>
				</div>
				<div class="second_chart chart">
					<canvas id="second_chart_"></canvas>
				</div>
				<div class="third_chart chart">
					<canvas id="third_chart_"></canvas>
				</div>
				<div class="fourth_chart chart">
					<canvas id="fourth_chart_"></canvas>
				</div>
			</div>
		</div>
	</main>
	<script type="text/javascript">
		var firstContainer = document.querySelector(".course_view_container");
		var secondContainer = document.querySelector(".course_new_container");
		var thirdContainer = document.querySelector(".feed_new_container");
		var fourthContainer = document.querySelector(".member_new_container");
		var charts = document.querySelector(".charts_wrapper");

		firstContainer.addEventListener("click", function() {
			charts.style.left = 0 + 'px';
			this.style.backgroundColor = '#febe2e';
			secondContainer.style.backgroundColor = 'white';
			thirdContainer.style.backgroundColor = 'white';
			fourthContainer.style.backgroundColor = 'white';

		});
		secondContainer.addEventListener("click", function() {
			charts.style.left = -800 + 'px';

			firstContainer.style.backgroundColor = 'white';
			this.style.backgroundColor = '#febe2e';
			thirdContainer.style.backgroundColor = 'white';
			fourthContainer.style.backgroundColor = 'white';

		});
		thirdContainer.addEventListener("click", function() {
			charts.style.left = -1600 + 'px';

			firstContainer.style.backgroundColor = 'white';
			secondContainer.style.backgroundColor = 'white';
			this.style.backgroundColor = '#febe2e';
			fourthContainer.style.backgroundColor = 'white';
		});
		fourthContainer.addEventListener("click", function() {
			charts.style.left = -2400 + 'px';
			firstContainer.style.backgroundColor = 'white';
			secondContainer.style.backgroundColor = 'white';
			thirdContainer.style.backgroundColor = 'white';
			this.style.backgroundColor = '#febe2e';
		});
	</script>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/admin/chart_home.js"></script>
</body>
</html>