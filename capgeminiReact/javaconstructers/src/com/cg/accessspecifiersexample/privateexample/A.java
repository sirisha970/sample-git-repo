package com.cg.accessspecifiersexample.privateexample;

public class A {
	
	private int a = 40;
	
	private void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// create an object for A class
		A a = new A();
		a.display();

	}

}
