package com.mycompany.u6e4conectarbdcompanymexicocity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carlos Fernandez
 */
public class PruebaInsert {

    public static void main(String[] args) {
       Connection conn = null;
        Statement st = null;
        ResultSet rs = null;    
       try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            int numFilas1 = st.executeUpdate("INSERT INTO INVENTORIES ( product_id,warehouse_id,quantity) VALUES (7,7,10)");
            int numFilas2 = st.executeUpdate("INSERT INTO INVENTORIES ( product_id,warehouse_id,quantity) VALUES (8,7,10)");
            int numFilas3 = st.executeUpdate("INSERT INTO INVENTORIES ( product_id,warehouse_id,quantity)VALUES (9,7,10)");

            int result = numFilas1 + numFilas2 + numFilas3;
            System.out.println("Los INSERT han afectado a " + result + " filas");

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
       try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT p.product_id,p.product_name,p.description,w.warehouse_name,i.quantity FROM warehouses w JOIN inventories i ON  i.warehouse_id= w.warehouse_id JOIN products p ON p.product_id=i.product_id WHERE (w.warehouse_name LIKE 'Mexico City') AND p.product_id IN (7,8,9)");
            while (rs.next()) {
                int productoId = rs.getInt(1);
                String nameProduct = rs.getString(2);
                String description = rs.getString(3);
                String warehouseName = rs.getString(3);
                int quantity = rs.getInt(5);

                System.out.println("Id del producto: " + productoId + " , nombre del producto: " + nameProduct + " ,descripción: " + description + ", nombre ciudad" + warehouseName + " y cantidad: " + quantity);
            }

        } catch (SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                DBUtils.close(st);
                DBUtils.close(conn);
                DBUtils.close(rs);
            } catch (SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }

    }
}


