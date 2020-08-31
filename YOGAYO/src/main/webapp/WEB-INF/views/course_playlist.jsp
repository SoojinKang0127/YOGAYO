<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
							<div class="course_title">
								<input type="text" class="textbox" placeholder="코스의 제목을 입력하세요" />
							</div>
							<div class="course_search">
								<input type="text" id="searching_box" class="textbox"
									placeholder="원하는 포즈명을 입력하세요" />
							</div>
							<div class="course_add">
								<input type="text" class="textbox" placeholder="포즈 추가" />
							</div>
						</div>

						<div class="pose_info_box">
							<ul id="sortable_list1" class="connectedSortable">



<%-- 
  				txt += "<li class='pose_content_box'>"
                txt += "<div class='pose_picture'>"
                txt += "<img src='" + img_path[r] + "' class='s1_img'>"
                txt += "</div>"
                txt += "<div class='pose_textarea'>"
                txt += "<div class='pose_title'>" + title[r] + "</div>"
                txt += "<div class='pose_content'>"
                txt += "</div>"
                txt += "<div class='info_box'>"
                txt += "<div class='pose_time'>"
                txt += "<i class='far fa-clock' style='font-size: 24px;'></i>"
                txt += "<p class='time'>" + time[r] + "초</p>"
                txt += "</div>"
                txt += "<div class='underline'></div>"
                txt += "<div class='pose_tag'>"
                txt += "<i class='fas fa-hashtag' style='font-size: 24px;'></i>"
                txt += "<p class='pose_tag_content'>허리</p>"
                txt += "</div>"
                txt += "<div class='underline'></div>"
                txt += "<div class='difficulty'>"
                txt += "<i class='fas fa-universal-access' style='font-size: 24px;'></i>"
                txt += "<p class='difficulty_content'>" + difficulty[r] + "단계</p>"
                txt += "</div>"
                txt += "<div class='underline'></div>"
                txt += "</div>"
                txt += "</div>"
                txt += "</li>" --%>


							</ul>
							<!--s1_wrapper end()-->
						</div>
						<!--end of pose_info_box()-->
					</div>
					<!--s1_wrapper()-->
				</div>
				<!-- <div class="add_btn_box">
                                                            <a href="#" class="add_pose">추가하기</a>
                                                        </div> -->
			</div>
			<div id="s2_container">
				<div class="s2_wrapper">
					<div class="s2_gap">
				<div class="s2_titlebox">
					<p class="s2_title">선택 된 포즈 리스트</p>
				</div>
						<div class="list_box">
							<ul id="sortable_list2" class="connectedSortable">
								<li id="object1"></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="button_box">
					<input type="button" class="addItem" value="나의 코스목록에 추가"
						>
					<!-- <input type="button" class="submitItem" value="제출" onclick="submitItem();" /> -->
				</div>
			</div>
		</div>
		<!--mypage container-->
	
	</main>
	</footer></footer>
</body>
</html>