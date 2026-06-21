package com.src.probleml1;

import java.util.Random;
import java.util.Scanner;

public class Coupons {
    public  static int genCoupDig(int n){
        Random random = new Random();
        return random.nextInt(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        boolean arr[]=new boolean[n];
        int distinct=0;
        int count=0;

        while(distinct<n){
            int couponDig=genCoupDig(n);
            if(!arr[couponDig]){
                arr[couponDig]=true;
                distinct++;
            }
            count++;
        }

        System.out.println("Distinct: "+distinct);
        System.out.println("Count: "+count);




    }
}
