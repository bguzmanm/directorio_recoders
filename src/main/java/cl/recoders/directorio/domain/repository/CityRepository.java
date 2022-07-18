package cl.recoders.directorio.domain.repository;

import cl.recoders.directorio.domain.dto.City;

import java.util.List;
import java.util.Optional;

public interface CityRepository {
    public List<City> findAll();
    public Optional<City> findById(int cityId);
    public Optional<List<City>> findByIdPais(int countryId);

}
