
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_course.css">
<title>ADMIN COURSE</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="pose_section">
			<div class="pose_section_wrapper">
				<div class="pose_section_title">Upward Facing Wide-Angle
					Seated Pose</div>
				<div class="pose_img"></div>
				<div class="pose_desc_wrapper">
					<ul>
						<li class="section">
							<div class="pose_th">No.</div>
							<div class="number value">56</div>
						</li>
						<li class="section">
							<div class="pose_th">시간(초)</div>
							<div class="second value">47</div>
						</li>
						<li class="section">
							<div class="pose_th">난이도</div>
							<div class="diffi value">5</div>
						</li>

					</ul>

				</div>
			</div>

		</div>
		<div class="member_title">
			<span class="underline">YOGAYO 코스 목록</span>
		</div>
		<div class="btnMenu">
			<div class="create_btn">관리자 코스 만들기</div>
			<div class="admin_btn">관리자 코스 조회</div>
			<div class="member_btn">회원 코스 조회</div>
		</div>
		<div class="course_table">
			<ul>
				<c:forEach var="i" items="${courseList }">
					<li class="wrapper">
						<div class="courseNum_ th">코스번호</div>
						<div class="createdBy_ th">만든이</div>
						<div class="title_ th">타이틀</div>
						<div class="desc_ th">코스설명</div>
						<div class="modify_ th" onclick="goToModify(${i.crsNum });">수정</div>
						<div class="courseNum">${i.crsNum }</div>
						<div class="createdBy">${i.name }</div>
						<div class="title">${i.crsTitle }</div>
						<div class="desc">${i.crsDscrt }</div>
						<div class="metarial_ th">준비물</div>
						<div class="imgPath_ th">이미지</div>
						<div class="seq1_ th">동작 1</div>
						<div class="seq2_ th">동작 2</div>
						<div class="seq3_ th">동작 3</div>
						<div class="seq4_ th">동작 4</div>
						<div class="seq5_ th">동작 5</div>
						<div class="seq6_ th">동작 6</div>
						<div class="seq7_ th">동작 7</div>
						<div class="seq8_ th">동작 8</div>
						<div class="metarial">${i.material }</div>
						<div class="imgPath"></div>
						<div class="seq1 seq">${i.seq1Num }</div>
						<div class="seq2 seq">${i.seq2Num }</div>
						<div class="seq3 seq">${i.seq3Num }</div>
						<div class="seq4 seq">${i.seq4Num }</div>
						<div class="seq5 seq">${i.seq5Num }</div>
						<div class="seq6 seq">${i.seq6Num }</div>
						<div class="seq7 seq">${i.seq7Num }</div>
						<div class="seq8 seq">${i.seq8Num }</div>
					</li>
				</c:forEach>
			</ul>
		</div>
	</main>

	<script type="text/javascript">
	function goToModify(crsnum){
		location.href="courseupdate?crsnum="+crsnum;
	}
</script>
<script type="text/javascript">
	const seqs = document.querySelectorAll(".seq");
	var seqNum = 0;
	seqs.forEach(function(seq){
		seq.addEventListener("mouseover", function(e){
			seqNum = e.currentTarget.innerHTML;
			console.log(seqNum);
			
			
			
			
		})
	})
</script>
</body>
</html>