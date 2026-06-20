package com.src.employeewage;

class EmployeeCreate{
    void displayWelcome(){
        System.out.println("Welcome Employee");
    }

    String checkAttendence(){
        int atend=(int)(Math.random()*2);

        return atend==0?"Absent":"Present";
    }


}

public class Employee {
    public static void main(String[] args) {
        EmployeeCreate e = new EmployeeCreate();
        System.out.println(e.checkAttendence());

    }
}
