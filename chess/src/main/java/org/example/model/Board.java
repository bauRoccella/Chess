package org.example.model;

import org.example.model.pieces.Piece;

public class Board {

    private static Board instance = null;
    private final Piece[][] board = new Piece[8][8];

    private Board() {
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

}
