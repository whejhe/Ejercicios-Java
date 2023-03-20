package es.tuespiral.u6.p1.conexion;
import java.sql.*;
import java.util.Scanner;

public class PruebaPreparedStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            
            System.out.println("Dime el nombre del cliente para ver sus datos:");
            String nombre = sc.nextLine();
            
            st = conn.prepareStatement("SELECT * FROM CUSTOMERS WHERE NAME = ?");
            st.setString(1, nombre);
            
            rs = st.executeQuery();    
            
            
            // Nombre válido: Exelon
            // Nombre SQL Injection: MeLoInvento' OR '1'='1
            // Sentencia resultante:
            // SELECT * FROM CUSTOMERS WHERE NAME = 'MeLoInvento' OR '1'='1'
            
            // Si isBeforeFirst devuelve true es que hay alguna fila
            if(rs.isBeforeFirst()) {
                while(rs.next()) {
                    long id = rs.getLong(1);
                    String name = rs.getString(2);
                    String address = rs.getString(3);
                    String website = rs.getString(4);
                    double credit = rs.getDouble(5);
                    System.out.println("Id = "+id+", name = "+name+", address = "+address+
                                       ", website = "+website+", credit = "+credit);
                }
            } else {
                System.out.println("No se encuentra al cliente "+nombre);
            }
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
        } finally {
            try {
                DBUtils.close(rs);
                DBUtils.close(st);    
                DBUtils.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}


