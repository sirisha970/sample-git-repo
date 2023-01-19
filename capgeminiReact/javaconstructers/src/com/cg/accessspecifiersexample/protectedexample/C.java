package com.cg.accessspecifiersexample.protectedexample;

public class C {
	A a = new A();
	void callingProtectedMethodOfClassAInTheNonSubClassOfSamePackage() {
		a.printAValue();
	}
}
