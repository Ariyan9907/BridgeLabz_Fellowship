package com.src.probleml1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int m1=a>b?a:b;
        int max=c>m1?c:m1;

        System.out.println(max);
    }
}
