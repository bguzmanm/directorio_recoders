package cl.recoders.directorio.web.controller;

import cl.recoders.directorio.domain.dto.Country;
import cl.recoders.directorio.domain.service.CountryService;
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
@RequestMapping("/api/country")
@Api(tags = "country")
public class PaisRest {

    private final CountryService service;

    public PaisRest(CountryService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation("Return all Country")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok")
    })
    public ResponseEntity<List<Country>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @ApiOperation("Return a Country by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code=404, message = "Country not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Country> findOne(@ApiParam("The id of Country") @PathVariable("id") int id){
        return service.findOne(id)
                .map(country -> new ResponseEntity<>(country, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
