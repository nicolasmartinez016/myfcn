package fr.personal.nmartinez.dtos;


import fr.personal.nmartinez.entities.YellowCard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of YellowCard
 */
public class YellowCardDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String GAME_MEMBER = "gameId";
    public static final String PLAYER_MEMBER = "playerId";
    public static final String MINUTE_MEMBER = "minute";

    private int id;
    private int gameId;
    private int playerId;
    private int minute;

    public YellowCardDto(){}

    /**
     * Creates a new instance of YellowCardDto from a YellowCard
     * @param yellowCard
     */
    public YellowCardDto(YellowCard yellowCard){
        this.id = yellowCard.getId();
        this.gameId = yellowCard.getGame().getId();
        this.playerId = yellowCard.getPlayer().getId();
        this.minute = yellowCard.getMinute();
    }

    /**
     * Creates a list of YellowCardDto from a list of YellowCard
     * @param yellowCards list of YellowCard
     * @return list of YellowCardDto
     */
    public static List<YellowCardDto> fromYellowCards(List<YellowCard> yellowCards){
        List<YellowCardDto> yellowCardDtos = new ArrayList<YellowCardDto>();
        for (YellowCard yellowCard : yellowCards){
            yellowCardDtos.add(new YellowCardDto(yellowCard));
        }

        return yellowCardDtos;
    }

    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
