
import java.sql.*;
/**
 *
 * @author Carlos Fernandez
 */

public class PruebaInsert {
    public static void main(String args[]){
        Connection conn = null;
        Statement st = null;

        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("Insert into INVENTORIES (PRODUCT_ID,WAREHOUSE_ID,QUANTITY) values (7,7,10)");   
            
            System.out.println("Se han insertado "+numFilas+" filas");
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar con la BD");
        } finally {
            try {  
                Conexion.close(st);  
                Conexion.close(conn);
            } catch(SQLException e) {
                System.out.println("Error al cerrar la BD");
            }
        }
        
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("Insert into INVENTORIES (PRODUCT_ID,WAREHOUSE_ID,QUANTITY) values (8,7,10)");   
            
            System.out.println("Se han insertado "+numFilas+" filas");
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {  
                Conexion.close(st);  
                Conexion.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
        
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            int numFilas = st.executeUpdate("Insert into INVENTORIES (PRODUCT_ID,WAREHOUSE_ID,QUANTITY) values (9,7,10)");   
            
            System.out.println("Se han insertado "+numFilas+" filas");
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {  
                Conexion.close(st);  
                Conexion.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
