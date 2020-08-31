$(function() {

	var request = new XMLHttpRequest();
	var arr = $("body")
	var docbox = arr[0]
	//request.open("GET", "./myPage", true);
	request.open("POST", "./myPage?feed="+encodeURIComponent(docbox.value), true);
	request.onreadystatechange = after_ajax;
	request.send();

	var txt = "";
	var fNum = [];
	var sLevel = [];
	var context = [];
	var regDate = [];
	var uImg1 = [];
	var crsNum = [];
	
	var txt2 = "";
	var title = [];
	var dscrt = [];
	var imgPath = [];
	
	function after_ajax() {

		var gol = request.responseText;
		console.log(gol)
		if (request.readyState == 4 && request.status == 200) {
			var list = JSON.parse(gol)
			var keyLength = Object.keys(list).length;

			console.log(list[0].fNum)
			for (var i = 0; i < keyLength; i++) {
				fNum[i] = list[i].fNum
				sLevel[i] = list[i].sLevel
				context[i] = list[i].context
				regDate[i] = list[i].regDate
				uImg1[i] = list[i].uImg1
				crsNum[i] = list[i].crsNum
			}
			


				txt += "<div class='content_bottom_myRcds_title'>내 요가 후기</div>"

				for(var r=0; r<keyLength; r++) {
					
				txt += "<div class='content_bottom_myRcds_wrap'>"
				txt += "<div class='content_bottom_myRcds_info'>"
				txt += "<div class='content_bottom_myRcds_top'>"
				txt += "<div class='myRcds_time'>"
				txt += "<span class='myRcds_time_txt'>오늘 요가 시간:</span>"
				txt += "<div class='myRcds_time_usrtime'></div>"
				txt += "</div>"
				txt += "<div class='myRcds_crs'>"
				txt += " <span class='myRcds_crs_txt'>진행 코스:</span>"
				txt += "<div class='myRcds_crs_crsname'>"+crsNum[r]+" 코스"+"</div>"
				txt += "</div>"
				txt += "<div class='myRcds_stf'>"
				txt += "<span class='myRcds_stf_txt'>나의 만족도:</span>"
				txt += "<div class='myRcds_stf_usrstf'>"+sLevel[r]+"</div>"
				txt += "</div>"
				txt += "</div>"
				txt += "<div class='content_bottom_myRcds_middle'>"
				txt += "<div class='middle_txt'>"+context[r]+"<br /></div>"
				txt += "</div>"
				txt += "<div class='content_bottom_myRcds_bottom'>"
				txt += "<div class='bottom_time'>"+regDate[r]+"</div>"
				txt += "</div>"
				txt += "</div>"
				txt += "<img class='content_bottom_myRcds_img' alt='불러오지 못함' src='${pageContext.request.contextPath}"+uImg1[r]+"'>"
			//	txt += "<img class='content_bottom_myRcds_img' alt='불러오지 못함' src='"+uImg1[r]+"'>"
				txt += "</div>"
			//	txt += "<div class='white_space'><div>"
					
					console.log(uImg1[r])

				}
			
			$('.content_bottom_myRcds').html(txt)
			
			

		}

	}
	

})