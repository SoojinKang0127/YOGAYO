document.addEventListener("DOMContentLoaded", function () {
  data = "";
  res = "";
  mp3_path="";
  barArr = document.getElementsByClassName("order-progress-bar");
  bar = barArr[0];
  play = document.getElementsByClassName("play-button");
  p_btn = document.getElementsByClassName("fas fa-pause btn");
  index = 0;
  flag=0;
  time = timeArr[index];
  timer = document.querySelector(
    "div.scroll-overflow > ul > li:nth-child(" +
      (index + 1) +
      ") > div.order-wrapper > div.order-title > div:nth-child(2)"
  );
  interval = null;
  heart = document.getElementsByClassName("fa-heart");
  $("body").append('<audio id="feedback"></audio>');


  bar.style.animationDuration = time / 100 + "s";
  bar.style.animationName = "progress";
  bar.style.animationTimingFunction = "linear";
  bar.style.animationPlayState = "running";
  bar.style.animationFillMode = "forwards";
  $("#pose_big_img").attr("src", poseArr[0]);
  interval = setInterval(() => {
    if (time > 0) {
      minute = parseInt(time / 6000);
      if (time % 6000 > 1000)
        timer.innerText = minute + ":" + parseInt((time % 6000) / 100);
      else {
        timer.innerText = minute + ":0" + parseInt((time % 6000) / 100);
      }
      if(flag==0){
      time--;
      }
      if (time == 800) {
        sendAjaxRequest(index);
      }
    } else {
      if (barArr.length > index) {
        $("audio").remove("#feedback");
        $("body").append(
          '<audio id="feedback" src=\"/test/resources/audio/' + mp3_path + "\"></audio>"
        );
        index++;
        flag=1
        feedback=document.getElementById("feedback");
        feedback.play();
        feedback.onended=function(){
        flag=0;
        audio = document.getElementById("audio").play();
        bar = barArr[index];
        bar.style.animationDuration = parseInt(time / 100) + "s";
        bar.style.animationName = "progress";
        bar.style.animationTimingFunction = "linear";
        bar.style.animationPlayState = "running";
        bar.style.animationFillMode = "forwards";
        
        }
        $("#pose_big_img").attr("src", poseArr[index]);
        if (barArr.length - 1 == index) {
          time = 0;
        } else {
          time = timeArr[index];
        }
        timer = document.querySelector(
          "div.scroll-overflow > ul > li:nth-child(" +
            (index + 1) +
            ") > div.order-wrapper > div.order-title > div:nth-child(2)"
        );
        $("audio").remove("#audio");
        $("body").append(
          '<audio id="audio" src=' + audioArr[index] + "></audio>"
        );
        console.log(audioArr[index]);
        $(".list-header-count").html("코스 " + (index + 1) + "/8");
      } else if (barArr.length == index) {
        index++;
        var popup2 = document.getElementById("pop2");
        var bgdark = document.getElementsByClassName("main-wrapper");
        popup2.style.visibility = "visible";
        bgdark[0].style.opacity = "0.5";
      }
    }
  }, 10);

  play[0].onclick = function a() {
    current_name = p_btn[0].className;
    if (current_name == "fas fa-pause btn") {
      p_btn[0].className = "fas fa-play btn";
      p_btn = document.getElementsByClassName("fas fa-play btn");
      barArr[index].style.animationPlayState = "paused";
      document.getElementById("audio").pause();
      clearInterval(interval);
    } else {
      p_btn[0].className = "fas fa-pause btn";
      p_btn = document.getElementsByClassName("fas fa-pause btn");
      barArr[index].style.animationPlayState = "running";
      document.getElementById("audio").play();
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
            time = timeArr[index];
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
  var request_like = new XMLHttpRequest();
  var request_dislike = new XMLHttpRequest();

  request_like.onreadystatechange = function () {
    if (request_like.readyState == 4 && request_like.status == 200) {
      var count = eval(request_like.responseText);
      $(".like-number").text(count.toString());
    }
  };

  request_dislike.onreadystatechange = function () {
    if (request_dislike.readyState == 4 && request_dislike.status == 200) {
      var count = eval(request_dislike.responseText);
      $(".like-number").text(count.toString());
    }
  };

  $(".leftwrapper").click(function () {
    if ($(".far.fa-heart").length) {
      $(".far.fa-heart").attr("class", "fas fa-heart");
      request_like.open(
        "POST",
        "./likeCourse?uNum=" + uNum + "&crsNum=" + crsNum,
        true
      );
      request_like.send(null);
    } else {
      $(".fas.fa-heart").attr("class", "far fa-heart");
      request_dislike.open(
        "POST",
        "./dislikeCourse?uNum=" + uNum + "&crsNum=" + crsNum,
        true
      );
      request_dislike.send(null);
    }
  });

  $(".pop1-btn").click((e) => {
    location.href = "course-page";
  });

  function sendAjaxRequest(index) {
    takepicture();
    var json = { data: data, pnum: pnumArr[index] };
    $.post("http://52.78.54.179:5000/index", json, function (data) {
      console.log(data);
      mp3_path=data
    });
  }


  // The width and height of the captured photo. We will set the
  // width to the value defined here, but the height will be
  // calculated based on the aspect ratio of the input stream.

  var width = 432; // We will scale the photo width to this
  var height = 0; // This will be computed based on the input stream
  // |streaming| indicates whether or not we're currently streaming
  // video from the camera. Obviously, we start at false.

  var streaming = false;

  // The various HTML elements we need to configure or control. These
  // will be set by the startup() function.

  var video = null;
  var canvas = null;

  function startup() {
    video = document.getElementById("gum");
    canvas = document.createElement("canvas");

    navigator.mediaDevices
      .getUserMedia({ video: true, audio: false })
      .then(function (stream) {
        video.srcObject = stream;
        video.play();
      })
      .catch(function (err) {
        console.log("An error occurred: " + err);
      });

    video.addEventListener(
      "canplay",
      function (ev) {
        if (!streaming) {
          height = video.videoHeight / (video.videoWidth / width);

          // Firefox currently has a bug where the height can't be read from
          // the video, so we will make assumptions if this happens.

          if (isNaN(height)) {
            height = width / (4 / 3);
          }

          video.setAttribute("width", width + "%");
          video.setAttribute("height", height + "%");
          canvas.setAttribute("width", width + "%");
          canvas.setAttribute("height", height + "%");
          streaming = true;
        }
      },
      false
    );

    //    startbutton.addEventListener('click', function(ev){
    //      takepicture();
    //      ev.preventDefault();
    //    }, false);
  }

  // Fill the photo with an indication that none has been
  // captured.

  // Capture a photo by fetching the current contents of the video
  // and drawing it into a canvas, then converting that to a PNG
  // format data URL. By drawing it on an offscreen canvas and then
  // drawing that to the screen, we can change its size and/or apply
  // other changes before drawing it.

  function takepicture() {
    var context = canvas.getContext("2d");
    console.log("사진찍음");
    if (width && height) {
      canvas.width = width;
      canvas.height = height;
      context.drawImage(video, 0, 0, width, height);
      data = canvas.toDataURL("image/png");
    } else {
      clearphoto();
    }
  }

  function clearphoto() {
    var context = canvas.getContext("2d");
    context.fillStyle = "#AAA";
    context.fillRect(0, 0, canvas.width, canvas.height);
    var data = canvas.toDataURL("image/png");
    //photo.setAttribute('src', data);
  }
  
  function fordomain(){
    
  $('body').append('<div class="domain" style="height: 600px; width: 1310px; background-color: #2d8cff; display:inline-block;z-index=5;position:absolute;margin-top=20px;margin-left:90px;opacity:0.9"><div>의자 자세와 플랭크 자세에서 포즈 디텍팅을 진행합니다.</div><div><a>화면 중앙에 전신이 나오도록 위치해주세요.</a></div><div class="ok">확인</div></div>')
  $('.domain div:nth-child(1)').css({color:'white','align-items':'center','font-size':'30px','margin-left':'30px','margin-bottom':'30px','margin-top':'300px'})
  $('.domain div:nth-child(2)').css({color:'white','align-items':'center','font-size':'20px','margin-left':'30px','margin-bottom':'30px'})
  $('.domain div:nth-child(2) a').css({color:'white'})
   $('.ok').css({color:'white','align-items':'center','font-size':'20px','margin-left':'30px',})
  $('.ok').click(function(){
  $('.domain').hide()
  })
  }



  // Set up our event listener to run the startup process
  // once loading is complete.
  window.addEventListener("load", startup, false);
  var windowWidth = $( window ).width();
  if(windowWidth>739){
	  fordomain()
  }
  
});