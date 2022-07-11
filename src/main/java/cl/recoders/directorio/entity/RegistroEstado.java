package cl.recoders.directorio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

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
@Table(name = "registro_estado", schema = "directorio", catalog = "")
@IdClass(RegistroEstadoPK.class)
public class RegistroEstado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "miembro_idmiembro", nullable = false)
    private int miembroIdMiembro;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "estado_idestado", nullable = false)
    private int estadoIdEstado;
    @Basic
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @ManyToOne
    @JoinColumn(name = "miembro_idmiembro", referencedColumnName = "idmiembro", nullable = false, insertable = false, updatable = false)
    private Miembro miembroByMiembroIdmiembro;
    @ManyToOne
    @JoinColumn(name = "estado_idestado", referencedColumnName = "idestado", nullable = false, insertable = false, updatable = false)
    private Estado estadoByEstadoIdestado;
}
