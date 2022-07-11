package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

    public List<Ciudad> findByIdPais(int idPais);
}