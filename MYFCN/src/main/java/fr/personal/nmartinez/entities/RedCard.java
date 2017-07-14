package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class RedCard implements Serializable {

    public static final String GENERATOR = "RedCardGenerator";

    // fields

    @TableGenerator(
            name = RedCard.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = RedCard.GENERATOR)
    private int id;

    @ManyToOne
    private Game game;

    @ManyToOne
    private Player player;

    private int minute;

    // constructors

    public RedCard(){}

    public RedCard(RedCardBuilder builder){
        this.id = builder.id;
        this.game = builder.game;
        this.player = builder.player;
        this.minute = builder.minute;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    // builder

    public static class RedCardBuilder{

        private int id;
        private Game game;
        private Player player;
        private int minute;

        public RedCardBuilder(){}

        public RedCardBuilder id(int id){
            this.id = id;
            return this;
        }

        public RedCardBuilder game(Game game){
            this.game = game;
            return this;
        }

        public RedCardBuilder player(Player player){
            this.player = player;
            return this;
        }

        public RedCardBuilder minute(int minute){
            this.minute = minute;
            return this;
        }

        public RedCard build(){
            return new RedCard(this);
        }
    }
}
