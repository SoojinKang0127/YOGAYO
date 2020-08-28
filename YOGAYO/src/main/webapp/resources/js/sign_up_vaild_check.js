var emailCheck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
var signUpBtn = document.getElementById("signUpBtn");
var submitBtn = document.getElementById("submitBtn");

var request = new XMLHttpRequest();
var email = $('input#email');

var number = "안됨";

// $('input#email').focusout(()=>{
// var email=$('input#email');
// request.open("Post", "./checkDuplication?email="+
// encodeURIComponent(email[0].value),true);
// request.onreadystatechange=after_ajax;
// request.send(null);
// })


function after_ajax() {
	if (request.readyState == 4 && request.status == 200) {
		number = request.responseText;
		console.log("넘어온 값"+ request.responseText)
	}
}

document.addEventListener("mouseover", function() {
	if (infoAllVaildCheck()) {
		submitBtn.removeAttribute("disabled");
		submitBtn.classList.remove("invaild");
		submitBtn.classList.add("vaild");
	} else {
		submitBtn.classList.remove("vaild");
		submitBtn.setAttribute("disabled", "disabled");
	}

})

function emailDuplCheck() {
	if ($("#email").val().length != 0 && emailCheck.test($("#email").val())
			&& number === "1") {
		return true
	} else
		return false;
}

// function emailVaildCheck() {
// if (emailCheck.test($("#email").val()))
// return true;
// else
// return false;
// }

function nameVaildCheck() {
	if ($("#name").val().length != 0 && $("#name").val().length > 1)
		return true;
	else
		return false;
}
function birthdayVaildCheck() {
	if ($("#birthDay").val().length != 0)
		return true;

	else
		return false;
}
function password1VaildCheck() {
	if ($("#pwd1").val().length > 6)
		return true;
	else
		return false;
}
function password2VaildCheck() {
	if (password1VaildCheck() && $("#pwd2").val() === $("#pwd1").val())
		return true;
	else
		return false;
}

function infoAllVaildCheck() {
	if (emailDuplCheck() && nameVaildCheck() && birthdayVaildCheck()
			&& password1VaildCheck() && password2VaildCheck()) {
		return true;
	} else {
		return false;
	}

}

document.addEventListener("mouseover", function() {

	if (infoAllVaildCheck()) {
		submitBtn.removeAttribute("disabled");
		submitBtn.classList.remove("invaild");
		submitBtn.classList.add("vaild");
	} else {
		submitBtn.classList.remove("vaild");
		submitBtn.setAttribute("disabled", "disabled");
	}
	
	
	///////////////////
	if ($("#email").val().length != 0) {
		if (emailDuplCheck()) {
			$("#email").css({
				"border-bottom" : "2px solid",
				color : "green",
			});
			$(".msgContainer").css({
				"display" : "none"
			});

		} else {
			$("#email").css({
				"border-bottom" : "2px solid red",
				color : "red",
			});

			$(".msgContainer").css({
				"display" : "block"
			});

		}
	} else {
		$("#email").css({
			"border-bottom" : "1px solid black",
			color : "black",
		});
		$(".msgContainer").css({
			"display" : "none"
		});

	}
	
	

})

$(document).ready(
		function() {
			/* 이메일 유효성 */
			$("#email").keyup(function() {
				request.open("Post", "./checkDuplication?email="
						+ encodeURIComponent(email[0].value), true);
				request.onreadystatechange = after_ajax;
				request.send(null);				
								
				if ($("#email").val().length != 0) {
					if (emailDuplCheck()) {
						$("#email").css({
							"border-bottom" : "2px solid",
							color : "green",
						});
						$(".msgContainer").css({
							"display" : "none"
						});

					} else {
						$("#email").css({
							"border-bottom" : "2px solid red",
							color : "red",
						});

						$(".msgContainer").css({
							"display" : "block"
						});

					}
				} else {
					$("#email").css({
						"border-bottom" : "1px solid black",
						color : "black",
					});
					$(".msgContainer").css({
						"display" : "none"
					});

				}
			});

			/* 이름 유효성 */
			$("#name").keyup(function() {

				if ($("#name").val().length != 0) {
					if ($("#name").val().length > 1) {
						$("#name").css({
							color : "green",
							"border-bottom" : "2px solid green",
						});
					} else {
						$("#name").css({
							color : "red",
							"border-bottom" : "2px solid red",
						});
					}
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
			$("#pwd2").keyup(
					function() {
						if ($("#pwd2").val().length != 0) {
							if (password1VaildCheck()
									&& $("#pwd2").val() === $("#pwd1").val()) {
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
