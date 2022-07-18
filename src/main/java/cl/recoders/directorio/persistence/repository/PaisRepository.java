package cl.recoders.directorio.persistence.repository;

import cl.recoders.directorio.domain.dto.Country;
import cl.recoders.directorio.domain.repository.CountryRepository;
import cl.recoders.directorio.persistence.crud.PaisCrudRepository;
import cl.recoders.directorio.persistence.entity.Pais;
import cl.recoders.directorio.persistence.mapper.CountryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 18-07-22
 */
@Repository
public class PaisRepository implements CountryRepository {

    private final PaisCrudRepository crudRepository;
    private final CountryMapper mapper;

    public PaisRepository(PaisCrudRepository crudRepository, CountryMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Country> findAll() {
        List<Pais> paises = (List<Pais>) crudRepository.findAll();
        return mapper.toCountrys(paises);
    }

    @Override
    public Optional<Country> findById(int countryId) {
        return crudRepository.findById(countryId).map(pais -> mapper.toCountry(pais));
    }
}
