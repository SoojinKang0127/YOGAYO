<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>YOGA POSE</title>
	
	<script src="https://kit.fontawesome.com/54919de5bd.js"
	crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/dictionary-detail.css">
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/dictionary-detail.js"></script>
</head>

<body>
	<header></header>
	<main>
		<div class="yoag-dictionary-box">
			<div class="yoag-dictionary-box-section">
				<div class="yoag-dictionary">
					<p>&#60; Yoga Dictionary</p>
				</div>
			</div>
		</div>
		<div class="yoga-title-box">
			<div class="yoga-title-box-section">
				<div class="yoga-title">
					<h2>${pose.title}</h2>
				</div>
			</div>
		</div>
		<div class="search-img-box">
			<div class="search-img-section">
				<div class="search-img">
				<img src="${pose.img_Path}" alt="불러오지 못함">
				</div>
			</div>
		</div>
		<div class="yoga-second-dificult-box">
			<div class="yoga-second-dificult-box-section">
				<div class="yoga-second-dificult">
					<i class="far fa-clock"></i><span> ${minu}분  ${second}초 </span>
					<span>DIFFICULTY:${pose.difficulty}</span>
				</div>
			</div>
		</div>
		<!-- 윗쪽 색션-->
		
		
		
		
		
		<div class="box">
			<div class="box_section">
				<div class="box-stepBystep">
					<div class="stepBystep-title">
						<p>Step by step</p>
					</div>
					<div class="stepBystep-content">
						<ul>
							
						</ul>
					</div>
				</div>
				<div class="box-BeginnersTips">
					<div class="BeginnersTips-title">
						<p>Beginners tips</p>
					</div>
					<div class="BeginnersTips-content">
						<ul>
							
						</ul>
					</div>
				</div>
				<div class="box-Benefits">
					<div class="Benefits-title">
						<p>Benefits</p>
					</div>
					<div class="Benefits-content">
						<ul>
							
						</ul>
					</div>
				</div>
				<div class="box-watchOutFor">
					<div class="watchOutFor-title">
						<p>Watch out for</p>
					</div>
					<div class="watchOutFor-content">
						<ul>
							
						</ul>
					</div>
				</div>
				<div class="box-variations">
					<div class="variations-title">
						<p>Variations</p>
					</div>
					<div class="variations-content">
						<ul>
							
						</ul>
					</div>
				</div>
			</div>
		</div> <!--end of box -->
	</main>
</body>

</html>