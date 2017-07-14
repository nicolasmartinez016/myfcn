package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Nationality implements Serializable {

    // constants

    public static final String GENERATOR = "NationalityGenerator";

    // fields

    @TableGenerator(
            name = Nationality.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Nationality.GENERATOR)
    private int id;

    private String name;
    private String flagPath;

    // constructors

    public Nationality(){}

    public Nationality(NationalityBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.flagPath = builder.flagPath;
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

    public String getFlagPath() {
        return flagPath;
    }

    public void setFlagPath(String flagPath) {
        this.flagPath = flagPath;
    }

    // builder

    public static class NationalityBuilder{

        private int id;
        private String name;
        private String flagPath;

        public NationalityBuilder(){}

        public NationalityBuilder id(int id){
            this.id = id;
            return this;
        }

        public NationalityBuilder name(String name){
            this.name = name;
            return this;
        }

        public NationalityBuilder flagPath(String flagPath){
            this.flagPath = flagPath;
            return this;
        }

        public Nationality build(){
            return new Nationality(this);
        }
    }
}
