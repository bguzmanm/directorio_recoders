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
public class Area {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idarea", nullable = false)
    private int idArea;
    @Basic
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @OneToMany(mappedBy = "areaByIdArea")
    private List<RegistroArea> registroAreasByIdarea;


}
