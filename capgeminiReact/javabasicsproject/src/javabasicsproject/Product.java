package javabasicsproject;

import java.util.Scanner;
public class Product {
    int pdtId;
	String pdtName;
	float pdtPrice;
			
	Scanner sc = new Scanner(System.in);
			
	void readProductDetails(){
		System.out.println("Enter pdtId");
		pdtId = sc.nextInt();
		System.out.println("Enter pdtName");
		pdtName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter pdtPrice");
		pdtPrice = sc.nextFloat();
	}
	
	void printProductDetails(){
		System.out.println("PdtId = " + pdtId);
		System.out.println("PdtName = " + pdtName);
		System.out.println("PdtPrice = " + pdtPrice);
	}

}
