package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Goal implements Serializable {

    // constants

    public static final String GENERATOR = "GoalGenerator";

    // fields

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

    // constructors

    public Goal(){}

    public Goal(GoalBuilder builder){
        this.id = builder.id;
        this.game = builder.game;
        this.goalScorer = builder.goalScorer;
        this.goalAssister = builder.goalAssister;
        this.minute = builder.minute;
        this.isHeader = builder.isHeader;
        this.isRightFoot = builder.isRightFoot;
        this.isLeftFoot = builder.isLeftFoot;
        this.isOwnGoal = builder.isOwnGoal;
    }

    // getters & setters

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

    // builder

    public static class GoalBuilder{

        private int id;
        private Game game;
        private Player goalScorer;
        private Player goalAssister;
        private int minute;
        private boolean isHeader;
        private boolean isRightFoot;
        private boolean isLeftFoot;
        private boolean isOwnGoal;

        public GoalBuilder(){}

        public GoalBuilder id(int id){
            this.id = id;
            return this;
        }

        public GoalBuilder game(Game game){
            this.game = game;
            return this;
        }

        public GoalBuilder goalScorer(Player goalScorer){
            this.goalScorer = goalScorer;
            return this;
        }

        public GoalBuilder goalAssister(Player goalAssister){
            this.goalAssister = goalAssister;
            return this;
        }

        public GoalBuilder minute(int minute){
            this.minute = minute;
            return this;
        }

        public GoalBuilder isHeader(boolean isHeader){
            this.isHeader = isHeader;
            return this;
        }

        public GoalBuilder isRightFoot(boolean isRightFoot){
            this.isRightFoot = isRightFoot;
            return this;
        }

        public GoalBuilder isLeftFoot(boolean isLeftFoot){
            this.isLeftFoot = isLeftFoot;
            return this;
        }

        public GoalBuilder isOwnGoal(boolean isOwnGoal){
            this.isOwnGoal = isOwnGoal;
            return this;
        }

        public Goal build(){
            return new Goal(this);
        }
    }
}
