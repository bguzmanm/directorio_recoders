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
@Table(name = "registro_rrss", schema = "directorio", catalog = "")
@IdClass(RegistroRrssPK.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroRrss {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrrss", nullable = false)
    private int idRrss;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmiembro", nullable = false)
    private int idMiembro;
    @Basic
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @ManyToOne
    @JoinColumn(name = "idrrss", referencedColumnName = "idrrss", nullable = false, updatable = false, insertable = false)
    private Rrss rrssByIdrrss;
    @ManyToOne
    @JoinColumn(name = "idmiembro", referencedColumnName = "idmiembro", nullable = false, updatable = false, insertable = false)
    private Miembro miembroByIdmiembro;

}
