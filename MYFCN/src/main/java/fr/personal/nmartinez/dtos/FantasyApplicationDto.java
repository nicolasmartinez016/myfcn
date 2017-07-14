package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.FantasyApplication;
import fr.personal.nmartinez.entities.Player;
import fr.personal.nmartinez.entities.Position;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 14/07/2017.
 */
public class FantasyApplicationDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String PLAYER_MEMBER = "playerId";
    public static final String POSITION_MEMBER = "position";
    public static final String START_MIN_MEMBER = "startMin";
    public static final String END_MIN_MEMBER = "endMin";

    private int id;
    private int minuteStart;
    private int minuteEnd;
    private Player player;
    private Position position;

    public FantasyApplicationDto(){}

    public FantasyApplicationDto(FantasyApplication fantasyApplication){
        this.id = fantasyApplication.getId();
        this.minuteStart = fantasyApplication.getMinuteStart();
        this.minuteEnd = fantasyApplication.getMinuteEnd();
        this.player = fantasyApplication.getPlayer();
        this.position = fantasyApplication.getPosition();
    }

    /**
     * Creates a list of FantasyApplicationDto from a list of FantasyApplication
     * @param fantasyApplications
     * @return
     */
    public static List<FantasyApplicationDto> fromFantasyApplications(List<FantasyApplication> fantasyApplications){
        List<FantasyApplicationDto> fantasyApplicationDtos = new ArrayList<FantasyApplicationDto>();
        for (FantasyApplication fantasyApplication : fantasyApplications){
            fantasyApplicationDtos.add(new FantasyApplicationDto(fantasyApplication));
        }

        return fantasyApplicationDtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinuteStart() {
        return minuteStart;
    }

    public void setMinuteStart(int minuteStart) {
        this.minuteStart = minuteStart;
    }

    public int getMinuteEnd() {
        return minuteEnd;
    }

    public void setMinuteEnd(int minuteEnd) {
        this.minuteEnd = minuteEnd;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
