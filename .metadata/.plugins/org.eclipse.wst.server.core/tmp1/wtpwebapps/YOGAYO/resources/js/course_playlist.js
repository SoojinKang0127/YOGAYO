$(function() {	
	

	var request = new XMLHttpRequest();
	var arr = $('.course_search > .textbox')
	var box = arr[0]
	var doc = $('body')
	var docbox = doc[0];
	var txt = "";
	var pnum = [];
	var title = [];
	var img_path = [];
	var time = [];
	var difficulty = [];
	var audio_path = [];
	request.open("POST", "./course_playlist?pose="
			+ encodeURIComponent(docbox.value), true);
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
				txt += "<p class='difficulty_content'>" + difficulty[r]
						+ "단계</p>"
				txt += "</div>"
				txt += "</div>"
				txt += "</div>"
				txt += "<img src='${pageContext.request.contextPath}../../resources/image/playlist/trash.jpg' class='trashBtn' ></img>"
				txt += "<span class='pnum'>" + pnum[r] + "</span>"
				txt += "</li>"

			}
			$('#sortable_list1').html(txt);

		}

		$('#searching_box').on(
				"keyup",
				function() {
					var value = $(this).val().toLowerCase();
					$("#sortable_list1 .pose_content_box").filter(
							function() {
								$(this).toggle(
										$(this).text().toLowerCase().indexOf(
												value) > -1)
							});
				});

		$('#sortable_list2').sortable({

			revert : true,
			connectWith : '.pose_content_box'

		});

		$('#sortable_list1 > li').draggable({
			connectToSortable : '#sortable_list2',
			helper : 'clone',
			appendTo : 'body',
			scroll : false,
			revert : "invaild",
			start : function(event, ui) {
				$(this).draggable("option", "cursorAt", {
					left : Math.floor(this.clientWidth / 2),
					top : Math.floor(this.clientHeight / 2)
				});
			},
			stop : function(params) {
				$('#sortable_list2 .trashBtn').click(function() {
					$(this).parent().remove();
				})
			}

		});
		
		$('#sortable_list1 > li').draggable({
			connectToSortable : '#sortable_list2',
			helper : 'clone',
			appendTo : 'body',
			scroll : false,
			revert : "invaild",
			start : function(event, ui) {
				$(this).draggable("option", "cursorAt", {
					left : Math.floor(this.clientWidth / 2),
					top : Math.floor(this.clientHeight / 2)
				});
			},
			stop : function(params) {
				$('#sortable_list2 .trashBtn').click(function() {
					$(this).parent().remove();
				})
			}

		});

		$('ul,li').disableSelection();

		const click_obj = $('#object1')
		
	
		

		$('.pose_content_box').dblclick(
				function() {
					var clone = $(this).clone()
					clone.insertAfter(click_obj).hide().show('slow');
					var a = document.getElementById('object1')
					var formTag = document.getElementById('form_tag')

					a.innerHTML += '<input type="hidden" name="seq'
							+ $('#sortable_list2').length + '" value="'
							+ $(this.pnum).val() + '">';

					console.log(a)
					$('#sortable_list2 .trashBtn').click(function() {
						$(this).parent().remove();
					})
				})//end of dbclick
				
				

		var touchtime = 0;
		$(".pose_content_box").on("click", function() {
		    if (touchtime == 0) {
		        // set first click
		        touchtime = new Date().getTime();
		    } else {
		        // compare first click to this click and see if they occurred within double click threshold
		        if (((new Date().getTime()) - touchtime) < 800) {
		            // double click occurred
		        	var clone = $(this).clone()
					clone.insertAfter(click_obj).hide().show('slow');
					var a = document.getElementById('object1')
					var formTag = document.getElementById('form_tag')

					a.innerHTML += '<input type="hidden" name="seq'
							+ $('#sortable_list2').length + '" value="'
							+ $(this.pnum).val() + '">';

					console.log(a)
					$('#sortable_list2 .trashBtn').click(function() {
						$(this).parent().remove();
					})
		            touchtime = 0;
		        } else {
		            // not a double click so set as a new first click
		            touchtime = new Date().getTime();
		        }
		    }
		});
		
		
	}//end of ajax

	var form = $("#form_tag");

	$('.addItem').click(function() {

		var title = $(".title_box").val();
		var desc = $('.description_box').val();
		var coursethumbnail = document.getElementById('coursethumbnail');

		if (title.length == 0 || desc.length == 0) {
			alert("제대로 입력해주세요");
			return;
		} else if (coursethumbnail.files.length == 0) {
			alert("사진을 등록해주세요")
			return;
		} else {
			alert("코스를 등록했음")

			var list_num = $('#sortable_list2').find('.pose_content_box');

			indexarr = [];
			for (var i = 0; i < list_num.length; i++) {
				index = $('#sortable_list2 .pnum').eq(i).text();
				indexarr.push(index);
			}

			console.log(indexarr);

			for (var i = 1; i <= list_num.length; i++) {

				var shift_num = indexarr.shift()

				if (i == 1) {
					seq = $('#seq1');
				} else if (i == 2) {
					seq = $('#seq2');
				} else if (i == 3) {
					seq = $('#seq3');
				} else if (i == 4) {
					seq = $('#seq4');
				} else if (i == 5) {
					seq = $('#seq5');
				} else if (i == 6) {
					seq = $('#seq6');
				} else if (i == 7) {
					seq = $('#seq7');
				} else if (i == 8) {
					seq = $('#seq8');
				}
				seq.attr("value", shift_num);
			}
			form.submit();
		}
		//////////////////////////////////////////////////////
	})

}) //end of ready