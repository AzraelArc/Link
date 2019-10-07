package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        System.out.println(request.getCharacterEncoding());
//        int user_account = Integer.parseInt(request.getParameter("id"));
//        String user_password = request.getParameter("name");
//        System.out.println(user_account+":"+user_password);
//        String jsonStr = "{\"Status\":\"1\"}";
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().print(jsonStr);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int user_account = Integer.parseInt(request.getParameter("id"));
        String user_password = request.getParameter("name");
        System.out.println(user_account+":"+user_password);
        String jsonStr = "{\"Status\":\"1\"}";
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonStr);
    }
}
