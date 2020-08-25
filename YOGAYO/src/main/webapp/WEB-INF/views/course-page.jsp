<%@page import="com.team4.vo.CourseVo"%>
<%@page import="com.team4.dao.course.CourseServiceImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>YOGAYO | COURSE</title>
<script src="https://kit.fontawesome.com/54919de5bd.js"
	crossorigin="anonymous"></script>
<script src="http://code.jquery.com/jquery.js"></script>
<script language=JavaScript
	src="${pageContext.request.contextPath}/resources/js/course-page.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/course-page.css">
</head>
<body>
	<header class="header">
		<div class="status_bar">
			<div class="logo_wrapper">
				<a href="${pageContext.request.contextPath}/main"><img
					src="${pageContext.request.contextPath}/resources/image/course/logo.jpg"
					alt="logo" /> </a>
				<div class="box-div"></div>
			</div>
			<div class="profile">
				<a href="${pageContext.request.contextPath}/my-page"><img
					src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
					class="profile_img" /></a>
			</div>
		</div>
	</header>
	<main>
		<div class="course-first_container">
			<div class="course_bg">
				<div class="course-bg_title_section">
					<div class="course-bg_title">새로 올라온 코스</div>
					<div class="course-bg_explain">
						<p>세계 각지 사람들의 다양한 코스들을 경험 해보세요. 저희 요가요에서 제공하는 코스들도 놓치지 마세요.</p>
					</div>
				</div>
			</div>
		</div>
		<div class="course-categories_container">
			<div class="course-categories_left">
				<button id="course-view_all">
					<span class="course-categories">전체보기</span>
				</button>
				<button id="course-view_yogayo_course">
					<span class="course-categories">전문 코스</span>
				</button>
				<button id="course-view_user_course">
					<span class="course-categories">사용자가 만든 코스</span>
				</button>
			</div>
			<div class="course-categories_right">
				<button id="courses_sort">정렬 ▼</button>
				<div class="sort_menu">
					<ul>
						<li><input type="radio" name="menu" value="like" />추천순</li>
						<li><input type="radio" name="menu" value="date" />날짜순</li>
						<li><input type="radio" name="menu" value="user" />사용자 많은 순
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="course-courses_container">
			<div class="courses_first_line">
				<c:forEach var="i" items="${list}" begin="1" end="13" varStatus="courses">
					<div class="up-on-scroll">
						<div class="course_container">
							<a
								href="${pageContext.request.contextPath}/course-detail?crsNum=${i}">
								<img
								src="${pageContext.request.contextPath}/resources/image/course/course.jpg"
								alt="couser" />
								<div class="course_star_rating">
									<i class="far fa-star">4.83(6)</i>
									<div class="course_title">${courses.get(i).title}</div>
								</div>
							</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

		<footer class="footer">
			<div class="main-footer_right">
				<i class="far fa-copyright"></i> 2020 Team4,Inc.All rights reserved
				<span>·</span> <span>개인정보 처리방침</span> <span>·</span> <span>이용약관</span>
				<span>·</span> <span>사이트 맵</span>
			</div>
			<div class="main-footer_left">
				<ul class="main-footer_sns_list">
					<li><i class="fab fa-facebook-f"></i></li>
					<li><i class="fab fa-twitter"></i></li>
					<li><i class="fab fa-instagram"></i></li>
				</ul>
			</div>
		</footer>
	</main>
</body>
</html>
