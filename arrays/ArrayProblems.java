package com.src.arrays;
import java.util.*;

public class ArrayProblems { 
	public static int findLong(int arr[]) {
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
	
	public static void revArr(int arr[]) {
		int j=arr.length-1;
		for(int i=0;i<j;i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int findMiss(int arr[],int n) {
		int total=n*(n+1)/2;
		int accSum=0;
		for(int i=0;i<arr.length;i++) {
			accSum+=arr[i];
		}
		return total-accSum;
	}
	
	public static void moveZero(int arr[]) {
		int j=0,i=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}
			else {
				arr[j]=arr[i];
				i++;j++;
			}
		}
		
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void rotatK(int arr[],int k) {
		int res[]=new int[arr.length],j=0;
		
		for(int i=k;i<arr.length;i++) {
			res[j]=arr[i];
			j++;
		}
		
		for(int i=0;i<k;i++) {
			res[j]=arr[i];
			j++;
		}
		
		for(int n=0;n<res.length;n++) {
			System.out.print(res[n]+" ");
		}
		
	}
	
	public static void interSec(int arr1[],int arr2[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int x:arr1) {
			set.add(x);
		}
		
		for(int x:arr2) {
			if(set.contains(x)) {
				System.out.print(x+" ");
			}
		}
	}
	
	public static int kadenesAlgo(int arr[]) {
		int curr=0,max=0;
		for(int i=0;i<arr.length;i++) {
			curr+=arr[i];
			
			if(curr>max) {
				max=curr;
			}
			
			if(curr<0) {
				curr=0;
			}
		}
		return max;
	}
	
	public static boolean checkArrSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true; 
	}
	
	public static void checkMajority(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int x:arr) {
			if(map.containsKey(x)) {
				int count=map.get(x);
				map.put(x, count+1);
			}
			else {
				map.put(x, 1);
			}
		}
		
		for(int x:map.keySet()) {
			if(map.get(x)>(arr.length/2)) {
				System.out.println(x);
				return;
			}
		}
		
		System.out.println("No majority");
		
	}
	
	public static void twoSum(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		
		
		twoSum(arr1, k);

	}

}
