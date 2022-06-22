package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
}