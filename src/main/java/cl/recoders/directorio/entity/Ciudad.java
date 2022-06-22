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
public class Ciudad {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_ciudad")
    private int idCiudad;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "id_pais")
    private int idPais;
    @ManyToOne
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais", nullable = false)
    private Pais paisByIdPais;
    @OneToMany(mappedBy = "ciudadByIdCiudad")
    private Collection<Solicitud> solicitudsByIdCiudad;

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ciudad ciudad = (Ciudad) o;

        if (idCiudad != ciudad.idCiudad) return false;
        if (idPais != ciudad.idPais) return false;
        if (nombre != null ? !nombre.equals(ciudad.nombre) : ciudad.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCiudad;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + idPais;
        return result;
    }

    public Pais getPaisByIdPais() {
        return paisByIdPais;
    }

    public void setPaisByIdPais(Pais paisByIdPais) {
        this.paisByIdPais = paisByIdPais;
    }

    public Collection<Solicitud> getSolicitudsByIdCiudad() {
        return solicitudsByIdCiudad;
    }

    public void setSolicitudsByIdCiudad(Collection<Solicitud> solicitudsByIdCiudad) {
        this.solicitudsByIdCiudad = solicitudsByIdCiudad;
    }
}
