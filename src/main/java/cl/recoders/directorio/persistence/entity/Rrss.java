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
public class Rrss {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrrss", nullable = false)
    private int idRrss;
    @Basic
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic
    @Column(name = "url", nullable = false, length = 100)
    private String url;
    @Basic
    @Column(name = "logo", nullable = true, length = 100)
    private String logo;
    @OneToMany(mappedBy = "rrssByIdrrss")
    private List<RegistroRrss> registroRrssesByIdrrss;


}
