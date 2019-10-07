package Main;

import com.google.gson.Gson;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.sql.*;
import java.util.*;

import static net.sf.json.JSONObject.*;

public class Json_test {





    public static String test() {
        List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        ConnectMysql.connect();
        try {
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC","root","root");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("Success connect Mysql server!");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ac_pw ");
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            while (rs.next()){
                Map<String,Object> rowData = new HashMap<String, Object>();
                for(int i =1;i<=columnCount;i++){
                    rowData.put(md.getColumnName(i),rs.getObject(i));
                }
                list.add(rowData);
            }
            Gson gson = new Gson();
            String json = gson.toJson(list);
            System.out.println(json);
            return json;

        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return "hollow";
    }


//    public static void main(String[] args) {
//        test();
//    }


}
