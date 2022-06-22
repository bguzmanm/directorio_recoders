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
@Table(name = "tipo_herramienta", schema = "directorio", catalog = "")
public class TipoHerramienta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo_herramienta")
    private int idTipoHerramienta;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "tipoHerramientaByIdTipoHerramienta")
    private Collection<Herramienta> herramientasByIdTipoHerramienta;

    public int getIdTipoHerramienta() {
        return idTipoHerramienta;
    }

    public void setIdTipoHerramienta(int idTipoHerramienta) {
        this.idTipoHerramienta = idTipoHerramienta;
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

        TipoHerramienta that = (TipoHerramienta) o;

        if (idTipoHerramienta != that.idTipoHerramienta) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoHerramienta;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public Collection<Herramienta> getHerramientasByIdTipoHerramienta() {
        return herramientasByIdTipoHerramienta;
    }

    public void setHerramientasByIdTipoHerramienta(Collection<Herramienta> herramientasByIdTipoHerramienta) {
        this.herramientasByIdTipoHerramienta = herramientasByIdTipoHerramienta;
    }
}
