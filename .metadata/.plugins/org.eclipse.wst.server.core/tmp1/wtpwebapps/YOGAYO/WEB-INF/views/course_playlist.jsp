<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="target-densitydpi=device-dpi, user-scalable=0, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, width=device-width" />
<title>YOGAYO | COURSEPLAYLIST</title>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script> -->

<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/hammer.js/2.0.8/hammer.js"></script> -->
<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/course_playlist.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/course_playlist.css" media="all and (min-width:600px) and (max-width:2000px)">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/course_playlist_mobile.css" media="all and (min-width:400px) and (max-width:599px)">
</head>

<body>
	<jsp:include page="header/header_black.jsp" />
	<main>
	<div id="mypage_container">
		<div id="s1_container">
			<div class="s1_gap">
				<div class="s1_wrapper">
					<div class='box_container'>
						<form action="mkcourse" method="POST" id="form_tag"
							enctype="multipart/form-data" name="mk_course">
							<input type="hidden" id="seq1" name="seq1" value=""> <input
								type="hidden" id="seq2" name="seq2" value=""> <input
								type="hidden" id="seq3" name="seq3" value=""> <input
								type="hidden" id="seq4" name="seq4" value=""> <input
								type="hidden" id="seq5" name="seq5" value=""> <input
								type="hidden" id="seq6" name="seq6" value=""> <input
								type="hidden" id="seq7" name="seq7" value=""> <input
								type="hidden" id="seq8" name="seq8" value="">

							<div class="course_title">
								<input type="text" name="title" class="title_box"
									placeholder="코스의 제목을 입력하세요">
							</div>
							<div class="course_explain">
								<input type="text" name="dscrt" class="description_box"
									placeholder="설명추가">
							</div>
							<div class="course_upload">
								<input type="file" name="coursethumbnail" class="textbox"
									id="coursethumbnail" placeholder="사진추가">
							</div>
							<div class="course_keyword">
								<input type="text" class="keyword_box" name="keywordBox"
									placeholder="키워드를 입력하세요">
							</div>
							<div class="course_search">
								<input type="text" id="searching_box" class="search"
									placeholder="원하는 포즈명을 검색해보세요">
							</div>
							<label>준비물</label> <select name="material" id="material">
								<option value="요가매트">요가 매트</option>
							</select>
					</div>
					<div class="pose_info_box">
						<ul id="sortable_list1"></ul>
					</div>
				</div>
			</div>
		</div>
		<div id="s2_container">
			<div class="s2_wrapper">
				<div class="s2_gap">
					<div class="s2_titlebox">
						<p class="s2_title">포즈를 더블클릭하거나 드래그하세요</p>
					</div>
					<div class="list_box">
						<ul id="sortable_list2">
							<li id="object1"></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="addItem_box">
		<input type="button" class="addItem" value="나의 코스목록에 추가">
		<div class="backBtn">
			<a href="${pageContext.request.contextPath}/myPage">뒤로가기</a>
		</div>
	</div>
	</form>
	</main>
	<jsp:include page="footer/footer_white.jsp" />
	<script>
		
	</script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
</body>
</html>