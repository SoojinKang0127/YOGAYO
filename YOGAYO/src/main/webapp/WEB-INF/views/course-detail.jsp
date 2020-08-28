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
	src="${pageContext.request.contextPath}/resources/js/course-detail.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/course-detail.css">
</head>
<body>
	<header></header>
	<main>
		<div class="course_detail-bg">
			<div class="course_detail-first">
				<div class="section">
					<div class="to_course">
						<a href="${pageContext.request.contextPath}/course-page">새로운
							코스 모두 보기</a>
					</div>
					<div class="like">
						<div class="like_icon">
							<i class="far fa-heart"></i>
						</div>
						<div class="like_btn">찜하기</div>
					</div>
				</div>
			</div>
			<div class="course_detail-second">
				<div class="section">
					<div class="course_detail-img_section">
						<img src="${coursePoses.img1}" alt="course_detail" /> <img
							src="${coursePoses.img2}" alt="course_detail" /> <img
							src="${coursePoses.img3}" alt="course_detail" />
					</div>
				</div>
			</div>

			<div class="course_detail-third">
				<div class="section">
					<div class="title_section">
						<div class="title">
							<p>${course.title}</p>
							<div class="course_detail-star_rating">
								<span><i class="fas fa-star"></i></span> <span id="rating">4.97</span>
								<span>(206)</span> <span>·</span> <span>(만든사람)</span>
							</div>
						</div>
					</div>
					<div class="course_detail-info_section">
						<div class="course_detail-info_title_section">
							<div class="course_detail-info_title">(만든사람)님이구성한 명상 코스</div>
							<img
								src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
								alt="profile" />

						</div>
						<div class="course_detail-info_icon_section">
							<div class="first_line">
								<div class="course_detail-info_time">
									<i class="far fa-clock"></i> ${totalMin}min
								</div>
								<div class="course_detail-why">
									<i class="fas fa-child"></i>정신 건강을 위한 명상
								</div>
							</div>
							<div class="second_line">
								<div class="course_detail-users">
									<i class="fas fa-users"></i> 50명
								</div>
								<div class="course_detail-difficulty">
									<i class="far fa-smile-wink"></i>쉬움
								</div>
							</div>
						</div>
						<div class="course_detail-coures_explain_section">
							<div class="course_detail-coures_explain_title">프로그램</div>
							<div class="course_detail-course_explain">
								<p>${course.dscrt}</p>
							</div>
						</div>
						<div class="coures_detail-coures_materials_section">
							<div class="coures_detail-coures_materials_title">준비물</div>
							<div class="coures_detail-coures_materials_list">
								<ul>
									<li><i class="far fa-check-circle"></i> ${course.material}</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="course_detail-mini_view_section">
					<div class="fake_mini_view"></div>
					<div class="course_detail-mini_view">
						<div class="title">코스 개요</div>
						<div class="poses">
							<div class="pose">
								<div class="pose_title">${coursePoses.pose1}</div>
								<div class="time">${coursePoses.time1}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose2}</div>
								<div class="time">${coursePoses.time2}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose3}</div>
								<div class="time">${coursePoses.time3}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose4}</div>
								<div class="time">${coursePoses.time4}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose5}</div>
								<div class="time">${coursePoses.time5}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose6}</div>
								<div class="time">${coursePoses.time6}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose7}</div>
								<div class="time">${coursePoses.time7}</div>
							</div>
							<div class="pose">
								<div class="pose_title">${coursePoses.pose8}</div>
								<div class="time">${coursePoses.time8}</div>
							</div>
						</div>
						<div class="btn">
							<div class="time">총 ${totalMin}분 ${totalSec} 초</div>
							<div class="start_btn">
								<a href="${pageContext.request.contextPath}/course_playlist">
									<button id="btn_to_start">시작하기</button>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="course_detail-fourth_section">
				<div class="course_detail-review_section">
					<div class="course_detail-rating">
						<span><i class="fas fa-star"></i></span> <span>4.97(206)</span> <span>(후기
							206개)</span>
					</div>
					<div class="course_detail-review_sec">
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> 다른 게스트 없이 가족이나 친구들과만 체험을 즐기고 싶으세요? Fragiskos님은 최대
										100명까지의 일행에게 시작 요금 ₩174,403에 프라이빗 예약을 제공합니다. </span>
								</div>
							</div>
						</div>
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> 수진 언니 결혼 축하해요 제가 춤 춰 드릴게요. 재호님이랑 </span>
								</div>
							</div>
						</div>
					</div>
					<div class="course_detail-review_sec">
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> The host really let the team interact to figure
										everything out, chiming in when we needed the help. It felt as
										close to an in-person escape room as we could really get
										virtually. Def recommend! </span>
								</div>
							</div>
						</div>
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> The host really let the team interact to figure
										everything out, chiming in when we needed the help. It felt as
										close to an in-person escape room as we could really get
										virtually. Def recommend! </span>
								</div>
							</div>
						</div>
					</div>
					<div class="course_detail-review_sec">
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> The host really let the team interact to figure
										everything out, chiming in when we needed the help. It felt as
										close to an in-person escape room as we could really get
										virtually. Def recommend! </span>
								</div>
							</div>
						</div>
						<div class="course_detail-review">
							<div class="course_detail-review_container">
								<div class="course_detail-review_profile_img">
									<img
										src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
										alt="profile" />
									<div class="course_detail-review_user_info">
										<div class="course_detail-review_user_name">Minh</div>
										<div class="course_detail-review_date">2020년8월</div>
									</div>
								</div>
								<div class="course_detail-review_box">
									<span> The host really let the team interact to figure
										everything out, chiming in when we needed the help. It felt as
										close to an in-person escape room as we could really get
										virtually. Def recommend! </span>
								</div>
							</div>
						</div>
					</div>
					<div class="more_review_btn">
						<button id="more_review_btn">후기 206개 모두 보기</button>
					</div>
				</div>
			</div>
		</div>
		<footer class="footer">
			<div class="footer_section">
				<div class="main-footer_right">
					<i class="far fa-copyright"></i> 2020 Team4,Inc.All rights reserved
					<div class="footer_right_sub">
						<span>개인정보 처리방침</span> <span>·</span> <span>이용약관</span> <span>·</span>
						<span>사이트 맵 ${pageContext.request.contextPath}</span>
					</div>
				</div>
				<div class="main-footer_left">
					<ul class="main-footer_sns_list">
						<li><i class="fab fa-facebook-f"></i></li>
						<li><i class="fab fa-twitter"></i></li>
						<li><i class="fab fa-instagram"></i></li>
					</ul>
				</div>
			</div>
		</footer>
	</main>
</body>
</html>
