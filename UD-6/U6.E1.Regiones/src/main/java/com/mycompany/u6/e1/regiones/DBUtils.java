package com.mycompany.u6.e1.regiones;
// OJO: El puerto de conexión de MariaDB es el 3306 (el mismo que en MySQL)
// El profesor usará el 3366 porque ya tiene ocupado el 3306 para MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        if (conn != null)
            conn.close();
    }
}
