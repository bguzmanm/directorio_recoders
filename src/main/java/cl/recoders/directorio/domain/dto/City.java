package cl.recoders.directorio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private int cityId;
    private String name;
    private int countryId;
    private Country country;
}
