package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.UsuarioHasRol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioHasRolRepository extends JpaRepository<UsuarioHasRol, Integer> {
}