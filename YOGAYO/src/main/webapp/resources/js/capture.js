(function () {
  // The width and height of the captured photo. We will set the
  // width to the value defined here, but the height will be
  // calculated based on the aspect ratio of the input stream.

  var width = 132; // We will scale the photo width to this
  var height = 0; // This will be computed based on the input stream

  // |streaming| indicates whether or not we're currently streaming
  // video from the camera. Obviously, we start at false.

  var streaming = false;

  // The various HTML elements we need to configure or control. These
  // will be set by the startup() function.

  var video = null;
  var canvas = null;
  var photo = null;
  var startbutton = null;
  var img = document.getElementsByTagName("img");

  function startup() {
    video = document.getElementById("gum");
    canvas = document.createElement("canvas");
    photo = document.getElementById("photo");
    startbutton = document.getElementById("startbutton");

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
    if (width && height) {
      canvas.width = width;
      canvas.height = height;
      context.drawImage(video, 0, 0, width, height);

      var data = canvas.toDataURL("image/png");

      var f = document.createElement("form"); // form 엘리멘트 생성
      f.setAttribute("method", "post"); // method 속성을 post로 설정
      f.setAttribute("action", "view"); // submit했을 때 무슨 동작을 할 것인지 설정
      document.body.appendChild(f); // 현재 페이지에 form 엘리멘트 추가

      var i = document.createElement("input"); // input 엘리멘트 생성
      i.setAttribute("type", "hidden"); // type 속성을 hidden으로 설정
      i.setAttribute("name", "img"); // name 속성을 'm_nickname'으로 설정
      //i.setAttribute("value",url); // value 속성을 neilong에 담겨있는 값으로 설정

      i.setAttribute("value", data);
      console.log(data);
      f.appendChild(i); // form 엘리멘트에 input 엘리멘트 추가
      const a = document.createElement("a");
    } else {
      clearphoto();
    }
  }

  // Set up our event listener to run the startup process
  // once loading is complete.
  window.addEventListener("load", startup, false);
})();