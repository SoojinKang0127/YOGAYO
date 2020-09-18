$(function () {
  var mql = window.matchMedia("screen and (max-width: 599px)")

  if (mql.matches) {
    $(".feed1_head").click(function () {
      $(".main_2").animate({ top: "0" }, 500)
    })

    $(".feed2_head").click(function () {
      $(".main_2").animate({ top: "-520" }, 500)
    })

    $(".feed3_head").click(function () {
      $(".main_2").animate({ top: "-1030" }, 500)
    })
  } else {
    $(".feed1_head").click(function () {
      $(".main_2").animate({ left: "0" }, 500)
      // $(".main_2").offset({ left: 580 })
    })

    $(".feed2_head").click(function () {
      // $(".main_2").offset({ left: -30 })
      $(".main_2").animate({ left: "-610" }, 500)
    })

    $(".feed3_head").click(function () {
      // $(".main_2").offset({ left: -640 })
      $(".main_2").animate({ left: "-1220" }, 500)
    })
  }
})
