package cl.recoders.directorio.web.controller;

import cl.recoders.directorio.persistence.entity.Pais;
import cl.recoders.directorio.domain.dto.Area;
import cl.recoders.directorio.domain.dto.Country;
import org.springframework.beans.BeanUtils;

/**
 * directorio
 * cl.recoders.directorio.controller
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 28-06-22
 */

public class MiembroRest {


    public static void main(String[] args) {
        Area areaVO = new Area(1, "La Cosa");
        cl.recoders.directorio.persistence.entity.Area area = new cl.recoders.directorio.persistence.entity.Area();

        Country paisVO = new Country(1, "Chile");
        Pais pais = new Pais();

        BeanUtils.copyProperties(areaVO, area);
        BeanUtils.copyProperties(paisVO, pais);


        System.out.println(paisVO);
        System.out.println(pais.toString());
    }
}
