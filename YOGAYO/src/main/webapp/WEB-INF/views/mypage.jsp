<<<<<<< HEAD
<%@page import="org.springframework.web.context.ContextLoader"%> <%@page
import="org.springframework.web.context.WebApplicationContext"%> <%@ page language="java"
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
>>>>>>> master
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | MY PAGE</title>
<<<<<<< HEAD
    <link
      rel="stylesheet"
      type="text/css"
      href="${pageContext.request.contextPath}/resources/css/mypage.css"
    />
=======
     <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/mypage.css">
>>>>>>> master
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"
    ></script>
<<<<<<< HEAD
    <link
      href="https://fonts.googleapis.com/css2?family=Gothic+A1:wght@300&display=swap"
      rel="stylesheet"
    />
=======
>>>>>>> master
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
    ></script>
<<<<<<< HEAD
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/myPage.js"></script>
    <script language="JavaScript"
      src="${pageContext.request.contextPath}/resources/js/graph.js"></script>
    <script>
      var data1 = ${count1week};
      var data2 = ${count2week};
      var data3 = ${count3week};
      var data4 = ${count4week};
    </script>
=======
    <script></script>
>>>>>>> master
  </head>
  <body>
    <header></header>
    <main>
<<<<<<< HEAD
      <div id="content">
        <div class="content_1">
          <div class="head_1">
            <img class="u_img" src="${pageContext.request.contextPath}/${user.img}" alt="사진 없음" />
            <div class="welcome_txt">This is your Records</div>
          </div>
          <div class="main_1">
            <div class="info">
              <div class="u_name">Welcome ${user.id}</div>
              <div class="date1">${thisday}</div>
              <div class="date2">
                <div class="date2_day">${thisdate}</div>
                <div class="date_month">${thismonth }</div>
              </div>
            </div>
            <div class="weight">
              <div class="cWeight_title">현재몸무게</div>
              <div class="cWeight_value">${cWeight}kg</div>
              <div class="tWeight_title">이번달 감량 몸무게</div>
              <div class="tWeight_value">${tWeight}kg</div>
              <div class="lWeight_title">지난달 감량 몸무게</div>
              <div class="lWeight_value">${lWeight}kg</div>
              <div class="btns">
                <div class="btn1">정보수정</div>
                <div class="btn2">코스추가</div>
              </div>
            </div>
          </div>
        </div>
        <div class="content_2">
          <div class="head_2">
            <div class="feed1_head">Feed1</div>
            <div class="feed2_head">Feed2</div>
            <div class="feed3_head">Feed3</div>
          </div>
          <div class="main_2">
            <div class="feed1">
            	<c:forEach var="f" items="${feList }">
	              <div class="feed1_content">
	                <div class="feed1_info">
	                  <div class="feed1_date">${f.regDate }</div>
	                  <div class="feed1_title">${f.crsNum } 코스</div>
	                  <div class="feed1_text">${f.context }</div>
	                  <div class="feed1_crsName">만족 : ${f.sLevel}</div>
	                  <div class="feed1_stat">난이도 : ${f.dLevel }</div>
	                </div>
	                <img class="feed1_img" src="${pageContext.request.contextPath}${f.uImg1}" alt="사진 없음" />
	              </div>
	              <div class="hr"></div>
              	</c:forEach>
            </div>
            <div class="feed2">
             <c:forEach var="c" items="${crsList }">
              <div class="feed2_content">
                <div class="feed2_info">
                  <div class="feed2_title">${c.title }</div>
                  <div class="feed2_text">${c.dscrt }</div>
                  <div class="feed2_need">need : ${c.material }</div>
                </div>
                <img src="${pageContext.request.contextPath}${c.imgPath}" alt="사진없음" class="feed2_img" />
              </div>
              <div class="hr"></div>
             </c:forEach>
            </div>
            <div class="feed3">
              <div class="feed3_content">
                <div class="feed3_title">Course good for health</div>
                <img src="face.jpg" alt="사진없음" class="feed3_img" />
              </div>
              <div class="hr"></div>
              <div class="feed3_content">
                <div class="feed3_title">Course good for health</div>
                <img src="face.jpg" alt="사진없음" class="feed3_img" />
              </div>
              <div class="hr"></div>
              <div class="feed3_content">
                <div class="feed3_title">Course good for health</div>
                <img src="face.jpg" alt="사진없음" class="feed3_img" />
              </div>
              <div class="hr"></div>
              <div class="feed3_content">
                <div class="feed3_title">Course good for health</div>
                <img src="face.jpg" alt="사진없음" class="feed3_img" />
              </div>
              <div class="hr"></div>
              <div class="feed3_content">
                <div class="feed3_title">Course good for health</div>
                <img src="face.jpg" alt="사진없음" class="feed3_img" />
              </div>
              <div class="hr"></div>
            </div>
          </div>
        </div>
        <div class="content_3">
          <div class="head_3"></div>
          <div class="main_3">
            <div class="main3_title">STATISTICS</div>
            <div class="stat1">
              <div class="stat1_title">피드 올린 횟수</div>
              <canvas id="stat1_data"></canvas>
            </div>
            <div class="stat2">
              <div class="stat2_title">피드 올린 횟수</div>
              <canvas id="stat2_data"></canvas>
=======
      <div class="content">
        <div class="content_top">
          <div class="content_top_welcome">
            <div class="content_top_faceImg"></div>
            <div class="content_top_welcomeTxt">${user.id} 님의 기록</div>
          </div>
          <div class="content_top_btn">
            <button class="content_top_btn_edit" onclick="location.href='update'">정보 수정</button>
            <button class="content_top_btn_addCrs"><a href="${pageContext.request.contextPath}/course_playlist">코스 추가</a></button>
          </div>
        </div>
        <div class="content_front">
          <div class="front_first">
            <div class="front_first_title">현재 몸무게</div>
            <div class="front_first_value">
              <div class="first_value1"> kg</div>
              <div class="first_value2"></div>
            </div>
          </div>
          <div class="front_second">
            <div class="front_second_title">이번달 감량 몸무게</div>
            <div class="front_second_value">
              <div class="second_value1">${tWeight} kg</div>
              <div class="second_value2"></div>
            </div>
          </div>
          <div class="front_third">
            <div class="front_third_title">지난 달 감량 몸무게</div>
            <div class="front_third_value">
              <div class="third_value1">${lWeight} kg</div>
              <div class="third_value2"></div>
            </div>
          </div>
        </div>
        <div class="content_middle">
          <div class="statistics">
            <div class="statistics_1">
              <div class="statistics_title">내 기록 모아보기</div>
              <div class="graph">
                <ul class="months">
                  <li>Jan</li>
                  <li>Feb</li>
                  <li>Mar</li>
                  <li>Apr</li>
                </ul>
                <ul class="days">
                  <li>Sun</li>
                  <li>Mon</li>
                  <li>Tue</li>
                  <li>Wed</li>
                  <li>Thu</li>
                  <li>Fri</li>
                  <li>Sat</li>
                </ul>
                <ul class="squares">
                  <!-- added via javascript -->
                </ul>
              </div>
            </div>
            <div class="statistics_2">
              <div class="stat2_title">stat2</div>
              <canvas id="stat2"></canvas>
            </div>
            <div class="statistics_3">
              <div class="stat3_title">stat3</div>
              <canvas id="stat3"></canvas>
            </div>
            <div class="statistics_4">
              <div class="stat4_title">stat4</div>
              <canvas id="stat4"></canvas>
            </div>
          </div>
        </div>
        <div class="content_bottom">
          <div class="content_bottom_rcdlist need_scrollbar">
            <div class="content_bottom_myRcds">
              <div class="content_bottom_myRcds_title">내 요가 후기</div>
              <div class="content_bottom_myRcds_wrap">
                <div class="content_bottom_myRcds_info">
                  <div class="content_bottom_myRcds_top">
                    <div class="myRcds_time">
                      <span class="myRcds_time_txt">오늘 요가 시간:</span>
                      <div class="myRcds_time_usrtime"></div>
                    </div>
                    <div class="myRcds_crs">
                      <span class="myRcds_crs_txt">진행 코스:</span>
                      <div class="myRcds_crs_crsname">${crsnum }</div>
                    </div>
                    <div class="myRcds_stf">
                      <span class="myRcds_stf_txt">나의 만족도:</span>
                      <div class="myRcds_stf_usrstf">${slevel }</div>
                    </div>
                  </div>
                  <div class="content_bottom_myRcds_middle">
                    <div class="middle_txt">${context}<br /></div>
                  </div>
                  <div class="content_bottom_myRcds_bottom">
                    <div class="bottom_time">${regdate }</div>
                  </div>
                </div>
                <div class="content_bottom_myRcds_img"></div>
              </div>
              <div class="content_bottom_myRcds_wrap">
                <div class="content_bottom_myRcds_info">
                  <div class="content_bottom_myRcds_top">
                    <div class="myRcds_time">
                      <span class="myRcds_time_txt">오늘 요가 시간</span>
                      <div class="myRcds_time_usrtime"></div>
                    </div>
                    <div class="myRcds_crs">
                      <span class="myRcds_crs_txt">진행 코스</span>
                      <div class="myRcds_crs_crsname">${crsnum }</div>
                    </div>
                    <div class="myRcds_stf">
                      <span class="myRcds_stf_txt">나의 만족도</span>
                      <div class="myRcds_stf_usrstf">${slevel }</div>
                    </div>
                  </div>
                  <div class="content_bottom_myRcds_middle">
                    <div class="middle_txt">${context }<br /></div>
                  </div>
                  <div class="content_bottom_myRcds_bottom">
                    <div class="bottom_time">${regdate }</div>
                  </div>
                </div>
                <div class="content_bottom_myRcds_img"></div>
              </div>
              <div class="content_bottom_myRcds_wrap">
                <div class="content_bottom_myRcds_info">
                  <div class="content_bottom_myRcds_top">
                    <div class="myRcds_time">
                      <span class="myRcds_time_txt">오늘 요가 시간</span>
                      <div class="myRcds_time_usrtime">| 32분</div>
                    </div>
                    <div class="myRcds_crs">
                      <span class="myRcds_crs_txt">진행 코스</span>
                      <div class="myRcds_crs_crsname">| A-2 코스</div>
                    </div>
                    <div class="myRcds_stf">
                      <span class="myRcds_stf_txt">나의 만족도</span>
                      <div class="myRcds_stf_usrstf">| 좋음</div>
                    </div>
                  </div>
                  <div class="content_bottom_myRcds_middle">
                    <div class="middle_txt">"나는 오늘 정말 만족한다..<br /></div>
                  </div>
                  <div class="content_bottom_myRcds_bottom">
                    <div class="bottom_time">2020년 8월 15일</div>
                  </div>
                </div>
                <div class="content_bottom_myRcds_img"></div>
              </div>
              <div class="content_bottom_myRcds_wrap">
                <div class="content_bottom_myRcds_info">
                  <div class="content_bottom_myRcds_top">
                    <div class="myRcds_time">
                      <span class="myRcds_time_txt">오늘 요가 시간</span>
                      <div class="myRcds_time_usrtime">| 32분</div>
                    </div>
                    <div class="myRcds_crs">
                      <span class="myRcds_crs_txt">진행 코스</span>
                      <div class="myRcds_crs_crsname">| A-2 코스</div>
                    </div>
                    <div class="myRcds_stf">
                      <span class="myRcds_stf_txt">나의 만족도</span>
                      <div class="myRcds_stf_usrstf">| 좋음</div>
                    </div>
                  </div>
                  <div class="content_bottom_myRcds_middle">
                    <div class="middle_txt">"나는 오늘 정말 만족한다..<br /></div>
                  </div>
                  <div class="content_bottom_myRcds_bottom">
                    <div class="bottom_time">2020년 8월 15일</div>
                  </div>
                </div>
                <div class="content_bottom_myRcds_img"></div>
              </div>
            </div>
          </div>
          <div class="content_bottom_myCrs need_scrollbar">
            <div class="myCrs_title">나만의 코스 리스트</div>
            <div class="myCrs_box">
              <div class="myCrs_top">
                <div class="myCrs_top_img"></div>
                <div class="myCrs_top_title">허리에 좋은 코스</div>
              </div>
              <div class="myCrs_bottom">
                <div class="myCrs_bottom_content">이 코스는 허리에 즈으으응ㅇ말 좋습니다</div>
              </div>
            </div>
            <div class="myCrs_box">
              <div class="myCrs_top">
                <div class="myCrs_top_img"></div>
                <div class="myCrs_top_title">허리에 좋은 코스</div>
              </div>
              <div class="myCrs_bottom">
                <div class="myCrs_bottom_content">이 코스는 허리에 즈으으응ㅇ말 좋습니다</div>
              </div>
            </div>
            <div class="myCrs_box">
              <div class="myCrs_top">
                <div class="myCrs_top_img"></div>
                <div class="myCrs_top_title">허리에 좋은 코스</div>
              </div>
              <div class="myCrs_bottom">
                <div class="myCrs_bottom_content">이 코스는 허리에 즈으으응ㅇ말 좋습니다</div>
              </div>
            </div>
            <div class="myCrs_box">
              <div class="myCrs_top">
                <div class="myCrs_top_img"></div>
                <div class="myCrs_top_title">허리에 좋은 코스</div>
              </div>
              <div class="myCrs_bottom">
                <div class="myCrs_bottom_content">이 코스는 허리에 즈으으응ㅇ말 좋습니다</div>
              </div>
            </div>
          </div>
          <div class="content_bottom_likes need_scrollbar">
            <div class="likes_title">좋아요한 코스 리스트</div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
            </div>
            <div class="likes_content">
              <div class="likes_content_img"></div>
              <span class="likes_content_txt">요가 코스1</span>
>>>>>>> master
            </div>
          </div>
        </div>
      </div>
    </main>
    <footer></footer>
<<<<<<< HEAD
    
  </body>
</html>
=======
    	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/graph.js"></script>
		<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/square.js"></script>
  </body>
</html>
    
>>>>>>> master
