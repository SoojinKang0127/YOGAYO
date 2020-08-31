
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
                txt += "<span class='pnum'>"+pnum[r]+"</span>"
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
            clone.insertAfter(click_obj).hide().show('slow');
        
            // $("#sortable_list2").has("li").css("background-color", "lightgreen"); 
        })

        
     $('.addItem').click(function(){
        var a =$('.pnum').innerHTML();
        console.log(a);
        })   
        
        
        
        
    }
    


})

    //$(this).slideDown("slow");

    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------

