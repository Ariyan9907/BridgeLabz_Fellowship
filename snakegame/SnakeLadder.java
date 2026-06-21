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

    static boolean checkWin(int p1,int p2){
        if(p1==100||p2==100){
            return true;
        }
        return false;
    }

    static  String winner(int p1,int p2){
        if(p1==100){
            return "Player 1";
        }
        return  "Player 2";
    }




    public static void main(String[] args) {
        int p1=initialPosition();
        int p2=initialPosition();
        boolean isWin=false;
        int p1count=0;
        int p2count=0;

        while(!isWin){
            int dice=rollDice();
            p1=updatePosition(p1,dice);
            p1count++;
            System.out.println("p1 Dice: "+dice);
            System.out.println("p1 Position: "+p1);

            dice=rollDice();
            p2=updatePosition(p2,dice);
            p2count++;
            System.out.println("p2 Dice: "+dice);
            System.out.println("p2 Position: "+p2);

            isWin=checkWin(p1,p2);

        }

        int rollcount=0;
        String winner=winner(p1,p2);
        if(winner.equals("Player 1")){
            rollcount=p1count;
        }
        else{
            rollcount=p2count;
        }

        System.out.println(winner+" Won with rolling count: "+rollcount);

    }
}
