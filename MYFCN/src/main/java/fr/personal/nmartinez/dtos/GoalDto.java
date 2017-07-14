package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Goal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

/**
 * Proxy class used for serialization of Goal
 */
public class GoalDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String GAME_MEMBER = "gameId";
    public static final String GOAL_SCORER_MEMBER = "goalScorerId";
    public static final String GOAL_ASSISTER_MEMBER = "goalAssisterId";
    public static final String MINUTE_MEMBER = "minute";
    public static final String IS_HEADER_MEMBER = "isHeader";
    public static final String IS_RIGHT_FOOT_MEMBER = "isRightFoot";
    public static final String IS_LEFT_FOOT_MEMBER = "isLeftFoot";
    public static final String IS_OWN_GOAL_MEMBER = "isOwnGoal";

    private int id;
    private int gameId;
    private int goalScorerId;
    private int goalAssisterId;
    private int minute;
    private boolean isHeader;
    private boolean isRightFoot;
    private boolean isLeftFoot;
    private boolean isOwnGoal;

    public GoalDto(){}

    public GoalDto(Goal goal){
        this.id = goal.getId();
        this.gameId = goal.getGame().getId();
        this.goalScorerId = goal.getGoalScorer().getId();
        this.goalAssisterId = goal.getGoalAssister().getId();
        this.minute = goal.getMinute();
        this.isHeader = goal.isHeader();
        this.isRightFoot = goal.isRightFoot();
        this.isLeftFoot = goal.isLeftFoot();
        this.isRightFoot = goal.isRightFoot();
        this.isOwnGoal = goal.isOwnGoal();
    }


    /**
     * Creates a list of GoalDto from a list of Goal
     * @param goals list of Goal
     * @return list of GoalDto
     */
    public static List<GoalDto> fromGoals(List<Goal> goals){
        List<GoalDto> goalDtos = new ArrayList<GoalDto>();
        for (Goal goal : goals){
            goalDtos.add(new GoalDto(goal));
        }

        return goalDtos;
    }

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

    public int getGoalScorerId() {
        return goalScorerId;
    }

    public void setGoalScorerId(int goalScorerId) {
        this.goalScorerId = goalScorerId;
    }

    public int getGoalAssisterId() {
        return goalAssisterId;
    }

    public void setGoalAssisterId(int goalAssisterId) {
        this.goalAssisterId = goalAssisterId;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public boolean isHeader() {
        return isHeader;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public boolean isRightFoot() {
        return isRightFoot;
    }

    public void setRightFoot(boolean rightFoot) {
        isRightFoot = rightFoot;
    }

    public boolean isLeftFoot() {
        return isLeftFoot;
    }

    public void setLeftFoot(boolean leftFoot) {
        isLeftFoot = leftFoot;
    }

    public boolean isOwnGoal() {
        return isOwnGoal;
    }

    public void setOwnGoal(boolean ownGoal) {
        isOwnGoal = ownGoal;
    }
}
