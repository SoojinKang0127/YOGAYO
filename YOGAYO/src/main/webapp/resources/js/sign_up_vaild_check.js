
var emailCheck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;


$(document).ready(function() {
	/* 이메일 유효성 */
	$("#email").keyup(function() {
		if ($("#email").val().length != 0) {
			if (emailCheck.test($("#email").val())) {
				$("#email").css({
					"border-bottom" : "2px solid",
					color : "green",
				});

			} else {
				$("#email").css({
					"border-bottom" : "2px solid red",
					color : "red",
				});

			}
		} else {
			$("#email").css({
				"border-bottom" : "1px solid black",
				color : "black",
			});

		}
	});

	/* 이름 유효성 */
	$("#name").keyup(function() {

		if ($("#name").val().length != 0 && $("#name").val().length > 2) {
			$("#name").css({
				color : "green",
				"border-bottom" : "2px solid green",
			});

		} else {
			$("#name").css({
				color : "black",
				"border-bottom" : "1px solid black",
			});
		}
	});

	/* 비밀번호 유효성 */

	$("#pwd1").keyup(function() {
		console.log($("#birthDay").val());
		if ($("#birthDay").val().length != 0) {
			$("#birthDay").css({
				color : "green",
				"border-bottom" : "2px solid green",
			});
			$("#gender").css({
				color : "green",
				"border-bottom" : "2px solid green",
			});
		}

		if ($("#pwd1").val().length != 0) {

			if ($("#pwd1").val().length > 6) {
				$("#pwd1").css({
					color : "green",
					"border-bottom" : "2px solid green",
				});

			} else {
				$("#pwd1").css({
					color : "red",
					"border-bottom" : "2px solid red",
				});
			}
		} else {
			$("#pwd1").css({
				color : "black",
				"border-bottom" : "1px solid black",
			});
		}
	});

	/* 비밀번호 확인 유효성 */
	$("#pwd2").keyup(function() {
		if ($("#pwd2").val().length != 0) {
			if (password1VaildCheck() && $("#pwd2").val() === $("#pwd1").val()) {
				$("#pwd2").css({
					color : "green",
					"border-bottom" : "2px solid green",
				});

			} else {
				$("#pwd2").css({
					color : "red",
					"border-bottom" : "2px solid red",
				});

			}
		} else {
			$("#pwd2").css({
				color : "black",
				"border-bottom" : "1px solid black",
			});

		}
	});
});
