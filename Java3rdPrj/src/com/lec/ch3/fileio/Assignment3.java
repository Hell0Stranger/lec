package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\Homework0.java");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\Homework3-1.java");
		int x;
		int count=0;
		while( (x=fin.read())!=-1 ) {
			count ++;
			if (x == '{')
				break;
		}
		System.out.println("첫번째중괄호의 값은"+count+"번째");
	}

}
