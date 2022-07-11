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
@Table(name = "registro_area", schema = "directorio", catalog = "")
@IdClass(RegistroAreaPK.class)
public class RegistroArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idarea", nullable = false)
    private int idArea;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmiembro", nullable = false)
    private int idMiembro;
    @Basic
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @ManyToOne
    @JoinColumn(name = "idarea", referencedColumnName = "idarea", nullable = false, insertable = false, updatable = false)
    private Area areaByIdArea;
    @ManyToOne
    @JoinColumn(name = "idmiembro", referencedColumnName = "idmiembro", nullable = false, insertable = false, updatable = false)
    private Miembro miembroByIdMiembro;

}
