package com.neotech.review;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringAnagram {

	/*
	 * Write a function that checks if a string is build out of the same letters as
	 * another string. Ex: isSame("abc", "cabbbbb"); -> true isSame("abc", "abb"); -> 
	 * false:
	 * 
	 * Anagram -strings made up of the same chars
	 */
	public static void main(String[] args) {
		System.out.println(isAnagram2("abc","cabbbbb"));
		System.out.println(isAnagram2("abc","abb"));
		
		
		
	}

	public static boolean isAnagram(String str1, String str2)
	{
		char[] ca1=str1.toCharArray();
		char[] ca2=str2.toCharArray();
		
		Arrays.sort(ca1);
		Arrays.sort(ca2);
		
		//[a,b,c]
		String s1="";
		for(char ch: ca1) {
			if (s1.contains(ch+"")) {
				continue;
				
			}
			s1 = s1 + ch; //can use this function to find distinct strings and sort them
		}
		
		//[a,b,b,b,b,b,c]
		String s2="";
		for(char ch: ca2) {
			if (s2.contains(ch+"")) {
				continue;
				
			}
			s2 = s2 + ch;
		}
		
		return s1.equals(s2);
	}
	
	public static boolean isAnagram2 (String str1, String str2)
	{ Set<String> ts1 = new TreeSet<>(Arrays.asList(str1.split("")));
	  Set<String> ts2 = new TreeSet<>(Arrays.asList(str2.split("")));
		
	  return ts1.equals(ts2);
	}
	
	
	
}
