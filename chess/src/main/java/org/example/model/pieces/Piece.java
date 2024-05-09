package org.example.model.pieces;

import org.example.model.Color;

public abstract class Piece implements IPiece{
    private final Color color;
    private int posX;
    private int posY;

    protected Piece(int posX, int posY, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    @Override
    public void move(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int[] getPosition() {
        return new int[]{posX, posY};
    }

    @Override
    public Color getColor() {
        return null;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }
}
