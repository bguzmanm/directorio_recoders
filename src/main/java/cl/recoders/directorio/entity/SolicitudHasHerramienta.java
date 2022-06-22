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
@Table(name = "solicitud_has_herramienta", schema = "directorio", catalog = "")
@IdClass(SolicitudHasHerramientaPK.class)
public class SolicitudHasHerramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_solicitud")
    private int idSolicitud;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_herramienta")
    private int idHerramienta;
    @ManyToOne
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud", nullable = false)
    private Solicitud solicitudByIdSolicitud;
    @ManyToOne
    @JoinColumn(name = "id_herramienta", referencedColumnName = "id_herramienta", nullable = false)
    private Herramienta herramientaByIdHerramienta;

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(int idHerramienta) {
        this.idHerramienta = idHerramienta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolicitudHasHerramienta that = (SolicitudHasHerramienta) o;

        if (idSolicitud != that.idSolicitud) return false;
        if (idHerramienta != that.idHerramienta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSolicitud;
        result = 31 * result + idHerramienta;
        return result;
    }

    public Solicitud getSolicitudByIdSolicitud() {
        return solicitudByIdSolicitud;
    }

    public void setSolicitudByIdSolicitud(Solicitud solicitudByIdSolicitud) {
        this.solicitudByIdSolicitud = solicitudByIdSolicitud;
    }

    public Herramienta getHerramientaByIdHerramienta() {
        return herramientaByIdHerramienta;
    }

    public void setHerramientaByIdHerramienta(Herramienta herramientaByIdHerramienta) {
        this.herramientaByIdHerramienta = herramientaByIdHerramienta;
    }
}
