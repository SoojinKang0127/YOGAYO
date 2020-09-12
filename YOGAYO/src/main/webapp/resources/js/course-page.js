$(window).ready(function () {
	
	$(window).scroll(function () {
		   if ($(window).scrollTop() == $(document).height() - $(window).height()) {
// $("footer").css("bottom", "0px");
// $("footer").css("position", "fixed");
			   for(i in courses){
		     $(".courses_first_line").append(' <div class="up-on-scroll"><div class="course_container"><a href="${pageContext.request.contextPath}/course-detail?crsNum=${i.crsNum}"><img src="${pageContext.request.contextPath}/${i.imgPath}" alt="course" /><div class="course_star_rating"><i class="far fa-star"></i>${i.total}(${i.totalComment})<div class="course_title">${i.title}</div></div></a></div></div>'
		        
		     );
			   }
		   }
		 });
	
// var crsNum = 2;
// $(window).scroll(function() {
// if ($(window).scrollTop() == $(document).height() - $(window).height()) {
// console.log(crsNum);
// for(i in resultData.result){
// var list = "<div class=up-on-scroll>" +
// "<div class=course_container>"+
// "<a href=/test/course-detail?crsNum="+(resultData.result[i].crsNum)+">"+
// "<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
// "<div class=course_star_rating>"+
// "<i class='far fa-star'></i><span
// class=rateNum>"+resultData.result[i].total+"</span>(<span
// id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
// "<div class=course_title>"+resultData.result[i].title+"</div>"+
// "</div></a></div></div>"
//									
// $('.courses_first_line').append(list);
// }
// }
// });
	
// $('#more_course_btn').on("click",function(){
// alert("더보여주라주");
// $.ajax({
// type:"post",
// async : true,
// url : "course-page-ajax.do",
// contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
// data : {"course":"more"},
// dataType : "json",
// success : function(resultData) {
// $('.courses_first_line').empty();
// // for(i in resultData.result){
// // console.log(resultData.result);
// // var list = "<div class=up-on-scroll>" +
// // "<div class=course_container>"+
// // "<a href=/test/course-detail?crsNum="+(resultData.result[i].crsNum)+">"+
// // "<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
// // "<div class=course_star_rating>"+
// // "<i class='far fa-star'></i><span
// class=rateNum>"+resultData.result[i].total+"</span>(<span
// id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
// // "<div class=course_title>"+resultData.result[i].title+"</div>"+
// // "</div></a></div></div>"
// //
// // $('.courses_first_line').append(list);
// // }
//
// },
// error : function(request, status, error) {
// console.log("code:" + request.status + "\n" + "message:"
// + request.responseText + "\n" + "error:" + error);
// }
// });
		
// });
	
	$('input[name=menu]').on("change",function(e){
		var radioValue = $(this).val();
		/* alert('value'+radioValue); */
		
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"sort":radioValue,
				"searchType" : "pro"
			},
			dataType : "json",			
			success : function(resultData) {
				
				$('.courses_first_line').empty();
				
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
					"<div class=course_container>"+
					"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
					"<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
					"<div class=course_star_rating>"+
					"<i class='far fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
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
		$.ajax({
			type:"post",
			async : true,
			url : "course-page-ajax.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"all"},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
									"<div class=course_star_rating>"+
										"<i class='far fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
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
	
	$('#course-view_yogayo_course').click(function(){
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"pro"},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
									"<div class=course_star_rating>"+
										"<i class='far fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
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
	$('#course-view_user_course').click(function(){
		$.ajax({
			type:"post",
			async : true,
			url : "search-course.do",
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			data : {"searchType":"user"},
			dataType : "json",			
			success : function(resultData) {
				$('.courses_first_line').empty();
				for(i in resultData.result){
					var list = "<div class=up-on-scroll>" +
						"<div class=course_container>"+
							"<a href=/test/course-detail?crsNum="+resultData.result[i].crsNum+">"+
								"<img src=/test/"+resultData.result[i].imgPath+" alt=course />"+
									"<div class=course_star_rating>"+
										"<i class='far fa-star'></i><span class=rateNum>"+resultData.result[i].total+"</span>(<span id=totalComment>"+resultData.result[i].totalComment+"</span>)"+
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
