package com.src.employeewage;

import java.util.Scanner;

class EmployeeCreate{
    int rate;
    int hour;
    void displayWelcome(){
        System.out.println("Welcome Employee");
    }

    String checkAttendence(){
        int atend=(int)(Math.random()*2);

        return atend==0?"Absent":"Present";
    }

    int calcDailyWage(){
        rate=20;
        hour=8;
        return rate*hour;
    }

    int calcPartTime(){
        rate=20;
        hour=4;
        return  rate*hour;
    }

    int calcMonthWage(){
        rate=20;
        hour=8;
        int days=20;
        return days*hour*rate;
    }


}

public class Employee {
    public static void main(String[] args) {
        EmployeeCreate e = new EmployeeCreate();
        System.out.println(e.calcMonthWage());

    }
}
