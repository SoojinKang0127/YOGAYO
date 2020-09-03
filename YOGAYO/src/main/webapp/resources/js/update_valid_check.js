var emailCheck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

var emailVaild = false;
var nameVaild = false;
var birthDayVaild = false;
var password1Vaild = false;
var password2Vaild = false;

$(document).ready(function () {
  /* 이메일 유효성 */
  $("#email").keyup(function () {
    if ($("#email").val().length != 0) {
      if (emailCheck.test($("#email").val())) {
        $("#email").css({
          "border-bottom": "2px solid",
          color: "green",
        });
        emailVaild = true;
      } else {
        $("#email").css({
          "border-bottom": "2px solid red",
          color: "red",
        });
      }
    } else {
      $("#email").css({
        "border-bottom": "1px solid black",
        color: "black",
      });
    }
  });

  /* 이름 유효성 */
  $("#name").keyup(function () {
    console.log($("#birthDay").val());
    if ($("#name").val().length != 0 && $("#name").val().length > 2) {
      $("#name").css({
        color: "green",
        "border-bottom": "2px solid green",
      });
      nameVaild = true;
    } else {
      $("#name").css({
        color: "black",
        "border-bottom": "1px solid black",
      });
    }
  });

  /* 생일 유효성 */
  if ($("#birthDay").val().length === 0) {
  }

  /* 비밀번호 유효성 */

  $("#pwd1").keyup(function () {
    console.log(password1Vaild);
    if ($("#birthDay").val().length != 0) {
      $("#birthDay").css({
        color: "green",
        "border-bottom": "2px solid green",
      });
    }

    if ($("#pwd1").val().length != 0) {
      if ($("#pwd1").val().length > 6) {
        $("#pwd1").css({
          color: "green",
          "border-bottom": "2px solid green",
        });
        password1Vaild = true;
      } else {
        $("#pwd1").css({
          color: "red",
          "border-bottom": "2px solid red",
        });
        password1Vaild = false;
      }
    } else {
      $("#pwd1").css({
        color: "black",
        "border-bottom": "1px solid black",
      });
      password1Vaild = false;
    }
  });

  /* 비밀번호 확인 유효성 */
  //하ㅎ하하하하하끝이없다 열받앙...

  $("#pwd2").keyup(function () {
    if ($("#pwd2").val().length != 0) {
      if (password1Vaild && $("#pwd2").val() === $("#pwd1").val()) {
        $("#pwd2").css({
          color: "green",
          "border-bottom": "2px solid green",
        });
      } else {
        $("#pwd2").css({
          color: "red",
          "border-bottom": "2px solid red",
        });
      }
    } else {
      $("#pwd2").css({
        color: "black",
        "border-bottom": "1px solid black",
      });
    }
  });
});
