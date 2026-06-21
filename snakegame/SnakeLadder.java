package com.src.snakegame;

public class SnakeLadder {
    static final int noPlay=0;
    static final int ladder=1;
    static final int snake=2;

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
            position+=dice;
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

    static boolean checkWin(int position){
        if(position==100){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        int position=initialPosition();
        boolean isWin=false;
        int count=0;

        while(!isWin){
            int dice=rollDice();
            count++;
            position=updatePosition(position,dice);
            System.out.println("Dice: "+dice);
            System.out.println("Position: "+position);
            isWin=checkWin(position);

        }

        System.out.println("You Won with rolling count: "+count);

    }
}
