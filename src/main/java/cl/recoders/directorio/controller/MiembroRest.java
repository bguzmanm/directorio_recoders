package cl.recoders.directorio.controller;

import cl.recoders.directorio.entity.Area;
import cl.recoders.directorio.entity.Pais;
import cl.recoders.directorio.entity.vo.AreaVO;
import cl.recoders.directorio.entity.vo.PaisVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;

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
        AreaVO areaVO = new AreaVO(1, "La Cosa");
        Area area = new Area();

        PaisVO paisVO = new PaisVO(1, "Chile");
        Pais pais = new Pais();

        BeanUtils.copyProperties(areaVO, area);
        BeanUtils.copyProperties(paisVO, pais);


        System.out.println(paisVO);
        System.out.println(pais.toString());
    }
}
