package cl.recoders.directorio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
public class Miembro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmiembro", nullable = false)
    private int idMiembro;
    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "resumen", nullable = true, length = -1)
    private String resumen;
    @Basic
    @Column(name = "img", nullable = true, length = 200)
    private String img;
    @Basic
    @Column(name = "linkedin", nullable = true, length = 200)
    private String linkedIn;
    @Basic
    @Column(name = "idciudad", nullable = false)
    private int idCiudad;
    @Basic
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "idciudad", nullable = false, insertable = false, updatable = false)
    private Ciudad ciudad;
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false, insertable = false, updatable = false)
    private Usuario usuarioByUsername;
    @OneToMany(mappedBy = "miembroByIdMiembro")
    private List<RegistroArea> registroAreasByIdmiembro;
    @OneToMany(mappedBy = "miembroByMiembroIdmiembro")
    private List<RegistroEstado> registroEstadosByIdmiembro;
    @OneToMany(mappedBy = "miembroByIdmiembro")
    private List<RegistroHerramienta> registroHerramientasByIdmiembro;
    @OneToMany(mappedBy = "miembroByIdmiembro")
    private List<RegistroRrss> registroRrssesByIdmiembro;

}
