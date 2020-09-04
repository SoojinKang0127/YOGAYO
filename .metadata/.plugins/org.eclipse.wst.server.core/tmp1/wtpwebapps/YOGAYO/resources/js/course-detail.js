$(window).ready(function() {
	$(window).scroll(function() {
		var scrollTop = $(document).scrollTop();
		if (scrollTop < 530) {
			scrollTop = 530;
		} else if (scrollTop > 850) {
			scrollTop = 850;
		}
		$(".course_detail-mini_view").stop();
		$(".course_detail-mini_view").animate({
			top : scrollTop,
			marginTop : "50px",
			position : "fixed"
		}, 1);
	});
	$("#more_review_btn").hover(function() {
		// $(this).css("background-color", "#F7F7F7");
		$(this).css({
			"background-color" : "var(--theme-color)",
			border : "1px solid var(--theme-color)",
		});
	}, function() {
		// $(this).css("background-color", "white");
		$(this).css({
			"background-color" : "white",
			border : "1px solid gray"
		});
	});
});
