<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMIN NEWSLETTER</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_newsletter.css">
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="member_title"><span class="underline">뉴스레터 수신 동의 회원 목록</span></div>
		<div class="member_table_wrapper">
			<div class="member_table">
				<ul>
					<li class="member_list">
						<div class="idx col">순번</div>
						<div class="user_number col">번호</div>
						<div class="user_name col">이름</div>
						<div class="user_id col">E-MAIL</div>
						<div class="user_regdate col">수신동의일</div>
					</li>
					<c:forEach var="i" items="${userList}">
						<li class="member_list">
							<div class="idx">1</div>
							<div class="user_number">${i.uNum }</div>
							<div class="user_name">${i.name }</div>
							<div class="user_id">${i.id }</div>
							<div class="user_regdate">${i.regDate }</div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="mail_content_wrapper">
			<div class="sender">
				<div class="mail_sender name">보내는 주소</div>
				<div class="mail_sender_input">
					<input type="text" value="yogayo@naver.com" name="sender"
						id="sender">
				</div>
			</div>
			<div class="title">
				<div class="mail_title name">메일 제목</div>
				<div class="mail_title_input">
					<input type="text" placeholder="이곳에 제목을 입력하세요. 예) YOGAYO 10월 새소식!"
						name="title" id="title">
				</div>
			</div>
			<div class="content">
				<div class="mail_sender name">메일 내용</div>
				<div class="mail_sender_input">
					<textarea rows="" cols="" class="body">이곳에 메일 내용이 들어갑니다앙</textarea>
					<!-- <input type="text" placeholder="" name="sender" id="sender"> -->
				</div>
			</div>
		</div>
		<div class="submit_btn">전송하기!</div>

	</main>
</body>
</html>