package cl.recoders.directorio.domain.dto;

import cl.recoders.directorio.persistence.entity.RolUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

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
public class User {
    private String username;
    private String password;
    private Timestamp fecha;
    private List<Member> miembros;
    private List<RolUsuario> rolUsuarios;


}
