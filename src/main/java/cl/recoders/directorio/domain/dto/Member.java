package cl.recoders.directorio.domain.dto;

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
public class Member {

    private int memberId;
    private String name;
    private String email;
    private String resume;
    private String img;
    private String linkedIn;
    private int cityId;
    private City city;
    private String username;
    private User user;
    private List<Area> areas;
    private List<State> states;
    private List<Tool> tools;
    private List<Rrss> rrss;

}
