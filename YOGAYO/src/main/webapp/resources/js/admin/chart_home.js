//1번 차트

var ctx = document.getElementById("first_chart_").getContext('2d');

var myChart = new Chart(ctx, {
	type : 'line',
	data : {
		labels : [ "7일전", "6일전", "5일전", "4일전", "3일전", "2일전", "어제", "오늘" ],
		datasets : [ {
			label : '가입 회원',
			data : [ newMemberDay7ago, newMemberDay6ago, newMemberDay5ago, newMemberDay4ago, newMemberDay3ago, newMemberDay2ago, newMemberDay1ago, newMemberToday ],
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
			label : '작성 코스',
			data : [ newCourseDay7ago, newCourseDay6ago, newCourseDay5ago, newCourseDay4ago, newCourseDay3ago, newCourseDay2ago, newCourseDay1ago, newCourseToday ],
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
			label : '피드수',
			data : [ newFeedDay7ago, newFeedDay6ago, newFeedDay5ago, newFeedDay4ago, newFeedDay3ago, newFeedDay2ago, newFeedDay1ago, newFeedToday ],
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
			label : '댓글수',
			data : [ newCommentDay7ago, newCommentDay6ago, newCommentDay5ago, newCommentDay4ago, newCommentDay3ago, newCommentDay2ago, newCommentDay1ago, newCommentToday ],
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