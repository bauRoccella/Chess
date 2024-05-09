package org.example.model;

public class Turns {
    private Color color = Color.WHITE;
    private int turn = 1;
    private static Turns instance = null;

    private Turns() {
    }

    public static Turns getInstance() {
        if (instance == null) {
            instance = new Turns();
        }
        return instance;
    }

    public void nextTurn(){
        this.turn++;
        if(this.color == Color.WHITE){
            this.color = Color.BLACK;
        }else{
            this.color = Color.WHITE;
        }
    }


}
