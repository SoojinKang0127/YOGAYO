$(window).ready(function() {
		
	if ( rate_people_num< 7) {
		$('#more_review_btn').hide();
	} else {
		$('#more_review_btn').show();
	}

	/*$('#more_review_btn').on("click", function() {
		alert('더보여주라');
		$.ajax({
			type:"post",
			async : true,
			url : "comment_more.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"commentMore":"commentMore",
				"crsNum":$('#crsNum').val()},
			dataType : "json",			
			success : function(resultData) {
				$('.ajax').empty();
				for(i in resultData.result){
					var list = "<div class=course_detail-review_profile_img>"
					
				}
			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	})*/
	var request_like = new XMLHttpRequest();
	var request_dislike = new XMLHttpRequest();
	$('#review_btn').click(function(){
		$('#text_box').val("");
		$('input[name=rating3]').removeAttr('checked');
		$('input[name=rating3]')[0].checked=true;
	});
	
	$("#heart").click(function() {
		if ($(this).attr('class') == 'far fa-heart') {
			$(this).attr('class', 'fas fa-heart');
			request_like.open("POST","./likeCourse?uNum=" + uNum + "&crsNum=" + crsNum, true);
			 request_like.send(null);
		} else {
			$(this).attr('class', 'far fa-heart');
			request_dislike.open("POST","./dislikeCourse?uNum=" + uNum + "&crsNum=" + crsNum, true);
			 request_dislike.send(null);
		}
	});
	$(".show_me").click(function() {
		if ($(this).attr('class') == 'fas fa-caret-down show_me') {
			$(this).attr('class', 'fas fa-caret-left show_me');
			$(this).parent().next().show();
		} else {
			$(this).attr('class', 'fas fa-caret-down show_me');
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
});
