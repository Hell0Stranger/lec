package com.lec.ch3.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputApp {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\data.txt");
		fout.write(51);
		fout.flush();
		fout.close();
		
		System.out.println("파일 저장이 완료 되었습니다.");
	}

}
