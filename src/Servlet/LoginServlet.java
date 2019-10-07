package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Main.login;
import Main.register;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
//        resp.setContentType("text/html;charset=utf-8");
//        //
//        String uname = req.getParameter("uname");
//        String pwd = req.getParameter("pwd");
//        System.out.println(uname+":"+pwd);
//        if(login.compare(uname,pwd)==1)
//        {
//            System.out.println("Success");
//            resp.getWriter().write("<script>window.location='http://localhost:8080/Work_Place.html';</script>");
////            String jsonStr = "{\"Status\":\"1\"}";
////            resp.getWriter().write(jsonStr);
//        }
//        else {
//            System.out.println("filed");
//            resp.getWriter().write("<script>alert('登录失败！');window.location='http://localhost:8080/Main.html';</script>");
////            String jsonStr = "{\"Status\":\"2\"}";
////            resp.getWriter().print(jsonStr);
//        }
    }
}


