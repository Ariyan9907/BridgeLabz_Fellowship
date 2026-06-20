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


}

public class Employee {
    public static void main(String[] args) {
        EmployeeCreate e = new EmployeeCreate();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        switch (n){
            case 1:
                System.out.println(e.checkAttendence());
                break;
            case 2:
                System.out.println(e.calcDailyWage());
                break;
            case 3:
                System.out.println(e.calcPartTime());
                break;
        }


    }
}
