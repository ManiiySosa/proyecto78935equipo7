package mx.uv.tis.pedido;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.tis_uv_mx.pedido.AgregarPedidoRequest;
import https.tis_uv_mx.pedido.AgregarPedidoResponse;
import https.tis_uv_mx.pedido.BorrarPedidoRequest;
import https.tis_uv_mx.pedido.BorrarPedidoResponse;
import https.tis_uv_mx.pedido.ListarPedidoResponse; 

@Endpoint
public class PedidoEndPoint{
    @Autowired
    Ipedido ipedido;

    @PayloadRoot(localPart = "agregarPedidoRequest", namespace = "https://tis.uv.mx/pedido")
    @ResponsePayload
    public AgregarPedidoResponse agregarPedido(@RequestPayload AgregarPedidoRequest peticion){
        AgregarPedidoResponse respuesta = new AgregarPedidoResponse(); 

        Pedido pedido = new Pedido();
        pedido.setPedidoId(peticion.getPedidoId());
        pedido.setUsuarioId(peticion.getUsuarioId());
        pedido.setDireccion(peticion.getDireccion());
        pedido.setFecha(peticion.getFecha());
        pedido.setTotal(peticion.getTotal());
        ipedido.save(pedido);
        respuesta.setRespuesta(pedido.toString());

       return respuesta;
    }


    @PayloadRoot(localPart = "listarPedidoRequest", namespace = "https://tis.uv.mx/pedido")
    @ResponsePayload
    public ListarPedidoResponse listarPedido(){
        ListarPedidoResponse res = new ListarPedidoResponse();
        Iterable<Pedido> lista = ipedido.findAll();

        for(Pedido o : lista){
            ListarPedidoResponse.Pedido p = new ListarPedidoResponse.Pedido();
            p.setPedidoId(o.getPedidoId());
            p.setUsuarioId(o.getUsuarioId());
            p.setDireccion(o.getDireccion());
            p.setFecha(o.getFecha());
            p.setTotal(o.getTotal());
            res.getPedido().add(p);
        }

        return res;
    }
    

    @PayloadRoot(localPart = "borrarPedidoRequest", namespace = "https://tis.uv.mx/pedido")
    @ResponsePayload
    public BorrarPedidoResponse borrarPedido(@RequestPayload BorrarPedidoRequest peticion){
        BorrarPedidoResponse respuesta = new BorrarPedidoResponse();
    
        ipedido.deleteById(peticion.getPedidoId());
        respuesta.setRespuesta(true);

        return respuesta;
    }


}
