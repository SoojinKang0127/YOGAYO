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
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
   <script language=JavaScript
	src="${pageContext.request.contextPath}/resources/js/library.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/library.css">
</head>

<body>
    <header></header>


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
                                <input type="text" placeholder="검색어를 입력하세요" class="searching_bar">
                            </div>
                        </div>

<div class='list_wrap'>
                        <ul id='#list1'>
						<c:forEach var="i" items="${pose}" begin="0" end="70" step="1">
                            <li class='s1_content_row1'>
                                <div class='row1_wrap'>
                                    <div class='row1_img'>
                                        <span><a href="${pageContext.request.contextPath}/library?pNum=${i.pNum}">
                                        <img src="${i.imgPath}" alt=""></a></span>
                                    </div>
                                    <div class='row1_text'>
                                        <div class='text_gap'>
                                            <h2 class='pose_title'>${i.title}</h2>
                                            <p class='pose_desc'>설명없음</p>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            </c:forEach>
                            </ul>
</div>

                           
                    </div>
                </div>
            </div>
        </section>


    </main>
    <footer></footer>
</body>

</html>