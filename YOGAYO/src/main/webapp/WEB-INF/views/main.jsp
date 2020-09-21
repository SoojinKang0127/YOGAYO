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
		<!-- -------------end 첫번째 세션------------ -->
		
		
		<!-- -------------두번째 세션------------ -->
		<div class="main-second_container">
			<div class="up-on-scroll">
				<div class="main-second_bg">
					<div class="main-recommand">
						<a href="${pageContext.request.contextPath}/course-detail?crsNum=1">
							<img src="${pageContext.request.contextPath}/resources/image/course/course.jpg" />
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
						<img src="${pageContext.request.contextPath}/resources/image/course/course.jpg" />
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
						<img src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-first_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-first_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
					<div class="main-recommand">
						<img src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-second_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-second_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
					<div class="main-recommand">
						<img src="${pageContext.request.contextPath}/resources/image/course/course2.jpg" />
						<div class="main-third_course">
							<div class="main-course_title">당신의 허리를 위한 스트레칭</div>
							<div class="main-third_course_explain">예전 같지 않은 허리 이대로
								괜찮으신가요?</div>
						</div>
					</div>
				</div> -->

				<!--------------- end 두번째 세션-------------->

				<!-- -----------------세번째 세션 ------------->
			</div>
		</div>
		<div class="up-on-scroll">
			<div class="main-third_container">
				<div class="up-on-scroll">
					<div class="main-third_bg">
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
				</div>
				
				<div class="main-latest_sections">
					<a
									href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(0).crsNum}">
					<div class="up-on-scroll">

						<div class="main-latest_section">
							<div class="img_wrapper">
								<img src="${pageContext.request.contextPath}/${allCourses.get(0).imgPath}" /></div>
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
								</a>
								<a
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
						<a href="${pageContext.request.contextPath}/course-detail?crsNum=${allCourses.get(3).crsNum}">
							<div class="up-on-scroll">
								<div class="main-latest_section2-2">
									<div class="main-latest">
										<div class="img_wrapper3"><img
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
		<div class="newsletter_section">
			<div class="newsletter">
				<div class="first">YOGAYO NEWSLETTER</div>
				<div class="second">
					요가요 뉴스레터 구독 신청하고 최신 소식과 여러 혜택을 만나보세요! <i
						class="fas fa-arrow-circle-right" id="arrow"></i>
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
		<div class="newsletter_modal hiding" id="newsletter_modal">
			<div class="temp">
				<div class="pop_up">
					<i class="far fa-envelope"></i>
					<span class="title">YOGAYO NEWSLETTER</span>
					<span class="sentence">${user.name}님, 뉴스레터를 구독하고<br>
					YOGAYO에서 제공하는 최신 정보와<br> 회원님에게 딱 맞는 요가 코스 추천을<br>받아보시겠어요? :)</span>
					<span class="email">${user.id} 로 메일 수신 동의</span>
					<div class="btn_area">
						<div class="no_btn" id="no_btn" >아니요</div>
						<div class="yes_btn" id="yes_btn">네</div>
					</div>
				</div>
				<div class="black_back"></div>
			</div>
		</div>
	</main>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/main_newsletter.js"></script>
		<jsp:include page="footer/footer_grey.jsp" />
	</main>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>

</html>