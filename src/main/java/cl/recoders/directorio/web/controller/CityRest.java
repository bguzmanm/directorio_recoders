package cl.recoders.directorio.web.controller;

import cl.recoders.directorio.domain.dto.City;
import cl.recoders.directorio.domain.service.CityService;
import io.swagger.annotations.*;
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
@RequestMapping("/api/city")
@Api(tags = "citys")
public class CityRest {

    private final CityService service;

    public CityRest(CityService service) {
        this.service = service;
    }

    @ApiOperation("Return all Citys")
    @ApiResponses({
            @ApiResponse(code=201, message = "Ok"),
            @ApiResponse(code = 404, message = "Citys not found")
    })
    @GetMapping
    public ResponseEntity<List<City>> findAll(){

        List<City> lista = service.findAll();
        if (lista.size() < 1){
            return new ResponseEntity<List<City>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<City>>(lista, HttpStatus.OK);
        }
    }

    @ApiOperation("Return a City by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 404, message = "Citys not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<City> findOne(@ApiParam(value = "the id of city") @PathVariable("id") int id){
        return service.findOne(id)
                .map(city -> new ResponseEntity<>(city, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @ApiOperation("Return Citys by country id")
    @ApiResponses({
            @ApiResponse(code=200, message = "Ok"),
            @ApiResponse(code=404, message = "Citys not found")
    })
    @GetMapping("/country/{id}")
    public ResponseEntity<List<City>> findCitysByCountryId(@ApiParam(value = "id of country") @PathVariable("id") int id){

        return service.findByIdPais(id)
                .map(cities -> new ResponseEntity<>(cities, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));


    }
}
