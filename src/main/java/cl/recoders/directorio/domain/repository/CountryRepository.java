package cl.recoders.directorio.domain.repository;

import cl.recoders.directorio.domain.dto.Country;

import java.util.List;
import java.util.Optional;

/**
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 18-07-22
 */
public interface CountryRepository {
    public List<Country> findAll();
    public Optional<Country> findById(int countryId);

}
