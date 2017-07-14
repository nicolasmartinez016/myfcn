package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Application;
import fr.personal.nmartinez.entities.Game;
import fr.personal.nmartinez.entities.Week;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of Game
 */
public class GameDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String WEEK_MEMBER = "week";
    public static final String HOME_SCORE_MEMBER = "homeScore";
    public static final String AWAY_SCORE_MEMBER = "awayScore";
    public static final String APPLICATIONS_MEMBER = "applications";
    public static final String GOALS_MEMBER = "goals";
    public static final String YELLOW_CARDS_MEMBER = "yellowCards";
    public static final String RED_CARDS_MEMBER = "redCards";

    private int id;
    private Week week;
    private int homeScore;
    private int awayScore;
    private List<ApplicationDto> applications;
    private List<GoalDto> goals;
    private List<YellowCardDto> yellowCards;
    private List<RedCardDto> redCards;

    public GameDto(){}

    public GameDto(Game game){
        this.id = game.getId();
        this.week = game.getWeek();
        this.homeScore = game.getHomeScore();
        this.awayScore = game.getAwayScore();
        this.applications = ApplicationDto.fromApplications(game.getApplications());
        this.goals = GoalDto.fromGoals(game.getGoals());
        this.yellowCards = YellowCardDto.fromYellowCards(game.getYellowCards());
        this.redCards = RedCardDto.fromRedCards(game.getRedCards());
    }

    /**
     * Creates a Game from a GameDto
     * @param gameDto
     * @return Game created
     */
    public static Game toGame(GameDto gameDto){
        return new Game(gameDto);
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

    public List<ApplicationDto> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationDto> applications) {
        this.applications = applications;
    }

    public List<GoalDto> getGoals() {
        return goals;
    }

    public void setGoals(List<GoalDto> goals) {
        this.goals = goals;
    }

    public List<YellowCardDto> getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(List<YellowCardDto> yellowCards) {
        this.yellowCards = yellowCards;
    }

    public List<RedCardDto> getRedCards() {
        return redCards;
    }

    public void setRedCards(List<RedCardDto> redCards) {
        this.redCards = redCards;
    }
}
