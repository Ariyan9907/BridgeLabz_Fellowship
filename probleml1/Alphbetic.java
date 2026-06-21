package com.src.probleml1;

import java.util.Scanner;

public class Alphbetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);

        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U'){
                System.out.println(ch+" is a vowel");
            }
            else{
                System.out.println(ch+" is a consonent");
            }
        }

    }
}
