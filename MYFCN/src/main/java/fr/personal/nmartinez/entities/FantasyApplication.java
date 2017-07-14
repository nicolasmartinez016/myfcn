package fr.personal.nmartinez.entities;

import javax.persistence.*;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class FantasyApplication {

    public static final String GENERATOR = "FantasyApplicationGenerator";

    @TableGenerator(
            name = FantasyApplication.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = FantasyApplication.GENERATOR)
    private int id;

    private int minuteStart;
    private int minuteEnd;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Position position;

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
