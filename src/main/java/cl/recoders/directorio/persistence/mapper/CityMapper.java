package cl.recoders.directorio.persistence.mapper;

import cl.recoders.directorio.domain.dto.City;
import cl.recoders.directorio.persistence.entity.Ciudad;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 18-07-22
 */
@Mapper(componentModel = "spring", uses = {CountryMapper.class})
public interface CityMapper {

    @Mappings({
            @Mapping(source = "idCiudad", target = "cityId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idPais", target = "countryId"),
            @Mapping(source = "paisByIdpais", target = "country"),

    })
    City toCity(Ciudad ciudad);
    List<City> toCitys(List<Ciudad> ciudades);

    @InheritInverseConfiguration
    Ciudad toCiudad(City city);
}
