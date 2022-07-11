package cl.recoders.directorio.controller;

import cl.recoders.directorio.entity.Ciudad;
import cl.recoders.directorio.entity.vo.CiudadVO;
import cl.recoders.directorio.service.CiudadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping("/api/ciudad")
@Api(tags = "ciudad")
public class CiudadRest {

    private final CiudadService ciudadService;

    public CiudadRest(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }


    @ApiOperation(value="Lista ciudades", notes = "Servicio para listar ciudades")
    @ApiResponses(value = {@ApiResponse(code=201, message = "Listado encontrado correctamente"),
            @ApiResponse(code = 400, message = "No se encuentran ciudades")})
    @GetMapping
    public ResponseEntity<List<CiudadVO>> findAll(){

        List<Ciudad> lista = ciudadService.findAll();
        if (lista.size() < 1){
            return new ResponseEntity<List<CiudadVO>>(HttpStatus.NOT_FOUND);
        } else {
            List<CiudadVO> listaVO = new ArrayList<CiudadVO>();
            lista.forEach(ciudad -> {
                CiudadVO c = new CiudadVO();
                BeanUtils.copyProperties(ciudad, c);
                listaVO.add(c);
            });
            return new ResponseEntity<List<CiudadVO>>(listaVO, HttpStatus.FOUND);
        }
    }

    @ApiOperation(value="Retorna Ciudad by Id", notes="Servicio que retorna una Ciudad dado su ID")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Ciudad encontrada"),
            @ApiResponse(code = 400, message = "Ciudad no encontrada")})
    @GetMapping("/{id}")
    public ResponseEntity<CiudadVO> findOne(@PathVariable("id") int id){
        Ciudad c = ciudadService.findOne(id);
        if (c == null){
            return new ResponseEntity<CiudadVO>(HttpStatus.NOT_FOUND);
        } else {
            CiudadVO cvo = new CiudadVO();
            BeanUtils.copyProperties(c, cvo);
            return new ResponseEntity<CiudadVO>(cvo, HttpStatus.FOUND);
        }
    }

    @ApiOperation(value="Retorna Ciudades dado un ID de País",
            notes = "Servicio que retorna las ciudades asociadas a un país")
    @ApiResponses(value = {@ApiResponse(code=201, message = "Ciudades de un País"),
            @ApiResponse(code=404, message = "Ciudades del país no encontrado")})
    @GetMapping("/pais/{id}")
    public ResponseEntity<List<CiudadVO>> findOneByPaisId(@PathVariable("id") String id){
        List<Ciudad> lista = ciudadService.findByIdPais(Integer.parseInt(id));
        System.out.println("Hay " + lista.size()+ " ciudades en este país");
        if (lista.size() < 1){
            return new ResponseEntity<List<CiudadVO>>(HttpStatus.NOT_FOUND);
        } else {
            List<CiudadVO> listaVO = new ArrayList<CiudadVO>();
            lista.forEach(ciudad -> {
                CiudadVO c = new CiudadVO();
                BeanUtils.copyProperties(ciudad, c);
                listaVO.add(c);
            });
            return new ResponseEntity<List<CiudadVO>>(listaVO, HttpStatus.FOUND);
        }
    }
}
