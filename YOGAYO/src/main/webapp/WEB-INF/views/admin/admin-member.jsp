<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
     <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_member.css">
    <title>YOGAYO 회원관리</title>
  </head>
  <body>
    <header>
      <a href="/"
        ><div class="logo-wrapper">
          <span>YOGAYO</span>
          <div class="box-div"></div>
        </div>
      </a>
      <ul class="menu_list">
        <li class="menu">통계</li>
        <li class="menu ">회원 관리</li>
        <li class="menu">코멘트 관리</li>
        <li class="menu">뉴스레터 전송</li>
        <li class="menu">코스 관리</li>
        <li class="menu">포즈 관리</li>
        <li class="menu">포즈 관리</li>
        <li class="menu">LOG OUT</li>
      </ul>
    </header>
    <main>
      <div class="member_table">
        <ul>
          <li class="member_list">
            <div class="idx">순번</div>
            <div class="user_avatar">프로필사진</div>
            <div class="user_number">번호</div>
            <div class="user_id">E-MAIL</div>
            <div class="user_name">이름</div>
            <div class="user_birthday">생년월일</div>
            <div class="user_gender">성별</div>
            <div class="user_profi">숙련도</div>
            <div class="user_feed">후기</div>
          </li>
          <c:forEach var="i" items="${userList}">
          <li class="member_list">
            <div class="idx">1</div>
            <div class="user_avatar">
              <img
                src="https://www.pngitem.com/pimgs/m/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png"
              />
            </div>
            <div class="user_number">${i.uNum }</div>
            <div class="user_id">${i.id }</div>
            <div class="user_name">${i.name }</div>
            <div class="user_birthday">${i.bDate }</div>
            <div class="user_gender">${i.gender }</div>
            <div class="user_profi">${i.profiLevel }</div>
            <div class="user_feed"><a href="http://naver.com">후기</a></div>
          </li>
          
          </c:forEach>
          
          
   
          
          
        </ul>
      </div>
    </main>
  </body>
</html>
