package mx.uv.tis;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String UsuarioId;
    
    public int getPedidoId() {
        return id;
    }
    public void setPedidoId(int id) {
        this.id = id;
    }
    public String getUsuarioId() {
        return UsuarioId;
    }
    public void setUsuarioId(String UsuarioId) {
        this.UsuarioId = UsuarioId;
    }
    
}
