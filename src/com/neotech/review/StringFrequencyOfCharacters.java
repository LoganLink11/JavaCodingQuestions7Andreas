package com.neotech.review;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringFrequencyOfCharacters {

	/*
	 * Write a function that can find the frequency of characters in a String
	 * 
	 * EX: "AAABBCDDD"==>A3B2C1D3
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(characterFrequency("AAABBCDDD"));
		
	}
	
	//"AAABBCDDD"
	public static String characterFrequency(String str)
	{
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (map.containsKey(letter)) {
				int currentValue = map.get(letter);
				map.put(letter, currentValue + 1);
			} else {
				map.put(letter, 1);
			}
		}
		
		String result="";
		for (Entry<Character, Integer>letter:map.entrySet())
		{result += letter.getKey().toString() + letter.getValue().toString();
			 
		}
		
		return result;
	}
}
