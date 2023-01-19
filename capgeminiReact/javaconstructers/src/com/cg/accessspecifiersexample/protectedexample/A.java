package com.cg.accessspecifiersexample.protectedexample;

public class A {
	
	protected int a = 70;
	
	protected void printAValue() {
		System.out.println("A Value = " + a);
	}
	
	void callingProtectedMethodInTheSameClass() {
		printAValue();
	}

}

