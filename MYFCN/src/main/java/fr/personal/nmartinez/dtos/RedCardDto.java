package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.RedCard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of RedCard
 */
public class RedCardDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String GAME_MEMBER = "gameId";
    public static final String PLAYER_MEMBER = "playerId";
    public static final String MINUTE_MEMBER = "minute";

    private int id;
    private int gameId;
    private int playerId;
    private int minute;

    public RedCardDto(){}

    public RedCardDto(RedCard redCard){
        this.id = redCard.getId();
        this.gameId = redCard.getGame().getId();
        this.playerId = redCard.getPlayer().getId();
        this.minute = redCard.getMinute();
    }

    /**
     * Creates a list of RedCardDto from a list of RedCard
     * @param redCards list of RedCard
     * @return list of RedCardDto
     */
    public static List<RedCardDto> fromRedCards(List<RedCard> redCards){
        List<RedCardDto> redCardDtos = new ArrayList<RedCardDto>();
        for (RedCard redCard : redCards){
            redCardDtos.add(new RedCardDto(redCard));
        }

        return redCardDtos;
    }
}
