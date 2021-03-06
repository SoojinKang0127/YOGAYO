<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | COURSE</title>
    <script
      src="https://kit.fontawesome.com/54919de5bd.js"
      crossorigin="anonymous"
    ></script>
    <script src="http://code.jquery.com/jquery.js"></script>
        <script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/course-detail.js"></script>
     <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/course-detail.css">
  </head>
  <body>
    <header></header>
    <main>
      <div class="course_detail-bg">
        <div class="course_detail-first">
          <div class="section">
            <div class="to_course">
              <a href="./course_page.html">새로운 코스 모두 보기</a>
            </div>
            <div class="like">
              <div class="like_icon"><i class="far fa-heart"></i></div>
              <div class="like_btn">찜하기</div>
            </div>
          </div>
        </div>
        <div class="course_detail-second">
          <div class="section">
            <div class="course_detail-img_section">
              <img src="${pageContext.request.contextPath}/resources/image/course/course_detail.jpg" alt="course_detail" />
              <img src="${pageContext.request.contextPath}/resources/image/course/course_detail.jpg" alt="course_detail" />
              <img src="${pageContext.request.contextPath}/resources/image/course/course_detail.jpg" alt="course_detail" />
            </div>
          </div>
        </div>
        <div class="course_detail-third">
          <div class="section">
            <div class="title_section">
              <div class="title">
                <p>마음을 다스리는 명상</p>
                <div class="course_detail-star_rating">
                  <span><i class="fas fa-star"></i></span>
                  <span id="rating">4.97</span>
                  <span>(206)</span>
                  <span>·</span>
                  <span>전예슬</span>
                </div>
              </div>
            </div>
            <div class="course_detail-info_section">
              <div class="course_detail-info_title_section">
                <div class="course_detail-info_title">
                  전예슬님이 구성한 명상 코스
                </div>
                <img src="./images/profile_face.png" alt="profile" />
              </div>
              <div class="course_detail-info_icon_section">
                <div class="first_line">
                  <div class="course_detail-info_time">
                    <i class="far fa-clock"></i> 30min
                  </div>
                  <div class="course_detail-why">
                    <i class="fas fa-child"></i>정신 건강을 위한 명상
                  </div>
                </div>
                <div class="second_line">
                  <div class="course_detail-users">
                    <i class="fas fa-users"></i> 50명
                  </div>
                  <div class="course_detail-difficulty">
                    <i class="far fa-smile-wink"></i>쉬움
                  </div>
                </div>
              </div>
              <div class="course_detail-coures_explain_section">
                <div class="course_detail-coures_explain_title">
                  프로그램
                </div>
                <div class="course_detail-course_explain">
                  <p>
                    마음챙김(Sati) 명상은 불교의 전통적 수행방법의 하나이자,
                    그것을 현대 심리학/정신의학과 결합해서 만든 치료법이다.
                    서구에서 유행하는 방법이기도 하며, 많은 정신과
                    의사/상담사들에 의해서도 환자/내담자들에게 추천되는
                    방법이기도 하다. 마음챙김 명상은 종교적 요소를 현대심리학과
                    결합해서 의미 있는 결과를 낳을 수 있다는 것을 증명한
                    사례이기도 하고, 아직 초창기인 목회상담에 자극을 주고 있기도
                    한다.
                  </p>
                </div>
              </div>
              <div class="coures_detail-coures_materials_section">
                <div class="coures_detail-coures_materials_title">
                  준비물
                </div>
                <div class="coures_detail-coures_materials_list">
                  <ul>
                    <li><i class="far fa-check-circle"></i>요가 매트</li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
          <div class="course_detail-mini_view_section">
            <div class="fake_mini_view"></div>
            <div class="course_detail-mini_view">
              <div class="title">코스 개요</div>
              <div class="poses">
                <div class="pose">
                  <div class="pose_title">산 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">나무 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">전사 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">개 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">프랭크</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">코브라 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">고양이 자세</div>
                  <div class="time">45:00</div>
                </div>
                <div class="pose">
                  <div class="pose_title">송장 자세</div>
                  <div class="time">45:00</div>
                </div>
              </div>
              <div class="btn">
                <div class="time">총 10분</div>
                <div class="start_btn">
                  <button id="btn_to_start">시작하기</button>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="course_detail-fourth_section">
          <div class="course_detail-review_section">
            <div class="course_detail-rating">
              <span><i class="fas fa-star"></i></span>
              <span>4.97(206)</span>
              <span>(후기 206개)</span>
            </div>
            <div class="course_detail-review_sec">
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      다른 게스트 없이 가족이나 친구들과만 체험을 즐기고
                      싶으세요? Fragiskos님은 최대 100명까지의 일행에게 시작
                      요금 ₩174,403에 프라이빗 예약을 제공합니다.
                    </span>
                  </div>
                </div>
              </div>
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      수진 언니 결혼 축하해요 제가 춤 춰 드릴게요. 재호님이랑
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="course_detail-review_sec">
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      The host really let the team interact to figure everything
                      out, chiming in when we needed the help. It felt as close
                      to an in-person escape room as we could really get
                      virtually. Def recommend!
                    </span>
                  </div>
                </div>
              </div>
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      The host really let the team interact to figure everything
                      out, chiming in when we needed the help. It felt as close
                      to an in-person escape room as we could really get
                      virtually. Def recommend!
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="course_detail-review_sec">
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      The host really let the team interact to figure everything
                      out, chiming in when we needed the help. It felt as close
                      to an in-person escape room as we could really get
                      virtually. Def recommend!
                    </span>
                  </div>
                </div>
              </div>
              <div class="course_detail-review">
                <div class="course_detail-review_container">
                  <div class="course_detail-review_profile_img">
                    <img src="${pageContext.request.contextPath}/resources/image/course/profile_face.png" alt="profile" />
                    <div class="course_detail-review_user_info">
                      <div class="course_detail-review_user_name">
                        Minh
                      </div>
                      <div class="course_detail-review_date">2020년8월</div>
                    </div>
                  </div>
                  <div class="course_detail-review_box">
                    <span>
                      The host really let the team interact to figure everything
                      out, chiming in when we needed the help. It felt as close
                      to an in-person escape room as we could really get
                      virtually. Def recommend!
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="more_review_btn">
              <button id="more_review_btn">후기 206개 모두 보기</button>
            </div>
          </div>
        </div>
      </div>
      <footer class="footer">
        <div class="footer_section">
          <div class="main-footer_right">
            <i class="far fa-copyright"></i> 2020 Team4,Inc.All rights reserved
            <div class="footer_right_sub">
              <span>개인정보 처리방침</span>
              <span>·</span>
              <span>이용약관</span>
              <span>·</span>
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
    </main>
  </body>
</html>
    