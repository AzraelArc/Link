package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Main.register;
import com.google.gson.Gson;
import Main.Json_test;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import static net.sf.json.JSONObject.*;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        int user_account = Integer.parseInt(request.getParameter("raccount"));
        String user_password = request.getParameter("rpassword");
        System.out.println(user_account+":"+user_password);
        if(register.reg(user_account,user_password)==1){
//            response.getWriter().print(Json_test.test());
            String jsonStr = "{\"Status\":\"1\"}";
            response.getWriter().write(jsonStr);

//            response.getWriter().write("<script>alert('success');</script>");
        }
        else {
            String jsonStr = "{\"Status\":\"2\"}";
            response.getWriter().print(jsonStr);
        }

    }


}
