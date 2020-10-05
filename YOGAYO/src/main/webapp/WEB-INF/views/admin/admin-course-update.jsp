<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/admin_course_update.css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<title>ADMIN COURSE UPDATE</title>
</head>
<body>
	<header>
		<jsp:include page="admin-header.jsp" />
	</header>
	<main>
		<div class="update_form">
			<form action="docourseupdate" id="form" method="get">
				<li class="wrapper"><input type="hidden" name="crsnum"
					value="${course.crsNum }"> <input type="hidden" name="name"
					value="${course.name }">

					<div class="courseNum_ th">코스번호</div>
					<div class="createdBy_ th">만든이</div>
					<div class="title_ th">타이틀</div>
					<div class="desc_ th">코스설명</div>
					<div class="courseNum">${course.crsNum }</div>
					<div class="createdBy">${course.name }</div>
					<div class="title">
						<input type="text" name="title" placeholder="${course.crsTitle }"
							value="${course.crsTitle }" class="course_title">
					</div>
					<div class="desc">
						<input type="text" name="description"
							placeholder="${course.crsDscrt }" value="${course.crsDscrt }"
							class="course_dscrt">
					</div>
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
					<div class="metarial">
						<select class="material_option" name="material">
							<option>${course.material }</option>
						</select>
					</div>
					<div class="imgPath">
						<i class="fas fa-image"></i>
						<div class="img">
							<img src="${pageContext.request.contextPath}/${course.img }">
						</div>
					</div>
					<div class="seq1">
						<input type="text" name="seq1" placeholder="${course.seq1Num }"
							value="${course.seq1Num }" class="seq">
					</div>
					<div class="seq2">
						<input type="text" name="seq2" placeholder="${course.seq2Num }"
							value="${course.seq2Num }" class="seq">
					</div>
					<div class="seq3">
						<input type="text" name="seq3" placeholder="${course.seq3Num }"
							value="${course.seq3Num }" class="seq">
					</div>
					<div class="seq4">
						<input type="text" name="seq4" placeholder="${course.seq4Num }"
							value="${course.seq4Num }" class="seq">
					</div>
					<div class="seq5">
						<input type="text" name="seq5" placeholder="${course.seq5Num }"
							value="${course.seq5Num }" class="seq">
					</div>
					<div class="seq6">
						<input type="text" name="seq6" placeholder="${course.seq6Num }"
							value="${course.seq6Num }" class="seq">
					</div>
					<div class="seq7">
						<input type="text" name="seq7" placeholder="${course.seq7Num }"
							value="${course.seq7Num }" class="seq">
					</div>
					<div class="seq8">
						<input type="text" name="seq8" placeholder="${course.seq8Num }"
							value="${course.seq8Num }" class="seq">
					</div></li>
			</form>
		</div>

		<div class="modify_btn" onclick="update(${course.crsNum });">수정완료</div>
	</main>

	<script type="text/javascript">
	
	var form = document.getElementById('form');
	
		function update(crsNum) {
			var yesOrNo = confirm(crsNum + "번 코스를 수정하시겠습니까?")
			if(yesOrNo){
				form.submit();	
			}
		}
	</script>
</body>
</html>