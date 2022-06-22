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
public class Pais {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_pais")
    private int idPais;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "paisByIdPais")
    private Collection<Ciudad> ciudadsByIdPais;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
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

        Pais pais = (Pais) o;

        if (idPais != pais.idPais) return false;
        if (nombre != null ? !nombre.equals(pais.nombre) : pais.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPais;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public Collection<Ciudad> getCiudadsByIdPais() {
        return ciudadsByIdPais;
    }

    public void setCiudadsByIdPais(Collection<Ciudad> ciudadsByIdPais) {
        this.ciudadsByIdPais = ciudadsByIdPais;
    }
}
