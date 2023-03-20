package es.tuespiral.u6.p1.conexion.dominio;

import es.tuespiral.u6.p1.conexion.dominio.OrderItem;
import es.tuespiral.u6.p1.conexion.excepciones.OrderException;
import es.tuespiral.u6.p1.conexion.utilidades.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {

    private List<OrderItem> carro;
    private int idCliente;

    public Carrito(int idCliente) {
        carro = new ArrayList<>();
        this.idCliente = idCliente;
    }

    public void addItem(OrderItem item) {
        carro.add(item);
    }

    public boolean isEmpty() {
        return carro.isEmpty();
    }

    public double getTotalAmount() {
        double suma = 0;

        Iterator<OrderItem> iter = carro.iterator();

        while (iter.hasNext()) {
            OrderItem elem = iter.next();
            suma = suma + elem.getQuantity() * elem.getUnitPrice();
        }
        return suma;
    }

    public List<OrderItem> getItems() {
        return carro;
    }

    // Vacía el carrito
    public void removeAll() {
        carro.clear();
    }

    public void realizaPedido() throws OrderException {
        Connection conn = null;
        PreparedStatement st = null;
        boolean hasToRollback = false;

        try {
            conn = DBUtils.getTransactionConnection();

            Order pedido = new Order(null, this.idCliente, "Pending", null, LocalDate.now());
            pedido.persist(conn);
            
            for (OrderItem item : carro) {
                int numPedido = pedido.getOrderId();
                item.setOrderId(numPedido);
                item.persist(conn);
            }
            conn.commit();
            // Vaciamos el carrito
            carro.clear();
            
        } catch (SQLException e) {
            hasToRollback = true;
            throw new OrderException(e.getMessage());

        } finally { // En cualquier caso cerramos los elementos abiertos
            try {
                if (conn != null && hasToRollback) {
                    conn.rollback();
                }
                DBUtils.close(st);
                DBUtils.transactionClose(conn);
            } catch (SQLException e) {
                throw new OrderException(e.getMessage());
            }
        }
    }

}
