package cl.recoders.directorio.persistence.repository;

import cl.recoders.directorio.domain.dto.City;
import cl.recoders.directorio.domain.repository.CityRepository;
import cl.recoders.directorio.persistence.crud.CiudadCrudRepository;
import cl.recoders.directorio.persistence.entity.Ciudad;
import cl.recoders.directorio.persistence.mapper.CityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CiudadRepository implements CityRepository {

    private final CiudadCrudRepository crudRepository;
    private final CityMapper mapper;

    public CiudadRepository(CiudadCrudRepository crudRepository, CityMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<City> findAll() {
        List<Ciudad> ciudades = (List<Ciudad>) crudRepository.findAll();
        return mapper.toCitys(ciudades);
    }

    @Override
    public Optional<City> findById(int cityId) {
        return crudRepository.findById(cityId).map(ciudad -> mapper.toCity(ciudad));
    }

    @Override
    public Optional<List<City>> findByIdPais(int countryId) {

        return crudRepository.findByIdPais(countryId)
                .map(ciudades -> mapper.toCitys(ciudades));
    }
}
