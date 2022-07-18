package cl.recoders.directorio.persistence.entity;

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
@Table(name = "registro_herramienta", schema = "directorio", catalog = "")
@IdClass(RegistroHerramientaPK.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroHerramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idherramienta", nullable = false)
    private int idHerramienta;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmiembro", nullable = false)
    private int idMiembro;
    @Basic
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @ManyToOne
    @JoinColumn(name = "idherramienta", referencedColumnName = "idherramienta", nullable = false, insertable = false, updatable = false)
    private Herramienta herramientaByIdherramienta;
    @ManyToOne
    @JoinColumn(name = "idmiembro", referencedColumnName = "idmiembro", nullable = false, insertable = false, updatable = false)
    private Miembro miembroByIdmiembro;
}
