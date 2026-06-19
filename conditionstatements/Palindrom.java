package com.src.conditionstatements;

import java.util.Scanner;

public class Palindrom {
    public static  boolean isPalindrom(int n){
        int temp=n;
        int rev=0;
        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        return temp==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindrom(n)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }


    }
}
