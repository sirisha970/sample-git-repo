package com.cgLambaExpressionsExample;

import java.util.*;

public class LambdaExpression {
	
	public static void main(String[] args) {
		Scanner mo = new Scanner(System.in);
		System.out.println("Enter the no of Elements");
		int n = mo.nextInt();
		System.out.println("Enter the array Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=mo.nextInt();
			
		}
		
		Lambda m=(a)->
		{
			for(int i=0;i<n;i++){
				int sum=0;
				sum=sum+a[i];
				
			}
			System.out.println(sum);
			
		}
		m.sumOfArray(arr);
	}

}
