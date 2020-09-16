<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
     <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_member.css">
    <title>ADMIN MEMBER</title>
  </head>
  <body>
    <header>
      <jsp:include page="admin-header.jsp" />
    </header>
    <main>
      <div class="member_table">
        <ul>
          <li class="member_list">
            <div class="idx col">순번</div>
            <div class="user_avatar col">프로필사진</div>
            <div class="user_number col">번호</div>
            <div class="user_id col">E-MAIL</div>
            <div class="user_name col">이름</div>
            <div class="user_birthday col">생년월일</div>
            <div class="user_gender col">성별</div>
            <div class="user_profi col">숙련도</div>
            <div class="user_feed col">후기</div>
            <div class="user_comment col">댓글</div>
            <div class="user_regdate col">가입일</div>
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
            <div class="user_gender">
            <c:set var ="gender" value="${i.gender }"/>
            <c:if test="${fn:contains(gender,'M')}">남성</c:if>
            <c:if test="${fn:contains(gender,'F')}">여성</c:if>
            </div>
            <div class="user_profi">
            <c:if test="${i.profiLevel == '5'}">상</c:if>
            <c:if test="${i.profiLevel == '3'}">중</c:if>
            <c:if test="${i.profiLevel == '1'}">하</c:if>
            </div>
            <div class="user_feed"><a href="memberfeed?usernum=${i.uNum }">후기</a></div>
            <div class="user_comment"><a href="membercomment?usernum=${i.uNum }">댓글</a></div>
            <div class="user_regdate">${i.regDate }</div>
          </li>
          
          </c:forEach>
        </ul>
      </div>
    </main>
  </body>
</html>
