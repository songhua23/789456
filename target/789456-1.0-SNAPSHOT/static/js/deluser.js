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
    $("#delete").on("click",function () {
        var userName = $('#userName').val();
        $.ajax({
            url: "http://localhost:8080/789456/deleteuser",
            method: "get",
            data: {
                userName: userName,
            },
            success: function (data) {
                alert("删除成功");
            },
            error:function (data){
                alert("删除失败");
            }
        })
    })
})