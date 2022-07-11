package cl.recoders.directorio.entity;

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
public class Ciudad {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idciudad", nullable = false)
    private int idCiudad;
    @Basic
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic
    @Column(name = "idpais", nullable = false)
    private int idPais;
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "idpais", nullable = false, insertable = false, updatable = false)
    private Pais paisByIdpais;
    @OneToMany(mappedBy = "ciudad")
    private List<Miembro> miembrosByIdciudad;

}
