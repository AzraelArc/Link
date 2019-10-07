package Main;

import java.sql.*;

public class register {

    public static int reg (int account,String password){
        ConnectMysql.connect();
        try {
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC","root","root");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("Success connect Mysql server!");
            Statement stmt = connect.createStatement();
            String sql_check = "select * from ac_pw";
            ResultSet rs = stmt.executeQuery(sql_check);
            rs.next();
            if(account == rs.getInt("account"))return 0;
            String sql = "insert into ac_pw(account,password)values(?,?)";
            PreparedStatement pstmt = (PreparedStatement)connect.prepareStatement(sql);
            pstmt.setInt(1,account);
            pstmt.setString(2,password);
            pstmt.executeUpdate();
            return 1;
//            ResultSet rs = stmt.executeQuery("select * from user");
//            //user 为你表的名称
//            while (rs.next()) {
//
//            }
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
            return 0;
        }
    }


}
