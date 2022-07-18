package cl.recoders.directorio.domain.service;

import cl.recoders.directorio.domain.dto.City;
import cl.recoders.directorio.domain.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * directorio
 * cl.recoders.directorio.service
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@Service
public class CityService {

    private final CityRepository repository;

    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    public List<City> findAll(){
        return repository.findAll();
    }

    public Optional<City> findOne(int id){
        return repository.findById(id);
    }

    public Optional<List<City>> findByIdPais(int countryId){
        return repository.findByIdPais(countryId);
    }
}
