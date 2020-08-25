$(function () {
  $("#sortable_list2").sortable({})

  //   $("#sortable_list1").sortable({
  //     connectWith: "#sortable_list2, #sortable_list1",
  //     start: function () {
  //       console.log("start")
  //     },
  //     stop: function () {
  //       console.log("end")
  //     },
  //   })
  checkArr = []

  var $newdiv1 = $("<div id='object1'>ddd</div>"),
    newdiv2 = document.createElement("div"),
    existingdiv1 = document.getElementById("sortable_list2")
  $(document).ready(function () {
    var index = $(".pose_content_box")
    //console.log(index)
  })

  //   $(".pose_content_box").click(function () {
  //     console.log($(".pose_content_box").index(this))
  //     idx = $(".pose_content_box").index(this)
  //     checkArr[idx] = 1
  //     console.log(checkArr)
  //   })

  //   $(".pose_content_box").dblclick(function () {
  //     $(this).removeClass("pose_picture")
  //     console.log(this)
  //     // $(this).insertAfter("#object1")

  //     console.log("index" + ":" + $("li").index(this))

  //     index = $("li").index(this)
  //     var arr = []
  //     arr.push(index)
  //     console.log(arr.reverse())
  //     console.log(arr.reverse().toString)

  // $(this).removeClass(function(){
  //     return $(this).
  // });
  // $(this).addClass('')
  // var index = $(".pose_content_box").index(this)
  // $()
  // console.log(index)

  // var arr = []
  // indexA == arr.push(index)
  // console.log(indexA)
  // console.log(arr.toString());
  //})



  //ㅌㅐ겸코드
//   $(".pose_content_box").mousedown(function (e) {
//     //console.log("left: " + (this.offsetLeft + 66))
//     //console.log("top: " + (this.offsetTop + 235))
//     obj = $(this).clone()
//     obj.css("position", "absolute")
//     obj.addClass("drag_this")
//     obj.css({ left: "0px", top: "0px" })
//     console.log(obj.attr("class"))
//     $("body").append(obj)
//     $(window).mousemove(e2 => {
//       obj.css("top", e2.clientY + "px")
//       obj.css("left", e2.clientX + "px")
//     })
//   })
//   $(".pose_content_box").mouseup(e2 => {
//     target = $(".drag_this").remove()
//     $(window).off("mousemove")
//     $(window).unbind("mousemove")
//     console.log()
//   })
// })

// $(".pose_content_box").draggable({
//   helper: 'clone',
//   revert: 'invalid',
//   appendTo: '#object1',
//   connectToSortable: "#object1"
// })

  // $('.pose_content_box').draggable({
  //   helper : 'clone',
  //   revert : 'invalid',


  // });

  $('#sortable_list1').draggable({
    containment : ".pose_info_wrapper",
    scroll : false
  })


  $('#sortable_list2').sortable({

    connectWith : '.pose_content_box'
  })
// })

    
  $( '#sortable_list1 li' ).draggable({
      connectToSortable: '#sortable_list2',
      helper: 'clone',
      appendTo : 'body'
      
  });
  $('#sortable_list2 li')
      .sortable()
      .droppable({
      
          drop: function(e,ui) {
            var element = $(ui.draggable);
            element.resizable({ 
                containment: "parent",
                handles: "all"
            });
            $(this).append($('#object1'));
      
          }
      })

  $('ul,li').disableSelection();




});




