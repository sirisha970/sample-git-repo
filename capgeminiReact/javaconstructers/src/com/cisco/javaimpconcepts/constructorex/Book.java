package com.cisco.javaimpconcepts.constructorex;

public class Book {
	
	//instance variables
	int bookId;
	String bookName;
	float bookPrice;
	
	
	//default constructor
	Book() {
		System.out.println("default constructor is called");
		bookId = 43535;
	}

	//param constructor
	public Book(int bookId, String bookName, float bookPrice) {
		super();
		System.out.println("3 param constructor is called");
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}


	//two param constructor
	public Book(String bookName, float bookPrice) {
		super();
		System.out.println("2 param constructor is called");
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public Book(String bookName) {
		super();
		System.out.println("single param constructor is called");
		this.bookName = bookName;
	}

}
