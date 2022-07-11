package cl.recoders.directorio.service;

import cl.recoders.directorio.entity.Ciudad;
import cl.recoders.directorio.repository.CiudadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * directorio
 * cl.recoders.directorio.service
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@Service
public class CiudadService {

    private final CiudadRepository ciudadRepository;

    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public List<Ciudad> findAll(){
        return ciudadRepository.findAll();
    }

    public Ciudad findOne(int id){
        return ciudadRepository.findById(id).orElse(null);
    }

    public List<Ciudad> findByIdPais(int idPais){
        return ciudadRepository.findByIdPais(idPais);
    }
}
