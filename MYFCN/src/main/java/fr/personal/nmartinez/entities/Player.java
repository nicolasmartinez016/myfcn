package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.dtos.PlayerDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Player implements Serializable {


    public static final String GENERATOR = "PlayerGenerator";

    @TableGenerator(
            name = Player.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Player.GENERATOR)
    private int id;

    private String firstName;
    private String lastName;
    private int size;
    private String picturePath;

    @ManyToOne
    private Nationality nationality;

    @OneToMany
    private List<Application> applications;

    public Player(){}

    public Player(PlayerDto playerDto){
        this.id = playerDto.getId();
        this.firstName = playerDto.getFirstName();
        this.lastName = playerDto.getLastName();
        this.size = playerDto.getSize();
        this.picturePath = playerDto.getPicturePath();
        //this.applications = playerDto.getApplications();
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

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
