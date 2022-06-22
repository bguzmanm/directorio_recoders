package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Herramienta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HerramientaRepository extends JpaRepository<Herramienta, Integer> {
}