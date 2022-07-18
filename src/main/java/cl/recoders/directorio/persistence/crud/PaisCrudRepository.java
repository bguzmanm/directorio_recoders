package cl.recoders.directorio.persistence.crud;

import cl.recoders.directorio.persistence.entity.Pais;
import org.springframework.data.repository.CrudRepository;

public interface PaisCrudRepository extends CrudRepository<Pais, Integer> {
}