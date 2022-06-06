package mx.uv.tis.carrito.carrito.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uv.tis.carrito.carrito.models.Carrito;
import mx.uv.tis.carrito.carrito.repositories.CarritoRepository;

@Service
public class CarritoService {

    @Autowired
    CarritoRepository carritoRepository;

    public ArrayList<Carrito>  getCarrito(){
        
        return (ArrayList<Carrito>) carritoRepository.findAll();
    }

    public Carrito addCarrito(Carrito carrito){

        return carritoRepository.save(carrito);
    }


    public boolean vaciarCarrito(Iterable<Carrito> carrito){

        try{
            carritoRepository.deleteAll(carrito);
            return true;
        }catch(Exception e){
            return false;
        }
           
    }   
    
}
