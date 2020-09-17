<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.footer {
	width: 100%;
   height: 90px;
   background-color: #f7f7f7;
   padding: 0px 250px 0px 255px;
   font-size: 11pt;
   align-items: center;
   display: flex;
   flex-direction: row;
   justify-content: space-between;
   font-size: 11pt;
}

.footer_section {
	display: flex;
	width: 100%;
	height: 90px;
	justify-content: space-between;
	align-items: center;
	
}

.main-footer_right {
	font-size: 11pt;
}

.footer_right_sub {
	margin-top: 8px;
	font-size: 11pt;
}

.main-footer_sns_list {
	display: flex;
	flex-direction: row;
}

.main-footer_sns_list li {
	font-size: 15pt;
	margin-left: 29px;

}
</style>
<script src="https://kit.fontawesome.com/54919de5bd.js" crossorigin="anonymous"></script>
</head>
<body>
	<footer class="footer">
			<div class="footer_section">
				<div class="main-footer_right">
					<i class="far fa-copyright"></i> 2020 Team4,Inc.All rights reserved
					<div class="footer_right_sub">
						<span>개인정보 처리방침</span> <span>·</span> <span>이용약관</span> <span>·</span>
						<span>사이트 맵</span>
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
</body>
</html>