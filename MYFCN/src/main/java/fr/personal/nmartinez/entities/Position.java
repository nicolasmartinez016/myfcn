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

    // fields

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

    // constructors

    public Position(){}

    public Position(PositionBuilder builder){
        this.id = builder.id;
        this.positionName = builder.positionName;
        this.widthOffset = builder.widthOffset;
        this.heightOffset = builder.heightOffset;
    }

    // getters & setters

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

    // builder

    public static class PositionBuilder{

        private int id;
        private PositionName positionName;
        private float widthOffset;
        private float heightOffset;

        public PositionBuilder(){}

        public PositionBuilder id(int id){
            this.id = id;
            return this;
        }

        public PositionBuilder positionName(PositionName positionName){
            this.positionName = positionName;
            return this;
        }

        public PositionBuilder widthOffset(float widthOffset){
            this.widthOffset = widthOffset;
            return this;
        }

        public PositionBuilder heightOffset(float heightOffset){
            this.heightOffset = heightOffset;
            return this;
        }

        public Position build(){
            return new Position(this);
        }
    }
}
