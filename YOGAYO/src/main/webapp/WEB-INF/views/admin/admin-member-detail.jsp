<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_member_detail.css">

<title>ADMIN MEMBER</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="member_title">
			<span class="underline">회원 상세 정보</span>
		</div>
		<div class="detail_section">
			<div class="user_pic">
				<img
					src="${pageContext.request.contextPath}/resources/image/profile/william.jpg">
			</div>
			<div class="info">
				<div class="user_no">
					<div class="th">회원번호</div>
					<div class="value">${user.uNum }</div>
				</div>
				<div class="user_name">
					<div class="th">이름</div>
					<div class="value">강수진</div>
				</div>
				<div class="user_id">
					<div class="th">아이디</div>
					<div class="value">iamhajaml@naver.com</div>
				</div>
				<div class="user_gender">
					<div class="th">성별</div>
					<div class="value">여성</div>
				</div>
				<div class="user_profi">
					<div class="th">숙련도</div>
					<div class="value">중</div>
				</div>
				<div class="user_birthday">
					<div class="th">나이</div>
					<div class="value">28세</div>
				</div>
				<div class="user_reg">
					<div class="th">가입일</div>
					<div class="value">2020-09-28</div>
				</div>
				<div class="user_like">
					<div class="th">좋아요</div>
					<div class="value">34<span>건</span></div>
				</div>
				<div class="user_comment">
					<div class="th">댓글</div>
					<div class="value">22<span>건</span></div>
				</div>
				<div class="user_feed">
					<div class="th">피드</div>
					<div class="value">9<span>건</span></div>
				</div>
				<div class="user_course">
					<div class="th">코스</div>
					<div class="value">3<span>건</span></div>
				</div>
			</div>

		</div>



	</main>

</body>
</html>
