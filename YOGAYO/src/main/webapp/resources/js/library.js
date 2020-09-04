$(window).ready(function() {


    $('.searching_bar').on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $('.s1_content_row1').filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });
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
	
	
		console.log(data);
		var count = Object.keys(data).length
        console.log(count)

        var check = data[pnum.toString()].tips[1];
        console.log(check)

			// for (var i = 0; i < data[pnum.toString()].stepbystep.length; i++) {
			// 	stepbystep.push('<li>' + data[pnum.toString()].stepbystep[i] + '</li>')
			// }
			for (var i = 0; i < count; i++) {
				tips.push(data[pnum.toString()].tips[i]);
			}
			for (var i = 0; i < count; i++) {
				benefit.push(data[pnum.toString()].benefit[i]);
			}
			// for (var i = 0; i < data[pnum.toString()].watchout.length; i++) {
			// 	watchout.push('<li>' + data[pnum.toString()].watchout[i] + '</li>')
			// }
			// for (var i = 0; i < data[pnum.toString()].variation.length; i++) {
			// 	variation.push('<li>' + data[pnum.toString()].variation[i] + '</li>')
			// }

		console.log(tips);
		// $(".stepBystep-content > ul").html(stepbystep);
		$(".pose_tips").html(tips);
		$(".pose_benefit").html(benefit);
		// $(".watchOutFor-content > ul").html(watchout);
		// $(".variations-content > ul").html(variation);


	})
});




