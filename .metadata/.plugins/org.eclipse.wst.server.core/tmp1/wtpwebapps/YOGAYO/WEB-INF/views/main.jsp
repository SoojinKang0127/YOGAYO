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
	href="${pageContext.request.contextPath}/resources/css/main.css"  media="all and (min-width:600px) and (max-width:2000px)">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main_mobile.css" media="all and (min-width:300px) and (max-width:599px)">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700&display=swap" rel="stylesheet">
	
</head>
<body>
	<header class="header">
		<div class="main-status_bar">
			<div class="main-logo_wrapper">
				<a href="main_page.html"> 
					<div class="logo-wrapper">
					<span>YOGAYO</span>
						<div class="box-div"></div>
					</div>
				</a>
			</div>
			<div class="main-status_categories">
				<span class="recommand"><a href="${pageContext.request.contextPath}/main">추천</a></span> 
				<span class="course"><a href="${pageContext.request.contextPath}/course-page">코스</a></span>
				<span class="dictionary"><a href="${pageContext.request.contextPath}/my-page">자세 사전</a></span> 
				<span class="my_page"><a href="${pageContext.request.contextPath}/my-page">마이 페이지</a></span>
			</div>
			<div class="main-profile">
				<div class="welcome_user">안녕하세요. ${user.name}님</div>
				<a href="myPage"><img
					src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
					class="profile_img" /></a>
			</div>
		</div>
	</header>
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
		<!-- -------------end 첫번째 세션------------ -->
		
		
		<!-- -------------두번째 세션------------ -->
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
			
				<!-- <div class="main-second_bg">
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
				</div> -->

				<!--------------- 두번째 세션-------------->

				<!-- -----------------세번째 세션 ------------->
			</div>
		</div>
		<div class="up-on-scroll">
			<div class="main-third_container">








					<div class="main-third_bg up-on-scroll">
						<div class="main-latest_title_section">
							<div class="main-latest_courses_title">새로 올라온 코스</div>
							<div class="main-latest_courses_explain">
								<p>세계 각지 사람들의 다양한 코스들을 경험해보세요. 저희 요가요에서 제공하는 코스들도 놓치지 마세요.</p>
							</div>
						</div>
						<div class="main-to_course_btn_section">
							
								<button id="main-to_course_btn"><a href="${pageContext.request.contextPath}/course-page">모두 둘러보기</a></button>
							
						</div>
					</div>
			
			







				<div class="main-latest_sections">
					<div class="up-on-scroll">
						<div class="main-latest_section">
							<img
								src="${pageContext.request.contextPath}/resources/image/course/latest_course.jpg" />
							<div class="main-first_course">
								<div class="main-first_course_title">
									${allCourses.get(0).title}</div>
							</div>
						</div>
					</div>
					<div class="main-latest_section2">
						<div class="main-latest_section2-1">
							<div class="main-small_latest_courses">
								<div class="up-on-scroll">
									<div class="main-small_latest1">
										<img
											src="${pageContext.request.contextPath}/resources/image/course/latest_course.jpg" />
										<div class="main-first_course">
											<div class="main-first_course_title">
												${allCourses.get(1).title}</div>
										</div>
									</div>
								</div>
								<div class="up-on-scroll">
									<div class="main-samll_latest2 ">
										<img
											src="${pageContext.request.contextPath}/resources/image/course/latest_course.jpg" />
										<div class="main-first_course">
											<div class="main-first_course_title">
												${allCourses.get(3).title}</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="up-on-scroll">
							<div class="main-latest_section2-2">
								<div class="main-latest">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/latest_course.jpg" />
									<div class="main-first_course">
										<div class="main-first_course_title">
											${allCourses.get(4).title}</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
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
	<script src="http://code.jquery.com/jquery.js"></script>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>
