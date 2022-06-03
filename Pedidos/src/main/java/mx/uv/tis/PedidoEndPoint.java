package mx.uv.tis;
 
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.mx.uv.tis.AgregarPedidosRequest;
import https.mx.uv.tis.AgregarPedidosResponse;

@Endpoint
public class PedidoEndPoint{

    @PayloadRoot(localPart = "agregarPedidoRequest", namespace = "https://mx.uv.tis/pedido")
    @ResponsePayload
    public AgregarPedidoResponse agregarPedido(@RequestPayload AgregarPedidoRequest Pedido){
        AgregarPedidoResponse respuesta = new AgregarPedidoResponse(); 

        Pedido pedido = new Pedido();
        pedido.setpedidoId(peticion.getPedidoId());
        pedido.setUsuarioId(peticion.getUsuarioId());
        pedido.setFecha(peticion.getFecha());
        ic.save(pedido);
        respuesta.setRespuesta("Agregar un pedido nuevo");

       return respuesta;
    }


    @PayloadRoot(localPart = "listarPedidoRequest", namespace = "https://mx.uv.tis/pedido")
    @ResponsePayload
    public ListarPedidoResponse listarPedido(){
        ListarPedidoResponse res = new ListarPedidoResponse();
        Iterable<Pedido> lista = ic.findAll();

        for(Pedido o : lista){
            ListarPedidoResponse.Pedido p = new ListarPedidoResponse.Pedido();
            p.setPedidoId(o.getPedidoId());
            p.setUsuarioId(o.getUsuarioId());
            res.getPedido().add(p);
        }

        return res;
    }
    

    @PayloadRoot(localPart = "borrarPedidoRequest", namespace = "https://mx.uv.tis/pedido")
    @ResponsePayload
    public BorrarPedidoResponse borrarPedido(@RequestPayload BorrarPedidoRequest Pedido){
        BorrarPedidoResponse respuesta = new BorrarPedidoResponse();
    
        ip.deleteById(peticion.getPedidoId());
        res.setRespuesta(true);

        return res;
    }






   

}
