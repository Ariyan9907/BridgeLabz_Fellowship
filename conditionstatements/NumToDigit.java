package com.src.conditionstatements;

import java.util.Scanner;

public class NumToDigit {
    public static void main(String[] args) {
        String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",};
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }catch (Exception e){
            System.out.println("Enter single digot number only");
        }

    }
}
