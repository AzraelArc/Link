package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Main.login;
import Main.Json_test;

@WebServlet(name = "Re_LoginServlet")
public class Re_LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println(request.getCharacterEncoding());
        int user_account = Integer.parseInt(request.getParameter("account"));
        String user_password = request.getParameter("password");
        System.out.println(user_account+":"+user_password);
        if (login.compare(user_account,user_password)==1){
            String jsonStr = "{\"Status\":\"1\"}";
//            String jsonStr = Json_test.test();
            response.getWriter().write(jsonStr);
        }
        else{
            String jsonStr = "{\"Status\":\"2\"}";
            response.getWriter().write(jsonStr);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
