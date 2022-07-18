package cl.recoders.directorio.persistence.crud;

import cl.recoders.directorio.persistence.entity.Ciudad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface CiudadCrudRepository extends CrudRepository<Ciudad, Integer> {

    public Optional<List<Ciudad>> findByIdPais(int idPais);
}