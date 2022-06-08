package mx.tis.uv.carrito;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {
    @Autowired
    private CarritoRepository carritoRepository;

    public CarritoModel addCart(CarritoModel carritoModel){

        return carritoRepository.save(carritoModel);
    }

    public List<CarritoModel> getCart(){

        return (List<CarritoModel>) carritoRepository.findAll();
    }

    public boolean deleteByNameProduct(String productoId){
        try{
            carritoRepository.deleteByNameProduct(productoId);
            return true;

         }catch(Exception e){
            
            return false;
        }
        
    }


}
