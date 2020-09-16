$(function () {
  $(document).ready(function () {
	  
  })

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
  

})
