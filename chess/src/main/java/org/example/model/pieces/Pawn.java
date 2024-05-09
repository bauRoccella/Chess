package org.example.model.pieces;

import org.example.model.Color;

public class Pawn extends Piece{

    private boolean hasMoved = false;

    public Pawn(int posX, int posY, Color color) {
        super(posX, posY, color);
    }

    private boolean canPromote(){
        int row = this.getPosY();
        return row == 0 || row == 7;
    }

    public void move(int posX, int posY){
        if(!hasMoved){
            hasMoved = true;
        }
        if(canPromote()){
            return;
        }
    }
}
