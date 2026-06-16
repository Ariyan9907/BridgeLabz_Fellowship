package com.src.numbers;
import java.util.*;

public class NumberProblem {
	public static boolean checkPrime(int n) {
		if(n<2) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int findFact(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		return fact;
	}
	
	public static void fibSeq(int n) {
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=3;i<=n;i++) {
			int c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static int gcd(int a,int b) {
		while(a!=0&&b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		return a+b;
	}
	
	public static String  DecToBin(int n) {
		String s="";
		while(n>0) {
			int bin=n%2;
			s=bin+s;
			n=n/2;
		}
		
		return s; 
	}
	
	public static boolean checkOddEven(int n) {
//		while(n>1) {
//			n=n-2;
//			
//		}
//		System.out.println(n);
//		if(n==1) {
//			return false;
//		}
//		
//		return true;
		
		if((n&1)==0) {
			return true;
		}
		return false;
	}
	
	public static void fibAgain(int n) {
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=3;i<=n;i++) {
			int c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		fibAgain(a);
		

	}

}
