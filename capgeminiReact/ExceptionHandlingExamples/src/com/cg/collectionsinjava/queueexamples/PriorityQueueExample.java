package com.cg.collectionsinjava.queueexamples;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> empNames =  new PriorityQueue<>();
		
		//add empNames to the Queue
		empNames.add("Siri");
		empNames.add("Sirii");
		empNames.add("Sirish");
		empNames.add("Siris");
		
		System.out.println("Queue = "+empNames);
		
		//access elements of the queue
		System.out.println(empNames.peek());
		
		//remove elements from the queue
		System.out.println(empNames.poll());
		
		System.out.println("Updated Queue = " +empNames);
		
	}

}
