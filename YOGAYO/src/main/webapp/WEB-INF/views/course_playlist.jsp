<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | COURSEPLAYLIST</title>
    <script
      type="text/javascript"
      src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"
    ></script>
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
            <li class="s1_wrapper">
              <div class="course_title">
                <input type="text" class="textbox" placeholder="코스의 제목을 입력하세요" />
              </div>
              <div class="course_search">
                <input type="text" id="searching_box" class="textbox" placeholder="원하는 포즈명을 입력하세요" />
              </div>
              
              <div class="course_add">
                <input type="text" class="textbox" placeholder="포즈 추가" />


              </div>
              <div class="pose_info_box">
                <div class="pose_info_gap">
                  <div class="pose_info_wrapper">
                    <ul id="sortable_list1" class="connectedSortable">
                      
                      
                      
                      
                      <%-- <li class="pose_content_box">
                        <div class="pose_picture">
                          <img
                            src="https://i.pinimg.com/originals/fc/15/2d/fc152dc03dc4e6df1aa6e1079dfa3804.jpg"
                            class="s1_img"
                          />
                        </div>
                        <div class="pose_textarea">
                          <div class="pose_title">THIS IS POSE 1</div>
                          <div class="pose_content">
                          </div>
                          <div class="info_box">
                            <div class="pose_time">
                              <i class="far fa-clock" style="font-size: 24px;"></i>
                              <p class="time">30초</p>
                            </div>
                            <div class="underline"></div>
                            <div class="pose_tag">
                              <i class="fas fa-hashtag" style="font-size: 24px;"></i>
                              <p class="pose_tag_content">허리</p>
                            </div>
                            <div class="underline"></div>
                            <div class="difficulty">
                              <i class="fas fa-universal-access" style="font-size: 24px;"></i>
                              <p class="difficulty_content">상</p>
                            </div>
                            <div class="underline"></div>
                            <input type="button" value="추가하기" class="add_button" />
                          </div>
                        </div>
                      </li> --%>



                    </ul>
                  </div>
                  <!--s1_wrapper end()-->
                </div>
              </div>
              <!--end of pose_info_box()-->
            </li>
            <!--s1_wrapper()-->
          </div>
          <!-- <div class="add_btn_box">
                                                            <a href="#" class="add_pose">추가하기</a>
                                                        </div> -->
        </div>

        <div id="s2_container">
          <div class="s2_title">선택 된 포즈 리스트</div>
          <div class="s2_gap">
            <li class="s2_wrapper">
              <div class="list_box">
                <ul id="sortable_list2" class="connectedSortable">
                  <div id="object1">obje1</div>
                </ul>
              </div>
              <div class="button_box">
                <input type="button" class="addItem" value="추가" onclick="createItem();" />
                <!-- <input type="button" class="submitItem" value="제출" onclick="submitItem();" /> -->
              </div>
            </li>
          </div>
        </div>
      </div>
      <!--mypage container-->
    </main>
  </body>
</html>