package com.src.probleml1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);


    }
}
