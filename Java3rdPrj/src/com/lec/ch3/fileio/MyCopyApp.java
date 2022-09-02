package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyCopyApp {

	public static void main(String[] args) throws IOException {
			
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\Deploy_copy.java");
		FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\src\\week01\\ChTest.java");
		
		int x = fin.read(); 
		int count = 0 ;
		while(x >=0) {

//			if (x =='\n'|| x=='\r'){
//				continue;  --> error 발생, 공백에 해당하는 값을 가지고 위로 올라가면 다시 조건절만족해서 내려오게됨 = 무한반복문
		if (x=='\n'|| x=='r') {
			x=fin.read();
			continue;
		}
		
			fout.write(x);
			x= fin.read();

			
			count ++;
			
				
		}
		System.out.println("문자열의 갯수는 총 "+count+"개입니다.");
		
	}

}
