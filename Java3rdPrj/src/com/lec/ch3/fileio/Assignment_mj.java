package com.lec.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment_mj {

		public static void main(String[] args) throws IOException {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\hello.java");
			FileInputStream fin = new FileInputStream("C:\\Users\\JIN\\git\\lec\\Java3rdPrj\\res\\hello1.java");
			
			
			while(true) {
				int x = fin.read();
				if(x==-1) 
					break; //한문장일때는 {} 굳이 안써도 괜찮다.
				fout.write(x);
				
				if(x=='n') {
					//옆에 N을 추가하는 문장을 쓰기
					fout.write('N');
				}
			
			}
			
			while(true) {
				int x = fin.read();
				
				if(x==-1)
					break;
				 if(x!=' ') {
						fout.write(x);
						
					}
			
				
		
				
			}
			
			int count =0;
			
			while(true) {
				int x = fin.read();
				if(x==-1)
					break;
				count++;
				if(x=='{') {
					System.out.println("{의 위치는"+count+"번째입니다");
					break;
				}
				
				
				
			}
			
			
		}
	}


