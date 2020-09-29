<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
   <meta charset="UTF-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>YOGAYO | COURSE</title>
   <script src="https://kit.fontawesome.com/54919de5bd.js" crossorigin="anonymous"></script>
   <script src="http://code.jquery.com/jquery.js"></script>
   <script language="JavaScript" src="${pageContext.request.contextPath}/resources/js/course-detail.js"></script>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/course-detail.css"
      media="all and (min-width:600px) and (max-width:2000px)" />
   <link rel="stylesheet" type="text/css"
      href="${pageContext.request.contextPath}/resources/css/course-detail_mobile.css"
      media="all and (min-width:300px) and (max-width:599px)">
</head>

<body>
   <jsp:include page="header/header_black.jsp" />
   <main>
      <div class="course_detail-bg">
         <div class="course_detail-first">
            <div class="section"></div>
         </div>
         <div class="course_detail-second">
            <div class="section">
               <div class="course_detail-img_section">
                  <div class="img_wrapper"><img src="${coursePoses.img1}" alt="course_detail" /></div>
                  <div class="img_wrapper"><img src="${coursePoses.img2}" alt="course_detail" /></div>
                  <div class="img_wrapper"><img src="${coursePoses.img3}" alt="course_detail" /></div>
               </div>
            </div>
         </div>

         <div class="course_detail-third">
            <div class="section">
               <div class="title_section">
                  <div class="title">
                     <p>${course.title}</p>
                     <div class="course_detail-star_rating">
                        <span><i class="fas fa-star"></i></span> <span id="rating"></span>
                        <span id="cmc"></span> <span>·</span> <span>${makerInfo.name}</span>
                     </div>
                  </div>
                  <div class="like">
                     <div class="like_icon">
                        <i id="heart" class="${like}"></i>
                     </div>
                     <div class="like_btn"></div>
                  </div>
               </div>

               <div class="course_detail-info_section">
                  <div class="course_detail-info_title_section">
                     <img src="${pageContext.request.contextPath}/${makerInfo.img}" alt="profile" />
                     <div class="course_detail-info_title"> ${makerInfo.name} 님의 코스</div>
                  </div>
                  <div class="course_detail-info_icon_section">
                     <div class="first_line">
                        <div class="course_detail-info_time">
                           <i class="fas fa-stopwatch"></i><span>${totalMin}분</span>
                        </div>
                        <div class="course_detail-difficulty">
                           <i class="fas fa-certificate"></i><span>${difficulty}</span>
                        </div>
                     </div>
                     <div class="second_line">
                        <div class="course_detail-users">
                           <i class="fas fa-users"></i> <span>${userCount}명</span>
                        </div>
                        <div class="course_detail-tags">
                           <i class="fab fa-slack-hash"></i><div class="key"><span>${keyword}</span></div>
                        </div>
                     </div>
                  </div>
                  <div class="course_detail-coures_explain_section">
                     <div class="course_detail-coures_explain_title">프로그램 설명</div>
                     <div class="course_detail-course_explain">
                        <p>${course.dscrt}</p>
                     </div>
                  </div>
                  <div class="coures_detail-coures_materials_section">
                     <div class="coures_detail-coures_materials_title">준비물</div>
                     <div class="coures_detail-coures_materials_list">
                        <ul>
                           <li><i class="far fa-check-circle"></i> ${course.material}</li>
                        </ul>
                     </div>
                  </div>
               </div>
            </div>
            <div class="course_detail-mini_view_section">
               <div class="fake_mini_view"></div>
               <div class="course_detail-mini_view">
                  <div class="title">코 스</div>
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
                        <a href="${pageContext.request.contextPath}/player?course=${crsNum }">
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
                     <img src="${pageContext.request.contextPath}/${user.img}" alt="profile" />
                  </div>

                  <!--   <form  class="form" >  -->

                  <div class="text_box">
                     <div id="full-stars-example-two">
                        <div class="rating-group">
                           <input disabled checked class="rating__input rating__input--none" name="rating3"
                              id="rating3-none" value="0" type="radio" /> <label aria-label="1 star"
                              class="rating__label" for="rating3-1">
                              <i class="rating__icon rating__icon--star fa fa-star"></i>
                           </label> <input class="rating__input" name="rating3" id="rating3-1" value="1"
                              type="radio" /> <label aria-label="2 stars" class="rating__label"
                              for="rating3-2"> <i class="rating__icon rating__icon--star fa fa-star"></i>
                           </label> <input class="rating__input" name="rating3" id="rating3-2" value="2"
                              type="radio" /> <label aria-label="3 stars" class="rating__label"
                              for="rating3-3"> <i class="rating__icon rating__icon--star fa fa-star"></i>
                           </label> <input class="rating__input" name="rating3" id="rating3-3" value="3"
                              type="radio" /> <label aria-label="4 stars" class="rating__label"
                              for="rating3-4"> <i class="rating__icon rating__icon--star fa fa-star"></i>
                           </label> <input class="rating__input" name="rating3" id="rating3-4" value="4"
                              type="radio" /> <label aria-label="5 stars" class="rating__label"
                              for="rating3-5"> <i class="rating__icon rating__icon--star fa fa-star"></i>
                           </label> <input class="rating__input" name="rating3" id="rating3-5" value="5"
                              type="radio" />
                        </div>
                     </div>
                     <input type="text" id="text_box" name="comment" placeholder="댓글 달기..." /> <input
                        type="hidden" name="uNum" value="${user.uNum}" /> <input type="hidden" name="crsNum"
                        value="${crsNum}" /> <input type="hidden" id="rating3" name="rating3" value="${rate}" />
                  </div>
                  <div class="review_btn">
                     <button id="review_btn">게시</button>
                  </div>
                  <!-- </form>  -->
               </div>
               <!-- end of review text box -->

               <!-- 댓글 시작  -->
               <div class="new_review">
                  <div class="course_detail-rating">
                     <span><i class="fas fa-star"></i></span> <span>${cmavg}</span> <span>${cmc}</span>
                  </div>
                  <div class="ajax"></div>
                  <script>
                     var crsNum = encodeURIComponent("${crsNum}");
                     var uNum = encodeURIComponent("${user.uNum}");
                     $(document).ready(function () {
                        request.open("POST",
                           "./course-detail?"
                           + "&crsNum="
                           + crsNum, true);
                        request.onreadystatechange = refresh_comment;
                        request.send(null);
                     })
                     function ajax() {
                        var uNum = encodeURIComponent("${user.uNum}");
                        var crsNum = encodeURIComponent("${crsNum}");
                        var rating3 = encodeURIComponent($(
                           'input[name="rating3"]:checked').val());
                        var comment = encodeURIComponent(document
                           .getElementById("text_box").value);
                        request.open("POST",
                           "./course-detail-upload-comment?uNum="
                           + uNum + "&crsNum=" + crsNum
                           + "&rating=" + rating3
                           + "&comment=" + comment, true);
                        request.onreadystatechange = refresh_comment;
                        request.send(null);
                     }
                     var request = new XMLHttpRequest();
                     $("#review_btn").click(function () {
                        ajax();

                     });
                     var object = null;
                     //////////////////////////////
                     var comment_prefix = "";
                     var comment_suffix = "";
                     var review_string = "";
                     var fin_string = "";
                     function refresh_comment() {
                        if (request.readyState == 4 && request.status == 200) {
                           object = eval("(" + request.responseText + ")");
                           $('.ajax').html("");
                           var commentCount = 0;
                           if (Object.keys(object.comment).length < 6) {
                              commentCount = Object.keys(object.comment).length
                           } else {
                              commentCount = 6
                           }
                           for (var i = 0; i < commentCount; i++) {
                              comment_prefix = "";
                              comment_suffix = "";
                              review_string = "";
                              fin_string = "";
                              comment_prefix = comment_prefix
                                 + '<div class="course_detail-review_profile_img">'
                                 + '<div class="nothing">'
                                 + '<img src="${pageContext.request.contextPath}/'
                                 + object.comment[parseInt(i)].img
                                 + '" alt="profile"/>'
                                 + '</div>'
                                 + '<div class="course_detail-review_user_info">'
                                 + '<div class="user_review">'
                                 + '<div class="course_detail-review_user_name">'
                                 + object.comment[parseInt(i)].name
                                 + "</div>"
                                 + '<div class="course_detail-review_date">'
                                 + object.comment[parseInt(i)].regDate
                                 + "</div>"
                                 + '<div class="course_detail-review_box">'
                                 + "<span>"
                                 + object.comment[parseInt(i)].context
                                 + "</span>"
                                 + "</div></div>"
                                 + '<div class="show_me_the_comment">'
                                 + '<i id="show_me_the_comment" class="fas fa-caret-down show_me"></i>'
                                 + "</div>"
                                 + '<div class="hidden_comment">'
                                 + '<form action="addReview">'
                                 + '<div class="review_review">'
                                 + '<input type="text" id="comment_text" name="review" placeholder="답글.."/>'
                                 + '<input type="hidden" name="uNum" value='
                                 + object.comment[parseInt(i)].uNum
                                 + " />"
                                 + '<input type="hidden" name="parent" value='
                                 + object.comment[parseInt(i)].cmtNum
                                 + " />"
                                 + '<input type="hidden" name="crsNum" value='
                                 + object.comment[parseInt(i)].crsNum
                                 + " />"
                                 + '<input type="submit" id="comment_btn" value="답글"/></div></form>';
                              for (var j = 0; j < Object.keys(object.review).length; j++) {
                                 if (object.comment[parseInt(i)].cmtNum == object.review[parseInt(j)].parent) {
                                    review_string = review_string
                                       + '<div class="comments">'
                                       + '<img alt="comment_user_img" src="${pageContext.request.contextPath}/'
                                       + object.comment[parseInt(j)].img
                                       + '"/>'
                                       + '<div class="comments_box">'
                                       + '<div class="comment_user_name">'
                                       + object.review[parseInt(j)].name
                                       + '</div>'
                                       + '<div class="user_comment">'
                                       + object.review[parseInt(j)].context
                                       + '</div>' + "</div>"
                                       + "</div>";
                                 }
                              }

                              comment_suffix = comment_suffix
                                 + " </div></div></div>";
                              fin_string += comment_prefix
                                 + review_string
                                 + comment_suffix;
                              $('.ajax').append(fin_string)
                           }////////////////////////////////////
                           $('#rating').html(object.avg.toFixed(2) + "")
                           $('.course_detail-rating span:nth-child(2)').html(object.avg.toFixed(2))

                           $('#cmc').html();
                           $('.course_detail-rating span:nth-child(3)').html("(댓글" + rate_people_num + "개)")

                           $(".show_me").click(function () {
                              if ($(this).attr('class') == 'fas fa-caret-down') {
                                 $(this).attr('class', 'fas fa-caret-left');
                                 $(this).parent().next().show();
                              } else {
                                 $(this).attr('class', 'fas fa-caret-down');
                                 $(this).parent().next().hide();
                              }
                           });
                           $(".show_me").hover(function () {
                              $(this).css({
                                 color: "black"
                              });
                           }, function () {
                              $(this).css({
                                 color: "#C0C0C0"
                              });
                           });
                        }
                        $('.course_detail-rating span:nth-child(3)').html("(댓글" + commentCount + "개)")
                        $('#more_review_btn').html("후기 " + commentCount + "개 모두 보기")
                     }
                     rate_num = ${ cmavg }
                     rate_people_num = ${ cmc }
                     $('#rating').html(rate_num.toFixed(2) + "")
                     $('.course_detail-rating span:nth-child(2)').html(rate_num.toFixed(2))

                     $('#cmc').html("(" + rate_people_num + ")");
                     $('.course_detail-rating span:nth-child(3)').html("(댓글" + rate_people_num + "개)")

                     function more_comment() {
                        if (request.readyState == 4 && request.status == 200) {
                           object = eval("(" + request.responseText + ")");
                           $('.ajax').html("");
                           var commentCount = 0;
                           commentCount = Object.keys(object.comment).length
                           for (var i = 0; i < commentCount; i++) {
                              comment_prefix = "";
                              comment_suffix = "";
                              review_string = "";
                              fin_string = "";
                              comment_prefix = comment_prefix
                                 + '<div class="course_detail-review_profile_img">'
                                 + '<div class="nothing">'
                                 + '<img src="${pageContext.request.contextPath}/'
                                 + object.comment[parseInt(i)].img
                                 + '" alt="profile"/>'
                                 + '</div>'
                                 + '<div class="course_detail-review_user_info">'
                                 + '<div class="user_review">'
                                 + '<div class="course_detail-review_user_name">'
                                 + object.comment[parseInt(i)].name
                                 + "</div>"
                                 + '<div class="course_detail-review_date">'
                                 + object.comment[parseInt(i)].regDate
                                 + "</div>"
                                 + '<div class="course_detail-review_box">'
                                 + "<span>"
                                 + object.comment[parseInt(i)].context
                                 + "</span>"
                                 + "</div></div>"
                                 + '<div class="show_me_the_comment">'
                                 + '<i id="show_me_the_comment" class="fas fa-caret-down"></i>'
                                 + "</div>"
                                 + '<div class="hidden_comment">'
                                 + '<form action="addReview">'
                                 + '<div class="review_review">'
                                 + '<input type="text" id="comment_text" name="review" placeholder="답글.."/>'
                                 + '<input type="hidden" name="uNum" value='
                                 + object.comment[parseInt(i)].uNum
                                 + " />"
                                 + '<input type="hidden" name="parent" value='
                                 + object.comment[parseInt(i)].cmtNum
                                 + " />"
                                 + '<input type="hidden" name="crsNum" value='
                                 + object.comment[parseInt(i)].crsNum
                                 + " />"
                                 + '<input type="submit" id="comment_btn" value="답글"/></div></form>';
                              for (var j = 0; j < Object.keys(object.review).length; j++) {
                                 if (object.comment[parseInt(i)].cmtNum == object.review[parseInt(j)].parent) {
                                    review_string = review_string
                                       + '<div class="comments">'
                                       + '<img alt="comment_user_img" src="${pageContext.request.contextPath}/'
                                       + object.comment[parseInt(j)].img
                                       + '"/>'
                                       + '<div class="comments_box">'
                                       + '<div class="comment_user_name">'
                                       + object.review[parseInt(j)].name
                                       + '</div>'
                                       + '<div class="user_comment">'
                                       + object.review[parseInt(j)].context
                                       + '</div>' + "</div>"
                                       + "</div>";
                                 }
                              }

                              comment_suffix = comment_suffix
                                 + " </div></div></div>";
                              fin_string += comment_prefix
                                 + review_string
                                 + comment_suffix;
                              $('.ajax').append(fin_string)
                           }////////////////////////////////////
                           $('#rating').html(object.avg.toFixed(2) + "")
                           $('.course_detail-rating span:nth-child(2)').html(object.avg.toFixed(2))

                           $('#cmc').html();
                           $('.course_detail-rating span:nth-child(3)').html("(댓글" + rate_people_num + "개)")

                           $(".show_me").click(function () {
                              if ($(this).attr('class') == 'fas fa-caret-down') {
                                 $(this).attr('class', 'fas fa-caret-left');
                                 $(this).parent().next().show();
                              } else {
                                 $(this).attr('class', 'fas fa-caret-down');
                                 $(this).parent().next().hide();
                              }
                           });
                           $(".show_me").hover(function () {
                              $(this).css({
                                 color: "black"
                              });
                           }, function () {
                              $(this).css({
                                 color: "#C0C0C0"
                              });
                           });
                        }
                     }

                     $(document).on("click", '#more_review_btn', function () {
                        more_comment();
                        $('#more_review_btn').hide();
                     });

                  </script>
                  <!-- 댓글 끝 -->

                  <div class="more_review_btn">
                     <button id="more_review_btn">후기 ${cmc}개 모두 보기</button>
                  </div>
               </div>
            </div>
            <!-- black_line -->
         </div>
      </div>
      <jsp:include page="footer/footer_white.jsp" />
   </main>
</body>

</html>