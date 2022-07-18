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
public class Estado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idestado", nullable = false)
    private int idEstado;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;
    @OneToMany(mappedBy = "estadoByEstadoIdestado")
    private List<RegistroEstado> registroEstadosByIdestado;

}
