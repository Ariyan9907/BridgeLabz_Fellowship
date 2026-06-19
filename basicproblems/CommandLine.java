package com.src.basicproblems;

public class CommandLine {
    public static void main(String[] args) {
        int sum=0;
        int invalid=0;
        for(String s:args) {
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                invalid++;
            }
        }

        System.out.println("Sum: "+sum);
        System.out.println("Invalids are: "+invalid);
    }

}
