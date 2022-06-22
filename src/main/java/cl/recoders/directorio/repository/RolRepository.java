package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}