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
    $("#sumb").on("click",function (){
        var password= $("#password").val();
        var password2=$("#password2").val();
        if(password==password2){
            $.ajax({
                url:"http://localhost:8080/789456/getalladmin",
                method:"get",
                data:{
                    password:password,
                },
                success:function (data) {
                    alert("修改成功");
                },
                error:function (){
                    alert('aaaaa');
                }
            });

        }
        else {
            alert("两次密码不一致");
        }


    });
});