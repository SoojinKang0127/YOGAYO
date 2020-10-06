<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>YOGAYO</title>
  </head>
  <style>
      main {
          display: flex;
          flex-direction: column;
          justify-content: center;
          align-items: center;
      }

      img {
          margin-top: 150px;
          width: 300px;
          height: 300px;
      }

      .text1 {
          font-size: 100px;
          font-weight: 500;
      }

      .text2 {
          font-size: 30px;
      }

      .text3 {
          margin-top: 30px;
      }

      .toMain {
          margin-top: 50px;
          background-color: white;
          width: 150px;
          height: 40px;
      }
  </style>
  <body>
    <main>
      <img src="./yogaIcon.jpg" alt="사진없음">
      <div class="text1">404</div>
      <div class="text2">Page not found</div>
      <div class="text3">찾으시려는 페이지가 존재하지 않습니다..</div>
      <div class="text4">메인페이지로 돌아가시거나 새로고침을 해주세요.</div>
      <a href="main"><button class="toMain"></button>메인페이지로 이동</button></a>
  </body>
</html>