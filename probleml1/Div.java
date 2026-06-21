package com.src.probleml1;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Divident");
        int n=sc.nextInt();
        System.out.println("Enter Divisor");
        int d=sc.nextInt();

        System.out.println("Quotient: "+(n/d));
        System.out.println("Reminder: "+(n%d));
    }
}
