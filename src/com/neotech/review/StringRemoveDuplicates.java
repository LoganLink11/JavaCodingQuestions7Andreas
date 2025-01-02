package com.neotech.review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringRemoveDuplicates {

	/*
	 * Write function that will remove the duplicate items from a given String
	 * 
	 * Ex:removeDup("AAABBBCCC") ==> ABC
	 */

	public static void main(String[] args) {
		System.out.println(removeDuplicates2("AAABBBCCC"));
		System.out.println(countSameLetters("ADCAABBBAACCC"));
	}

	public static String removeDuplicates(String str) {
		char[] ca = str.toCharArray();

		String noDuplicates = "";
		for (char ch : ca) {
			if (noDuplicates.contains(ch + "")) {
				continue;
			}
			noDuplicates += ch;
		}

		return noDuplicates;
	}

	public static String removeDuplicates2(String str) {
		Set<String> lhs = new LinkedHashSet<>(Arrays.asList(str.split("")));

		return String.join("", lhs);
	}

	// "AAABBBCCC"
	public static Map<Character, Integer> countSameLetters(String str) {
		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (result.containsKey(letter)) {
				int currentValue = result.get(letter);
				result.put(letter, currentValue + 1);
			} else {
				result.put(letter, 1);
			}
		}

		return result;
	}

}

