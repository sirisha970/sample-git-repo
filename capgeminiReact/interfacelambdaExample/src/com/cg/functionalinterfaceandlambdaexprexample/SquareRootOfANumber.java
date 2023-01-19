package com.cg.functionalinterfaceandlambdaexprexample;

import java.util.Scanner;

public class SquareRootOfANumber {

	public static void main(String[] args) {

		SquareRoot sr = (arr) -> {
			for(int a : arr) {
				System.out.println(Math.round(Math.sqrt(a)));
			}
		};
		
		System.out.println("Enter the array elemets");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		//call the above code
		sr.findSquareRoot(arr);
	}

}
=============================================================
package com.cg.functionalinterfaceandlambdaexprexample;

@FunctionalInterface
public interface SumArray {
	
	void sumValueOfArray(int[] arr);

}
