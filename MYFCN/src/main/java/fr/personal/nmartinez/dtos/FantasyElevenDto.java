package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.FantasyApplication;
import fr.personal.nmartinez.entities.FantasyEleven;
import fr.personal.nmartinez.entities.User;
import fr.personal.nmartinez.entities.Week;

import java.io.Serializable;
import java.util.ArrayList;
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
    private WeekDto week;
    private List<FantasyApplicationDto> fantasyApplications;

    public FantasyElevenDto(){}

    public FantasyElevenDto(FantasyEleven fantasyEleven){
        this.id = fantasyEleven.getId();
        this.userId = fantasyEleven.getUser().getId();
        this.week = new WeekDto(fantasyEleven.getWeek());
        this.fantasyApplications = FantasyApplicationDto.fromFantasyApplications(fantasyEleven.getFantasyApplications());
    }

    /**
     * Creates a list of FantasyElevenDto from a list of FantasyEleven
     * @param fantasyElevens
     * @return
     */
    public static List<FantasyElevenDto> fromFantasyElevens(List<FantasyEleven> fantasyElevens){
        List<FantasyElevenDto> fantasyElevenDtos = new ArrayList<FantasyElevenDto>();
        for (FantasyEleven fantasyEleven : fantasyElevens){
            fantasyElevenDtos.add(new FantasyElevenDto(fantasyEleven));
        }

        return fantasyElevenDtos;
    }

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

    public WeekDto getWeek() {
        return week;
    }

    public void setWeek(WeekDto week) {
        this.week = week;
    }

    public List<FantasyApplicationDto> getFantasyApplications() {
        return fantasyApplications;
    }

    public void setFantasyApplications(List<FantasyApplicationDto> fantasyApplications) {
        this.fantasyApplications = fantasyApplications;
    }
}
