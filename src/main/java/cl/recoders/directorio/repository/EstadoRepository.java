package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}