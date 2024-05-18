package org.example.model.pieces;

import org.example.model.Color;

public class Pawn extends Piece{

    private boolean hasMoved = false;

    public Pawn(Color color, int x, int y) {

        super(color, x, y);
    }

    private boolean canPromote(){
        int row = this.getPosition().getY();
        return row == 0 || row == 7;
    }

    public boolean isValidMove(int x1, int y1) {
        int x0 = this.getPosition().getX();
        int y0 = this.getPosition().getY();

        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7) {
            return false;
        }

        // Check if the move is in the correct direction based on pawn's color
        int direction = (this.getColor() == Color.WHITE) ? 1 : -1;

        // Check if it's the first move of the pawn
        if (!hasMoved) {
            return x1 == x0 && (y1 == y0 + direction || y1 == y0 + 2 * direction);
        } else {
            return x1 == x0 && y1 == y0 + direction;
        }
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
}
