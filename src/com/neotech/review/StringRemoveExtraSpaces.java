package com.neotech.review;

import java.util.Arrays;

public class StringRemoveExtraSpaces {

	/*
	 * Remove all extra spaces in a string
	 * input: "     Hello world         I            LOVE  Java          "
	 * output: "Hello world I LOVE Java"
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println(removeExtraSpace2("     Hello world         I            LOVE  Java          "));
		
		
	}
	
	public static String removeExtraSpace (String str)
	{String [] words = str.trim().split("\\s+");
	
	String result ="";
	//words: [Hello, world, I, LOVE, Java]
	for(String word:words)
	{result += word + " ";
		
	}
		
		return result.trim();
	}
	
	public static String removeExtraSpace2(String str) {
		return str.trim().replaceAll("\\s+", " ");
	}
}
