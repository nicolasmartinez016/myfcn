package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Goal implements Serializable {

    public static final String GENERATOR = "GoalGenerator";

    @TableGenerator(
            name = Goal.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Goal.GENERATOR)
    private int id;

    @ManyToOne
    private Game game;

    @ManyToOne
    private Player goalScorer;

    @ManyToOne
    private Player goalAssister;

    private int minute;
    private boolean isHeader;
    private boolean isRightFoot;
    private boolean isLeftFoot;
    private boolean isOwnGoal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getGoalScorer() {
        return goalScorer;
    }

    public void setGoalScorer(Player goalScorer) {
        this.goalScorer = goalScorer;
    }

    public Player getGoalAssister() {
        return goalAssister;
    }

    public void setGoalAssister(Player goalAssister) {
        this.goalAssister = goalAssister;
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
