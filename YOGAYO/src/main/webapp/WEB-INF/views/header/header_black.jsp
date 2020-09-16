<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.main_wrapper{
  height: 70px;
  margin-top: 30px;
}

.main-status_bar {
  display: flex;
  position: absolute;
  flex-direction: row;
  justify-content: space-around;
  width: 100%;
  height: 70px;
  z-index: 2;
}

.logo-wrapper {
   width: 150px;
   height: 200px;
   /* padding: 25px; */
   position: relative;
   display: flex;
   flex-direction: column;
  align-items: center;
  margin-left: 30px;
}

.box-div {
   width: 100px;
   height: 100px;
   display: flex;
   justify-content: center;
   align-items: center;
   border: 2px solid rgb(0, 0, 0);
   /* transition: all 0.3s linear; */
   box-shadow: var(- -light-shadow);
   transform: perspective(400px) rotateX(80deg);
}

/* .logo-wrapper:hover .box-div {
   transform: none;
} */

.logo-wrapper span {
   color: rgb(0, 0, 0);
   font-size: 20px;
   font-weight: 600;
   position: absolute;
   top: 20px;
   opacity: 1;
   /* transition: opacity 0.3s ease-in-out 0s; */
  display: block;
}

/* .logo-wrapper:hover span {
   opacity: 0;
   top: 46px;
} */

.main-status_categories {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  color: black;
  margin-top: 10px;
}

.main-status_categories span {
  margin-right: 30px;
  align-items: center;
  font-size: 18pt;
  font-family: 'Noto Sans KR', sans-serif;
  font-weight: 300;
  margin-left: 50px;
  position: relative;
  height: 35px;
}

.main-status_categories  a {
  color: black;
  text-decoration: none;
}

.main-status_categories span:nth-child(1)::after{
  content: "";
  position: absolute;
  bottom: 0;
  left: 50%;
  width: 100%;
  height: 3px;
  background: black;
  /* transition: all .2s ease-out; */
}

.main-status_categories span::after {
  content: "";
  position: absolute;
  bottom: 0;
  left: 50%;
  transform: translateX(-50%);
  width: 0;
  height: 3px;
  background: black;
  transition: all .2s ease-out;
}

.main-status_categories span:hover::after {
  width: 100%;
}

.main-profile {
  display: flex;
  align-items: center;
  margin-top: 5px;
}

.main-profile .welcome_user {
  color: black;
  margin-right: 30px;
}

.header .main-status_bar .main-profile img {
  display: flex;
  width: 70px;
  height: 70px;
  border-radius: 50px;
}

</style>
</head>
<body>
<header class="header">
	<div class="main_wrapper">
	<div class="main-status_bar">
         <div class="main-logo_wrapper">
            <a href="${pageContext.request.contextPath}/main"> 
               <div class="logo-wrapper">
               <span>YOGAYO</span>
                  <div class="box-div"></div>
               </div>
            </a>
         </div>
         <div class="main-status_categories">
            <span class="recommand"><a href="${pageContext.request.contextPath}/main">추천</a></span> 
            <span class="course"><a href="${pageContext.request.contextPath}/course-page">코스</a></span>
            <span class="dictionary"><a href="${pageContext.request.contextPath}/dictionary">자세 사전</a></span> 
            <span class="my_page"><a href="${pageContext.request.contextPath}/myPage">마이 페이지</a></span>
         </div>
         <div class="main-profile">
            <div class="welcome_user">안녕하세요. ${user.name}님</div>
            <a href="myPage"><img
               src="${pageContext.request.contextPath}/${user.img}"
               class="profile_img" /></a>
         </div>
      </div>
      </div>
	</header>
</body>
</html>