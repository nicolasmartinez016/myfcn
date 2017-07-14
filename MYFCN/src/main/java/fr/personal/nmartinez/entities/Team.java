package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Team implements Serializable {

    public static final String GENERATOR = "TeamGenerator";

    // fields

    @TableGenerator(
            name = Team.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Team.GENERATOR)
    private int id;

    private String name;
    private String logoPath;

    // constructors

    public Team(){}

    public Team(TeamBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.logoPath = builder.logoPath;
    }

    // getters & setters

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

    // builder

    public static class TeamBuilder{

        private int id;
        private String name;
        private String logoPath;

        public TeamBuilder(){}

        public TeamBuilder id(int id){
            this.id = id;
            return this;
        }

        public TeamBuilder name(String name){
            this.name = name;
            return this;
        }

        public TeamBuilder logoPath(String logoPath){
            this.logoPath = logoPath;
            return this;
        }

        public Team build(){
            return new Team(this);
        }
    }
}
