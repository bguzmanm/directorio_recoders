package cl.recoders.directorio.entity.vo;

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
public class CiudadVO {
    private int idCiudad;
    private String nombre;
    private int idPais;
    private PaisVO pais;
}
