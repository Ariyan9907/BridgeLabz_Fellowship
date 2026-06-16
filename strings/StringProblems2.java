package com.src.strings;
import java.util.*;
public class StringProblems2 {
	
	public static boolean checkRotation(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		String temp=s1+s1;
		
		if(temp.contains(s2)) {
			return true;
		}
		
		return false;
	}
	
	public static String longestPrefix(String arr[]) {
		if(arr==null||arr.length==0) return "";
		
		String s=arr[0];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			for(int j=1;j<arr.length;j++) {
				if(i>=arr[j].length()||arr[j].charAt(i)!=ch) {
					return s.substring(0,i);
				}
			}
		}
		return s; 
	}
	
	public static String removeSpace(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				t=t+s.charAt(i);
			}
		}
		return t;
	}
	
	public static int countWords(String s) {
		int count=0;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		return count+1;
	}
	
	public static void charFreq(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(Character ch:map.keySet()) {
			System.out.println(ch+" = "+map.get(ch));
		}
	}
	
	public static boolean checkDig(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch>='0'&ch<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static String longWord(String s) {
		String data[]=s.split(" ");
		int val=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].length()>val) {
				val=i;
			}
		}
		
		return data[val];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(longWord(s));

	}

}
