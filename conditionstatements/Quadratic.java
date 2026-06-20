package com.src.conditionstatements;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double delta=(b*b)-(4*a*c);

        double r1=(-b+ Math.sqrt(delta))/(2*a);
        double r2=(-b-Math.sqrt(delta))/(2*a);

        System.out.println("Root 1="+r1);
        System.out.println("Root 2="+r2);






    }
}
