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
		<div class="member_title">
			<span class="underline">뉴스레터 수신 동의 회원 목록</span>
		</div>
		<div class="member_table_wrapper">
			<div class="member_table">
				<ul>
					<li class="member_list">
						<div class="idx col">순번</div>
						<div class="user_number col">번호</div>
						<div class="user_name col">이름</div>
						<div class="user_id col">E-MAIL</div>
						<div class="user_regdate col">수신동의일</div>
						<div class="user_delete">삭제</div>
					</li>
					<c:forEach var="i" items="${userList}" varStatus="status">
						<li class="member_list">
							<div class="idx">${status.count }</div>
							<div class="user_number">${i.uNum }</div>
							<div class="user_name">${i.name }</div>
							<div class="user_id">${i.id }</div>
							<div class="user_regdate">${i.regDate }</div>
							<div class="user_delete"><span class="deleteBtn" onclick="confirmDelete(${i.uNum }, '${i.name }');">삭제</span></div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<form action="sendnewsletter" method="GET" id="form">
			<div class="mail_content_wrapper">
				<div class="sender">
					<div class="mail_sender name">보내는 주소</div>
					<div class="mail_sender_input">
						<input type="text" value="yogayo_newsletter@naver.com" name="sender"
							id="sender">
					</div>
				</div>
				<div class="title">
					<div class="mail_title name">메일 제목</div>
					<div class="mail_title_input">
						<input type="text" placeholder="이곳에 제목을 입력하세요. 예) YOGAYO 10월 새소식!"
							name="subject" id="title">
					</div>
				</div>
				<div class="content">
					<div class="mail_sender name">메일 내용</div>
					<div class="mail_sender_input">
						<textarea name="context" rows="" cols="" class="body"></textarea>
						<!-- <input type="text" placeholder="" name="sender" id="sender"> -->
					</div>
				</div>
			<input type="submit" class="submit_btn" onclick="submit();" value="전송하기!">
			</div>
		</form>
	</main>
	<script type="text/javascript">

	
	function confirmDelete(uNum, name){
		var yesOrNo = confirm(name + " 회원을 구독 목록에서 삭제하시겠습니까?");
				
		if(yesOrNo){
			location.href="newsletterdelete?usernumber="+uNum;
		}
	}
	
		function submit() {
			location.href = "/test/admin/sendnewsletter"
		}
	</script>
</body>
</html>