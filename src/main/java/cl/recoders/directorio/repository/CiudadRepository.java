package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
}