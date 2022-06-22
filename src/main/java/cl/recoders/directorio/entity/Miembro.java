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
public class Miembro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_miembro")
    private int idMiembro;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "id_solicitud_vigente")
    private int idSolicitudVigente;
    @ManyToOne
    @JoinColumn(name = "id_solicitud_vigente", referencedColumnName = "id_solicitud", nullable = false)
    private Solicitud solicitudByIdSolicitudVigente;
    @OneToMany(mappedBy = "miembroByIdMiembro")
    private Collection<Solicitud> solicitudsByIdMiembro;

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdSolicitudVigente() {
        return idSolicitudVigente;
    }

    public void setIdSolicitudVigente(int idSolicitudVigente) {
        this.idSolicitudVigente = idSolicitudVigente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Miembro miembro = (Miembro) o;

        if (idMiembro != miembro.idMiembro) return false;
        if (idSolicitudVigente != miembro.idSolicitudVigente) return false;
        if (nombre != null ? !nombre.equals(miembro.nombre) : miembro.nombre != null) return false;
        if (email != null ? !email.equals(miembro.email) : miembro.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMiembro;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + idSolicitudVigente;
        return result;
    }

    public Solicitud getSolicitudByIdSolicitudVigente() {
        return solicitudByIdSolicitudVigente;
    }

    public void setSolicitudByIdSolicitudVigente(Solicitud solicitudByIdSolicitudVigente) {
        this.solicitudByIdSolicitudVigente = solicitudByIdSolicitudVigente;
    }

    public Collection<Solicitud> getSolicitudsByIdMiembro() {
        return solicitudsByIdMiembro;
    }

    public void setSolicitudsByIdMiembro(Collection<Solicitud> solicitudsByIdMiembro) {
        this.solicitudsByIdMiembro = solicitudsByIdMiembro;
    }
}
