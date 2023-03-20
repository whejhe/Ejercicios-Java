/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.u6e6conectarbdcompanymexicocitydelete;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Susana
 */
public class PruebaDelete {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("DELETE FROM inventories\n"
                    + "WHERE warehouse_id IN \n"
                    + "(SELECT warehouse_id FROM warehouses WHERE warehouse_name LIKE 'Mexico City')\n"
                    + " AND product_id IN (SELECT product_id FROM products WHERE category_id IN\n"
                    + "  (SELECT category_id FROM product_categories WHERE category_name LIKE 'CPU'))");

            System.out.println("Se han insertado " + numFilas + " filas");//14 filas

        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                DBUtils.close(st);
                DBUtils.close(conn);
            } catch (SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
