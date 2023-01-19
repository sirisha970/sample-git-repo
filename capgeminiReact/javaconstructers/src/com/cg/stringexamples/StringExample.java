package com.cg.stringexamples;

import java.util.Scanner;

public class StringExample {
	
	public static void main(String[] args) {
		//create the string in java
		//first way of creating the string
		String companyName = "Capgemini";
		//second way of creating the string
		String countryName = new String(); //this statement creates an empty string
		//third way of creating the string
		char[] capitalCity = {'N','e','w','D','e','l','h','i'};
		String cCity = new String(capitalCity);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Company Name = "+companyName);
		System.out.println("Enter the Country Name");
		countryName = sc.nextLine();
		System.out.println("Country Name = "+countryName);
		System.out.println("Capital City = "+cCity);
		
		
		//difference between next() and nextLine() method
		System.out.println("Enter the sentence");
		String str = sc.next();
		System.out.println("String using next() method =:" + str);
		System.out.println("Enter another sentence");
		sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println("String using nextLine() method =:" + str1);
	}

}
