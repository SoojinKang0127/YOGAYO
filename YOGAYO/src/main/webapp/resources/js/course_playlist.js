<<<<<<< HEAD
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
  
var request = new XMLHttpRequest();

$('.course_search > .textbox').click(()=>{
var arr=$('.course_search > .textbox')
var box=arr[0]
console.log(box.value)
	request.open("Post", "./poseSearch?pose="+ encodeURIComponent(box.value),true);
	request.onreadystatechange=after_ajax;
	request.send(null);
})

function after_ajax(){
 if(request.readyState ==4 && request.status==200){
 	var list= eval('('+request.responseText+')')
 	console.log(list);
 	//받아온 데이터를 view에 알맞게 가공하여 붙이는 곳
 }
}


});



=======

$(function () {


    var request = new XMLHttpRequest();

    var arr = $('.course_search > .textbox')
    var box = arr[0]
    //request.open("Post", "./poseSearch?pose="+ encodeURIComponent(box.value),true);
    var doc = $('body')
    var docbox = doc[0];
    var txt = "";
    var pnum = [];
    var title = [];
    var img_path = [];
    var time = [];
    var difficulty = [];
    var audio_path = [];
    request.open("POST", "./course_playlist?pose=" + encodeURIComponent(docbox.value), true);
    request.onreadystatechange = after_ajax;
    request.send(null);


    function after_ajax() {

        if (request.readyState == 4 && request.status == 200) {
            var list = eval('(' + request.responseText + ')')

            for (var i = 0; i < Object.keys(list).length; i++) {
                pnum[i] = list[i].pnum
                title[i] = list[i].title
                img_path[i] = list[i].imgPath
                time[i] = list[i].time
                difficulty[i] = list[i].difficulty
                audio_path[i] = list[i].audioPath
            }


            for (var i = 0; i < Object.keys(list).length; i++) {
                arrayFn(i);
            }



            function arrayFn(r) {
                txt += "<li class='pose_content_box'>"
                txt += "<div class='pose_picture'>"
                txt += "<img src='" + img_path[r] + "' class='s1_img'>"
                txt += "</div>"
                txt += "<div class='pose_textarea'>"
                txt += "<div class='pose_title'>" + title[r] + "</div>"
                txt += "<div class='info_box'>"
                txt += "<div class='pose_time'>"
                txt += "<i class='far fa-clock' style='font-size: 24px;'></i>"
                txt += "<p class='time'>" + time[r] + "초</p>"
                txt += "</div>"
                txt += "<div class='pose_tag'>"
                txt += "<i class='fas fa-hashtag' style='font-size: 24px;'></i>"
                txt += "<p class='pose_tag_content'>허리</p>"
                txt += "</div>"
                txt += "<div class='difficulty'>"
                txt += "<i class='fas fa-universal-access' style='font-size: 24px;'></i>"
                txt += "<p class='difficulty_content'>" + difficulty[r] + "단계</p>"
                txt += "</div>"
                txt += "</div>"
                txt += "</div>"
                txt += "<img src='${pageContext.request.contextPath}../../resources/image/playlist/trash.jpg' class='trashBtn' ></img>"
                txt += "<span class='pnum'>" + pnum[r] + "</span>"
                txt += "</li>"

            }
            $('#sortable_list1').html(txt);

        }


        $('#searching_box').on("keyup", function () {
            var value = $(this).val().toLowerCase();
            $("#sortable_list1 .pose_content_box").filter(function () {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });



        $('#sortable_list2').sortable({

            //connectWith: '.pose_content_box',
            revert: true,
            connectWith: '.pose_content_box'

        });

        $('#sortable_list1 > li').draggable({
            connectToSortable: '#sortable_list2',
            helper: 'clone',
            appendTo: 'body',
            scroll: false,
            revert: "invaild",
            start: function (event, ui) {
                $(this).draggable("option", "cursorAt", {
                    left: Math.floor(this.clientWidth / 2),
                    top: Math.floor(this.clientHeight / 2)
                });
            }
        });

        $('ul,li').disableSelection();

        const click_obj = $('#object1')
        $('.pose_content_box').dblclick(function () {
            var clone = $(this).clone()
            clone.insertBefore(click_obj).hide().show('slow');
            $('#sortable_list2 .trashBtn').click(function () {
                $(this).parent().remove();
            })
            // $("#sortable_list2").has("li").css("background-color", "lightgreen"); 
        })





    }


   $('.button_box').click(function(){

    var index;
    var indexarr = [];
   // var ele = $('#sortable_list2 .pose_content_box').children('img');
    //console.log(ele)
    var list_num = $('#sortable_list2').find('.pose_content_box');
    for (var i = 0; i < list_num.length; i++) {
        index = $('#sortable_list2 .pnum').eq(i).text();
        indexarr.push(index);
        
    }

    console.log(indexarr);
    

    // for (var i = 0; i <list_num.length; i++) {
        
    //     var shift_num = indexarr.shift()
    //     document.getElementById('mypage_container').innerHTML += "<input type=\"hidden\" name=\"seq" + i + "\" value=\""+shift_num+"\"><br>";
    //     console.log(shift_num);
    // }

    
}) 


    



}) //end of ready

    //$(this).slideDown("slow");

    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
>>>>>>> master

