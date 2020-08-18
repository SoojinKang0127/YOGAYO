const interests = document.querySelectorAll(".interest");

interests.forEach(function (interest) {
  interest.addEventListener("click", function (e) {
    const style = e.currentTarget.classList;
    e.currentTarget.classList.toggle("selected");

    if (e.currentTarget.classList.contains("selected")) {
      str = e.currentTarget.classList;
      classArr = str.toString().split(" ");
      alert(classArr[0]);
      document.getElementById(classArr[0]).setAttribute("value", true);
    } else {
      str = e.currentTarget.classList;
      classArr = str.toString().split(" ");
      alert(classArr[0]);
      document.getElementById(classArr[0]).setAttribute("value", false);
    }
  });
});
