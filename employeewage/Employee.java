package com.src.employeewage;

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


}

public class Employee {
    public static void main(String[] args) {
        EmployeeCreate e = new EmployeeCreate();
        System.out.println("Daily Wage:"+e.calcDailyWage());

    }
}
