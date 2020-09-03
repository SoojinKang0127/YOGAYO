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
	href="${pageContext.request.contextPath}/resources/css/admin/admin_comment.css">
<title>YOGAYO COMMENT</title>
</head>
<body>
	<header>
		<a href="/"><div class="logo-wrapper">
				<span>YOGAYO</span>
				<div class="box-div"></div>
			</div> </a>
		<ul class="menu_list">
			<li class="menu	">통계</li>
			<li class="menu ">회원 관리</li>
			<li class="menu">코멘트 관리</li>
			<li class="menu">뉴스레터 전송</li>
			<li class="menu">코스 관리</li>
			<li class="menu">포즈 관리</li>
			<li class="menu">포즈 관리</li>
			<li class="menu">LOG OUT</li>
		</ul>
	</header>
	<main>
		<div class="search_container">
			<input type="button" id="filter" value="비속어 포함 댓글 검색"> <input type="text"
				id="search" placeholder="키워드로 검색">
		</div>
		<div class="comment_table">
			<ul>
				<li class="comment_list">
					<div class="idx">순번</div>
					<div class="comment_date">작성일시</div>
					<div class="user_avatar">프로필사진</div>
					<div class="comment_user">작성자</div>
					<div class="comment_couse">코스번호</div>
					<div class="comment_couse">평점</div>
					<div class="comment_content">내용</div>
					<div class="comment_delete">삭제</div>
				</li>
				
			</ul>
		</div>
	</main>
</body>
</html>
