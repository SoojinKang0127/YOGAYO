$(function() {
	
	Chart.defaults.global.legend.display = false;

	
	var ctx2 = document.getElementById("stat1_data").getContext("2d")
	array = [data1, data2, data3, data4]
	var statistics_2_stat = new Chart(ctx2, {
		type: "bar",
		data: {
			labels: ["이번주", "1주전", "2주전", "3주전"],
			datasets: [
				{
					label: "weight",
					data: array,
					backgroundColor: [
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)"
						],
						borderWidth: 1,
				},
				],
		},
		options: {
			responsive: false,
			scales: {
				yAxes: [
					{
						ticks: {
							beginAtZero: true,
						},
					},
					],
			},
		},
	})
	
	var ctx3 = document.getElementById("stat2_data").getContext("2d")
	array = [data5, data6, data7, data8]
	var statistics_3_stat = new Chart(ctx3, {
		type: "line",
		data: {
			labels: ["이번주", "1주전", "2주전", "3주전"],
			datasets: [
				{

					data: array,
					backgroundColor: [
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						"rgba(54, 162, 235, 1)",
						],
						borderWidth: 3,
						borderColor: "rgba(54, 162, 235, 1)",
						fill: false,
						lineTension: 0
				},
				],
		},
		options: {
			responsive: false,
			scales: {
				yAxes: [
					{
						ticks: {
							beginAtZero: true,
						},
					},
					],
			},
		},
	})
	
})
