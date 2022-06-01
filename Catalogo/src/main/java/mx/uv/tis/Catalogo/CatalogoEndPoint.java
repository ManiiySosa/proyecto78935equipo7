package mx.uv.tis.Catalogo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.tis_uv_mx.catalogo.AgregarCategoriaRequest;
import https.tis_uv_mx.catalogo.AgregarCategoriaResponse;
import https.tis_uv_mx.catalogo.AgregarProductoRequest;
import https.tis_uv_mx.catalogo.AgregarProductoResponse;
import https.tis_uv_mx.catalogo.BorrarProductoRequest;
import https.tis_uv_mx.catalogo.BorrarProductoResponse;
import https.tis_uv_mx.catalogo.BuscarProductosCategoriaRequest;
import https.tis_uv_mx.catalogo.BuscarProductosCategoriaResponse;
import https.tis_uv_mx.catalogo.BuscarProductosResponse;
import https.tis_uv_mx.catalogo.ListarCategoriasResponse;
import https.tis_uv_mx.catalogo.ModificarProductoRequest;
import https.tis_uv_mx.catalogo.ModificarproductoResponse;

@Endpoint
public class CatalogoEndPoint {

    @Autowired
    Icategoria ic;
    @Autowired
    Iproducto ip;

    @PayloadRoot(localPart = "agregarCategoriaRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public AgregarCategoriaResponse agregarCategoria(@RequestPayload AgregarCategoriaRequest peticion){
        AgregarCategoriaResponse respuesta = new AgregarCategoriaResponse(); 

        Categoria categoria = new Categoria();
        categoria.setId(peticion.getCategoriaId());
        categoria.setNombre(peticion.getNombre());
        ic.save(categoria);
        respuesta.setRespuesta("categoria agregada correctamente");

       return respuesta;
    }

    @PayloadRoot(localPart = "listarCategoriasRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public ListarCategoriasResponse listarCategorias(){
        ListarCategoriasResponse res = new ListarCategoriasResponse();
        Iterable<Categoria> lista = ic.findAll();

        for(Categoria o : lista){
            ListarCategoriasResponse.Categorias c = new ListarCategoriasResponse.Categorias();
            c.setCategoriaId(o.getId());
            c.setNombre(o.getNombre());
            res.getCategorias().add(c);
        }

        return res;
    }

    @PayloadRoot(localPart = "agregarProductoRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public AgregarProductoResponse agregarProducto(@RequestPayload AgregarProductoRequest peticion){
        AgregarProductoResponse res = new AgregarProductoResponse();

        Producto producto = new Producto();
        producto.setId(peticion.getProductoId());
        producto.setNombre(peticion.getNombre());
        producto.setDescripcion(peticion.getDescripcion());
        producto.setPrecio(peticion.getPrecio());
        producto.setCategoriaId(peticion.getCategoriaId());
        ip.save(producto);
        res.setRespuesta("producto agregado");

        return res;
    }   

    @PayloadRoot(localPart = "buscarProductosRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public BuscarProductosResponse buscarProductos(){
        BuscarProductosResponse res = new BuscarProductosResponse();
        Iterable<Producto> lista = ip.findAll();
        

        for(Producto o : lista){
            BuscarProductosResponse.Productos p = new BuscarProductosResponse.Productos();
            Optional<Categoria> opt= ic.findById(o.getCategoriaId());
            p.setProductoId(o.getId());
            p.setCategoria(opt.get().getNombre());
            p.setNombre(o.getNombre());
            p.setDescripcion(o.getDescripcion());
            p.setPrecio(o.getPrecio());
            res.getProductos().add(p);
        }
        return res;
    }

    @PayloadRoot(localPart = "modificarProductoRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public ModificarproductoResponse modificarProducto(@RequestPayload ModificarProductoRequest peticion){
        ModificarproductoResponse res = new ModificarproductoResponse();

        Producto producto = new Producto();
        producto.setId(peticion.getProductoId());
        producto.setNombre(peticion.getNombre());
        producto.setDescripcion(peticion.getDescripcion());
        producto.setPrecio(peticion.getPrecio());
        producto.setCategoriaId(peticion.getCategoriaId());
        ip.save(producto);

        res.setRespuesta(true);

        return res;
    }

    @PayloadRoot(localPart = "borrarProductoRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload
    public BorrarProductoResponse borrarProducto(@RequestPayload BorrarProductoRequest peticion){
        BorrarProductoResponse res = new BorrarProductoResponse();

        ip.deleteById(peticion.getProductoId());
        res.setRespuesta(true);

        return res;
    }

    @PayloadRoot(localPart = "buscarProductosCategoriaRequest", namespace = "https://tis.uv.mx/catalogo")
    @ResponsePayload    
    public BuscarProductosCategoriaResponse buscarProductosCategoria(@RequestPayload BuscarProductosCategoriaRequest peticion){
        BuscarProductosCategoriaResponse res = new BuscarProductosCategoriaResponse();
       
        Iterable<Producto> lc = ip.findAll();
        for(Producto o : lc){
            BuscarProductosCategoriaResponse.ProductosCategoria proCat = new BuscarProductosCategoriaResponse.ProductosCategoria();
            Optional<Categoria> opt = ic.findById(peticion.getCategoriaId());
            if(o.getCategoriaId() == opt.get().getId()){
                proCat.setCategoria(opt.get().getNombre());
                proCat.setProductoId(o.getId());
                proCat.setNombre(o.getNombre());
                proCat.setDescripcion(o.getDescripcion());
                proCat.setPrecio(o.getPrecio());
                res.getProductosCategoria().add(proCat);
            }
        }
        return res;

    }
    
}

