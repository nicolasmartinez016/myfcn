package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Team;

import java.io.Serializable;

/**
 * Created by marti on 14/07/2017.
 */
public class TeamDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String NAME_MEMBER = "name";
    public static final String LOGO_PATH_MEMBER = "logoPath";

    private int id;
    private String name;
    private String logoPath;

    // constructors

    public TeamDto(){}

    public TeamDto(Team team){
        this.id = team.getId();
        this.name = team.getName();
        this.logoPath = team.getLogoPath();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
}
