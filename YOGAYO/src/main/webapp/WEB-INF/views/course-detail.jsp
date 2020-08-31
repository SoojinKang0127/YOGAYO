<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <script
      language="JavaScript"
      src="${pageContext.request.contextPath}/resources/js/course-detail.js"
    ></script>
    <link
      rel="stylesheet"
      type="text/css"
      href="${pageContext.request.contextPath}/resources/css/course-detail.css"
    />
  </head>
  <body>
    <header></header>
    <main>
      <div class="course_detail-bg">
      
        <div class="course_detail-first">
          <div class="section">
            <div class="to_course">
              <a href="${pageContext.request.contextPath}/course-page"
                >새로운 코스 모두 보기</a
              >
            </div>
            <div class="like">
              <div class="like_icon">
                <i id="heart" class="far fa-heart"></i>
              </div>
              <div class="like_btn">찜하기</div>
            </div>
          </div>
        </div>
        
        <div class="course_detail-second">
          <div class="section">
            <div class="course_detail-img_section">
              <img src="${coursePoses.img1}" alt="course_detail" />
              <img src="${coursePoses.img2}" alt="course_detail" />
              <img src="${coursePoses.img3}" alt="course_detail" />
            </div>
          </div>
        </div>

        <div class="course_detail-third">
          <div class="section">
            <div class="title_section">
              <div class="title">
                <p>${course.title}</p>
                <div class="course_detail-star_rating">
                  <span><i class="fas fa-star"></i></span>
                  <span id="rating">4.97</span> <span>(206)</span>
                  <span>·</span> <span>(만든사람)</span>
                </div>
              </div>
            </div>
            <div class="course_detail-info_section">
              <div class="course_detail-info_title_section">
                <div class="course_detail-info_title">
                  (만든사람)님이구성한 명상 코스
                </div>
                <img
                  src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
                  alt="profile"
                />
              </div>
              <div class="course_detail-info_icon_section">
                <div class="first_line">
                  <div class="course_detail-info_time">
                    <i class="far fa-clock"></i> ${totalMin}min
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
                <div class="course_detail-coures_explain_title">프로그램</div>
                <div class="course_detail-course_explain">
                  <p>${course.dscrt}</p>
                </div>
              </div>
              <div class="coures_detail-coures_materials_section">
                <div class="coures_detail-coures_materials_title">준비물</div>
                <div class="coures_detail-coures_materials_list">
                  <ul>
                    <li>
                      <i class="far fa-check-circle"></i> ${course.material}
                    </li>
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
                  <div class="pose_title">${coursePoses.pose1}</div>
                  <div class="time">${mins[0]}:${seconds[0]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose2}</div>
                  <div class="time">${mins[1]}:${seconds[1]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose3}</div>
                  <div class="time">${mins[2]}:${seconds[2]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose4}</div>
                  <div class="time">${mins[3]}:${seconds[3]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose5}</div>
                  <div class="time">${mins[4]}:${seconds[4]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose6}</div>
                  <div class="time">${mins[5]}:${seconds[5]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose7}</div>
                  <div class="time">${mins[6]}:${seconds[6]}</div>
                </div>
                <div class="pose">
                  <div class="pose_title">${coursePoses.pose8}</div>
                  <div class="time">${mins[7]}:${seconds[7]}</div>
                </div>
              </div>
              <div class="btn">
                <div class="time">총 ${totalMin}분 ${totalSec} 초</div>
                <div class="start_btn">
                  <a href="${pageContext.request.contextPath}/course_playlist">
                    <button id="btn_to_start">시작하기</button>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="course_detail-fourth_section">
          <!-- black_line -->
          <div class="course_detail-review_section">
          
            <div class="review_text_box">
              <div class="user_img">
                <img
                  src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
                  alt="profile"
                />
              </div>
              
            <!--   <form  class="form" >  -->
	              <div class="text_box">
	                <div id="full-stars-example-two">
					    <div class="rating-group">
					        <input disabled checked class="rating__input rating__input--none" name="rating3" id="rating3-none" value="0" type="radio">
					        <label aria-label="1 star" class="rating__label" for="rating3-1"><i class="rating__icon rating__icon--star fa fa-star"></i></label>
					        <input class="rating__input" name="rating3" id="rating3-1" value="1" type="radio">
					        <label aria-label="2 stars" class="rating__label" for="rating3-2"><i class="rating__icon rating__icon--star fa fa-star"></i></label>
					        <input class="rating__input" name="rating3" id="rating3-2" value="2" type="radio">
					        <label aria-label="3 stars" class="rating__label" for="rating3-3"><i class="rating__icon rating__icon--star fa fa-star"></i></label>
					        <input class="rating__input" name="rating3" id="rating3-3" value="3" type="radio">
					        <label aria-label="4 stars" class="rating__label" for="rating3-4"><i class="rating__icon rating__icon--star fa fa-star"></i></label>
					        <input class="rating__input" name="rating3" id="rating3-4" value="4" type="radio">
					        <label aria-label="5 stars" class="rating__label" for="rating3-5"><i class="rating__icon rating__icon--star fa fa-star"></i></label>
					        <input class="rating__input" name="rating3" id="rating3-5" value="5" type="radio">
					    </div>
					</div>
	                <input type="text" id="text_box" name="comment" placeholder="댓글 달기..." />
	                <input type="hidden" name="uNum" value="${user.uNum}"/>
	                <input type="hidden" name="crsNum" value="${crsNum}"/>
	                <input type="hidden" id='rating3' name="rating3" value="${rate}"/>
	                
	               
	              </div>
	               <!-- </form>  -->
	              <div class="review_btn">
	                <button id="review_btn">게시</button>
	              </div>
	            
	              <script>
	               
	             $('#review_btn').click(function(){
	            	 console.log('review 눌림')
	            	
	            	 var request= new XMLHttpRequest();
		                var uNum=encodeURIComponent("${user.uNum}");
		                var crsNum=encodeURIComponent("${crsNum}");
		                var rating3=encodeURIComponent($('input[name="rating3"]:checked').val());
		                var comment=encodeURIComponent(document.getElementById('text_box').value);
		                console.log(uNum)
		                console.log(crsNum)
		                console.log(rating3)
		                console.log(comment)
		                request.open("POST","./course-detail-upload-comment?uNum="+uNum+"&crsNum="+crsNum+"&rating="+rating3+"&comment="+comment,true)
		             	request.onreadystatechange=function(){
		                	
		                }
		                request.send(null)   
	             })
	               
            </script>
            </div><!-- end of review text box -->
            
          <!-- 댓글 시작  -->
            <div class="new_review">
              <div class="course_detail-rating">
                <span><i class="fas fa-star"></i></span> <span>4.97(206)</span>
                <span>(후기 206개)</span>
              </div>
              <c:forEach var="i" items="${commentList}" >
              <div class="course_detail-review_profile_img">
                <img
                  src="${pageContext.request.contextPath}/resources/image/course/profile_face.png"
                  alt="profile"
                />
                
                <div class="course_detail-review_user_info">
	                <div class="user_review">
	                  <div class="course_detail-review_user_name">${i.uNum}</div>
	                  <div class="course_detail-review_date">${i.regDate}</div>
	                  <div class="course_detail-review_box">
	                    <span> ${i.context}</span>
	                  </div>
	                </div>
	                <div class="show_me_the_comment">
	                  <i id="show_me_the_comment" class="fas fa-caret-down"></i>
	                </div>
	                <div class="hidden_comment">
	               <form action="addReview">
	                   <div class="review_review">
	                    <input type="text" id="comment_text" name="review" placeholder="답글.." />
		                <input type="hidden" name="uNum" value="${i.uNum}"/>
		                <input type="hidden" name="parent" value="${i.cmtNum}"/>
		                <input type="hidden" name="crsNum" value="${crsNum}"/>
		                <input type="submit" id="comment_btn" value="답글"/>
	                  </div>
	               </form>
	            
	              <c:forEach var="j" items="${reviewList}">
	                <c:if test="${i.cmtNum eq j.parent}">
						<div class="comments">
	                    <!-- 답글들 -->
	                    <img alt="comment_user_img" src="${pageContext.request.contextPath}/resources/image/course/profile_face.png">
	                    <div class="comments_box">
		                    <div class="comment_user_name">${j.uNum}</div>
		                    <div class="user_comment">${j.context}</div>
	                    </div>
	                  </div>
  
				   </c:if>
	                    </c:forEach>
	               </div>
	             
                </div>
                
              </div>
              </c:forEach>
              <!-- 댓글 끝 -->
              <div class="more_review_btn">
                <button id="more_review_btn">후기 206개 모두 보기</button>
              </div>
            </div>
            
          </div>
          <!-- black_line -->
        </div>
        
      </div>
      
      <footer class="footer">
        <div class="footer_section">
          <div class="main-footer_right">
            <i class="far fa-copyright"></i> 2020 Team4,Inc.All rights reserved
            <div class="footer_right_sub">
              <span>개인정보 처리방침</span> <span>·</span>
              <span>이용약관</span> <span>·</span>
              <span>사이트 맵 ${pageContext.request.contextPath}</span>
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
