package com.cg.exceptionhandling.trywithresourcesexample;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromFileUsingBufferedReader {

	public static void main(String[] args) {
		String line;
		try(BufferedReader br =  new BufferedReader(new FileReader("file.txt"))){
			while((line = br.readLine())!=null) {
				System.out.println("Line => "+line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
