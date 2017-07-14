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

    // constants

    public static final String GENERATOR = "PlayerGenerator";

    // fields

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

    // constructors

    public Player(){}

    public Player(PlayerBuilder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.size = builder.size;
        this.picturePath = builder.picturePath;
        this.applications = builder.applications;
    }

    // getters & setters

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

    // builder

    public static class PlayerBuilder{

        private int id;
        private String firstName;
        private String lastName;
        private int size;
        private String picturePath;
        private Nationality nationality;
        private List<Application> applications;

        public PlayerBuilder(){}

        public PlayerBuilder id(int id){
            this.id = id;
            return this;
        }

        public PlayerBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PlayerBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PlayerBuilder size(int size){
            this.size = size;
            return this;
        }

        public PlayerBuilder picturePath(String picturePath){
            this.picturePath = picturePath;
            return this;
        }

        public PlayerBuilder nationality(Nationality nationality){
            this.nationality = nationality;
            return this;
        }

        public PlayerBuilder applications(List<Application> applications){
            this.applications = applications;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }
}
