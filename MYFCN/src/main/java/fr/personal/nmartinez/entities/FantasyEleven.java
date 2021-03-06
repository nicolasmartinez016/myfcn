package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class FantasyEleven {

    // constants

    public static final String GENERATOR = "FantasyElevenGenerator";

    // fields

    @TableGenerator(
            name = FantasyEleven.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = FantasyEleven.GENERATOR)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Week week;

    @OneToMany
    private List<FantasyApplication> fantasyApplications;

    // constructors

    public FantasyEleven(){}

    public FantasyEleven(FantasyElevenBuilder builder){

    }

    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public List<FantasyApplication> getFantasyApplications() {
        return fantasyApplications;
    }

    public void setFantasyApplications(List<FantasyApplication> fantasyApplications) {
        this.fantasyApplications = fantasyApplications;
    }

    // builder

    public static class FantasyElevenBuilder{

        private int id;
        private User user;
        private Week week;
        private List<FantasyApplication> fantasyApplications;

        public FantasyElevenBuilder(){}
    }
}
