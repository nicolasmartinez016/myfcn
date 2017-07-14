package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class YellowCard implements Serializable {

    public static final String GENERATOR = "YellowCardGenerator";

    @TableGenerator(
            name = YellowCard.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = YellowCard.GENERATOR)
    private int id;

    private int minute;

    @ManyToOne
    private Game game;

    @ManyToOne
    private Player player;

    public YellowCard(){}

    public YellowCard(YellowCardBuilder builder){
        this.id = builder.id;
        this.minute = builder.minute;
        this.game = builder.game;
        this.player = builder.player;
    }

    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    // builder

    public static class YellowCardBuilder{

        private int id;
        private int minute;
        private Game game;
        private Player player;

        public YellowCardBuilder(){}

        public YellowCardBuilder id(int id){
            this.id = id;
            return this;
        }

        public YellowCardBuilder minute(int minute){
            this.minute = minute;
            return this;
        }

        public YellowCardBuilder game(Game game){
            this.game = game;
            return this;
        }

        public YellowCardBuilder player(Player player){
            this.player = player;
            return this;
        }

        public YellowCard build(){
            return new YellowCard(this);
        }
    }
}
