package com.cgLambaExpressionsExample;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		SumArray sa = (arr) -> {
			int sum = 0;
			for(int a : arr) {
				sum = sum + a;
			}
			System.out.println("Sum = "+ sum);
		};

		System.out.println("Enter the array elemets");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		//call the above code
		sa.sumValueOfArray(arr);
	}

}
