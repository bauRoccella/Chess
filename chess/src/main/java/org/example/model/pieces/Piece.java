package org.example.model.pieces;

import lombok.Getter;
import org.example.model.Color;
@Getter
@SuppressWarnings("FieldCanBeLocal")
public abstract class Piece{
    private final Color color;
    private Position position;

    protected Piece(Color color, int x, int y) {
        this.position = new Position(x,y);
        this.color = color;
    }

    public boolean isMoveValid(int posX, int posY) {

        return false;
    }

}
