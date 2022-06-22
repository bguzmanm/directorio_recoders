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
public class SolicitudHasAreaPK implements Serializable {
    @Column(name = "id_solicitud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSolicitud;
    @Column(name = "id_area")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArea;

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

        SolicitudHasAreaPK that = (SolicitudHasAreaPK) o;

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
}
