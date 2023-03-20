package com.mycompany.u6.e2.countries;

import java.sql.*;

/**
 *
 * @author Carlos Fernandez
 */
public class PruebaConexion {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM CUSTOMERS WHERE customer_id <= 10");   
            
            while(rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                double credit = rs.getDouble(5);
                System.out.println("Id = "+id+", name = "+name+", credit = "+credit);
            }
            
        } catch(SQLException e) {
            System.out.println("Ocurrió algún error al conectar u operar con la BD");
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
                    
                Conexion.close(conn);
            } catch(SQLException e) {
                System.out.println("Ocurrió una excepción al cerrar la BD");
            }
        }
    }
}
