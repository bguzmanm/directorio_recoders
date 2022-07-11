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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Herramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idherramienta", nullable = false)
    private int idHerramienta;
    @Basic
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic
    @Column(name = "url", nullable = true, length = 100)
    private String url;
    @Basic
    @Column(name = "img", nullable = true, length = 100)
    private String img;
    @Basic
    @Column(name = "idtipo_herramienta", nullable = false)
    private int idTipoHerramienta;
    @ManyToOne
    @JoinColumn(name = "idtipo_herramienta", referencedColumnName = "idtipo_herramienta", nullable = false, insertable = false, updatable = false)
    private TipoHerramienta tipoHerramientaByIdtipoHerramienta;
    @OneToMany(mappedBy = "herramientaByIdherramienta")
    private List<RegistroHerramienta> registroHerramientasByIdherramienta;

}
