var arr=new Array();
var i=0
$(document).ready(function(){
	const interests = document.querySelectorAll(".interest");
	interests.forEach(function (interest) {
		  interest.addEventListener("click", function (e) {
		    const style = e.currentTarget.classList;
		    console.log(1)
		    e.currentTarget.classList.toggle("selected");
		    keyword=e.currentTarget.innerText;
		    if (e.currentTarget.classList.contains("selected")) {
		      str = e.currentTarget.classList;
		      classArr = str.toString().split(" ");
		      arr.push(keyword)
		      document.getElementById("keyword").setAttribute("value", arr.toString());
		    } else {
		      str = e.currentTarget.classList;
		      classArr = str.toString().split(" ");
		      arr.splice(arr.indexOf(keyword),1);
		      document.getElementById("keyword").setAttribute("value", arr.toString());
		    }
		  });
		  i++;
		});
})








