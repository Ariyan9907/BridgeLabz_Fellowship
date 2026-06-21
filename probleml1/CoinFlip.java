package com.src.probleml1;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flips=sc.nextInt();

        if(flips<0){
            System.out.println("Enter the positive number of flips");
            System.exit(0);
        }

        int heads = 0;
        int tails = 0;
        for(int i=0;i<flips;i++) {
            double res = Math.random();

            if (res < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Percentage of heads: "+(heads/flips)*100);
        System.out.println("Percentage of tails: "+(tails/flips)*100);
    }
}
