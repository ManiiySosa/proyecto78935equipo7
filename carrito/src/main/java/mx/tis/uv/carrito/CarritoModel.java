package mx.tis.uv.carrito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class CarritoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String productoId;
    private int cantidad;
    private double precio;
    private double total;

    public CarritoModel(){
        super();
    }
    
    public CarritoModel(Integer id, String productoId, int cantidad, double precio) {
        Id = id;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Producto en [producto= " + productoId + ", precio= " + precio + ", cantidad= " + cantidad + 
                 ", total= " + total + "]";
    }
    
    
}
