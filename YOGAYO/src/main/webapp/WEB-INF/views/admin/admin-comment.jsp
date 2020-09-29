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
	href="${pageContext.request.contextPath}/resources/css/admin/admin_comment.css">
<title>ADMIN COMMENT</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="member_title">
			<span class="underline">댓글과 대댓글 목록</span>
		</div>
<!-- 		<div class="search_container">
			<input type="button" id="filter" value="비속어 포함 댓글 검색"> <input
				type="text" id="search" placeholder="키워드로 검색">
		</div> -->
		<div class="comment_table">
			<ul>
				<li class="comment_list comment_list_th">
					<div class="idx">댓글번호</div>
					<div class="comment_date">작성일시</div>
					<div class="user_avatar">프로필사진</div>
					<div class="comment_user">작성자</div>
					<div class="comment_couse">코스번호</div>
					<div class="comment_couse">평점</div>
					<div class="comment_type">구분</div>
					<div class="comment_content">내용</div>
					<div class="comment_delete">댓글삭제</div>
				</li>
				<c:forEach var="i" items="${commentList }" varStatus="status">
					<li class="comment_list">
						<div class="idx">${i.cmtNum }</div>
						<div class="comment_date">${i.regDate }</div>
						<div class="user_avatar">
							<div class="user_pic"><img src="${pageContext.request.contextPath}/${i.img}"></div>
						</div>
						<div class="comment_user">${i.name }</div>
						<div class="comment_couse">
							<a href="">${i.crsNum }</a>
						</div>
						<div class="comment_couse">
							<a href="">${i.rate }</a>
						</div>
						<div class="comment_type">
							<c:if test="${i.parent == '0'}">댓글</c:if>
							<c:if test="${i.parent != '0'}">${i.parent }번 대댓글</c:if>


						</div>
						<div class="comment_content">${i.context }</div>
						<div class="comment_delete">
							<input type="button" class="deleteBtn"
								onclick="confirmDelete(${i.cmtNum });" value="삭제">
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
	</main>

	<script type="text/javascript">
	
	function confirmDelete(cmtNum){
		var yesOrNo = confirm(cmtNum + "번 댓글을 삭제하시겠습니까?");
				
		if(yesOrNo){
			location.href="commentdelete?cmtnum="+cmtNum;
		}
	}
	
	</script>
</body>
</html>
