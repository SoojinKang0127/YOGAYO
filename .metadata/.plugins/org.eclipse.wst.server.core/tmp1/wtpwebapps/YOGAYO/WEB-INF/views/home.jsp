<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO</title>

 <link rel="stylesheet" type="text/css"	href="${pageContext.request.contextPath}/resources/css/home.css" media="all and (min-width:600px) and (max-width:2000px)">
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
        
        <div class="login-form-wrapper" id="login-wrapper">
          <div class="login-form">
            <span>로그인</span>
            <div class="form-row">
              <form action="/login" method="post">
                <input type="text" name="id" placeholder="이메일 (example@gmail.com)"/><br />
                <input type="password" name="pwd" placeholder="비밀번호"/><br />
                <input type="submit" value="로그인" />
              </form>
            </div>
            <div class="withgoogle">
              <div></div>
            </div>
            <a href="tester-login"><div class="sign-up-btn">테스터로 로그인</div></a>
            <a href="sign-up"><div class="sign-up-btn">회원가입</div></a>
          </div>
        </div>
        <span class="text" id="text">요가를 할 때 몸과 마음에서는 어떤 일이 일어날까요?</span>
        
        <a href="login">
        <div class="start-btn" id="start-btn">
                  시작하기
        </div>
        </a>
        
      </div>
      
      <div class="background-cover"></div>
      <div class="background"></div>
    </main>
    <script>

    </script>
  </body>
</html>
    