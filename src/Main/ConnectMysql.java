package Main;

import java.sql.*;

public class ConnectMysql {

    public static void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            System.out.println("Success loading Mysql Driver!");

        } catch (ClassNotFoundException e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
    }

}
