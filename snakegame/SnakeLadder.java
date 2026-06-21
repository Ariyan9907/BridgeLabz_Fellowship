package com.src.snakegame;

public class SnakeLadder {
    static int initialPosition(){
        return 0;
    }

    static int rollDice(){
        return (int)(Math.random()*6)+1;
    }


    public static void main(String[] args) {
        int position=initialPosition();
        int dice=rollDice();
        System.out.println(dice);

    }
}
