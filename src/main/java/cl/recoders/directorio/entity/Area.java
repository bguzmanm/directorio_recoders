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
public class Area {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_area")
    private int idArea;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "areaByIdArea")
    private Collection<SolicitudHasArea> solicitudHasAreasByIdArea;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Area area = (Area) o;

        if (idArea != area.idArea) return false;
        if (nombre != null ? !nombre.equals(area.nombre) : area.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArea;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public Collection<SolicitudHasArea> getSolicitudHasAreasByIdArea() {
        return solicitudHasAreasByIdArea;
    }

    public void setSolicitudHasAreasByIdArea(Collection<SolicitudHasArea> solicitudHasAreasByIdArea) {
        this.solicitudHasAreasByIdArea = solicitudHasAreasByIdArea;
    }
}
