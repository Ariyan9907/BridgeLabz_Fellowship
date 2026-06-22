package com.src.junitesting;

public class VendingMachine {

    static int arr[]={1000,500,100,50,10,5,2,1};
    public static int findNotes(int amount,int i){

        if(amount==0||i==arr.length) return 0;


        if(amount>=arr[i]){

            return 1+findNotes(amount-arr[i],i);
        }
        else{
            return findNotes(amount,i+1);
        }


    }
    public static void main(String[] args) {
            int count=findNotes(2489,0);
            System.out.println(count);
    }
}
