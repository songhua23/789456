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
    $("#login").on("click",function () {
        var adminid = $("#ID").val();
        var password = $("#password").val();
        $.ajax({
            url:"http://localhost:8080/789456/loginadmin",
            type:"GET",
            data:{
                adminid:adminid,
            },
            success:function(res){
                if (res.password==password){
                    // alert("success"+res.password);
                    // alert("success"+res.headurl);
                    $.cookie("adminid",adminid,{path:'/',expires:10});
                    $.cookie("headurl",res.headurl,{path:'/',expires:10});
                    alert(getcookie("adminid"));
                    location.href="http://localhost:8080/789456/home";
                }
            }
        })
    });
});