package cl.recoders.directorio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
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
@Table(name = "tipo_herramienta", schema = "directorio", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoHerramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipo_herramienta", nullable = false)
    private int idTipoHerramienta;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;
    @OneToMany(mappedBy = "tipoHerramientaByIdtipoHerramienta")
    private List<Herramienta> herramientasByIdtipoHerramienta;

}
