package cl.recoders.directorio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@Entity
@Table(name = "rol_usuario", schema = "directorio", catalog = "")
@IdClass(RolUsuarioPK.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolUsuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrol", nullable = false)
    private int idRol;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic
    @Column(name = "habilitado", nullable = true)
    private byte habilitado;
    @ManyToOne
    @JoinColumn(name = "idrol", referencedColumnName = "idrol", nullable = false, insertable = false, updatable = false)
    private Rol rolByIdrol;
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false, insertable = false, updatable = false)
    private Usuario usuarioByUsername;
}
