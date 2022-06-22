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
public class Perfil {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_perfil")
    private int idPerfil;
    @Basic
    @Column(name = "id_solicitud")
    private int idSolicitud;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "link")
    private String link;
    @ManyToOne
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud", nullable = false)
    private Solicitud solicitudByIdSolicitud;

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Perfil perfil = (Perfil) o;

        if (idPerfil != perfil.idPerfil) return false;
        if (idSolicitud != perfil.idSolicitud) return false;
        if (nombre != null ? !nombre.equals(perfil.nombre) : perfil.nombre != null) return false;
        if (link != null ? !link.equals(perfil.link) : perfil.link != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPerfil;
        result = 31 * result + idSolicitud;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }

    public Solicitud getSolicitudByIdSolicitud() {
        return solicitudByIdSolicitud;
    }

    public void setSolicitudByIdSolicitud(Solicitud solicitudByIdSolicitud) {
        this.solicitudByIdSolicitud = solicitudByIdSolicitud;
    }
}
