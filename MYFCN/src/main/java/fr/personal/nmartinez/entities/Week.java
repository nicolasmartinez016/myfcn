package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.enums.WeekType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Week implements Serializable {

    public static final String GENERATOR = "WeekGenerator";

    @TableGenerator(
            name = Week.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Week.GENERATOR)
    private int id;

    @ManyToOne
    private Team opponent;

    private WeekType type;
    private String weekNumber;
    private boolean isHome;

    public Week(){}

    public Week(WeekBuilder builder){
        this.id = builder.id;
        this.opponent = builder.opponent;
        this.type = builder.type;
        this.weekNumber = builder.weekNumber;
        this.isHome = builder.isHome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getOpponent() {
        return opponent;
    }

    public void setOpponent(Team opponent) {
        this.opponent = opponent;
    }

    public WeekType getType() {
        return type;
    }

    public void setType(WeekType type) {
        this.type = type;
    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }

    public boolean isHome() {
        return isHome;
    }

    public void setHome(boolean home) {
        isHome = home;
    }

    public static class WeekBuilder{

        private int id;
        private Team opponent;
        private WeekType type;
        private String weekNumber;
        private boolean isHome;

        public WeekBuilder(){}

        public WeekBuilder id(int id){
            this.id = id;
            return this;
        }

        public WeekBuilder opponent(Team opponent){
            this.opponent = opponent;
            return this;
        }

        public WeekBuilder type(WeekType type){
            this.type = type;
            return this;
        }

        public WeekBuilder weekNumber(String weekNumber){
            this.weekNumber = weekNumber;
            return this;
        }

        public WeekBuilder isHome(boolean isHome){
            this.isHome = isHome;
            return this;
        }

        public Week build(){
            return new Week(this);
        }
    }
}
