$(window).ready(function () {
	
	$('#course-view_all').click(function(){
		$('input[name=menu]:checked').prop('checked', false);
	});
	$('#course-view_yogayo_course').click(function(){
		$('input[name=menu]:checked').prop('checked', false);
	});
	$('#course-view_user_course').click(function(){
		$('input[name=menu]:checked').prop('checked', false);
	});
	
	var clickMore=0;
	$('#more_course_btn').on("click",function(){
		var controllerUrl="course-page-ajax.do";//ajax url
		var radioValue = $('input[name=menu]:checked').val(); // data
		clickMore+=16;
		var jsonData={"searchType":"all",
				startNum:clickMore}
		if(radioValue=='total'){
			controllerUrl="search-course.do";
			jsonData={"sort":"total",
				"searchType" : "all",
				startNum:clickMore}
		}else if(radioValue=='date'){
			controllerUrl="search-course.do";
			jsonData={"sort":"date",
				"searchType" : "all",
				startNum:clickMore}
		}else if(radioValue=='totalComment'){
			controllerUrl="search-course.do";
			jsonData={"sort":"totalComment",
				"searchType" : "all",
				startNum:clickMore}
		}

		$.ajax({
			type:"post",
			async : true,
			url : controllerUrl,
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : jsonData,
			dataType : "json",			
			success : function(resultData) {
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<div class='img_wrapper'><img src=/test/"+resultData.result[i].imgPath+" alt=course /></div>"+
									"<div class=course_star_rating>"+
										"<div class=rating><i class='fas fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)</div>"+
									"<div class=course_title>"+resultData.result[i].title+"</div>"+
								"</div></a></div></div>"
									
					$('.courses_first_line').append(list);
				}

			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	});
	
	
	
	$('input[name=menu]').on("change",function(e){
		clickMore=0;
		var radioValue = $(this).val();
		
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"sort":radioValue,
				"searchType" : "all",
				startNum:clickMore
			},
			dataType : "json",			
			success : function(resultData) {
				
				$('.courses_first_line').empty();
				
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
					"<div class=course_container>"+
					"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
					"<div class='img_wrapper'><img src=/test/"+resultData.result[i].imgPath+" alt=course /></div>"+
					"<div class=course_star_rating>"+
					"<div class=rating><i class='fas fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)</div>"+
					"<div class=course_title>"+resultData.result[i].title+"</div>"+
					"</div></a></div></div>"
					
					$('.courses_first_line').append(list);
				}
				
			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	});

	
	// 전체보기
	$('#course-view_all').click(function(){
		// location.href="course-page.do";
		clickMore=0;
		$.ajax({
			type:"post",
			async : true,
			url : "course-page-ajax.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"all",
				startNum:clickMore},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<div class='img_wrapper'><img src=/test/"+resultData.result[i].imgPath+" alt=course /></div>"+
									"<div class=course_star_rating>"+
										"<div class=rating><i class='fas fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)</div>"+
									"<div class=course_title>"+resultData.result[i].title+"</div>"+
								"</div></a></div></div>"
									
					$('.courses_first_line').append(list);
				}

			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	});
	//전문가코스
	$('#course-view_yogayo_course').click(function(){
		clickMore=0;
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"pro",
				startNum:clickMore},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<div class='img_wrapper'><img src=/test/"+resultData.result[i].imgPath+" alt=course /></div>"+
									"<div class=course_star_rating>"+
										"<div class=rating><i class='fas fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)</div>"+
									"<div class=course_title>"+resultData.result[i].title+"</div>"+
								"</div></a></div></div>"
									
					$('.courses_first_line').append(list);
				}

			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	});
	//사용자가 만든거
	$('#course-view_user_course').click(function(){
		clickMore=0;
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"user",
				startNum:clickMore},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<div class='img_wrapper'><img src=/test/"+resultData.result[i].imgPath+" alt=course /></div>"+
									"<div class=course_star_rating>"+
										"<div class=rating><i class='fas fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)</div>"+
									"<div class=course_title>"+resultData.result[i].title+"</div>"+
								"</div></a></div></div>"
									
					$('.courses_first_line').append(list);
				}

			},
			error : function(request, status, error) {
				console.log("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
		
	});
	
	
	$("#more_course_btn").hover(function() {
		$(this).css({
			"background-color" : "var(--theme-color)",
			border : "1px solid var(--theme-color)",
		});
	}, function() {
		$(this).css({
			"background-color" : "white",
			border : "1px solid gray"
		});
	});
  $("#course-view_all").hover(
    function () {
      $(this).css("border", "1px solid black");
    },
    function () {
      $(this).css("border", "1px solid gray");
    }
  );
  $("#course-view_yogayo_course").hover(
    function () {
      $(this).css("border", "1px solid black");
    },
    function () {
      $(this).css("border", "1px solid gray");
    }
  );
  $("#course-view_user_course").hover(
    function () {
      $(this).css("border", "1px solid black");
    },
    function () {
      $(this).css("border", "1px solid gray");
    }
  );

  $("#courses_sort").hover(
    function () {
      $(this).css("border", "1px solid black");
    },
    function () {
      $(this).css("border", "1px solid gray");
    }
  );

  $(".course-categories_right #courses_sort").on("click", function () {
    if ($(this).html() === "정렬 ▼") {
      $(this).html("정렬 ▲");
      $(".sort_menu").css({ visibility: "visible" });
    } else {
      $(this).html("정렬 ▼");
      $(".sort_menu").css({ visibility: "hidden" });
    }
  });

  function isElementUnderBottom(elem, triggerDiff) {
    const { top } = elem.getBoundingClientRect();
    const { innerHeight } = window;
    return top > innerHeight + (triggerDiff || 0);
  }

  function handleScroll() {
    var elems = document.querySelectorAll(".up-on-scroll");
    elems.forEach((elem) => {
      if (isElementUnderBottom(elem, -20)) {
        elem.style.opacity = "0";
        elem.style.transform = "translateY(100px)";
      } else {
        elem.style.opacity = "1";
        elem.style.transform = "translateY(0px)";
        elem.style.transition = "1s";
      }
    });
  }

  window.addEventListener("scroll", handleScroll);
});
