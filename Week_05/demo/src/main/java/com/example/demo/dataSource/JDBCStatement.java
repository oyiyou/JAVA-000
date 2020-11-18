package com.example.demo.dataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCStatement {
    private String driverClassName = "com.mysql.jdbc.Driver";    //启动驱动
    private String url = "jdbc:mysql://localhost:3306/test";    //设置连接路径
    private String username = "root";    //数据库用户名
    private String password = "123";    //数据库连接密码
    private Connection con = null;        //连接
    private PreparedStatement pstmt = null;

    public void getConnection() {
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO USER VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "1");
            pstmt.setString(2, "123");
            pstmt.setInt(3, 1);
            pstmt.setString(4, "1");
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                try {
                    pstmt.close();
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) {
        JDBCStatement jdbcStatement = new JDBCStatement();
        jdbcStatement.getConnection();
    }
}
