package com.company;

import javax.xml.crypto.Data;
import java.sql.*;

public class JDBC {
    public JDBC() {};

    public static Connection getConnection(){
        Connection conn = null;
        try {
            //初始化驱动类com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/exam?characterEncoding=UTF-8","root", "admin");
            //该类就在 mysql-connector-java-5.0.8-bin.jar中,如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static Data data;

    //关闭
    public static void close(PreparedStatement pstmt) {
        if (pstmt != null) {                        //避免出现空指针异常
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }

    }
    //获得数据库连接池
    public static Data getData(){
        return data;
    }

    public void InsertintoAll(String k, Integer confirmed, Integer recovered, Integer deaths) {
    }
}
