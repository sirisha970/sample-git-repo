package com.cg.accessspecifiersexample.defaultexample;

public class A {
	
	int value = 50;
	
	void printValue() {
		System.out.println("Value = "+value);
	}
	
	void callDefaultMethodFromSameClass() {
		printValue();
	}

}

