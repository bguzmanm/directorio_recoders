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
public class SolicitudHasHerramientaPK implements Serializable {
    @Column(name = "id_solicitud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSolicitud;
    @Column(name = "id_herramienta")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHerramienta;

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

        SolicitudHasHerramientaPK that = (SolicitudHasHerramientaPK) o;

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
}
