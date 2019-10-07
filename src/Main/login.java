package Main;
import java.sql.*;

public class login {

    public static int  compare(int account,String password)
    {
        int state = 0;
        ConnectMysql.connect();
        try {
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC","root","root");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("Success connect Mysql server!");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ac_pw");
            //user 为你表的名称
            while (rs.next()) {
//                System.out.println(rs.getString("account"));
//                System.out.println(rs.getString("password"));
                if(account==(rs.getInt("account"))&&password.equals(rs.getString("password")))
                    state = 1;
            }
            System.out.println(state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return state;
    }

}
