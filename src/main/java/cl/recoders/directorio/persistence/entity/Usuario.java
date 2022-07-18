package cl.recoders.directorio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 45)
    private String password;
    @Basic
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @OneToMany(mappedBy = "usuarioByUsername")
    private List<Miembro> miembrosByUsername;
    @OneToMany(mappedBy = "usuarioByUsername")
    private List<RolUsuario> rolUsuariosByUsername;
}
