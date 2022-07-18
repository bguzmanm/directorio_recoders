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
public class RolUser {
    private int idRol;
    private String username;
    private boolean habilitado;
    private Rol rol;
    private User usuario;
}
