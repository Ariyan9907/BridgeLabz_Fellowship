package com.src.junitesting;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int n){
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return n==sum;
    }

    public static void main(String[] args) {

        System.out.println(checkPerfectNumber(6));

    }
}
