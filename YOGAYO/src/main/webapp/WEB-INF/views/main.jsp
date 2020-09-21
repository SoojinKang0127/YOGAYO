<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>YOGAYO</title>
<script src="https://kit.fontawesome.com/54919de5bd.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700&display=swap"
	rel="stylesheet">

</head>

<body>
	<jsp:include page="header/header_white.jsp" />
	<main>
		<div class="main-first_container">
			<div class="main-first_bg">
				<div class="main-first_title_section">
					<div class="main-title">
						<p>가까운 곳에서 즐기는 색다른 요가</p>
					</div>
					<div class="main-sub_title">
						<p>
							그동안 몰랐던 요가의<br /> 아름다움을 발견해보세요.
						</p>
					</div>
					<div class="main-btn">
						<button id="main-start_btn">시작하기</button>
					</div>
				</div>
			</div>
		</div>
		<div class="main-second_container">
			<div class="up-on-scroll">
				<div class="main-second_bg">
					<div class="main-recommand">
						<a
							href="${pageContext.request.contextPath}/course-detail?crsNum=1">
							<img
							src="${pageContext.request.contextPath}/resources/image/course/course.jpg" />
							<div class="main-first_course">
								<div class="main-course_title">${allCourses.get(0).title}
								</div>
								<div class="main-first_course_explain">
									${allCourses.get(0).dscrt}</div>
							</div>
						</a>
					</div>
					<div class="main-recommand">
						<a href="${pageContext.request.contextPath}/course-detail"> <img
							src="${pageContext.request.contextPath}/resources/image/course/course.jpg" />
							<div class="main-second_course">
								<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
								<div class="main-second_course_explain">예전 같지 않은 허리 이대로
									괜찮으신가요?</div>
							</div>
						</a>
					</div>
					<div class="main-recommand">
						<img
							src="${pageContext.request.contextPath}/resources/image/course/course.jpg" />
						<div class="main-third_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-third_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
				</div>
			</div>
			<div class="up-on-scroll">
				<div class="main-second_bg">
					<div class="main-recommand">
						<img
							src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-first_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-first_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
					<div class="main-recommand">
						<img
							src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-second_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-second_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
					<div class="main-recommand">
						<img
							src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-third_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-third_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="up-on-scroll">
			<div class="main-third_container">
				<div class="up-on-scroll">
					<div class="main-third_bg">
						<div class="main-latest_title_section">
							<div class="main-latest_courses_title">새로 올라운 코스</div>
							<div class="main-latest_courses_explain">
								<p>세계 각지 사람들의 다양한 코스들을 경험해보세요. 저희 요가요에서 제공하는 코스들도 놓치지 마세요.</p>
							</div>
						</div>
						<div class="main-to_course_btn_section">
							<a href="${pageContext.request.contextPath}/course-page">
								<button id="main-to_course_btn">모두 둘러보기</button>
							</a>
						</div>
					</div>
				</div>
				<div class="main-latest_sections">
					<a
						href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(0).crsNum}">
						<div class="up-on-scroll">
							<div class="main-latest_section">
								<div class="img_wrapper">
									<img
										src="${pageContext.request.contextPath}/${allCourses.get(0).imgPath}" />
								</div>
								<div class="main-first_course">
									<div class="main-first_course_title">
										${allCourses.get(0).title}</div>
								</div>
							</div>
						</div>
					</a>
					<div class="main-latest_section2">
						<div class="main-latest_section2-1">
							<div class="main-small_latest_courses">
								<a
									href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(1).crsNum}">
									<div class="up-on-scroll">
										<div class="main-small_latest1">
											<div class="img_wrapper2">
												<img
													src="${pageContext.request.contextPath}/${allCourses.get(1).imgPath}" />
											</div>
											<div class="main-first_course">
												<div class="main-first_course_title">
													${allCourses.get(1).title}</div>
											</div>
										</div>
									</div>
								</a> <a
									href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(2).crsNum}">
									<div class="up-on-scroll">
										<div class="main-samll_latest2">
											<div class="img_wrapper2">
												<img
													src="${pageContext.request.contextPath}/${allCourses.get(2).imgPath}" />
											</div>
											<div class="main-first_course">
												<div class="main-first_course_title">
													${allCourses.get(2).title}</div>
											</div>
										</div>
									</div>
								</a>
							</div>
						</div>
						<a
							href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(3).crsNum}">
							<div class="up-on-scroll">
								<div class="main-latest_section2-2">
									<div class="main-latest">
										<div class="img_wrapper3">
											<img
												src="${pageContext.request.contextPath}/${allCourses.get(3).imgPath}" />
										</div>
										<div class="main-first_course">
											<div class="main-first_course_title">
												${allCourses.get(3).title}</div>
										</div>
									</div>
								</div>
							</div>
						</a>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="footer/footer_grey.jsp" />
	</main>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>

</html>