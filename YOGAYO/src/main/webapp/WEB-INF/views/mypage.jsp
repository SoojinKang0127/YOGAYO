<%@page import="org.springframework.web.context.ContextLoader"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>YOGAYO | MY PAGE</title>
<link rel="stylesheet" type="text/css"   href="${pageContext.request.contextPath}/resources/css/mypage.css" media="all and (min-width:600px) and (max-width:2000px)">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage_mobile.css" media="all and (min-width:400px) and (max-width:599px)">
   <script type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"></script>
  <link href="https://fonts.googleapis.com/css2?family=Gothic+A1:wght@300&display=swap" rel="stylesheet" />
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/myPage.js"></script>
  <script language="JavaScript" src="${pageContext.request.contextPath}/resources/js/graph.js"></script>
  <script>
  
    var data1 = ${ count1week };
    var data2 = ${ count2week };
    var data3 = ${ count3week };
    var data4 = ${ count4week };
    var data5 = ${ count1week2 };
    var data6 = ${ count2week2 };
    var data7 = ${ count3week2 };
    var data8 = ${ count4week2 };
    
    

  </script>
</head>

<body>
  <jsp:include page="header/header_black.jsp" />
  <main>
    <div id="content">
      <div class="content_1">
        <div class="head_1">
          <img class="u_img" src="${pageContext.request.contextPath}/${user.img}" alt="사진 없음" />
          <div class="welcome_txt">This is your Records</div>
        </div>
        <div class="main_1">
          <div class="info">
            <div class="u_name">Welcome ${user.name}</div>
            <div class="date1">${thisday}</div>
            <div class="date2">
              <div class="date2_day">${thisdate}</div>
              <div class="date_month">${thismonth }</div>
            </div>
          </div>
          <div class="weight">
            <div class="w1">
              <div class="cWeight_title">현재몸무게</div>
              <div class="cWeight_value">${cWeight}kg</div>
            </div>
            <div class="w2">
              <div class="tWeight_title">이번달 감량 몸무게</div>
              <div class="tWeight_value">${tWeight}kg</div>
            </div>
            <div class="w3">
              <div class="lWeight_title">지난달 감량 몸무게</div>
              <div class="lWeight_value">${lWeight}kg</div>
            </div>
            <div class="btns">
              <a href="${pageContext.request.contextPath}/update">
                <div class="btn1" style='cursor:pointer;'>정보수정</div>
              </a>
              <a href="${pageContext.request.contextPath}/course_playlist">
                <div class="btn2" style='cursor:pointer;'>코스추가</div>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="content_2">
        <div class="head_2">
          <div class="feed1_head" style='cursor:pointer;'>Feed</div>
          <div class="feed2_head" style='cursor:pointer;'>My Course</div>
          <div class="feed3_head" style='cursor:pointer;'>Liked Course</div>
        </div>
        <div class="main_2">
          <div class="feed1">
            <c:forEach var="f" items="${feList }">
              <div class="feed1_content">
                <div class="feed1_info">
                  <div class="feed1_title">
                    <img class="feed1_uimg" alt="사진오류" src="${pageContext.request.contextPath}/${user.img}">
                    <div class="feed1_name">${user.name }</div>
                    <div class="feed1_date">${f.regDate }</div>
                  </div>
                  <div class="feed1_img_wrapper">
                    <img class="feed1_img" alt="사진 없음" src="${pageContext.request.contextPath}/${f.uImg1 }"></div>
                  <div class="feed1_context">${f.context }</div>
                  <div class="feed1_level">
                    <div class="feed1_sLevel">만족도 : ${f.sLevel }</div>
                    <div class="feed1_dLevel">난이도 : ${f.dLevel }</div>
                  </div>
                </div>
              </div>
            </c:forEach>
          </div>
          <div class="feed2">
            <c:forEach var="c" items="${crsList }">
              <a href="${pageContext.request.contextPath}/course-detail?crsNum=${c.crsNum}">
              <div class="feed2_content">
                <div class="feed2_info">
                  <div class="feed2_title">${c.title }</div>
                  <div class="feed2_img_wrapper"><img class="feed2_img" alt="사진없음"
                      src="${pageContext.request.contextPath}/${c.imgPath }"></div>
                  <div class="feed2_context">${c.dscrt }</div>
                  <div class="feed2_material">필요한 물품: ${c.material }</div>
                </div>
              </div>
            </a>
            </c:forEach>
          </div>
          <div class="feed3">
            <c:forEach var="l" items="${likeList }">
              <a href="${pageContext.request.contextPath}/course-detail?crsNum=${l.crsNum}">
                <div class="feed3_content">
                  <div class="feed3_info">
                    <div class="img_wrapper3"><img class="feed3_img" alt="사진없음"
                        src="${pageContext.request.contextPath}/${l.imgPath }"></div>
                    <div class="feed3_title">${l.title }</div>
                  </div>
                </div>
              </a>

            </c:forEach>
          </div>
        </div>
      </div>
      <div class="content_3">
        <div class="head_3"></div>
        <div class="main_3">
          <div class="main3_title">STATISTICS</div>
          <div class="stat1">
            <div class="stat1_title">나의 운동 횟수</div>
            <canvas id="stat1_data"></canvas>
          </div>
          <div class="stat2">
            <div class="stat2_title">최근 내 몸무게</div>
            <canvas id="stat2_data"></canvas>
          </div>
        </div>
      </div>
    </div>
  </main>
  <jsp:include page="footer/footer_white.jsp" />

</body>

</html>