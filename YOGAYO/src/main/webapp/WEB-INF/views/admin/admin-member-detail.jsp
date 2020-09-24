<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_member_detail.css">
<script src="https://kit.fontawesome.com/54919de5bd.js"
	crossorigin="anonymous"></script>
<title>ADMIN MEMBER</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<div class="feed_modal hiding">
		<div class="temp">
			<i class="fas fa-times"></i>
			<div class="pop_up">
				<ul>
					<c:forEach var="feed" items="${feedList}">
						<li class="feed">
							<div class="sec_first">
								<div class="user_avatar">
									<img src="${pageContext.request.contextPath}/${user.img}">
								</div>
								<div class="content">
									<div class="first">
										<span class="user_name">${user.name}</span> <span
											class="user_id">${user.id }</span> <span class="reg_date">${feed.regDate }</span>
									</div>
									<div class="second">${feed.crsTitle }</div>
									<div class="third">${feed.context }</div>
								</div>
							</div>
							<div class="sec_second">
								<div class="feed_img">
									<img src="${pageContext.request.contextPath}/${feed.img}">
								</div>
							</div>
							<div class="sec_third">
								<div class="feed_slevel">
									<span class="th">만족도</span><span class="value">${feed.sLevel }</span>
								</div>
								<div class="feed_dlevel">
									<span class="th">체감 난이도</span><span class="value">${feed.dLevel }</span>
								</div>
								<div class="feed_weight">
									<span class="th">몸무게</span><span class="value">${feed.weight }kg</span>
								</div>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
			<div class="black_back"></div>
		</div>
	</div>
	<main>
		<div class="member_title">
			<span class="underline">회원 상세 정보</span>
		</div>
		<div class="detail_section">
			<div class="user_pic">
				<img src="${pageContext.request.contextPath}/${user.img}">
			</div>
			<div class="info">
				<div class="user_no">
					<div class="th">회원번호</div>
					<div class="value">${user.uNum }</div>
				</div>
				<div class="user_name">
					<div class="th">이름</div>
					<div class="value">${user.name }</div>
				</div>
				<div class="user_id">
					<div class="th">아이디</div>
					<div class="value">${user.id }</div>
				</div>
				<div class="user_gender">
					<div class="th">성별</div>
					<div class="value">
						<c:set var="gender" value="${user.gender }" />
						<c:if test="${fn:contains(gender,'M')}">남성</c:if>
						<c:if test="${fn:contains(gender,'F')}">여성</c:if>
					</div>
				</div>
				<div class="user_profi">
					<div class="th">숙련도</div>
					<div class="value">
						<c:if test="${user.profiLevel == '5'}">상</c:if>
						<c:if test="${user.profiLevel == '3'}">중</c:if>
						<c:if test="${user.profiLevel == '1'}">하</c:if>
					</div>
				</div>
				<div class="user_birthday">
					<div class="th">나이 (만)</div>
					<jsp:useBean id="now" class="java.util.Date" />
					<fmt:formatDate var="cyear" value="${now}" pattern="yyyy" />
					<fmt:formatDate value="${user.bDate }" pattern="yyyy" var="year" />
					<div class="value">${cyear - year}</div>
				</div>
				<div class="user_reg">
					<div class="th">가입일</div>
					<div class="value">${user.regDate }</div>
				</div>
				<div class="user_like">
					<div class="th">좋아요</div>
					<div class="value link">${likeNum }</div>
					<div class="like_table_wrapper_for_hidden">
						<div class="like_table_wrapper">
							<div class="member_title">
								<span class="underline">${user.name }님이 좋아요한 코스</span>
							</div>
							<ul>
								<li class="like_list">
									<div class="course_num list_th">코스 번호</div>
									<div class="course_title list_th">코스 타이틀</div>
								</li>
								<c:forEach var="like" items="${likeList}">
									<li class="like_list">
										<div class="course_num list_th">${like.crsNum }</div>
										<div class="course_title list_th">${like.crsTitle }</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="user_comment">
					<div class="th">댓글</div>
					<div class="value link">${commentNum }</div>
					<div class="comment_table_wrapper_for_hidden">
						<div class="comment_table_wrapper">
							<div class="member_title">
								<span class="underline">${user.name }님이 남긴 댓글</span>
							</div>
							<ul>
								<li class="comment_list">
									<div class="comment_num list_th">
										댓글</br>번호
									</div>
									<div class="comment_date list_th">작성 일시</div>
									<div class="comment_type list_th">구분</div>
									<div class="comment_content list_th">내용</div>
									<div class="comment_rate list_th">별점</div>
								</li>
								<c:forEach var="comment" items="${commentList}">
									<li class="comment_list">
										<div class="comment_num list_th">${comment.cmtNum }</div>
										<div class="comment_date list_th">${comment.regDate }</div>
										<div class="comment_type list_th">
											<c:if test="${comment.parent == '0'}">댓글</c:if>
											<c:if test="${comment.parent != '0'}">${comment.parent }번 대댓글</c:if>
										</div>
										<div class="comment_content list_th">${comment.context }
										</div>
										<div class="comment_rate list_th">${comment.rate }</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="user_feed">
					<div class="th">피드</div>
					<div class="value link">${feedNum }</div>
					<div class="feed_table_wrapper_for_hidden">
						<div class="feed_table_wrapper">
							클릭하면<br>피드로 이동
						</div>
					</div>

				</div>
				<div class="user_course">
					<div class="th">코스</div>
					<div class="value link">${courseNum }</div>
					<div class="course_table_wrapper_for_hidden">
						<div class="course_table_wrapper">
							<div class="member_title">
								<span class="underline">${user.name }님이 만든 코스</span>
							</div>
							<ul>
								<li class="course_list">
									<div class="course_num list_th">
										코스</br>번호
									</div>
									<div class="mycourse_title list_th">타이틀</div>
									<div class="course_desc list_th">설명</div>
									<div class="course_rate list_th">평점</div>
								</li>
								<c:forEach var="course" items="${courseList}">
									<li class="course_list">
										<div class="course_num list_th">${course.crsNum }</div>
										<div class="mycourse_title list_th">${course.title }</div>
										<div class="course_desc list_th">${course.dscrt }</div>
										<div class="course_rate list_th"></div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div class="member_title">
				<span class="underline">${user.name }님의 관심 KEYWORD</span>
			</div>
			<div class="keywords_wrapper"></div>

		</div>


	</main>

	<script type="text/javascript">
		//console.log(`${likeList}`);
		var keywordWrapper = document.querySelector(".keywords_wrapper");

		<c:forEach var="keyword" items="${keywordList}">
		keyword = document.createElement("span");
		keyword.setAttribute('class', 'keyword');
		keyword.innerHTML = '#' + `${keyword}`;
		keywordWrapper.appendChild(keyword);
		console.log(`${keyword}`);
		</c:forEach>

		var likeListWrapper = document
				.querySelector(".like_table_wrapper_for_hidden");
		var likeNumBtn = document.querySelector(".user_like");
		likeNumBtn.addEventListener("mouseover", function() {
			likeListWrapper.style.display = 'block';
			likeNumBtn.style.backgroundColor = '#febe2e';
		});
		likeNumBtn.addEventListener("mouseleave", function() {
			likeListWrapper.style.display = 'none';
			likeNumBtn.style.backgroundColor = 'white';
		});

		var commentListWrapper = document
				.querySelector(".comment_table_wrapper_for_hidden");
		var commentBtn = document.querySelector(".user_comment");
		commentBtn.addEventListener("mouseover", function() {
			commentListWrapper.style.display = 'block';
			commentBtn.style.backgroundColor = '#febe2e';
		});
		commentBtn.addEventListener("mouseleave", function() {
			commentListWrapper.style.display = 'none';
			commentBtn.style.backgroundColor = 'white';
		});

		var courseListWrapper = document
				.querySelector(".course_table_wrapper_for_hidden");
		var courseBtn = document.querySelector(".user_course");
		courseBtn.addEventListener("mouseover", function() {
			courseListWrapper.style.display = 'block';
			courseBtn.style.backgroundColor = '#febe2e';
		});
		courseBtn.addEventListener("mouseleave", function() {
			courseListWrapper.style.display = 'none';
			courseBtn.style.backgroundColor = 'white';
		});
		var feedListWrapper = document
				.querySelector(".feed_table_wrapper_for_hidden");
		var feedBtn = document.querySelector(".user_feed");
		var feedModal = document.querySelector(".feed_modal");
		var closeBtn = document.querySelector(".fa-times");

		feedBtn.addEventListener("mouseover", function() {
			feedListWrapper.style.display = 'block';
			feedBtn.style.backgroundColor = '#febe2e';
		});
		feedBtn.addEventListener("mouseleave", function() {
			feedListWrapper.style.display = 'none';
			feedBtn.style.backgroundColor = 'white';
		});
		feedBtn.addEventListener("click", function() {
			feedModal.classList.remove("hiding");
			document.querySelector("body").classList.add("overflow_hidden");
		});

		closeBtn.addEventListener("click", function() {
			feedModal.classList.add("hiding");
			document.querySelector("body").classList.remove("overflow_hidden");
		})
	</script>
</body>
</html>
