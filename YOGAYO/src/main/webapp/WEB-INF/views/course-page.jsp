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
	<jsp:include page="header/header_white.jsp" />
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
						<li><input type="radio" name="menu" value="date" id="date" />최신순</li>
						<li><input type="radio" name="menu" value="total" id="like" />별점순</li>
						<li><input type="radio" name="menu" value="totalComment" id="comment"/>리뷰 많은 순
						</li>
					</ul>
					
				</div>
			</div>
		</div>
		<!-- <form id="searchTxtForm">  -->
			<div class="course-courses_container">
				<div class="courses_first_line">
					<c:forEach var="i" items="${courses}" varStatus="status" >
						<div class="up-on-scroll">
							<div class="course_container">
								<a
									href="${pageContext.request.contextPath}/course-detail?crsNum=${i.crsNum}">
									<div class="img_wrapper">
									<img
									src="${pageContext.request.contextPath}/${i.imgPath}"
									alt="course" />
									</div>
									<div class="course_star_rating">
										<i class="fas fa-star"></i>${i.total}(${i.totalComment})
										<div class="course_title">${i.title}</div>
									</div>
								</a>
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="more_course_btn">
					<button id="more_course_btn">더보기(More)</button>
				</div>
			</div>
		<!-- </form>  -->


		<jsp:include page="footer/footer_grey.jsp" />
	</main>
</body>
</html>
