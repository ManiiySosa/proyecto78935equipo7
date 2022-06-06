package mx.uv.tis.carrito.carrito.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.uv.tis.carrito.carrito.models.Carrito;

@Repository
public interface CarritoRepository extends CrudRepository<Carrito, Long> {
    
}
