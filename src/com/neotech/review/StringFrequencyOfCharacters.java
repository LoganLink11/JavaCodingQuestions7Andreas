package com.neotech.review;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StringFrequencyOfCharacters {

	/*
	 * Write a function that can find the frequency of characters in a String
	 * 
	 * EX: "AAABBCDDD"==>A3B2C1D3
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(CharacterFrequency2("AAABBCDDD"));
		
	}
	
	//"AAABBCDDD"==>A3B2C1D3
	public static String CharacterFrequency(String str)
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
	
	
	//"AAABBCDDD"==>A3B2C1D3
	public static String CharacterFrequency2 (String str)
	{
		Set<String> lhs = new LinkedHashSet<>(Arrays.asList(str.split("")));
	
		//lhs: [A,B,C,D]
		String result = "";
		for(String letter: lhs)
		{
			int count=0;
			for(int i=0; i<str.length();i++)
			{
				char c = str.charAt(i);
				if (letter.equals(c + ""))
				{
					count +=1;
				}
			}
			result += letter+count;
		}
		
		return result;
	}
}
