package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp {

	public static void main(String[] args) throws IOException {
		//res folder 내에 source.java를 copy해보자.
		//입력스트림 1개 필요 
		
		FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\source.java");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\source_copy.java");
		
// 		-----방법1. true로 계속 돌리면서 -1일때만 빠져나오게끔	------	
//		while(true) {
//			int x = fin.read();
//			if(x==-1) 
//				break; //한문장일때는 {} 굳이 안써도 괜찮다.
//			
//			fout.write(x);
//		}
//      -----방법1. End-------------------------------------------------
		
		//------방법2.  ----------------------
		int x = fin.read(); // 이것도 문제가 있다, 데이터가 없을 수도 있음. (-1) -> -1이면 while이 실행이안되니까 상관없지
		//읽어온 값
		while(x>=0) {
			// 순서중요 32번과 34번라인의 순서가 바뀌면 안된다.
		fout.write(x); 
		// read : -1은 32비트 정수형 ,byte와 정수형을 한번에 반환하는함수(?), -1이될 때까지 반환
		 x = fin.read(); 
		
		}		
		//-------방법2. End ----------------------
		
	
		fout.flush();
		fout.close();
		fin.close();
		System.out.println("파일 복사가 완료 되었습니다.");
	}

}
// Quiz1.
// 아래코드의 문제가 무엇인지 설명해보기
// int x = fin.read();
//while(x>=0) {
//	x= fin.read();
//	fout.write(x);
//}