package com.cg.exceptionhandling.trywithresourcesexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		String line;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("file.txt"));
			while((line = br.readLine())!=null) {
				System.out.println("Line => "+line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
