package mx.uv.tis.carrito.carrito.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.uv.tis.carrito.carrito.models.Carrito;
import mx.uv.tis.carrito.carrito.services.CarritoService;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    CarritoService carritoService;

    @GetMapping()
    public ArrayList<Carrito> getCarrito(){ 

        return carritoService.getCarrito();
    }  

    @PostMapping("/add")
    public Carrito addCarrito(@RequestBody Carrito carrito, @RequestParam int productoId, @RequestParam int cantidad){
        double precio = 50;

        carrito.setCompraId(carrito.getCompraId());
        carrito.setProductoId(productoId);
        carrito.setCantidad(cantidad);
        carrito.setPrecio(precio);
        carrito.setTotal(precio * cantidad);

        return carritoService.addCarrito(carrito);
    }
    
}
