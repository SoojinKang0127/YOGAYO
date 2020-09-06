$(window).ready(function () {


    $('.searching_bar').on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $('.s1_content_row1').filter(function () {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });




    // function getParameterByName(name) {
    //     name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    //     var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
    //         results = regex.exec(location.search);
    //     return results === null
    //         ? ""
    //         : decodeURIComponent(results[1].replace(/\+/g, " "));
    // }



    $.getJSON('./resources/json/pose.json', data => {
        $('#list1').find('.pose_tips').each((i, el) => { 
            $(el)[0].innerText = data[i].tips.join('\n')
        });
        $('#list1').find('.pose_benefit').each((i, el) => { 
            $(el)[0].innerText = data[i].benefit.join('\n')
        });
    }
    )}
)



