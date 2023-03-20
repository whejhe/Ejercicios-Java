package com.mycompany.u6e5conectarbdcompanymexicocityupdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaUpdate {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("update inventories\n"
                    + "set quantity=quantity+10\n"
                    + "WHERE warehouse_id IN (SELECT warehouse_id FROM warehouses WHERE warehouse_name LIKE 'Mexico City') and product_id IN (SELECT product_id FROM products WHERE category_id IN (SELECT category_id FROM product_categories WHERE \n"
                    + "category_name LIKE 'CPU'))");
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
