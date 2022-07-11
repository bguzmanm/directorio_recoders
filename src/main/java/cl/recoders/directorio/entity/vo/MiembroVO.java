package cl.recoders.directorio.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * directorio
 * cl.recoders.directorio.entity
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiembroVO {

    private int idMiembro;
    private String nombre;
    private String email;
    private String resumen;
    private String img;
    private String linkedIn;
    private int idCiudad;
    private CiudadVO ciudad;
    private String username;
    private UsuarioVO usuario;
    private List<AreaVO> areas;
    private List<EstadoVO> estados;
    private List<HerramientaVO> herramientas;
    private List<RrssVO> rrss;

}
