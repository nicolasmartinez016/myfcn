package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Nationality;
import fr.personal.nmartinez.entities.Player;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of Player
 */
public class PlayerDto implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private int size;
    private String picturePath;
    private Nationality nationality;
    private List<ApplicationDto> applications;

    public PlayerDto(){}

    public PlayerDto(Player player){
        this.id = player.getId();
        this.firstName = player.getFirstName();
        this.lastName = player.getLastName();
        this.size = player.getSize();
        this.nationality = player.getNationality();
        this.picturePath = player.getPicturePath();
        this.applications = ApplicationDto.fromApplications(player.getApplications());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public List<ApplicationDto> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationDto> applications) {
        this.applications = applications;
    }
}
