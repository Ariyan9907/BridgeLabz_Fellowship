package com.src.probleml1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(!(n>=0&&n<31)){
            System.out.println("Enter valid number");
            System.exit(0);
        }

        for(int i=0;i<n;i++){
            System.out.println((int)Math.pow(2,i));
        }
    }
}
