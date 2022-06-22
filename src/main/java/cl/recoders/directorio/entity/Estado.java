package cl.recoders.directorio.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 22-06-22
 */
@Entity
public class Estado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_estado")
    private int idEstado;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "estadoByIdEstado")
    private Collection<RegistroEstado> registroEstadosByIdEstado;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estado estado = (Estado) o;

        if (idEstado != estado.idEstado) return false;
        if (descripcion != null ? !descripcion.equals(estado.descripcion) : estado.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstado;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public Collection<RegistroEstado> getRegistroEstadosByIdEstado() {
        return registroEstadosByIdEstado;
    }

    public void setRegistroEstadosByIdEstado(Collection<RegistroEstado> registroEstadosByIdEstado) {
        this.registroEstadosByIdEstado = registroEstadosByIdEstado;
    }
}
