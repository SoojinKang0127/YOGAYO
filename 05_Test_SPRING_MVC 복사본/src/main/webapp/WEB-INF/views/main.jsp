<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script language=JavaScript src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<p>이곳이 메인</p>

<c:if test="${user != null}">
<p>${user.userId} 님 안녕 로그인이 되었습니다.</p>
<p>비밀번호는 ${user.password} </p>
</c:if>



<script>
var userId = '${user.userId}';
alert(userId);

</script>
</body>
</html>