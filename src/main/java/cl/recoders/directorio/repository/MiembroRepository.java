package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiembroRepository extends JpaRepository<Miembro, Integer> {
}