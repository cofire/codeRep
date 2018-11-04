
$(document).ready(function() {
    $.ajaxSettings.async = false;
    var length = $("body #key").length;
    for (var i = 0; i < length; i++) {
        var key = $("body #key:eq(" + i +")").val();
        var info = getInfo(key);
        if(info.type == "calendar"){
                $("body #key:eq(" + i +")").parent().next().prepend(createTable(info));
                setTableStyle(info,i);
            }
            
        if(info.type == "pixel"){
            createPixel(info);
            setPixelStyle(info);
        }

        if(info.type == "time"){
            createPixel(info);
            $("td").css("background-color",info.bgColor);

            createTime(info);

            setInterval(function(){
               createTime(info);
              }, 1000);
        }
    }
});

function createTime(info){
    var date = new Date();
    createNumber(info,10,0);

    var hour = date.getHours();
    var minute = date.getMinutes();
    var second = date.getSeconds();

    var decimal=0;
    var bit =0;

    decimal = parseInt(hour / 10);
    bit = hour % 10;
    createNumber(info,decimal,0);
    createNumber(info,bit,1);

    decimal = parseInt(minute / 10);
    bit = minute % 10;
    createNumber(info,decimal,2);
    createNumber(info,bit,3);
}

// info json 数据
// key 代表数字
// type 代表 数字的种类 包括 小时的十位各位，分钟的十位个位 0,1,2,3,
function createNumber(info,key,type){
    var pixels;
    var offset;
    switch(key)
    {
        case 0:
            pixels = info.number.zero;
            break;
        case 1: 
            pixels = info.number.one;
            break;
        case 2:
            pixels = info.number.two;
            break;
        case 3:
            pixels = info.number.three;
            break;
        case 4:
            pixels = info.number.four;
            break;
        case 5:
            pixels = info.number.five;
            break;
        case 6:
            pixels = info.number.six;
            break;
        case 7:
            pixels = info.number.seven;
            break;
        case 8:
            pixels = info.number.eight;
            break;
        case 9:
            pixels = info.number.nine;
            break;
        case 10:
            pixels = info.number.dots;
            type = 0;
            break;
    }

    switch(type)
    {
        case 0:
            offset = 0;
            break;
        case 1:
            offset = 5;
            break;
        case 2:
            offset = 13;
            break;
        case 3:
            offset = 18;
            break;
    }

    clearStyle(info,offset);
    setNumberStyle(pixels,offset);
}

function clearStyle(info,offset){
    var pixels = info.number.clear;
    for(var i = 0;i<pixels.length;i++){
        pixel = pixels[i];

        var x = pixel[0];
        var y = pixel[1] + offset;

        var st = "row" + x + "col" + y;
        $("."+st).css("background-color",info.bgColor);
    }
}

function setNumberStyle(pixels,offset){
    for(var i = 0;i<pixels.length;i++){
        pixel = pixels[i];

        var x = pixel[0];
        var y = pixel[1] + offset;

        var st = "row" + x + "col" + y;
        $("."+st).css("background-color",pixel[2]);
    }
}
//$("body #key:eq(" + i +")").children("span").
function setTableStyle(info,i){
  var workDays = info.style.workDays;
  var overDays = info.style.overDays;
  var offDays = info.style.offDays;

  for(var j = 0;j<workDays.length;j++){
    var st = "day" + workDays[j];
    $("body #key:eq(" + i +")").parent().next().find("."+st).addClass("work");
  }

  for(var j = 0;j<overDays.length;j++){
    var st = "day" + overDays[j];
    $("body #key:eq(" + i +")").parent().next().find("."+st).addClass("over");
  }

  for(var j = 0;j<offDays.length;j++){
    var st = "day" + offDays[j];
   $("body #key:eq(" + i +")").parent().next().find("."+st).addClass("off");
  }
}

function getInfo(name){
    var path = "/resource/post/json/" + name + ".json";
    var info = new Array();
    $.getJSON(path,function(data){
      info = data;
    })
    return info;
}

function createTable(info) {
    //$("#tb").empty();
    var table = document.createElement("table");
    // table.border = "1";
    // table.width = "80%";
    var date = info.date;
    var dateArray = date.split("-");

    var dataNow = new Date(dateArray[0], dateArray[1], 0);
    var days = dataNow.getDate();
    dataNow = new Date(date);
    var daysFirst = dataNow.getDay();
    //table API
    //创建一行
    //var tr = table.insertRow(table.rows.length);
    //创建单元格
    //var td = tr.insertCell(tr.cells.length);
    var tr, td;
    var count = 0;
    var header = "日一二三四五六";

    outer:
        for (var i = 0; i < 7; i++) {
            //循环插入元素
            tr = table.insertRow(table.rows.length);
            if (i == 0) {
                for (var j = 0; j < header.length; j++) {
                    td = tr.insertCell(tr.cells.length);
                    td.innerHTML = "<span class='head'>" + header.charAt(j) + "</span>";
                    td.align = "center";
                }
                continue;
            }

            if (i == 1) {
                for (var k = 0; k < daysFirst; k++) {
                    td = tr.insertCell(tr.cells.length);
                }

                for (var j = daysFirst; j < 7; j++) {
                    td = tr.insertCell(tr.cells.length);

                    count++;
                    td.innerHTML = "<span class=' day" + count + "'>" + count + "</span>";
                    td.align = "center";
                }
                continue;
            }

            for (var j = 0; j < 7; j++) {

                // if(i==1){
                //   for(var k=0;k<daysFirst;k++){
                //     td = tr.insertCell(tr.cells.length);
                //   }
                // }

                if (count == days) {
                    break outer;
                }

                td = tr.insertCell(tr.cells.length);

                count++;
                td.innerHTML = "<span class=' day" + count + "'>" + count + "</span>";
                td.align = "center";
            }
        }
    return table;
}

function createPixel(info){
    $("#tb").empty();
    var table = document.createElement("table");
    // table.border = "1";
    // table.width = "80%";
    //table API
    //创建一行
    //var tr = table.insertRow(table.rows.length);
    //创建单元格
    //var td = tr.insertCell(tr.cells.length);
    var tr, td;
    for (var i = 0; i < info.height; i++) {
        //循环插入元素
        tr = table.insertRow(table.rows.length);
        
        for (var j = 0; j < info.width; j++) {
            td = tr.insertCell(tr.cells.length);
            td.align = "center";
            td.class= "row"+ i + "col" + j;
        }
    }
    document.querySelector("#tb").appendChild(table);

    var className;
    for(var i = 0;i<info.height * info.width;i++){
        className = "row"+ i;
        $("#tb tr:eq("+ i +")").addClass(className);
        for(var j=0;j<info.width;j++){
            $("#tb ."+ className +" td:eq(" + j + ")").addClass(className + "col" +j);
        }
  }

}

function setPixelStyle(info){
  var pixels = info.pixels;
  var pixel;
  var rows;
  var cols;
  $("td").css("background-color",info.bgColor);

  for(var i = 0;i<pixels.length;i++){
    pixel = pixels[i];
    rows = pixel[0] + info.offsetX;
    cols = pixel[1] + info.offsetY;
    var st = "row" + rows + "col" + cols;
    $("."+st).css("background-color",pixel[2]);
  }
}