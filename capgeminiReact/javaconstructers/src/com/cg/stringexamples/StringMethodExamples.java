package com.cg.stringexamples;

import java.util.Scanner;

public class StringMethodExamples {

	public static void main(String[] args) {
		// String Methods Example
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Character at specified location = "+str.charAt(5));
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		System.out.println("Concatenation of two strings = "+str.concat(str1));
		System.out.println("Convert String to UpperCase = " + str.toUpperCase());
		System.out.println("Index of given character = " + str.indexOf('e'));
		System.out.println("Index of given character = " + str.concat(str1).lastIndexOf('e'));
	}

}
