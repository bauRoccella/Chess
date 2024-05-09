package org.example.model.pieces;

import org.example.model.Color;

public interface IPiece {
    void move(int posX, int posY);
    public int[] getPosition();
    Color getColor();
}
