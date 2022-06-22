package cl.recoders.directorio.entity;

import javax.persistence.*;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 22-06-22
 */
@Entity
@Table(name = "usuario_has_rol", schema = "directorio", catalog = "")
@IdClass(UsuarioHasRolPK.class)
public class UsuarioHasRol {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_rol")
    private int idRol;
    @Basic
    @Column(name = "habilitado")
    private byte habilitado;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false)
    private Usuario usuarioByIdUsuario;
    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false)
    private Rol rolByIdRol;

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

    public byte getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(byte habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioHasRol that = (UsuarioHasRol) o;

        if (idUsuario != that.idUsuario) return false;
        if (idRol != that.idRol) return false;
        if (habilitado != that.habilitado) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idRol;
        result = 31 * result + (int) habilitado;
        return result;
    }

    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }

    public Rol getRolByIdRol() {
        return rolByIdRol;
    }

    public void setRolByIdRol(Rol rolByIdRol) {
        this.rolByIdRol = rolByIdRol;
    }
}
