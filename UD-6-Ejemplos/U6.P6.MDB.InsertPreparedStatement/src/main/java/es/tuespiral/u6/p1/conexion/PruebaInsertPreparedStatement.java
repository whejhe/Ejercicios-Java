package es.tuespiral.u6.p1.conexion;
import java.sql.*;
import java.util.Scanner;

public class PruebaInsertPreparedStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DBUtils.getConnection();
            
            System.out.println("ALTA DE NUEVO CLIENTE");
            System.out.println("Dime el nombre del cliente:");
            String nombre = sc.nextLine();
            System.out.println("Dime su dirección postal:");
            String direccion = sc.nextLine();
            System.out.println("Dime su sitio web:");
            String web = sc.nextLine();
            System.out.println("Dime su límite de crédito:");
            double limite = sc.nextDouble();
            
            st = conn.prepareStatement("INSERT INTO CUSTOMERS (name, address, "+
                             "website, credit_limit) VALUES (?, ?, ?, ?)");
            st.setString(1, nombre);
            st.setString(2, direccion);
            st.setString(3, web);
            st.setDouble(4, limite);
            
            int numFilas = st.executeUpdate();    
            System.out.println(numFilas+" filas insertadas");
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                DBUtils.close(st);    
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


