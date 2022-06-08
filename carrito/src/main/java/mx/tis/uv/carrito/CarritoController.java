package mx.tis.uv.carrito;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarritoController {
    
    @Autowired
    private CarritoService carritoService;


    @RequestMapping("/")
    public String home(HttpServletRequest request){
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Microservicio Carrito</>");

        return sb.toString();
    }

    @PostMapping("/añadir")
    public CarritoModel addCart(@RequestBody CarritoModel carritoModel){
        
        CarritoModel cm = new CarritoModel();
        cm.setId(carritoModel.getId());
        cm.setProductoId(carritoModel.getProductoId());
        cm.setCantidad(carritoModel.getCantidad());
        cm.setPrecio(carritoModel.getPrecio());
        cm.setTotal(carritoModel.getPrecio() * carritoModel.getCantidad());

        return carritoService.addCart(cm);
    }

    @GetMapping("/carrito")
    public ArrayList<CarritoModel> getCart(){
    
        return (ArrayList<CarritoModel>) carritoService.getCart();
    }

    @DeleteMapping(path = "/carrito/{productoId}")
    public boolean deleteByNameProduct(@PathVariable("productoId") String productoId){

         return carritoService.deleteByNameProduct(productoId);
    }
    
}
