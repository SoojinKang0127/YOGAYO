$(window).ready(function () {
  $("#main-start_btn").hover(
    function () {
      $(this).css("background-color", "#dddddd");
    },
    function () {
      $(this).css("background-color", "white");
    }
  );

  $("#main-to_course_btn").hover(
    function () {
      $(this).css("background-color", "#717171");
    },
    function () {
      $(this).css("background-color", "black");
    }
  );

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
  

request = new XMLHttpRequest();
request.open("POST", "./main", true);
	request.onreadystatechange = after_ajax;
	request.send(null);
	function after_ajax() {
	if (request.readyState == 4 && request.status == 200) {
    data=eval('('+request.responseText+')')
    html='<div class="up-on-scroll">'+
    '<div class="main-second_bg">'+
      '<div class="main-recommand">'+
        '<a href="'+contextPath+'/course-detail?crsNum='+data[0].crsNum+'">'+
          '<div class="img_temp"><img src="'+contextPath+'/'+data[0].imgPath+'"/></div>'+
          '<div class="main-first_course">'+
            '<div class="main-course_title">'+data[0].title+
            '</div>'+
            '<div class="main-first_course_explain">'+
              data[0].dscrt+'</div>'+
          '</div>'+
        '</a>'+
      '</div>'+
      '<div class="main-recommand">'+
      '<a href="'+contextPath+'/course-detail?crsNum='+data[1].crsNum+'">'+
      '<div class="img_temp"><img src="'+contextPath+'/'+data[1].imgPath+'"/></div>'+
      '<div class="main-first_course">'+
        '<div class="main-course_title">'+data[1].title+
        '</div>'+
        '<div class="main-first_course_explain">'+
          data[1].dscrt+'</div>'+
      '</div>'+
    '</a>'+
      '</div>'+
      '<div class="main-recommand">'+
      '<a href="'+contextPath+'/course-detail?crsNum='+data[2].crsNum+'">'+
      '<div class="img_temp"><img src="'+contextPath+'/'+data[2].imgPath+'"/></div>'+
      '<div class="main-first_course">'+
        '<div class="main-course_title">'+data[2].title+
        '</div>'+
        '<div class="main-first_course_explain">'+
          data[2].dscrt+'</div>'+
      '</div>'+
    '</a>'+
      '</div>'+
    '</div>'+
  '</div>'+
  '<div class="up-on-scroll">'+
     '<div class="main-second_bg">'+
      '<div class="main-recommand">'+
      '<a href="'+contextPath+'/course-detail?crsNum='+data[3].crsNum+'">'+
      '<div class="img_temp"><img src="'+contextPath+'/'+data[3].imgPath+'"/></div>'+
      '<div class="main-first_course">'+
        '<div class="main-course_title">'+data[3].title+
        '</div>'+
        '<div class="main-first_course_explain">'+
          data[3].dscrt+'</div>'+
      '</div>'+
    '</a>'+
      '</div>'+
      '<div class="main-recommand">'+
      '<a href="'+contextPath+'/course-detail?crsNum='+data[4].crsNum+'">'+
      '<div class="img_temp"><img src="'+contextPath+'/'+data[4].imgPath+'"/></div>'+
      '<div class="main-first_course">'+
        '<div class="main-course_title">'+data[4].title+
        '</div>'+
        '<div class="main-first_course_explain">'+
          data[4].dscrt+'</div>'+
      '</div>'+
    '</a>'+
      '</div>'+
      '<div class="main-recommand">'+
      '<a href="'+contextPath+'/course-detail?crsNum='+data[5].crsNum+'">'+
      '<div class="img_temp"><img src="'+contextPath+'/'+data[5].imgPath+'"/></div>'+
      '<div class="main-first_course">'+
        '<div class="main-course_title">'+data[5].title+
        '</div>'+
        '<div class="main-first_course_explain">'+
          data[5].dscrt+'</div>'+
      '</div>'+
    '</a>'+
      '</div>'+
    '</div>'+ 
  '</div>'
    console.log(html)
    $('.main-second_container').html("")
    $('.main-second_container').html(html)

    
	}
	}
});
