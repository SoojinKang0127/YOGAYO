<%@page import="com.team4.vo.PoseVo"%>
<%@page import="com.team4.dao.pose.PoseServiceImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> YOGAYO | Library </title>
    <script src="https://kit.fontawesome.com/54919de5bd.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script language=JavaScript
	src="${pageContext.request.contextPath}/resources/js/dictionary.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dictionary.css" media="all and (min-width:600px) and (max-width:2000px)">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/dictionary_mobile.css" media="all and (min-width:300px) and (max-width:599px)">
</head>

<body>
   <jsp:include page="header/header_black.jsp" />
    <main>
        <section id='section1'>
            <div class='s1_content'>
                <div class='del_div'>
                    <div class='container'>
                        <div class='upper_wrap'>
                            <div class='upper_logo'>
                                <h1>logo</h1>
                            </div>
                            <div class='upper_search'>
                                <input type="text" placeholder="검색어를 입력하세요" class="searching_bar">
                            </div>
                        </div>

                    <div class='list_wrap'>
                        <div id='list1'>
                        <c:forEach var="i" items="${pose}">
                            <div class='s1_content_row1'>
                                <div class='row1_wrap'>
                                    <div class='row1_img'>
                                        <span>
                                            <a href="${pageContext.request.contextPath}/dictionary-detail?pnum=${i.pNum}">
                                          <div class="img_wrapper">  <img src="${i.img_Path}" alt=""></div>
                                        </span>
                                    </div>
                                    <div class='row1_text'>
                                        <div class='text_gap'>
                                            <h2 class='pose_title'>${i.title}</h2>
                                            <p class='pose_benefit'></p>
                                            <div class="more">···</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </a>
                        </c:forEach>
                        </div>
					</div>
                    </div>
                </div>
            </div>
        </section>

    </main>
    <jsp:include page="footer/footer_white.jsp" />
</body>

</html>