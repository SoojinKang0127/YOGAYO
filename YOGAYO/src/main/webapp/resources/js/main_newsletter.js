
var arrow = document.getElementById("arrow");
var modal = document.getElementById("newsletter_modal");
var noBtn = document.getElementById("no_btn");
var yesBtn = document.getElementById("yes_btn");

arrow.addEventListener("click",function(){
	modal.classList.remove("hiding");
})

noBtn.addEventListener("click", function(){
	modal.classList.add("hiding");
})

yesBtn.addEventListener("click", function(){
	alert("구독 신청이 완료되었습니다!")
	location.href="./main/subscribe"
})
