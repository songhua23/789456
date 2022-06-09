//获取指定名称的cookie的值
function getcookie(objname) {
    var arrstr = document.cookie.split("; ");
    for (var i = 0; i < arrstr.length; i++) {
        var temp = arrstr[i].split("=");
        if (temp[0] == objname)
            return unescape(temp[1]);
    }
}
$(function (){
    $("#headurl").attr('src',getcookie("headurl"));
    $("#adminid").html(getcookie("adminid"));
});

$(function (){
    $("#j1").on("click",function () {
        location.href="http://localhost:8080/789456/select";
    });
});
$(function (){
    $("#j2").on("click",function () {
        location.href="http://localhost:8080/789456/insert";
    });
});
$(function (){
    $("#j3").on("click",function () {
        location.href="http://localhost:8080/789456/update";
    });
});