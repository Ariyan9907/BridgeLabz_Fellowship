package com.src.strings;
import java.util.*;

public class StringsProblems {
	public static String reverseString(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			t=s.charAt(i)+t;
		}
		
		return t;
	}
	
	public static String checkPalindrom(String s) {
		int i=0,j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;j--;
			}
			else {
				return "not palindrom";
			}
		}
		return "Palindrom";
	} 
	
	public static boolean checkAnargam(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(map1.containsKey(ch)) {
				int count=map1.get(ch);
				map1.put(ch, count+1);
			}
			else {
				map1.put(ch, 1);
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			if(map2.containsKey(ch)) {
				int count=map2.get(ch);
				map2.put(ch, count+1);
			}
			else { 
				map2.put(ch, 1);
			}
		}
		
		if(map1.equals(map2)) {
			return true;
		}
		
		return false;
		
	}
	
	public static char findFirstNonRep(String s) {
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch,count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(char ch:map.keySet()) {
			if(map.get(ch)==1) {
				return ch;
			}
		}
		
		return ' ';
	}
	
	public static String removeDuplicates(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer();
		for(Character ch:set) {
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void FindDuplicates(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			if(set.contains(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			else {
				set.add(s.charAt(i));
			}
		}
		
		
	}
	
	public static int countCharOcc(String s,char a) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
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
		
		if(map.containsKey(a)) {
			return map.get(a);
		}
		return 0;
	}
	
	public static int longestSubStr(String s) {
		HashSet<Character> set = new HashSet<Character>();
		
		int i=0,j=0,max=0,len=0;
		
		while(i<s.length()) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				len=i-j+1;
				
				if(len>max) {
					max=len;
				}
				System.out.println(set);
				
				i++;
			}
			else {
				set.remove(s.charAt(j));
				j++;
				
			}
			
			
		}
		return max;
	}
	
	
	
	public static String reverseEach(String s) {
		String data[]=s.split(" ");
		String t="";
		
		for(String x:data) {
			x=reverseString(x);
			t=t+x+" ";
		}
		
		return t;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(longestSubStr(s1));
		
		
		
		

	}

}
