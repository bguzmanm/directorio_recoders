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
public class Solicitud {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_solicitud")
    private int idSolicitud;
    @Basic
    @Column(name = "id_miembro")
    private int idMiembro;
    @Basic
    @Column(name = "resumen")
    private String resumen;
    @Basic
    @Column(name = "imagen")
    private String imagen;
    @Basic
    @Column(name = "fecha")
    private String fecha;
    @Basic
    @Column(name = "linkedin")
    private String linkedin;
    @Basic
    @Column(name = "id_ciudad")
    private int idCiudad;
    @OneToMany(mappedBy = "solicitudByIdSolicitudVigente")
    private Collection<Miembro> miembrosByIdSolicitud;
    @OneToMany(mappedBy = "solicitudByIdSolicitud")
    private Collection<Perfil> perfilsByIdSolicitud;
    @OneToMany(mappedBy = "solicitudByIdSolicitud")
    private Collection<RegistroEstado> registroEstadosByIdSolicitud;
    @ManyToOne
    @JoinColumn(name = "id_miembro", referencedColumnName = "id_miembro", nullable = false)
    private Miembro miembroByIdMiembro;
    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad", nullable = false)
    private Ciudad ciudadByIdCiudad;
    @OneToMany(mappedBy = "solicitudByIdSolicitud")
    private Collection<SolicitudHasArea> solicitudHasAreasByIdSolicitud;
    @OneToMany(mappedBy = "solicitudByIdSolicitud")
    private Collection<SolicitudHasHerramienta> solicitudHasHerramientasByIdSolicitud;

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solicitud solicitud = (Solicitud) o;

        if (idSolicitud != solicitud.idSolicitud) return false;
        if (idMiembro != solicitud.idMiembro) return false;
        if (idCiudad != solicitud.idCiudad) return false;
        if (resumen != null ? !resumen.equals(solicitud.resumen) : solicitud.resumen != null) return false;
        if (imagen != null ? !imagen.equals(solicitud.imagen) : solicitud.imagen != null) return false;
        if (fecha != null ? !fecha.equals(solicitud.fecha) : solicitud.fecha != null) return false;
        if (linkedin != null ? !linkedin.equals(solicitud.linkedin) : solicitud.linkedin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSolicitud;
        result = 31 * result + idMiembro;
        result = 31 * result + (resumen != null ? resumen.hashCode() : 0);
        result = 31 * result + (imagen != null ? imagen.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (linkedin != null ? linkedin.hashCode() : 0);
        result = 31 * result + idCiudad;
        return result;
    }

    public Collection<Miembro> getMiembrosByIdSolicitud() {
        return miembrosByIdSolicitud;
    }

    public void setMiembrosByIdSolicitud(Collection<Miembro> miembrosByIdSolicitud) {
        this.miembrosByIdSolicitud = miembrosByIdSolicitud;
    }

    public Collection<Perfil> getPerfilsByIdSolicitud() {
        return perfilsByIdSolicitud;
    }

    public void setPerfilsByIdSolicitud(Collection<Perfil> perfilsByIdSolicitud) {
        this.perfilsByIdSolicitud = perfilsByIdSolicitud;
    }

    public Collection<RegistroEstado> getRegistroEstadosByIdSolicitud() {
        return registroEstadosByIdSolicitud;
    }

    public void setRegistroEstadosByIdSolicitud(Collection<RegistroEstado> registroEstadosByIdSolicitud) {
        this.registroEstadosByIdSolicitud = registroEstadosByIdSolicitud;
    }

    public Miembro getMiembroByIdMiembro() {
        return miembroByIdMiembro;
    }

    public void setMiembroByIdMiembro(Miembro miembroByIdMiembro) {
        this.miembroByIdMiembro = miembroByIdMiembro;
    }

    public Ciudad getCiudadByIdCiudad() {
        return ciudadByIdCiudad;
    }

    public void setCiudadByIdCiudad(Ciudad ciudadByIdCiudad) {
        this.ciudadByIdCiudad = ciudadByIdCiudad;
    }

    public Collection<SolicitudHasArea> getSolicitudHasAreasByIdSolicitud() {
        return solicitudHasAreasByIdSolicitud;
    }

    public void setSolicitudHasAreasByIdSolicitud(Collection<SolicitudHasArea> solicitudHasAreasByIdSolicitud) {
        this.solicitudHasAreasByIdSolicitud = solicitudHasAreasByIdSolicitud;
    }

    public Collection<SolicitudHasHerramienta> getSolicitudHasHerramientasByIdSolicitud() {
        return solicitudHasHerramientasByIdSolicitud;
    }

    public void setSolicitudHasHerramientasByIdSolicitud(Collection<SolicitudHasHerramienta> solicitudHasHerramientasByIdSolicitud) {
        this.solicitudHasHerramientasByIdSolicitud = solicitudHasHerramientasByIdSolicitud;
    }
}
