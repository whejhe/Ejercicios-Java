/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u6e6conectarbdcompanymexicocitydelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Susana
 */
public class DBUtils {

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
        if (conn != null) {
            conn.close();
        }
    }

    public static void close(Statement st) throws SQLException {
        if (st != null) {
            st.close();
        }
    }

    public static void close(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }
}
