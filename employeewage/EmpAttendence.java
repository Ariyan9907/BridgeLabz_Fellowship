package com.src.employeewage;

public class EmpAttendence {
    public static void main(String[] args) {
        int atend=(int)(Math.random()*2);

        if(atend==0){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
