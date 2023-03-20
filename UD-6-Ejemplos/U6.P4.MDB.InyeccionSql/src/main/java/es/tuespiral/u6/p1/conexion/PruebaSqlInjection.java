package es.tuespiral.u6.p1.conexion;
import es.tuespiral.u6.p1.conexion.DBUtils;
import java.sql.*;
import java.util.Scanner;

public class PruebaSqlInjection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            System.out.println("Dime el nombre del cliente para ver sus datos:");
            String nombre = sc.nextLine();
           
            rs = st.executeQuery("SELECT * FROM CUSTOMERS WHERE NAME = '"+nombre+"'");    
            // Nombre válido: Exelon
            // Nombre SQL Injection: MeLoInvento' OR '1'='1
            // Sentencia resultante:
            // SELECT * FROM CUSTOMERS WHERE NAME = 'MeLoInvento' OR '1'='1'
            
            while(rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String website = rs.getString(4);
                double credit = rs.getDouble(5);
                System.out.println("Id = "+id+", name = "+name+", address = "+address+
                                   ", website = "+website+", credit = "+credit);
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


