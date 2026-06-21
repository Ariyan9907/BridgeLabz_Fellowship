package com.src.probleml1;

import java.util.Scanner;

public class HarmonicaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double harmonic=0.0;

        if(n<=0){
            System.out.println("enter number grater than 0.");
            return;
        }

        for(int i=1;i<=n;i++){
            harmonic+=1.0/i;
        }

        System.out.println(harmonic);
    }
}
