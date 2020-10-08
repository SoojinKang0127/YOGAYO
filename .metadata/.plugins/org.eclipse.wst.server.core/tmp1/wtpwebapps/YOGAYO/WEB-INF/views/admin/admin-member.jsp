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
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
<script type="text/javascript">

	var female = ${femaleCount};
	var male = ${maleCount}; 
	
	var highLevel = ${levelCount.highLevel };
	var middleLevel = ${levelCount.middleLevel };
	var lowLevel = ${levelCount.lowLevel };
	
	var age_10 = ${ratioPerAge.age_10};
	var age_20 = ${ratioPerAge.age_20};
	var age_30 = ${ratioPerAge.age_30};
	var age_40 = ${ratioPerAge.age_40};
	var age_50 = ${ratioPerAge.age_50};
	var age_60 = ${ratioPerAge.age_60};

</script>
<title>ADMIN MEMBER</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="member_title">
			<span class="underline">전체 회원 조회 | 총 ${memberCount }명</span>
		</div>
		<div class="member_chart_section">
			<div class="chart_wrapper">
				<div class="first_chart">
					<canvas id="first_chart_"></canvas>
				</div>
				<div class="second_chart">
					<canvas id="second_chart_"></canvas>
				</div>
				<div class="third_chart">
					<canvas id="third_chart_"></canvas>
				</div>
			</div>
		</div>
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
					<div class="user_regdate col">가입일</div>
				</li>
				<c:forEach var="i" items="${userList}" varStatus="status">
					<li class="member_list">
						<div class="idx">${status.count }</div>
						<div class="user_avatar">
							<div class="user_pic">
								<img src="${pageContext.request.contextPath}/${i.img }" />
							</div>
						</div>
						<div class="user_number">${i.uNum }</div>
						<div class="user_id">${i.id }</div>
						<div class="user_name">
							<a href="memberdetail?usernum=${i.uNum}">${i.name } ${userNum }</a>
						</div>
						<div class="user_birthday">${i.bDate }</div>
						<div class="user_gender">
							<c:set var="gender" value="${i.gender }" />
							<c:if test="${fn:contains(gender,'M')}">남성</c:if>
							<c:if test="${fn:contains(gender,'F')}">여성</c:if>
						</div>
						<div class="user_profi">
							<c:if test="${i.profiLevel == '5'}">상</c:if>
							<c:if test="${i.profiLevel == '3'}">중</c:if>
							<c:if test="${i.profiLevel == '1'}">하</c:if>
						</div>
						<div class="user_regdate">${i.regDate }</div>
					
					</li>

				</c:forEach>
			</ul>
		</div>
	</main>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/admin/utils.js"></script>
	<script language=JavaScript
		src="${pageContext.request.contextPath}/resources/js/admin/chart_member.js"></script>
</body>
</html>