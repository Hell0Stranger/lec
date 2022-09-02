package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\Homework1.java");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\Homework2-1.java");
		int x;
		
		while( (x=fin.read())!=-1 ) {
			if (x!=' ')
				fout.write(x);
		}
	}

}
