$(window).ready(function() {

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
