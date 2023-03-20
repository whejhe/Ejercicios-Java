package es.tuespiral.u6.p1.conexionmariadb;
// OJO: El puerto de conexión de MariaDB es el 3306 (el mismo que en MySQL)
// El profesor usará el 3366 porque ya tiene ocupado el 3306 para MySQL
import java.sql.*;

public class ConexionMariaDB {

    public static void main(String args[]) {
        final String USER = "company";
        final String PASS = "company";
        final String DB_NAME = "company_db";
        final String CONN_URL = "jdbc:mariadb://localhost:3306/" + DB_NAME;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_URL, USER, PASS);
            System.out.println("Conexión válida: " + conn.isValid(10));
            System.out.println("Estado del autocommit: " + conn.getAutoCommit());
        } catch (SQLException e) {
            System.out.println("Ocurrió una excepción al conectar a la BD");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
