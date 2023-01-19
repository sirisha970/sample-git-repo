package com.cg.stringexamples;

import java.util.Arrays;

public class AnagramExample {
	
	static boolean checkAnagramsOrNot(String str1,String str2) {
		
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();

		if (string1.length != string2.length)
			return false;
		//Sort both arrays
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		System.out.println(string1);
		System.out.println(string2);

		
		for(int i=0;i<string1.length;i++)
			if(string1[i] != string2[i])
				return false;
		return true;
	}

	public static void main(String[] args) {
		
		if(checkAnagramsOrNot("bat","tab")) 
			System.out.println("Both are anagrams");
		else
			System.out.println("Both are not anagrams");
	}

}