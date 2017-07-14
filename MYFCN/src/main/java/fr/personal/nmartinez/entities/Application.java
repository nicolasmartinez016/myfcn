package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.App;
import fr.personal.nmartinez.dtos.ApplicationDto;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/07/2017.
 */

@Entity
public class Application implements Serializable {

    public static final String GENERATOR = "ApplicationGenerator";

    @TableGenerator(
            name = Application.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Application.GENERATOR)
    private int id;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Game game;

    private int startMinute;
    private int endMinute;

    // constructors

    public Application(){}


    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }
}
