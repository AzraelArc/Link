var $
var curWwwPath = window.document.location.href;
var address=curWwwPath.substring(0,curWwwPath.substring(1).lastIndexOf('/')+1);
var account;
var password;

function login() {
    account = document.getElementById("in_account").value;
    password = document.getElementById("in_password").value;
    $.ajax({
        url:address+"/Servlet/Re_LoginServlet",
        type:"post",
        data:{
            account:account,
            password:password,
        },
        datatype:"json",
        success:function (data) {
            data = eval("("+data+")");
            if(data.Status==1)window.location = address+"/main_page.html";
            else alert("账号或密码错误");
        },
        error:function () {
            alert("error");

        }
    });
}

function register_door() {
    window.location = address+"/register.html";
}


