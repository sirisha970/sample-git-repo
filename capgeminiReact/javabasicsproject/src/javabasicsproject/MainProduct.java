package javabasicsproject;

public class MainProduct {
	
	public static void main(String[] args) {
		// Create an object for the employee class
		Product pdt = new Product();
		Product pdt1 = new Product();
		Product pdt2 = new Product();
			
		pdt.readProductDetails();
		pdt.printProductDetails();
		pdt1.readProductDetails();
		pdt1.printProductDetails();
		pdt2.readProductDetails();
		pdt2.printProductDetails();
		}

}		