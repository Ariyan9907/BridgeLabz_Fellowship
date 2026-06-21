package com.src.snakegame;

public class SnakeLadder {
    static final int noPlay=0;
    static final int ladder=1;
    static final int sneak=2;

    static int initialPosition(){
        return 0;
    }

    static int rollDice(){
        return (int)(Math.random()*6)+1;
    }

    static int updatePosition(int position,int dice){
        int oldPos=position;
        int option=(int)(Math.random()*3);

        if(option==noPlay){
            return position;
        }
        else if(option==ladder){

            if(position>100){
                position=oldPos;
            }
        }
        else{
            position-=dice;
            if (position<0){
                position= initialPosition();
            }
        }
        return position;
    }






    public static void main(String[] args) {
        int position=initialPosition();
        int dice=rollDice();
        System.out.println(dice);

    }
}
