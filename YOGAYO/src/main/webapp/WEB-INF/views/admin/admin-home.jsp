<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<script type="text/javascript">
	var newMemberToday = ${newMember.today};
	var newMemberDay1ago = ${newMember.day1ago};
	var newMemberDay2ago = ${newMember.day2ago};
	var newMemberDay3ago = ${newMember.day3ago};
	var newMemberDay4ago = ${newMember.day4ago};
	var newMemberDay5ago = ${newMember.day5ago};
	var newMemberDay6ago = ${newMember.day6ago};
	var newMemberDay7ago = ${newMember.day7ago};
	
	var newFeedToday = ${newFeed.today};
	var newFeedDay1ago = ${newFeed.day1ago};
	var newFeedDay2ago = ${newFeed.day2ago};
	var newFeedDay3ago = ${newFeed.day3ago};
	var newFeedDay4ago = ${newFeed.day4ago};
	var newFeedDay5ago = ${newFeed.day5ago};
	var newFeedDay6ago = ${newFeed.day6ago};
	var newFeedDay7ago = ${newFeed.day7ago};
	
	var newCourseToday = ${newCourse.today};
	var newCourseDay1ago = ${newCourse.day1ago};
	var newCourseDay2ago = ${newCourse.day2ago};
	var newCourseDay3ago = ${newCourse.day3ago};
	var newCourseDay4ago = ${newCourse.day4ago};
	var newCourseDay5ago = ${newCourse.day5ago};
	var newCourseDay6ago = ${newCourse.day6ago};
	var newCourseDay7ago = ${newCourse.day7ago};
	
	var newCommentToday = ${newComment.today};
	var newCommentDay1ago = ${newComment.day1ago};
	var newCommentDay2ago = ${newComment.day2ago};
	var newCommentDay3ago = ${newComment.day3ago};
	var newCommentDay4ago = ${newComment.day4ago};
	var newCommentDay5ago = ${newComment.day5ago};
	var newCommentDay6ago = ${newComment.day6ago};
	var newCommentDay7ago = ${newComment.day7ago};
	

</script>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="top_title">
			<div class="member_title">
				<span class="underline">YOGAYO 일간 현황</span>
			</div>
			<div class="date_wrapper">
			<jsp:useBean id="now" class="java.util.Date" />
			<jsp:useBean id="nowtime" class="java.util.Date" />
			<fmt:formatDate var="now" value="${now}" pattern="yyyy-MM-dd" />
			<fmt:formatDate var="nowtime" value="${nowtime}" pattern="yyyy-MM-dd hh:mm" dateStyle="medium" timeStyle="medium" />
				<span class="date">${now }</span>
			</div>
		</div>
		<div class="dash_board_wrapper">
			<div class="dash_top_stat">
				<ul>
					<li class="course_view_container">
						<div class="header">오늘 가입 회원</div>
						<div class="course_view value">${newMember.today}</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">${nowtime }</div>
							<span>기준</span>
						</div>
					</li>
					<li class="course_new_container">
						<div class="header">오늘 작성 코스</div>
						<div class="course_new value">${newCourse.today}</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">${nowtime }</div>
							<span>기준</span>
						</div>
					</li>
					<li class="feed_new_container">
						<div class="header">오늘 작성 피드</div>
						<div class="feed_new value">${newFeed.today}</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">${nowtime }</div>
							<span>기준</span>
						</div>
					</li>
					<li class="member_new_container">
						<div class="header">오늘 작성 댓글</div>
						<div class="member_new value">${newComment.today}</div>
						<div class="now">
							<div class="live">실시간</div>
							<div class="real_time">${nowtime }</div>
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