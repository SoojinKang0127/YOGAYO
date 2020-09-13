<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>YOGAYO | COURSEPLAYLIST</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script language=JavaScript
	src="${pageContext.request.contextPath}/resources/js/course_playlist.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/course_playlist.css">
</head>

<body>
	<header></header>
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
								<select name="material" id="material">
									<option value="요가매트">요가 매트</option>
								</select>

								<div class="course_search">
									<input type="text" id="searching_box" class="search"
										placeholder="원하는 포즈명을 검색해보세요">
								</div>
								<div class="course_keyword">
									<input type="text" class="keyword_box" name="keywordBox" placeholder="키우드를 입력하세">
								</div>
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
							<p class="s2_title">선택 된 포즈 리스트</p>
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
		<input type="button" class="addItem" value="나의 코스목록에 추가">
		</form>
	</main>
	<footer> </footer>
<script>

</script>
</body>
</html>