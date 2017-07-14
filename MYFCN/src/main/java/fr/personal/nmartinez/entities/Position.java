package fr.personal.nmartinez.entities;

import fr.personal.nmartinez.enums.PositionName;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class Position implements Serializable {

    public static final String GENERATOR = "PositionGenerator";

    @TableGenerator(
            name = Position.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Position.GENERATOR)
    private int id;

    private PositionName positionName;
    private float widthOffset;
    private float heightOffset;

    public Position(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    public float getWidthOffset() {
        return widthOffset;
    }

    public void setWidthOffset(float widthOffset) {
        this.widthOffset = widthOffset;
    }

    public float getHeightOffset() {
        return heightOffset;
    }

    public void setHeightOffset(float heightOffset) {
        this.heightOffset = heightOffset;
    }
}
