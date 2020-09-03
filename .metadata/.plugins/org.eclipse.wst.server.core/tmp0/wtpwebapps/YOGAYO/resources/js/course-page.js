$(window).ready(function () {
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
