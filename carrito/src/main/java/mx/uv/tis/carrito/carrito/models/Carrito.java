package mx.uv.tis.carrito.carrito.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compraId;
    private int productoId;
    private int cantidad;
    private double precio;
    private double total;

    /*public Carrito(){

    }

    public Carrito(int compraId, int productoId, double precio, int cantidad, double total) {
        this.compraId =compraId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.total = total;
    }*/


    public int getCompraId() {
        return compraId;
    }

    public void setCompraId(int usuarioId) {
        this.compraId = usuarioId;
    }

    public int getProductoId() {
        return productoId;
    }
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carrito [compraId = " + compraId + ", productoId=" + productoId + ", precio= " + precio + ", cantidad= " + cantidad + ", total=" + total + "]";
    }

    
    
    
}
