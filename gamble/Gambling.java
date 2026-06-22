package com.src.gamble;

import java.util.Random;

public class Gambling {
    static final int STAKE=100;
    static final int BET=1;
    static final int F_WIN=150;
    static final int F_LOSS=50;

    static Random random=new Random();

    static int play(){
        int stake=STAKE;

        while(stake>F_LOSS&&stake<F_WIN){
            if(random.nextInt(2)==1){
                stake+=BET;
            }
            else{
                stake-=BET;
            }
        }
        return stake-STAKE;
    }



    public static void main(String[] args) {
        int total=0;
        int luckyDay=0;
        int unLuckyDay=0;

        int minWin=Integer.MAX_VALUE;
        int maxWin=Integer.MIN_VALUE;

        for(int i=1;i<=20;i++){
            int got=play();

            System.out.println(i+":"+got);

            total+=got;

            if(got>maxWin){
                maxWin=got;
                luckyDay=i;
            }

            if(got<minWin){
                minWin=got;
                unLuckyDay=i;
            }
        }

        System.out.println("-----------------Monthly Report--------------");
        System.out.println("Total got is: "+total);
        System.out.println("Luckyest Day is "+luckyDay+" got profit "+maxWin);
        System.out.println("Unluckyest Day is "+unLuckyDay+" got loss "+minWin);

        if(total>0){
            System.out.println("Continue next Month");
        }
        else{
            System.out.println("Stop");
        }
    }
}
