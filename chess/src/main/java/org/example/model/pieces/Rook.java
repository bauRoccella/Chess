package org.example.model.pieces;

import org.example.model.Color;

public class Rook extends Piece{
    public Rook(Color color, int x, int y) {
        super(color, x, y);
    }

    public boolean isValidMove(int x1, int y1) {
        Position currentPosition = this.getPosition();
        if (currentPosition == null) {
            return false;
        }
        int x0 = currentPosition.getX();
        int y0 = currentPosition.getY();

        // Check if the target position is within the bounds of the board
        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7) {
            return false;
        }

        // Rook moves in a straight line along rows or columns
        return x0 == x1 || y0 == y1;
    }

}
