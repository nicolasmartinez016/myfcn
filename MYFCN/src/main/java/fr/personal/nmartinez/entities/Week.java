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
}
