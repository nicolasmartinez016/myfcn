package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.dtos.GameDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Game implements Serializable {

    // constants

    public static final String GENERATOR = "GameGenerator";

    // fields

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

    // constructors

    public Game(){}

    public Game(GameBuilder builder){
        this.id = builder.id;
        this.week = builder.week;
        this.homeScore = builder.homeScore;
        this.awayScore = builder.awayScore;
        this.applications = builder.applications;
        this.goals = builder.goals;
        this.yellowCards = builder.yellowCards;
        this.redCards = builder.redCards;
    }

    // getters & setters

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

    // builder

    public static class GameBuilder{

        private int id;
        private Week week;
        private int homeScore;
        private int awayScore;
        private List<Application> applications;
        private List<Goal> goals;
        private List<YellowCard> yellowCards;
        private List<RedCard> redCards;

        public GameBuilder(){}

        public GameBuilder id(int id){
            this.id = id;
            return this;
        }

        public GameBuilder week (Week week){
            this.week = week;
            return this;
        }

        public GameBuilder homeScore (int homeScore){
            this.homeScore = homeScore;
            return this;
        }

        public GameBuilder awayScore (int awayScore){
            this.awayScore = awayScore;
            return this;
        }

        public GameBuilder applications(List<Application> applications){
            this.applications = applications;
            return this;
        }

        public GameBuilder goals(List<Goal> goals){
            this.goals = goals;
            return this;
        }

        public GameBuilder yellowCards(List<YellowCard> yellowCards){
            this.yellowCards = yellowCards;
            return this;
        }

        public GameBuilder redCards(List<RedCard> redCards){
            this.redCards = redCards;
            return this;
        }

        public Game build(){
            return new Game(this);
        }
    }
}
