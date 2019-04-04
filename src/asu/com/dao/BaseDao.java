package asu.com.dao;

import java.sql.*;

/**
 * 专门用来做数据库的处理
 * @author Administrator
 */
public class BaseDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/MembersInfo?useUnicode=true&characterEncoding=utf-8";
    private String user = "root";
    private String password = "root";

    // 获取数据库的连接对象
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 增删改
     * @param sql
     * @param params
     * @return
     */
    public int executeUpdate(String sql, Object[] params) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            if (params!=null) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i + 1, params[i]);
                }
            }
            count = ps.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally{
            closeAll(conn, ps, null);
        }
        return count;
    }

    /**
     * 查询
     * @param sql
     * @param params
     * @return
     */
    public ResultSet executeQuery(String sql, Object[] params){
        Connection conn =  null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            if (params!=null) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i+1, params[i]);
                }
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * 关闭所有的连接
     * @param conn  连接对象
     * @param stmt  sql执行对象
     * @param rs    结果集
     */
    public void closeAll(Connection conn,Statement stmt,ResultSet rs){
        try {
            if (conn!=null) {
                conn.close();
            }
            if (stmt!=null) {
                stmt.close();
            }
            if (rs!=null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
