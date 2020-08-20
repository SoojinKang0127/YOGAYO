barArr = document.getElementsByClassName("order-progress-bar");
bar = barArr[0];
time = 3000;
play=document.getElementsByClassName("play-button")
p_btn = document.getElementsByClassName("fas fa-pause btn");
document.get;
index = 0;
timer = document.querySelector(
  "div.scroll-overflow > ul > li:nth-child(" +
    (index + 1) +
    ") > div.order-wrapper > div.order-title > div:nth-child(2)"
);
interval = null;
heart=document.getElementsByClassName("fa-heart")

document.addEventListener("DOMContentLoaded", function () {
  bar.style.animationDuration = time / 100 + "s";
  bar.style.animationName = "progress";
  bar.style.animationTimingFunction = "linear";
  bar.style.animationPlayState = "running";
  bar.style.animationFillMode = "forwards";

  interval = setInterval(() => {
    if (time > 0) {
      if (time > 1000) timer.innerText = "0:" + Math.round(time / 100);
      else {
        timer.innerText = "0:0" + Math.round(time / 100);
      }
      time--;
    } else {
      if (barArr.length > index) {
        index++;
        time = 3000;
        bar = barArr[index];
        bar.style.animationDuration = time / 100 + "s";
        bar.style.animationName = "progress";
        bar.style.animationTimingFunction = "linear";
        bar.style.animationPlayState = "running";
        bar.style.animationFillMode = "forwards";
        timer = document.querySelector(
          "div.scroll-overflow > ul > li:nth-child(" +
            (index + 1) +
            ") > div.order-wrapper > div.order-title > div:nth-child(2)"
        );
      }
    }
  }, 10);

  play[0].onclick = function () {
    current_name = p_btn[0].className;
    if (current_name == "fas fa-pause btn") {
      p_btn[0].className = "fas fa-play btn";
      p_btn = document.getElementsByClassName("fas fa-play btn");
      barArr[index].style.animationPlayState = "paused";
      clearInterval(interval);
    } else {
      p_btn[0].className = "fas fa-pause btn";
      p_btn = document.getElementsByClassName("fas fa-pause btn");
      barArr[index].style.animationPlayState = "running";

      interval = setInterval(() => {
        if (time > 0) {
          if (time > 1000) timer.innerText = "0:" + Math.round(time / 100);
          else {
            timer.innerText = "0:0" + Math.round(time / 100);
          }
          time--;
        } else {
          if (barArr.length > index) {
            index++;
            time = 3000;
            bar = barArr[index];
            bar.style.animationDuration = time / 100 + "s";
            bar.style.animationName = "progress";
            bar.style.animationTimingFunction = "linear";
            bar.style.animationPlayState = "running";
            bar.style.animationFillMode = "forwards";
            timer = document.querySelector(
              "div.scroll-overflow > ul > li:nth-child(" +
                (index + 1) +
                ") > div.order-wrapper > div.order-title > div:nth-child(2)"
            );
          }
        }
      }, 10);
    }
  };

  like = document.getElementsByClassName("leftwrapper");

  like[0].onclick(function () {
    console.log(1)
  });
  /*
    console.log(p_btn)
    length=0
    velocity=1.28
    pixel=0
    max_pixel=380
    interval=setInterval(() => { 
        if(pixel<=max_pixel){
        bar[0].style.width=length+"px"
        length+=velocity
        pixel=bar[0].style.width
        pixel=pixel.split("px")
        pixel=Number(pixel[0])
        }else{
            bar[0].style.width=384+"px"
            clearInterval(interval)

        }
        
    }, 100);
    */
});
