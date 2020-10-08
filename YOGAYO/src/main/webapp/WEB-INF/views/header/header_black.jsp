<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/hamburgers.css" />
<style>
.main_wrapper {
	height: 70px;
	margin-top: 30px;
	display: flex;
	width: 100%;
	align-items: center;
}

.main-status_bar {
	display: flex;
	position: absolute;
	flex-direction: row;
	justify-content: space-around;
	width: 100%;
	z-index: 2;
}

.logo-wrapper {
	width: 150px;
	/* padding: 25px; */
	position: relative;
	display: flex;
	flex-direction: column;
	align-items: center;
	margin-left: 30px;
	margin-top: 25px;
}

.box-div {
	width: 100px;
	height: 100px;
	display: flex;
	justify-content: center;
	align-items: center;
	border: 2px solid rgb(0, 0, 0);
	/* transition: all 0.3s linear; */
	box-shadow: var(- -light-shadow);
	transform: perspective(400px) rotateX(80deg);
}

/* .logo-wrapper:hover .box-div {
   transform: none;
} */
.logo-wrapper span {
	color: rgb(0, 0, 0);
	font-size: 20px;
	font-weight: 600;
	position: absolute;
	top: 20px;
	opacity: 1;
	/* transition: opacity 0.3s ease-in-out 0s; */
	display: block;
}

/* .logo-wrapper:hover span {
   opacity: 0;
   top: 46px;
} */
.main-status_categories {
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	align-items: center;
	color: black;
	margin-top: 10px;
}

.main-status_categories span {
	margin-right: 30px;
	align-items: center;
	font-size: 18pt;
	font-family: "Noto Sans KR", sans-serif;
	font-weight: 300;
	margin-left: 50px;
	position: relative;
	height: 35px;
}

.main-status_categories a {
	color: black;
	text-decoration: none;
}

.main-status_categories span.nowpage::after {
	content: "";
	position: absolute;
	bottom: 0;
	left: 50%;
	width: 20px;
	height: 4px;
	border-radius: 2px;
	background: black;
	/* transition: all .2s ease-out; */
}

.main-status_categories span::after {
	content: "";
	position: absolute;
	bottom: 0;
	left: 50%;
	transform: translateX(-50%);
	width: 0;
	height: 4px;
	border-radius: 2px;
	background: black;
	transition: all 0.2s ease-out;
}

.main-status_categories span.nowmouse:hover::after {
	width: 100%;
}

.main-profile {
	display: flex;
	align-items: center;
	margin-top: 5px;
}

.main-profile .welcome_user {
	color: black;
	margin-right: 30px;
}

.header .main-status_bar .main-profile img {
	display: flex;
	width: 40px;
	height: 40px;
	border-radius: 50px;
}

.hamburger {
	display: none;
}

@media screen and (max-width: 599px) {
	header {
		height: 60px;
	}
	body {
		margin: 0px;
	}
	.main-status_bar {
		flex-direction: column;
		position: relative;
		width: 100%;
	}
	.main-logo_wrapper {
		height: 60px;
		width: 300px;
	}
	.main_wrapper {
	margin-top: 0;
	height: 60px;	
	display: block;
		
	}
	.logo-wrapper {
		height: 60px;
		margin-left: 10px;
		width: 110px;
		margin-top: 0px;
	}
	.main-status_categories {
		margin: 0px;
		flex-direction: column;
		display: flex;
		background-color: bisque;
	}
	.main-profile {
		margin: 0px;
		justify-content: center;
		display: flex;
		background-color: bisque;
		height: 33px;
		
	}
	.main-profile .welcome_user {
		font-size: 14px;
		margin-left: 15px;
	}
	.header .main-status_bar .main-profile img {
		width: 30px;
		height: 30px;
		border-radius: 30px;
	}
	.main-status_categories span {
		font-size: 15px;
		line-height: 35px;
		margin: 0px;
		width: 100%;
		text-align: center;
		border-bottom: 2px solid white;
	}
	.main-status_categories span.nowpage::after {
		display: none;
	}
	.main-status_categories span::after {
		display: none;
	}
	.main-status_categories span.nowmouse:hover::after {
		display: none;
	}
	.box-div {
		display: none;
	}
	.hamburger {
		display: block;
		position: absolute;
		right: 10px;
		top: 21px;
		font-size: 20px;
		color: black;
		z-index: 3;
	}
	.main-status_categories.active, .main-profile.active {
		display: flex;
	}
}

.main-profile i {
	margin-left: 20px;
	font-size: 23px;
	color: black;
}
</style>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<header class="header">
		<div class="main_wrapper">
			<div class="main-status_bar">
				<div class="main-logo_wrapper">
					<a href="${pageContext.request.contextPath}/main">
						<div class="logo-wrapper">
							<span>YOGAYO</span>
							<div class="box-div"></div>
						</div>
					</a>
				</div>
				<div class="main-status_categories">
					<span class="recommand"><a
						href="${pageContext.request.contextPath}/main">추천</a></span> <span
						class="course"><a
						href="${pageContext.request.contextPath}/course-page">코스</a></span> <span
						class="dictionary"><a
						href="${pageContext.request.contextPath}/dictionary">자세 사전</a></span> <span
						class="my_page"><a
						href="${pageContext.request.contextPath}/myPage">마이 페이지</a></span>
				</div>
				<div class="main-profile">
					<div class="welcome_user">안녕하세요. ${user.name}님</div>
					<a href="myPage"><img
						src="${pageContext.request.contextPath}/${user.img}"
						class="profile_img" /></a><i class="fas fa-door-open"></i>
				</div>
			</div>
		</div>
		<div class="hamburger hamburger--spin">
			<div class="hamburger-box">
				<div class="hamburger-inner"></div>
			</div>
		</div>
	</header>
	<script>
		// hamburger
		$(function() {
			var mql = window.matchMedia("screen and (max-width: 599px)")

			if (mql.matches) {
				var forEach = function(t, o, r) {
					if ("[object Object]" === Object.prototype.toString.call(t))
						for ( var c in t)
							Object.prototype.hasOwnProperty.call(t, c)
									&& o.call(r, t[c], c, t)
					else
						for (var e = 0, l = t.length; l > e; e++)
							o.call(r, t[e], e, t)
				}

				var hamburgers = document.querySelectorAll(".hamburger")
				if (hamburgers.length > 0) {
					forEach(hamburgers, function(hamburger) {
						hamburger.addEventListener("click", function() {
							this.classList.toggle("is-active")
						}, false)
					})
				}

				const toggleBtn = document.querySelector(".hamburger")
				const menu = document.querySelector(".main-status_categories")
				const icons = document.querySelector(".main-profile")

				$(menu).hide()
				$(icons).hide()

				$(toggleBtn).click(function() {
					$(menu).slideToggle()
					$(icons).slideToggle()
				})
			} else {
				pathname = window.location.pathname
				menu_num = 0
				switch (pathname) {
				case "/main":
					menu_num = 1
					break
				case "/course-page":
				case "/course-detail":
				case "/player":
					menu_num = 2
					break
				case "/dictionary":
				case "/dictionary-detail":
					menu_num = 3
					break
				case "/update":
				case "/myPage":
				case "/course_playlist":
					menu_num = 4
					break
				}

				function nowPage(a) {
					classname = ".main-status_categories span:nth-child(" + a
							+ ")"
					$(classname).toggleClass("nowpage")
				}
				nowPage(menu_num)

				$(".main-status_categories span")
						.hover(
								function() {
									$(this).toggleClass("nowmouse")
									if ($(this)[0] != $(".main-status_categories span:nth-child("
											+ menu_num + ")")[0]) {
										$(
												".main-status_categories span:nth-child("
														+ menu_num + ")")
												.removeClass("nowpage")
									}
								},
								function() {
									$(this).toggleClass("nowmouse")
									if ($(this)[0] != $(".main-status_categories span:nth-child("
											+ menu_num + ")")[0]) {
										$(
												".main-status_categories span:nth-child("
														+ menu_num + ")")
												.toggleClass("nowpage")
									}
								})
			}
		})
	</script>
</body>
</html>