<%@page import="org.springframework.web.context.ContextLoader"%> <%@page
import="org.springframework.web.context.WebApplicationContext"%> <%@ page language="java"
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | MY PAGE</title>
    <link
      rel="stylesheet"
      type="text/css"
      href="${pageContext.request.contextPath}/resources/css/mypage.css"
    />
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"
    ></script>
    <link
      href="https://fonts.googleapis.com/css2?family=Gothic+A1:wght@300&display=swap"
      rel="stylesheet"
    />
    <script
      type="text/javascript"
      src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
    ></script>
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
  </head>
  <body>
    <header></header>
    <main>
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
            </div>
          </div>
        </div>
      </div>
    </main>
    <footer></footer>
    
  </body>
</html>
