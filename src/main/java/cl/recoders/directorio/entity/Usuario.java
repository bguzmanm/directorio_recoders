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
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "fecha_creacion")
    private String fechaCreacion;
    @OneToMany(mappedBy = "usuarioByIdUsuario")
    private Collection<UsuarioHasRol> usuarioHasRolsByIdUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (idUsuario != usuario.idUsuario) return false;
        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (password != null ? !password.equals(usuario.password) : usuario.password != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(usuario.fechaCreacion) : usuario.fechaCreacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        return result;
    }

    public Collection<UsuarioHasRol> getUsuarioHasRolsByIdUsuario() {
        return usuarioHasRolsByIdUsuario;
    }

    public void setUsuarioHasRolsByIdUsuario(Collection<UsuarioHasRol> usuarioHasRolsByIdUsuario) {
        this.usuarioHasRolsByIdUsuario = usuarioHasRolsByIdUsuario;
    }
}
