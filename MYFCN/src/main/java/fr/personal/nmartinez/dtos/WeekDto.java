package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Week;

import java.io.Serializable;

/**
 * Created by marti on 14/07/2017.
 */
public class WeekDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String OPPONENT_MEMBER = "opponent";
    public static final String TYPE_MEMBER = "type";
    public static final String WEEK_NUMBER_MEMBER = "weekNumber";
    public static final String IS_HOME_MEMBER = "isHome";

    private int id;
    private TeamDto opponent;
    private String type;
    private String weekNumber;
    private boolean isHome;

    public WeekDto(){}

    public WeekDto(Week week){
        this.id = week.getId();
        this.opponent = new TeamDto(week.getOpponent());
        this.type = week.getType().name();
        this.weekNumber = week.getWeekNumber();
        this.isHome = week.isHome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeamDto getOpponent() {
        return opponent;
    }

    public void setOpponent(TeamDto opponent) {
        this.opponent = opponent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
