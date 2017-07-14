package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of Application
 */
public class ApplicationDto {

    public static final String ID_MEMBER = "id";
    public static final String PLAYER_MEMBER = "playerId";
    public static final String GAME_MEMBER = "gameId";
    public static final String START_MIN_MEMBER = "startMin";
    public static final String END_MIN_MEMBER = "endMin";

    private int id;
    private int playerId;
    private int gameId;
    private int startMin;
    private int endMin;
    private boolean isCaptain;

    public ApplicationDto(){}

    public ApplicationDto(Application application){
        this.id = application.getId();
        this.playerId = application.getPlayer().getId();
        this.gameId = application.getGame().getId();
        this.startMin = application.getStartMinute();
        this.endMin = application.getEndMinute();
        this.isCaptain = application.isCaptain();
    }

    /**
     * Creates a list of ApplicationDto from a list of Application
     * @param applications list of Application
     * @return list of ApplicationDto
     */
    public static List<ApplicationDto> fromApplications(List<Application> applications){
        List<ApplicationDto> applicationDtos = new ArrayList<ApplicationDto>();
        for (Application application : applications){
            applicationDtos.add(new ApplicationDto(application));
        }
        return applicationDtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        this.endMin = endMin;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }
}
