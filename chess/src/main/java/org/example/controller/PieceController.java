package org.example.controller;

import org.example.model.Game;

public class PieceController {

    private static PieceController instance = null;


    private PieceController() {
    }

    public static PieceController getInstance() {
        if (instance == null) {
            instance = new PieceController();
        }
        return instance;
    }
}
