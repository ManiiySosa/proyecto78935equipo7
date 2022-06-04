package mx.uv.tis.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int pedidoId;
    private int usuarioId;
    private String direccion;
    private String fecha;
    private double total;

    public Pedido(){

    }

    public int getPedidoId() {
        return pedidoId;
    }
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido [ pedido= " + pedidoId + ", usuario= " + usuarioId
                + ", direccion= " + direccion + ", fecha=" + fecha +  ", total=" + total + " ] ";
              
    }
    
    
}
