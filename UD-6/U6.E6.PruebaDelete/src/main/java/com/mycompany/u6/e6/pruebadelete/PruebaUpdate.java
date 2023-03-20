package com.mycompany.u6.e6.pruebadelete;

/**
 *
 * @author Carlos Fernandez
 */
import java.sql.*;

public class PruebaUpdate {

    public static void main(String args[]) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("UPDATE inventories "
                    + "SET quantity = (quantity + 10) "
                    + "WHERE product_id IN (SELECT p.product_id "
                    + "FROM products p JOIN product_categories pc "
                    + "ON p.category_id = pc.category_id "
                    + "WHERE pc.category_id = 1) "
                    + "AND warehouse_id = 7");

            System.out.println("Se han insertado " + numFilas + " filas");

        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                Conexion.close(st);
                Conexion.close(conn);
            } catch (SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
