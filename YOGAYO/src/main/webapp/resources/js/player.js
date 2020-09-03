<<<<<<< HEAD
barArr = document.getElementsByClassName("order-progress-bar")
bar = barArr[0]
time = 100
play = document.getElementsByClassName("play-button")
p_btn = document.getElementsByClassName("fas fa-pause btn")
document.get
index = 0
timer = document.querySelector(
  "div.scroll-overflow > ul > li:nth-child(" +
    (index + 1) +
    ") > div.order-wrapper > div.order-title > div:nth-child(2)"
)
interval = null
heart = document.getElementsByClassName("fa-heart")

document.addEventListener("DOMContentLoaded", function () {
=======


document.addEventListener("DOMContentLoaded", function () {
	barArr = document.getElementsByClassName("order-progress-bar")
	bar = barArr[0]
	play = document.getElementsByClassName("play-button")
	p_btn = document.getElementsByClassName("fas fa-pause btn")
	document.get
	index = 0
	time = timeArr[index]
	timer = document.querySelector(
	  "div.scroll-overflow > ul > li:nth-child(" +
	    (index + 1) +
	    ") > div.order-wrapper > div.order-title > div:nth-child(2)"
	)
	interval = null
	heart = document.getElementsByClassName("fa-heart")
	
	
>>>>>>> master
  bar.style.animationDuration = time / 100 + "s"
  bar.style.animationName = "progress"
  bar.style.animationTimingFunction = "linear"
  bar.style.animationPlayState = "running"
  bar.style.animationFillMode = "forwards"

  interval = setInterval(() => {
    if (time > 0) {
<<<<<<< HEAD
      if (time > 1000) timer.innerText = "0:" + Math.round(time / 100)
      else {
        timer.innerText = "0:0" + Math.round(time / 100)
=======
      minute=parseInt (time/6000)
      if (time%6000 > 1000) timer.innerText = minute+":" + parseInt(time%6000 / 100)
      else {
        timer.innerText = minute+":0" + parseInt(time%6000 / 100)
>>>>>>> master
      }
      time--
    } else {
      if (barArr.length > index) {
<<<<<<< HEAD
        if (barArr.length - 1 == index) {
          time = 0
        } else {
          time = 100
        }
        index++
        bar = barArr[index]
        bar.style.animationDuration = time / 100 + "s"
=======
    	  index++
        if (barArr.length - 1 == index) {
          time = 0
        } else {
          time = timeArr[index]
        }
        bar = barArr[index]
        bar.style.animationDuration = parseInt(time / 100) + "s"
>>>>>>> master
        bar.style.animationName = "progress"
        bar.style.animationTimingFunction = "linear"
        bar.style.animationPlayState = "running"
        bar.style.animationFillMode = "forwards"
        timer = document.querySelector(
          "div.scroll-overflow > ul > li:nth-child(" +
            (index + 1) +
            ") > div.order-wrapper > div.order-title > div:nth-child(2)"
        )
<<<<<<< HEAD
=======
        $('audio').remove("#audio")
        $('body').append('<audio id="audio" src='+audioArr[index]+'></audio>')
        console.log(audioArr[index])
				audio=document.getElementById('audio').play();
>>>>>>> master
      } else if (barArr.length == index) {
        index++
        var popup2 = document.getElementById("pop2")
        var bgdark = document.getElementsByClassName("main-wrapper")
        popup2.style.visibility = "visible"
        bgdark[0].style.opacity = "0.5"
      }
    }
  }, 10)

<<<<<<< HEAD
=======


  
>>>>>>> master
  play[0].onclick = function a() {
    current_name = p_btn[0].className
    if (current_name == "fas fa-pause btn") {
      p_btn[0].className = "fas fa-play btn"
      p_btn = document.getElementsByClassName("fas fa-play btn")
      barArr[index].style.animationPlayState = "paused"
<<<<<<< HEAD
=======
      document.getElementById('audio').pause()
>>>>>>> master
      clearInterval(interval)
    } else {
      p_btn[0].className = "fas fa-pause btn"
      p_btn = document.getElementsByClassName("fas fa-pause btn")
      barArr[index].style.animationPlayState = "running"
<<<<<<< HEAD

=======
      document.getElementById('audio').play()
>>>>>>> master
      interval = setInterval(() => {
        if (time > 0) {
          if (time > 1000) timer.innerText = "0:" + Math.round(time / 100)
          else {
            timer.innerText = "0:0" + Math.round(time / 100)
          }
          time--
        } else {
          if (barArr.length > index) {
            index++
<<<<<<< HEAD
            time = 3000
=======
            time = timeArr[index]
>>>>>>> master
            bar = barArr[index]
            bar.style.animationDuration = time / 100 + "s"
            bar.style.animationName = "progress"
            bar.style.animationTimingFunction = "linear"
            bar.style.animationPlayState = "running"
            bar.style.animationFillMode = "forwards"
            timer = document.querySelector(
              "div.scroll-overflow > ul > li:nth-child(" +
                (index + 1) +
                ") > div.order-wrapper > div.order-title > div:nth-child(2)"
            )
          }
        }
      }, 10)
    }
  }

<<<<<<< HEAD
  like = document.getElementsByClassName("leftwrapper")

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
=======
	check_like=0
  $('.leftwrapper').click(function(){
	  if(check_like==0){
	  $('.far.fa-heart').attr('class','fas fa-heart');
	  check_like++;}
	  else{
		  $('.fas.fa-heart').attr('class','far fa-heart')
		  check_like--;
		  console.log(1)
	  }	
  })

  /*
	 * console.log(p_btn) length=0 velocity=1.28 pixel=0 max_pixel=380
	 * interval=setInterval(() => { if(pixel<=max_pixel){
	 * bar[0].style.width=length+"px" length+=velocity pixel=bar[0].style.width
	 * pixel=pixel.split("px") pixel=Number(pixel[0]) }else{
	 * bar[0].style.width=384+"px" clearInterval(interval)
	 *  }
	 *  }, 100);
	 */
>>>>>>> master
})
