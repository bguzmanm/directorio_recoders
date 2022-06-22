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
public class Rol {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_rol")
    private int idRol;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "rolByIdRol")
    private Collection<UsuarioHasRol> usuarioHasRolsByIdRol;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rol rol = (Rol) o;

        if (idRol != rol.idRol) return false;
        if (nombre != null ? !nombre.equals(rol.nombre) : rol.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRol;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public Collection<UsuarioHasRol> getUsuarioHasRolsByIdRol() {
        return usuarioHasRolsByIdRol;
    }

    public void setUsuarioHasRolsByIdRol(Collection<UsuarioHasRol> usuarioHasRolsByIdRol) {
        this.usuarioHasRolsByIdRol = usuarioHasRolsByIdRol;
    }
}
