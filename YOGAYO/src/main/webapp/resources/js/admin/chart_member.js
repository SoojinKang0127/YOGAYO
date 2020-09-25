//세 번째 차트

var randomScalingFactor = function() {
	return Math.round(Math.random() * 100);
};

var chartColors = window.chartColors;
var color = Chart.helpers.color;
var config = {
	data : {
		datasets : [ {
			data : [ highLevel, middleLevel, lowLevel ],
			backgroundColor : [ color(chartColors.red).alpha(0.5).rgbString(),
					color(chartColors.orange).alpha(0.5).rgbString(),
					color(chartColors.yellow).alpha(0.5).rgbString(),
					color(chartColors.green).alpha(0.5).rgbString(),
					color(chartColors.blue).alpha(0.5).rgbString(), ],
			label : 'My dataset' // for legend
		} ],
		labels : [ '상', '중', '하' ]
	},
	options : {
		responsive : false,
		legend : {
			position : 'bottom',
		},
		title : {
			display : true,
			text : '회원 레벨 비율'
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

// window.onload = function() {
// var ctx = document.getElementById('first_chart_');
// window.myPolarArea = Chart.PolarArea(ctx, config);
// };

// 두 번째 차트


var ctx2 = document.getElementById("second_chart_").getContext('2d');

var myChart = new Chart(ctx2, {
	type : 'bar',
	data : {
		labels : [ '10대', '20대', '30대', '40대', '50대', '60대'],
		datasets : [ {
			label : '연령대별 회원수',
			data : [ age_10, age_20, age_30, age_40, age_50, age_60],
			backgroundColor : [ 'rgba(255, 99, 132, 0.4)',
					'rgba(54, 162, 235, 0.4)', 'rgba(255, 206, 86, 0.4)',
					'rgba(75, 192, 192, 0.4)', 'rgba(153, 102, 255, 0.4)',
					'rgba(255, 159, 64, 0.4)' ],
			borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
					'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)' ],
			borderWidth : 2
		} ]
	},
	options : {
		maintainAspectRatio : true, // default value. false일 경우 포함된 div의 크기에 맞춰서
									// 그려짐.
		scales : {
			yAxes : [ {
				ticks : {
					beginAtZero : true
				}
			} ]
		},
		title : {
			display : true,
			text : '연령대별 회원수'
		},
		responsive : true,
		legend : {
			position : 'bottom',
			display : false
		}
	
	}
});

//첫 번째 차트

var config1 = {
	type : 'doughnut',
	data : {
		datasets : [ {
			data : [ female, male ],
			backgroundColor : [ window.chartColors.red,
					window.chartColors.green, window.chartColors.blue, ],
			label : 'Dataset 1'
		} ],
		labels : [ '여성', '남성' ]
	},
	options : {
		responsive : false,
		legend : {
			position : 'bottom',
		},
		title : {
			display : true,
			text : '회원 성별 비율'
		},
		animation : {
			animateScale : true,
			animateRotate : true
		}
	}
};

window.onload = function() {
	var ctx = document.getElementById('third_chart_');
	window.myPolarArea = Chart.PolarArea(ctx, config);

	var ctx1 = document.getElementById('first_chart_').getContext('2d');
	window.myDoughnut = new Chart(ctx1, config1);
};
