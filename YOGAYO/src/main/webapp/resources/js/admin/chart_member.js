//첫 번째 차트

var randomScalingFactor = function() {
	return Math.round(Math.random() * 100);
};

var chartColors = window.chartColors;
var color = Chart.helpers.color;
var config = {
	data : {
		datasets : [ {
			data : [ 53, 120 ],
			backgroundColor : [ color(chartColors.red).alpha(0.5).rgbString(),
					color(chartColors.orange).alpha(0.5).rgbString(),
					color(chartColors.yellow).alpha(0.5).rgbString(),
					color(chartColors.green).alpha(0.5).rgbString(),
					color(chartColors.blue).alpha(0.5).rgbString(), ],
			label : 'My dataset' // for legend
		} ],
		labels : [ '남성', '여성' ]
	},
	options : {
		responsive : false,
		legend : {
			position : 'bottom',
		},
		title : {
			display : true,
			text : '회원 성별/연령별 비율'
		},
		scale : {
			ticks : {
				beginAtZero : true
			},
			reverse : false
		},
		animation : {
			animateRotate : false,
			animateScale : true
		}
	}
};

//window.onload = function() {
//	var ctx = document.getElementById('first_chart_');
//	window.myPolarArea = Chart.PolarArea(ctx, config);
//};

// 두 번째 차트



var config2 = {
	type : 'doughnut',
	data : {
		datasets : [ {
			data : [ 10, 40, 50 ],
			backgroundColor : [ window.chartColors.red,
					window.chartColors.orange, window.chartColors.yellow,
					window.chartColors.green, window.chartColors.blue, ],
			label : 'Dataset 1'
		} ],
		labels : [ '상', '중', '하']
	},
	options : {
		responsive : false,
		legend : {
			position : 'bottom',
		},
		title : {
			display : true,
			text : '회원 숙련도 비율'
		},
		animation : {
			animateScale : true,
			animateRotate : true
		}
	}
};

window.onload = function() {
	var ctx = document.getElementById('first_chart_');
	window.myPolarArea = Chart.PolarArea(ctx, config);
	
	var ctx = document.getElementById('second_chart_').getContext('2d');
	window.myDoughnut = new Chart(ctx, config2);
};




