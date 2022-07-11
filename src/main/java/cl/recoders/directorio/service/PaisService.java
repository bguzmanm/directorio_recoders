package cl.recoders.directorio.service;

import cl.recoders.directorio.entity.Pais;
import cl.recoders.directorio.repository.PaisRepository;
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
public class PaisService {

    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public List<Pais> findAll(){
        return paisRepository.findAll();
    }

    public Pais findOne(int id){
        return paisRepository.findById(id).orElse(null);
    }
}
