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
public class Herramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_herramienta")
    private int idHerramienta;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "id_tipo_herramienta")
    private int idTipoHerramienta;
    @ManyToOne
    @JoinColumn(name = "id_tipo_herramienta", referencedColumnName = "id_tipo_herramienta", nullable = false)
    private TipoHerramienta tipoHerramientaByIdTipoHerramienta;
    @OneToMany(mappedBy = "herramientaByIdHerramienta")
    private Collection<SolicitudHasHerramienta> solicitudHasHerramientasByIdHerramienta;

    public int getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(int idHerramienta) {
        this.idHerramienta = idHerramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoHerramienta() {
        return idTipoHerramienta;
    }

    public void setIdTipoHerramienta(int idTipoHerramienta) {
        this.idTipoHerramienta = idTipoHerramienta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Herramienta that = (Herramienta) o;

        if (idHerramienta != that.idHerramienta) return false;
        if (idTipoHerramienta != that.idTipoHerramienta) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHerramienta;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + idTipoHerramienta;
        return result;
    }

    public TipoHerramienta getTipoHerramientaByIdTipoHerramienta() {
        return tipoHerramientaByIdTipoHerramienta;
    }

    public void setTipoHerramientaByIdTipoHerramienta(TipoHerramienta tipoHerramientaByIdTipoHerramienta) {
        this.tipoHerramientaByIdTipoHerramienta = tipoHerramientaByIdTipoHerramienta;
    }

    public Collection<SolicitudHasHerramienta> getSolicitudHasHerramientasByIdHerramienta() {
        return solicitudHasHerramientasByIdHerramienta;
    }

    public void setSolicitudHasHerramientasByIdHerramienta(Collection<SolicitudHasHerramienta> solicitudHasHerramientasByIdHerramienta) {
        this.solicitudHasHerramientasByIdHerramienta = solicitudHasHerramientasByIdHerramienta;
    }
}
