package org.example.model.pieces;

import org.example.model.Color;

public class Queen extends Piece{

    public Queen(Color color, int x, int y) {
        super(color, x, y);
    }

    public boolean isValidMove(int x1, int y1) {
        Position currentPosition = this.getPosition();
        if (currentPosition == null) {
            return false;
        }
        int x0 = currentPosition.getX();
        int y0 = currentPosition.getY();


        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7) {
            return false;
        }

        int xDiff = Math.abs(x1 - x0);
        int yDiff = Math.abs(y1 - y0);

        return x0 == x1 || y0 == y1 || xDiff == yDiff;
    }
}
