<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO | LOGIN</title>

 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css" media="all and (min-width:600px) and (max-width:2000px)">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home_mobile.css" media="all and (min-width:300px) and (max-width:599px)">
  </head>
  <body>
    <main>
      <div class="content">
        <header>
          <div class="logo-wrapper">
            <span>YOGAYO</span>
            <div class="box-div"></div>
          </div>
        </header>
        <div class="login-form-wrapper showing" id="login-wrapper">
          <div class="login-form">
            <span>로그인</span>
            <div class="errMessage">${errMessage}</div>
            <div class="form-row">
 
              <form action="login" method="post">
                <input type="text" name="id" placeholder="이메일 (example@gmail.com)"/><br />
                <input type="password" name="pwd" placeholder="비밀번호"/><br />
                <input type="submit" value="로그인" />
              </form>
              
            </div>
            <div class="withgoogle">
				<!-- <a href="sign-up"><div class="sign-up-btn naverBtn">네이버로 로그인</div></a>
              <div></div>
              <div></div>
              <div></div> -->
            </div>
            
            <a href="sign-up"><div class="sign-up-btn">회원가입</div></a>
          </div>
        </div>

      </div>
      <div class="background-cover"></div>
      <div class="background"></div>
    </main>
    <script>
    </script>
  </body>
</html>
    