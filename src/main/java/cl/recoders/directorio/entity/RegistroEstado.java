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
@Table(name = "registro_estado", schema = "directorio", catalog = "")
public class RegistroEstado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_registro_estado")
    private int idRegistroEstado;
    @Basic
    @Column(name = "id_solicitud")
    private int idSolicitud;
    @Basic
    @Column(name = "fecha")
    private String fecha;
    @Basic
    @Column(name = "id_estado")
    private int idEstado;
    @Basic
    @Column(name = "id_responsable")
    private int idResponsable;
    @ManyToOne
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud", nullable = false)
    private Solicitud solicitudByIdSolicitud;
    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado", nullable = false)
    private Estado estadoByIdEstado;

    public int getIdRegistroEstado() {
        return idRegistroEstado;
    }

    public void setIdRegistroEstado(int idRegistroEstado) {
        this.idRegistroEstado = idRegistroEstado;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistroEstado that = (RegistroEstado) o;

        if (idRegistroEstado != that.idRegistroEstado) return false;
        if (idSolicitud != that.idSolicitud) return false;
        if (idEstado != that.idEstado) return false;
        if (idResponsable != that.idResponsable) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRegistroEstado;
        result = 31 * result + idSolicitud;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + idEstado;
        result = 31 * result + idResponsable;
        return result;
    }

    public Solicitud getSolicitudByIdSolicitud() {
        return solicitudByIdSolicitud;
    }

    public void setSolicitudByIdSolicitud(Solicitud solicitudByIdSolicitud) {
        this.solicitudByIdSolicitud = solicitudByIdSolicitud;
    }

    public Estado getEstadoByIdEstado() {
        return estadoByIdEstado;
    }

    public void setEstadoByIdEstado(Estado estadoByIdEstado) {
        this.estadoByIdEstado = estadoByIdEstado;
    }
}
