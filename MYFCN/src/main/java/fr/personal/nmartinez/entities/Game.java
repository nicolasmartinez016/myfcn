package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.dtos.GameDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Game implements Serializable {

    public static final String GENERATOR = "GameGenerator";

    @TableGenerator(
            name = Game.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Game.GENERATOR)
    private int id;

    @ManyToOne
    private Week week;

    private int homeScore;
    private int awayScore;

    @OneToMany
    private List<Application> applications;

    @OneToMany
    private List<Goal> goals;

    @OneToMany
    private List<YellowCard> yellowCards;

    @OneToMany
    private List<RedCard> redCards;

    public Game(){}

    public Game(GameDto gameDto){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<YellowCard> getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(List<YellowCard> yellowCards) {
        this.yellowCards = yellowCards;
    }

    public List<RedCard> getRedCards() {
        return redCards;
    }

    public void setRedCards(List<RedCard> redCards) {
        this.redCards = redCards;
    }
}
