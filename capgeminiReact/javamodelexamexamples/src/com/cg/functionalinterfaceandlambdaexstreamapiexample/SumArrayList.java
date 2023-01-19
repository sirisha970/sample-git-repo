package com.cg.functionalinterfaceandlambdaexstreamapiexample;

import java.util.*;
import java.util.Scanner;

public class SumArrayList {

	//create an array list
	static ArrayList<Integer> intArrList = new ArrayList<Integer>();
	static Scanner sc = new Scanner (System.in);
	static int n = 0;
	public static void readArrayListValues(){
		System.out.println("enter arraylist size");
		n = sc.nextInt();
		System.out.println("enter arraylist values");
		for(int i=0;i<n;i++){
		     System.out.println("enter arraylist "+ i +" value");
		     intArrList .add(sc.nextInt());
		}
	}

	static Iterator<Integer> it = intArrList.iterator();
	static int sum = 0;
		
	public static int sumArrayListValuesUsingStream(){
		return intArrList.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		}
	public static void main(String[] args) {
		readArrayListValues();
		System.out.println("sum = "+sumArrayListValuesUsingStream());
	}

}
