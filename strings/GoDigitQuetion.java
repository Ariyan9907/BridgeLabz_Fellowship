package com.src.strings;

import java.util.Scanner;

public class GoDigitQuetion {
	public static int revNum(int n) {
		int rev=0;
		while(n!=0) {
			int lastDig=n%10;
			rev=rev*10+lastDig;
			n=n/10;
		}
		return rev; 
	}
	
	public static int secMax(int arr[]) {
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec) {
				sec=arr[i];
			}
		}
		return sec;
	}
	
	public static void swap(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static String reverse(String s) {
		String t="";
		
		for(int i=0;i<s.length();i++) {
			t=s.charAt(i)+t;
		}
		
		return t;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
//		int arr[]=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		System.out.println(reverse(s));
		
		

	}

}
