//1번 차트

var ctx = document.getElementById("first_chart_").getContext('2d');

var myChart = new Chart(ctx, {
	type : 'line',
	data : {
		labels : [ "7일전", "6일전", "5일전", "4일전", "3일전", "2일전", "어제", "오늘" ],
		datasets : [ {
			label : '코스 조회수',
			data : [ 6, 3, 12, 19, 3, 5, 2, 3 ],
			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
					'rgba(255, 159, 64, 0.2)' ],
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
		}
	}
});

//2번 차트
var ctx = document.getElementById("second_chart_").getContext('2d');

var myChart = new Chart(ctx, {
	type : 'bar',
	data : {
		labels : [ "7일전", "6일전", "5일전", "4일전", "3일전", "2일전", "어제", "오늘" ],
		datasets : [ {
			label : '코스 조회수',
			data : [ 6, 3, 12, 19, 3, 5, 2, 3 ],
			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
					'rgba(255, 159, 64, 0.2)' ],
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
		}
	}
});

//3번 차트
var ctx = document.getElementById("third_chart_").getContext('2d');

var myChart = new Chart(ctx, {
	type : 'line',
	data : {
		labels : [ "7일전", "6일전", "5일전", "4일전", "3일전", "2일전", "어제", "오늘" ],
		datasets : [ {
			label : '코스 조회수',
			data : [ 6, 3, 12, 19, 3, 5, 2, 3 ],
			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
					'rgba(255, 159, 64, 0.2)' ],
			borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
					'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)' ],
			borderWidth : 3
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
		}
	}
});

//4번 차트
var ctx = document.getElementById("fourth_chart_").getContext('2d');

var myChart = new Chart(ctx, {
	type : 'line',
	data : {
		labels : [ "7일전", "6일전", "5일전", "4일전", "3일전", "2일전", "어제", "오늘" ],
		datasets : [ {
			label : '코스 조회수',
			data : [ 6, 3, 12, 19, 3, 5, 2, 3 ],
			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
					'rgba(255, 159, 64, 0.2)' ],
			borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
					'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)' ],
			borderWidth : 4
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
		}
	}
});