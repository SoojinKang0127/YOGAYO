<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | MY PAGE</title>
     <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/mypage.css">
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"
    ></script>
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
    ></script>
    <script></script>
  </head>
  <body>
    <header></header>
    <main>
      <div class="content">
        <div class="content_top">
          <div class="content_top_welcome">
            <div class="content_top_faceImg"></div>
            <div class="content_top_welcomeTxt">${user.name} My Records</div>
          </div>
          <div class="content_top_btn">
            <button class="content_top_btn_edit">정보 수정</button>
            <button class="content_top_btn_addCrs">코스 추가</button>
          </div>
        </div>
        <div class="content_front">
          <div class="front_first">
            <div class="front_first_title">총 감량 몸무게</div>
            <div class="front_first_value">
              <div class="first_value1">30.5kg</div>
              <div class="first_value2">+5.5kg</div>
            </div>
          </div>
          <div class="front_second">
            <div class="front_second_title">이번달 감량 몸무게</div>
            <div class="front_second_value">
              <div class="second_value1">5.5kg</div>
              <div class="second_value2"></div>
            </div>
          </div>
          <div class="front_third">
            <div class="front_third_title">지난 달 대비 감량 몸무게</div>
            <div class="front_third_value">
              <div class="third_value1">2.5kg</div>
              <div class="third_value2">-4.5kg</div>
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
                      <div class="myRcds_time_usrtime">32분</div>
                    </div>
                    <div class="myRcds_crs">
                      <span class="myRcds_crs_txt">진행 코스:</span>
                      <div class="myRcds_crs_crsname">A-2 코스</div>
                    </div>
                    <div class="myRcds_stf">
                      <span class="myRcds_stf_txt">나의 만족도:</span>
                      <div class="myRcds_stf_usrstf">좋음</div>
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
            </div>
          </div>
        </div>
      </div>
    </main>
    <footer></footer>
    	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/graph.js"></script>
		<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/square.js"></script>
  </body>
</html>
    