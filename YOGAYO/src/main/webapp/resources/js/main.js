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
	
	}
	}
});
