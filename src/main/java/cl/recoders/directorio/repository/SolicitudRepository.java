package cl.recoders.directorio.repository;

import cl.recoders.directorio.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
}