package com.src.conditionstatements;

import java.util.Scanner;

public class ArithmeticOperation {

    public static int doOperations(int a,int b,int c){
        int r1=a+b*c;
        int r2=c+(a/b);
        int r3=(a%b)+c;
        int r4=(a*b)+c;


        int m1=r1>r2?r1:r2;
        int m2=r3>r4?r3:r4;

        return m1>m2?m1:m2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(doOperations(a,b,c));

    }
}
