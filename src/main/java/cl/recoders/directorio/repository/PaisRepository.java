package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Integer> {
}