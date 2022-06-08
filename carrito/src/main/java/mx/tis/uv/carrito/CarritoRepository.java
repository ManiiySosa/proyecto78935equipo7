package mx.tis.uv.carrito;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarritoRepository extends CrudRepository<CarritoModel, Integer> {

    @Transactional
    @Modifying
    @Query(value = "delete from carrito where producto_id = :productoId", nativeQuery = true)
    public void deleteByNameProduct(@Param("productoId")String productoId);
}
