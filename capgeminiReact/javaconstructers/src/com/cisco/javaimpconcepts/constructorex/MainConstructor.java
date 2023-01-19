package com.cisco.javaimpconcepts.constructorex;

public class MainConstructor {
	public static void main(String[] args) {
		//create object for book class
		Book b = new Book(); //this statement calls default constructor
		
		//CREATE AN ANOTHER OBJECT OF THE BOOK
		Book b1 = new Book("The Bankrupt");
		
		//CREATE AN ANOTHER OBJECT OF THE BOOK
		Book b11 = new Book("The Bankrupt",353.29f);
		
		//CREATE AN ANOTHER OBJECT OF THE BOOK
		Book b12 = new Book(322344,"The Bankrupt",353.29f);

	}
}

