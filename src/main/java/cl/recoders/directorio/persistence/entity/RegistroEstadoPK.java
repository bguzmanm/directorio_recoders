package cl.recoders.directorio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEstadoPK implements Serializable {
    @Column(name = "miembro_idmiembro", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int miembroIdMiembro;
    @Column(name = "estado_idestado", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estadoIdEstado;
}
