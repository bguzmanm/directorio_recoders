package cl.recoders.directorio.entity;

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
 * @since 22-06-22
 */
public class UsuarioHasRolPK implements Serializable {
    @Column(name = "id_usuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "id_rol")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioHasRolPK that = (UsuarioHasRolPK) o;

        if (idUsuario != that.idUsuario) return false;
        if (idRol != that.idRol) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idRol;
        return result;
    }
}
