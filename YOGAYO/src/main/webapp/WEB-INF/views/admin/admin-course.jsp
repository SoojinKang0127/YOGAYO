
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_course.css">
<title>ADMIN COURSE</title>
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
		<div class="course_table">
			<ul>
				<li class="course_list"></li>
				<div class="idx">코스 번호</div>
				<div class="createdBy">만든이</div>
				<div class="title">타이틀</div>
				<div class="description">코스 설명</div>
				<div class="준비물">준비물</div>
				<div class="idx">동작 1</div>
				<div class="idx">코스 번호</div>
				<div class="idx">코스 번호</div>
				<div class="idx">코스 번호</div>
				<div class="idx">코스 번호</div>
			</ul>
		</div>

	</main>


</body>
</html>