var $;
var curWwwPath = window.document.location.href;
var address=curWwwPath.substring(0,curWwwPath.substring(1).lastIndexOf('/')+1);

function register() {
    var r_ac = document.getElementById("account").value;
    var r_pw = document.getElementById("password").value;
    $.ajax({
        url:address+"/Servlet/RegisterServlet",
        type:"post",
        data:{
            raccount:r_ac,
            rpassword:r_pw,
        },
        dataType:"json",
        success:function (data) {
            if(data.Status==1) {
                alert("success");
                window.location = address+"/Login.html"
            }
            else alert("failed");
        },

        error:function (data) {
            alert("error");
        },

    });
}