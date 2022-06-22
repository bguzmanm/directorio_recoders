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
@Table(name = "solicitud_has_area", schema = "directorio", catalog = "")
@IdClass(SolicitudHasAreaPK.class)
public class SolicitudHasArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_solicitud")
    private int idSolicitud;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_area")
    private int idArea;
    @ManyToOne
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud", nullable = false)
    private Solicitud solicitudByIdSolicitud;
    @ManyToOne
    @JoinColumn(name = "id_area", referencedColumnName = "id_area", nullable = false)
    private Area areaByIdArea;

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolicitudHasArea that = (SolicitudHasArea) o;

        if (idSolicitud != that.idSolicitud) return false;
        if (idArea != that.idArea) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSolicitud;
        result = 31 * result + idArea;
        return result;
    }

    public Solicitud getSolicitudByIdSolicitud() {
        return solicitudByIdSolicitud;
    }

    public void setSolicitudByIdSolicitud(Solicitud solicitudByIdSolicitud) {
        this.solicitudByIdSolicitud = solicitudByIdSolicitud;
    }

    public Area getAreaByIdArea() {
        return areaByIdArea;
    }

    public void setAreaByIdArea(Area areaByIdArea) {
        this.areaByIdArea = areaByIdArea;
    }
}
