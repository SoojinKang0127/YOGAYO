<<<<<<< HEAD
$(window).ready(function () {
  $(window).scroll(function () {
    var scrollTop = $(document).scrollTop();
    if (scrollTop < 530) {
      scrollTop = 530;
    } else if (scrollTop > 850) {
      scrollTop = 850;
    }
    $(".course_detail-mini_view").stop();
    $(".course_detail-mini_view").animate(
      { top: scrollTop, marginTop: "50px", position: "fixed" },
      1
    );
  });
  $("#more_review_btn").hover(
    function () {
      //   $(this).css("background-color", "#F7F7F7");
      $(this).css({
        "background-color": "var(--theme-color)",
        border: "1px solid var(--theme-color)",
      });
    },
    function () {
      //   $(this).css("background-color", "white");
      $(this).css({ "background-color": "white", border: "1px solid gray" });
    }
  );
=======
$(window).ready(function() {
	$('#review_btn').click(function(){
		$('#text_box').val("");
		$('input[name=rating3]').removeAttr('checked');
		$('input[name=rating3]')[0].checked=true;
	});
	
	$("#heart").click(function() {
		if ($(this).attr('class') == 'far fa-heart') {
			$(this).attr('class', 'fas fa-heart');
		} else {
			$(this).attr('class', 'far fa-heart');
		}
	});
	$(".fas").click(function() {
		if ($(this).attr('class') == 'fas fa-caret-down') {
			$(this).attr('class', 'fas fa-caret-left');
			$(this).parent().next().show();
		} else {
			$(this).attr('class', 'fas fa-caret-down');
			//$('.hidden_comment').hide();
			$(this).parent().next().hide();
		}
	});

	$("#show_me_the_comment").hover(function() {
		$(this).css({
			color : "black"
		});
	}, function() {
		$(this).css({
			color : "#C0C0C0"
		});
	});

	$(window).scroll(function() {
		var scrollTop = $(document).scrollTop();
		if (scrollTop < 530) {
			scrollTop = 530;
		} else if (scrollTop > 800) {
			scrollTop = 800;
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
>>>>>>> master
});
