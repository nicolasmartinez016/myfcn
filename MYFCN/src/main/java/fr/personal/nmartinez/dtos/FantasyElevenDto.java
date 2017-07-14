package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.FantasyApplication;
import fr.personal.nmartinez.entities.User;
import fr.personal.nmartinez.entities.Week;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 14/07/2017.
 */
public class FantasyElevenDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String USER_MEMBER = "userId";
    public static final String WEEK_MEMBER = "week";
    public static final String FANTASY_APPLICATION_MEMBER = "fantasyApplications";

    private int id;
    private int userId;
    private Week week;
    private List<FantasyApplicationDto> fantasyApplications;

    public FantasyElevenDto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUser(int userId) {
        this.userId = userId;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public List<FantasyApplicationDto> getFantasyApplications() {
        return fantasyApplications;
    }

    public void setFantasyApplications(List<FantasyApplicationDto> fantasyApplications) {
        this.fantasyApplications = fantasyApplications;
    }
}
