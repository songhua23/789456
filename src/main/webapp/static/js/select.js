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
})
$(function (){
    $.ajax({
        url:"http://localhost:8080/789456/getuser",
        type:"GET",
        data:{

        },
        success:function(res){
            if (res){
                $("#tbodys tbody").empty();

                $.each(res, function (idx, val) {
                    if (val.sex=='0'){
                        var sex='男';
                    }
                    else if (val.sex=='1'){
                        var sex='女';
                    }
                    else{
                        var sex='未知';
                    }

                    var row = $("<tr></tr>");
                    var td_userID = $("<td>" + val.userID + "</td>");
                    var td_userName = $("<td>" + val.userName + "</td>");
                    var td_sex = $("<td>" + sex + "</td>");
                    var td_birthYear = $("<td>" + val.birthYear + "</td>");
                    var td_collegeName = $("<td>" + val.collegeName + "</td>");
                    var td_highschoolName = $("<td>" + val.highschoolName + "</td>");
                    var td_address = $("<td>" + val.address + "</td>");
                    var td_tele = $("<td>" + val.tele + "</td>");
                    var td_btns = $("<td></td>");

                    //修改button
                    var edit_btn = $("<button>修改</button>").addClass("btn btn-outline-primary").addClass("edit_btn");
                    var edit_btn_span = $("<span></span>").addClass("glyphicon glyphicon-pencil");

                    edit_btn.append(edit_btn_span);
                    edit_btn.attr("data-id", val.userID);

                    //删除button
                    var delete_btn = $("<button>删除</button>").addClass("btn btn-danger").addClass("delete_btn");
                    var delete_btn_span = $("<span></span>").addClass("glyphicon glyphicon-remove");

                    delete_btn.append(delete_btn_span);
                    delete_btn.attr("data-id", val.userID);

                    edit_btn.appendTo(td_btns);
                    $("<span>&nbsp;</span>").appendTo(td_btns);
                    delete_btn.appendTo(td_btns);

                    row.append(td_userID).append(td_userName).append(td_sex).append(td_birthYear)
                        .append(td_collegeName).append(td_highschoolName).append(td_address).append(td_tele).append(td_btns);

                    row.appendTo($("#tbodys tbody"));
                })
            }
        }
    })
});

$(document).on("click",".edit_btn",function(){

    var userID = $(this).attr("data-id");


    $.ajax({
        url:"http://localhost:8080/789456/getuserdetailbyid",
        method:"get",
        data:{
            userID:userID,
        },
        success:function (data) {
            if(data.sex=='0'){
                $("#sex").val("男");
            }
            else {
                $("#sex").val("女");
            }
            $("#userName").val(data.userName);
            $("#tele").val(data.tele);
            $("#collegeName").val(data.collegeName);
            $("#highschoolName").val(data.highschoolName);
            $("#address").val(data.address);
        },
    });
    $("#editmodal").modal('show');

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
                userID:userID,
                collegeName:collegeName,
                highschoolName:highschoolName,
                tele:tele,
                address:address,
                sex:sex,
                userName:userName,
            },
            success:function () {
                $("#editmodal").modal('hide');
                alert("修改成功");
                window.location.reload();
            },
            error:function (){
                alert('aaaaa');
            }
        });


    });
})

$(document).on("click",".delete_btn",function(){

    var userID = $(this).attr("data-id");

    if(confirm("确定删除?")){
        $.ajax({
            url:"http://localhost:8080/789456/deluserdetailbyid",
            type:"GET",
            async:true,
            data: {"userID": userID},
            success:function(){
                alert("删除成功");
                window.location.reload();
            },
            error:function (){
                alert("aa");
            }
        })
    }
})

// $(function (){
//     $("#update").on("click",function (){
//         var userID = $(this).attr("data-id");
//         var collegeName= $("#collegeName").val();
//         var highschoolName=$("#highschoolName").val();
//         var tele= $("#tele").val();
//         var address=$("#address").val();
//         var userName=$('#userName').val();
//         if ($('#sex').val()=='男'){
//             var sex='0';
//         }
//         if ($('#sex').val()=='女'){
//             var sex='1';
//         }
//         $.ajax({
//             url:"http://localhost:8080/789456/newuser",
//             method:"get",
//             data:{
//                 collegeName:collegeName,
//                 highschoolName:highschoolName,
//                 tele:tele,
//                 address:address,
//                 sex:sex,
//                 userName:userName,
//             },
//             success:function (data) {
//                 $('editmodal').model('hide');
//                 alert("修改成功");
//             },
//             error:function (){
//                 alert('aaaaa');
//             }
//         });
//
//
//     });
// });