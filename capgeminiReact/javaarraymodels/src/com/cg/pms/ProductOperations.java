package com.cg.pms;

import java.util.Scanner;

public class ProductOperations {
	
	
	Product[] productData = new Product[30];
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	Product p = null;
	int n = 0;
	public void storeProductData() {
		
		System.out.println("Enter number of products");
		n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			p = new Product();
		System.out.println("Enter Product Info");
		System.out.println("Enter Product Id");
		p.setProductId(sc.nextInt());
		System.out.println("Enter Product Name");
		sc.nextLine();
		p.setProductName(sc.nextLine());
		System.out.println("Enter Product Price");
		p.setProductPrice(sc.nextFloat());
			productData[i] = p;
		}
		
	}
	
	public void readProductData() {
		System.out.println("Display Product Info");
		for(int i = 0;i<n;i++) {
			System.out.println(productData[i].getProductName());
		}

	}
	
	public void productOperations() {
		
		while(ch == 'y') {
			System.out.println("Enter the Choice");
			System.out.println("Add : Adding Product");
			System.out.println("View : Viewing Products");
			String choice = sc.next();
			switch (choice) {
			case "Add":
				storeProductData();
				break;
			case "View":
				readProductData();
				break;
			default:
				System.out.println("not a right choice");
				break;
			}
			System.out.println("do u want to continue y - yes or n - no");
			ch = sc.next().charAt(0);
		}
	}

}
