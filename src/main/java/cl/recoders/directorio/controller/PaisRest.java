package cl.recoders.directorio.controller;

import cl.recoders.directorio.entity.Pais;
import cl.recoders.directorio.entity.vo.PaisVO;
import cl.recoders.directorio.service.PaisService;
import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * directorio
 * cl.recoders.directorio.controller
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */
@RestController
@RequestMapping("/api/pais")
@Api(tags = "pais")
public class PaisRest {

    private final PaisService paisService;

    public PaisRest(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    @ApiOperation(value = "Lista todos los paises", notes = "Servicio para listar todos los paises")
    @ApiResponses(value = {@ApiResponse( code = 201, message = "Listado entregado correctamente"),
            @ApiResponse(code = 400, message = "No se encuentran paises")})
    public ResponseEntity<List<PaisVO>> findAll(){

        List<Pais> lista = paisService.findAll();
        if (lista.size() < 1){
            return new ResponseEntity<List<PaisVO>>(HttpStatus.NOT_FOUND);
        } else {
            List<PaisVO> listaVO = new ArrayList<PaisVO>();
            lista.forEach(pais -> {
                PaisVO pvo = new PaisVO();
                BeanUtils.copyProperties(pais, pvo);
                listaVO.add(pvo);
            });
            return new ResponseEntity<List<PaisVO>>(listaVO, HttpStatus.FOUND);
        }

    }
    @ApiOperation(value="Datos de País consultado", notes = "Servicio para consultar un país")
    @ApiResponses(value= {@ApiResponse(code = 201, message = "País entregado correctamente"),
        @ApiResponse(code=400, message = "No se encuentra el país")})
    @GetMapping("/{id}")
    public ResponseEntity<PaisVO> findOne(@PathVariable("id") int id){
        Pais p = paisService.findOne(id);
        if (p == null){
            return new ResponseEntity<PaisVO>(HttpStatus.NOT_FOUND);
        } else {
            PaisVO paisVO = new PaisVO();
            BeanUtils.copyProperties(p, paisVO);
            return new ResponseEntity<PaisVO>(paisVO, HttpStatus.FOUND);
        }
    }


}
