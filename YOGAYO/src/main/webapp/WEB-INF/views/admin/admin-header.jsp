<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/reset.css">
<style>
body {
	width: 100vw;
	height: 100vh;
	display: flex;
	flex-direction: column;
	align-items: center;
}

.logo {
	height: 150px;
	display: flex;
	align-items: center;
}

.by {
	font-size: 30px;
	font-weight: 700;
	margin-left: 15px;
	margin-right: 18px;
}

.admin {
	font-size: 48px;
	font-weight: 800;
	-webkit-text-fill-color: rgb(255, 255, 255);
	-webkit-text-stroke-color: rgb(0, 0, 0);
	-webkit-text-stroke-width: 2px;
}

.logo-wrapper {
	width: 150px;
	height: 150px;
	padding: 25px;
	position: relative;
	display: flex;
	flex-direction: column;
	align-items: center;
}

.box-div {
	width: 100px;
	height: 100px;
	display: flex;
	justify-content: center;
	align-items: center;
	border: 2px solid rgb(0, 0, 0);
	transition: all 0.3s linear;
	box-shadow: var(- -light-shadow);
	transform: perspective(400px) rotateX(80deg);
}

.logo-wrapper:hover .box-div {
	transform: none;
}

.logo-wrapper span {
	color: rgb(0, 0, 0);
	font-size: 20px;
	font-weight: 600;
	position: absolute;
	top: 46px;
	opacity: 1;
	transition: opacity 0.3s ease-in-out 0s;
	display: block;
}

.logo-wrapper:hover span {
	opacity: 0;
	top: 46px;
}

.login_title {
	margin-top: 100px;
	font-size: 400px;
	font-weight: 800;
	-webkit-text-fill-color: rgb(255, 255, 255);
	-webkit-text-stroke-color: rgb(0, 0, 0);
	-webkit-text-stroke-width: 2px;
	line-height: 250px;
	margin-bottom: 100px;
	transition: all 0.6s ease-in-out;
}

.login_title:hover {
	line-height: 180px;
}

.login_form {
	width: 500px;
	height: 200px;
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
}

.login_form input[type="text"], .login_form input[type="password"] {
	text-align: center;
	width: 400px;
	height: 50px;
	font-size: 23px;
	margin-bottom: 20px;
	border: none;
	border-bottom: 1px solid black;
}

input:focus {
	outline: none;
}

.login_form input[type="submit"] {
	width: 400px;
	height: 50px;
	margin-top: 30px;
	font-size: 23px;
	border: none;
}

header {
	position: fixed;
	width: 100%;
	height: 250px;
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
	z-index: 2;
	background-color: white;
}

.menu_list {
	display: flex;
	justify-content: center;
	align-items: flex-end;
}

.menu_list a{
	color:black;
}

.menu_list li {
	font-weight: 300;
	font-size: 20px;
	border-top: 0.5px dotted black;
	border-left: 0.5px dotted black;
	border-bottom: 0.5px dotted black;
	padding: 30px 50px 30px 50px;
	transition: all 0.2s ease-in-out;
}

.menu_list li:nth-last-child(1) {
	border-right: 0.5px dotted black;
}

.menu_list li:hover {
	background-color: black;
	color: white;
}
</style>

</head>
<body>
	<header>
		<div class="logo">
			<a href=""><div class="logo-wrapper">
					<span>YOGAYO</span>
					<div class="box-div"></div>
				</div> </a>
			<div class="by">X</div>
			<div class="admin">Admin</div>
		</div>
		<ul class="menu_list">
			<a href="${pageContext.request.contextPath}/admin/"><li class="menu	">대시보드</li></a>
			<a href="${pageContext.request.contextPath}/admin/member"><li class="menu ">회원 관리</li></a>
			<a href="${pageContext.request.contextPath}/admin/comment"><li class="menu">댓글 관리</li></a>
			<a href="${pageContext.request.contextPath}/admin/newsletter"><li class="menu">뉴스레터 전송</li></a>
			<a href="${pageContext.request.contextPath}/admin/course"><li class="menu">코스 관리</li></a>
			<a href="${pageContext.request.contextPath}"><li class="menu">YOGAYO</li></a>
		</ul>
	</header>
</body>
</html>