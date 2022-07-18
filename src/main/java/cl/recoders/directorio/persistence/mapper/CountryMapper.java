package cl.recoders.directorio.persistence.mapper;

import cl.recoders.directorio.domain.dto.Country;
import cl.recoders.directorio.persistence.entity.Pais;
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
@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mappings({
            @Mapping(source = "idPais", target = "countryId"),
            @Mapping(source = "nombre", target = "name")
    })
    Country toCountry(Pais pais);
    List<Country> toCountrys(List<Pais> paises);
    @InheritInverseConfiguration
    Pais toPais(Country country);

}
