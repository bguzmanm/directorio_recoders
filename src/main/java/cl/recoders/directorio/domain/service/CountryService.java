package cl.recoders.directorio.domain.service;

import cl.recoders.directorio.domain.dto.Country;
import cl.recoders.directorio.domain.repository.CountryRepository;
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
public class CountryService {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> findAll(){
        return repository.findAll();
    }

    public Optional<Country> findOne(int id){
        return repository.findById(id);
    }
}
