$(window).ready(function() {
	// var requestURL = 'http://json/pose.json';
	// var request = new XMLHttpRequest();
	// request.open('GET' , requestURL);
	// request.responseType = 'json';
	// request.send();


	// request.onload = function(){
	//     var superHeroes = request.response;
	//     populateHeader(superHeroes);
	//     showHeroes(superHeroes);
	// }

	// function populateHeader(jsonObj) {
	//     var myH1 = document.createElement('h1');
	//     myH1.textContent = jsonObj['sqadName'];
	//     hea
	// }

	// $(".yoga-title").hover(function(){
	//     $(this).css("background-color","red")
	//     console.log("과연");
	//     $('/json/pose.json',function(data){
	//         console.log(JSON.stringify(data));
	//     })
	// })

	//    $.getJSON('./json/pose.json',function(data){
	//        var html = [];

	//         $.each(data, function(i, item){
	//             console.log(item.watchout.length);






	//           })
	//        }

	//    })



	// $.ajax({
	//     url:'${pageContext.request.contextPath}'/reources/json/pose.json',
	//     dataType:'JSON',
	//     success: function(data){
	//         $.each(data.key["0"], function(index, object){
	//             ///test/json/pose.json
	//             a[index]=[];
	//             a[index][0]=(index);
	//             a[index][1]=(object.watchout);

	//             console.log(data.key[0]);

	//         })

	//     }
	// })

	function getParameterByName(name) {
		name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
		var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
			results = regex.exec(location.search);
		return results === null
			? ""
			: decodeURIComponent(results[1].replace(/\+/g, " "));
	}

	$.getJSON('./resources/json/pose.json', function(data) {

		var pnum = getParameterByName("pnum")

		var stepbystep = [];
		var tips = [];
		var benefit = [];
		var watchout = [];
		var variation = [];


		
			for (var i = 0; i < data[pnum.toString()].stepbystep.length; i++) {
				stepbystep.push('<li>' + data[pnum.toString()].stepbystep[i] + '</li>')
			}
			for (var i = 0; i < data[pnum.toString()].tips.length; i++) {
				tips.push('<li>' + data[pnum.toString()].tips[i] + '</li>')
			}
			for (var i = 0; i < data[pnum.toString()].benefit.length; i++) {
				benefit.push('<li>' + data[pnum.toString()].benefit[i] + '</li>')
			}
			for (var i = 0; i < data[pnum.toString()].watchout.length; i++) {
				watchout.push('<li>' + data[pnum.toString()].watchout[i] + '</li>')
			}
			for (var i = 0; i < data[pnum.toString()].variation.length; i++) {
				variation.push('<li>' + data[pnum.toString()].variation[i] + '</li>')
			}


		$(".stepBystep-content > ul").html(stepbystep);
		$(".BeginnersTips-content > ul").html(tips);
		$(".Benefits-content > ul").html(benefit);
		$(".watchOutFor-content > ul").html(watchout);
		$(".variations-content > ul").html(variation);


	})




})
