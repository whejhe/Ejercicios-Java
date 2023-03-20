package com.mycompany.u6.e6.pruebadelete;

import java.sql.*;

/**
 *
 * @author Carlos Fernandez
 */
public class PruebaDelete {

    public static void main(String args[]) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("DELETE FROM inventories "
                    + "WHERE warehouse_id = 7 "
                    + "AND product_id IN (SELECT product_id FROM products WHERE category_id = 1)");

            System.out.println("Se han eliminado " + numFilas + " filas");

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
