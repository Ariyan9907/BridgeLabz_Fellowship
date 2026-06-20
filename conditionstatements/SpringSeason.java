package com.src.conditionstatements;

import java.time.LocalDate;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String args[]){

        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);

        LocalDate date = LocalDate.of(2026, month, day);

        LocalDate start = LocalDate.of(2026, 3, 20);
        LocalDate end = LocalDate.of(2026, 6, 20);

        boolean isSpring=!date.isBefore(start)&&!date.isAfter(end);

        System.out.println(isSpring);



    }
}
