package com.src.probleml1;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press enter to start");
        sc.nextLine();
        long start = System.currentTimeMillis();
        System.out.println("press enter to stop");
        sc.nextLine();
        long end=System.currentTimeMillis();

        double time=end-start;

        System.out.println("Time Taken:"+(time/1000.0)+" seconds");
        sc.close();
    }
}
