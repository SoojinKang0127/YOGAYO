const interests = document.querySelectorAll(".interest");
var arr=new Array();
var arr2=["저강도의","체력 단련","영적인 경험","체중 감량","균형","유연성","임신중에 할수 있는","근력개선","스트레스 감소","기분 및 행동개선",
	"만성요통","우울증","아이를 위한","정신건강","내적 평화","명상훈련","고강도의","현대 요가","호흡법","관절염","불면증","친구와 같이하는","천식"]
var i=0
interests.forEach(function (interest) {
  interest.addEventListener("click", function (e) {
    const style = e.currentTarget.classList;
    e.currentTarget.classList.toggle("selected");
    keyword=e.currentTarget.innerText;
    if (e.currentTarget.classList.contains("selected")) {
      str = e.currentTarget.classList;
      classArr = str.toString().split(" ");
      document.getElementById(classArr[0]).setAttribute("value", true);
      arr.push(keyword)
    } else {
      str = e.currentTarget.classList;
      classArr = str.toString().split(" ");
      document.getElementById(classArr[0]).setAttribute("value", false);
      arr.splice(arr.indexOf(keyword),1);
    }
  });
  i++;
});
