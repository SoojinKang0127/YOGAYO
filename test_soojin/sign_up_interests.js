const interests = document.querySelectorAll(".interest");

interests.forEach(function (interest) {
  interest.addEventListener("click", function (e) {
    const style = e.currentTarget.classList;
    e.currentTarget.classList.toggle("selected");
  });
});
