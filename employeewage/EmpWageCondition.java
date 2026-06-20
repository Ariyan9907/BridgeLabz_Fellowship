package com.src.employeewage;

public class EmpWageCondition {
    public static void main(String[] args) {
        int hour=0;
        int rate=20;
        int days=0;

        while(hour<100&&days<20){
            hour+=8;
            days++;
        }
        int total=hour*days*rate;


        System.out.println("Total Wage is: "+total);

    }
}
