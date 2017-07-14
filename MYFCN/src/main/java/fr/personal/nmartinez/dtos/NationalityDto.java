package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Nationality;

import java.io.Serializable;

/**
 * Created by marti on 14/07/2017.
 */
public class NationalityDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String NAME_MEMBER = "name";
    public static final String FLAG_PATH_MEMBER = "flagPath";

    private int id;
    private String name;
    private String flagPath;

    public NationalityDto(){}

    public NationalityDto(Nationality nationality){
        this.id = nationality.getId();
        this.name = nationality.getName();
        this.flagPath = nationality.getFlagPath();
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

    public String getFlagPath() {
        return flagPath;
    }

    public void setFlagPath(String flagPath) {
        this.flagPath = flagPath;
    }
}
