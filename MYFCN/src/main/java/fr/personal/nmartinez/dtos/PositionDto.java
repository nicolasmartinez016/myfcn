package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.Position;

import java.io.Serializable;

/**
 * Created by marti on 13/07/2017.
 */
public class PositionDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String POSITION_NAME_MEMBER = "positionName";
    public static final String WIDTH_OFFSET_MEMBER = "widthOffset";
    public static final String HEIGHT_OFFSET_MEMBER = "heightOffset";

    private int id;
    private String positionName;
    private float widthOffset;
    private float heightOffset;

    public PositionDto(){}

    public PositionDto(Position position){
        this.id = position.getId();
        this.positionName = position.getPositionName().name();
        this.widthOffset = position.getWidthOffset();
        this.heightOffset = position.getHeightOffset();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
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
