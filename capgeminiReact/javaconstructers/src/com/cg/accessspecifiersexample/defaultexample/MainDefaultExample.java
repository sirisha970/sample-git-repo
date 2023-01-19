package com.cg.accessspecifiersexample.defaultexample;

public class MainDefaultExample {

	public static void main(String[] args) {
		// Create An Object B class
		B b = new B();
		b.callDefaultMethodOfAClassFromSubClass();
		b.callDefaultMethodFromSameClass();
		C c = new C();
		c.callDefaultMethodOfAClassFromNonSubClass();

	}

}
