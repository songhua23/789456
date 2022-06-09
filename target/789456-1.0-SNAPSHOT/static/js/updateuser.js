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
    $("#select").on("click",function (){
        var userName=$('#userName').val();
        $.ajax({
            url:"http://localhost:8080/789456/getuserdetailbyname",
            method:"get",
            data:{
                userName:userName,
            },
            success:function (data) {
                if(data.sex=='0'){
                    $("#sex").val("男");
                }
                else {
                    $("#sex").val("女");
                }
                $("#tele").val(data.tele);
                $("#collegeName").val(data.collegeName);
                $("#highschoolName").val(data.highschoolName);
                $("#address").val(data.address);
            },
        });



    });
});



$(function (){
    $("#update").on("click",function (){
        var collegeName= $("#collegeName").val();
        var highschoolName=$("#highschoolName").val();
        var tele= $("#tele").val();
        var address=$("#address").val();
        var userName=$('#userName').val();
        if ($('#sex').val()=='男'){
            var sex='0';
        }
        if ($('#sex').val()=='女'){
            var sex='1';
        }
        $.ajax({
            url:"http://localhost:8080/789456/newuser",
            method:"get",
            data:{
                collegeName:collegeName,
                highschoolName:highschoolName,
                tele:tele,
                address:address,
                sex:sex,
                userName:userName,
            },
            success:function (data) {
                alert("修改成功");
            },
            error:function (){
                alert('aaaaa');
            }
        });


    });
});