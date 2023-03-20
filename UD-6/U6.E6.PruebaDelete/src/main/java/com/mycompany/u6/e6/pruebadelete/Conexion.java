package com.mycompany.u6.e6.pruebadelete;


import java.sql.*;
/**
 *
 * @author Carlos Fernandez
 */
public class Conexion {
    public static Connection getConnection() throws SQLException {
        final String USER = "company";
        final String PASS = "company";
        final String DB_NAME = "company_db";
        final String CONN_URL = "jdbc:mariadb://localhost:3306/" + DB_NAME;
        Connection conn = null;       

        conn = DriverManager.getConnection(CONN_URL, USER, PASS);
        return conn;

    }
    
    public static void close(Connection conn) throws SQLException {
        if (conn != null)
            conn.close();
    }
    
    public static void close(Statement st) throws SQLException {
        if (st != null)
            st.close();
    }
    
    public static void close(ResultSet rs) throws SQLException {
        if (rs != null)
            rs.close();
    }
}
