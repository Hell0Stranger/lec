package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyCount {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\source.java");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\source_count.java");

		int count = 0;

		while (true) {
			int x = fin.read();

			if (x == -1)
				break;

			if (x == '\n' || x == '\r')
					continue;
			
				fout.write(x);
		}

		System.out.println("count는 " + count + "개");

		fout.flush();
		fout.close();
		fin.close();
		System.out.println("문자열 갯수 출력이 완료되었습니다.");
	}

}
