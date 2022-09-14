package com.lec.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreApp2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int max = 3;
		int index =0;
		int kors[] = new int[max];
		int engs[] = new int[max];
		int maths[] = new int[max];
		EXIT:
		 while(true) 
		  {
			System.out.println("성적관리 프로그램 ver.1");
			System.out.println("=======================");
			System.out.println("\t1. 성적 입력");
			System.out.println("\t2. 성적 출력");
			System.out.println("\t3. 성적 읽기");
			System.out.println("\t4. 성적 저장");
			System.out.println("\t5. 종료 하기");
			System.out.print("\t메뉴선택 >");
				
	

			int menu = sc.nextInt();
			switch(menu) {
			
			case 1:
				
			{
				//사용자에게 입력값을 받아 성적입력을 계속할지 말지의 유무를 결정
				//1이면 계속, 2이면 종료
				int go =1;
				while(go==1) {
					int kor;
					int eng;
					int math;
					
					do {
						System.out.println("국어성적을 입력하세요. (범위 0~100)");
						kor = sc.nextInt();
					}while(kor<0||kor>100);
					do {
						System.out.println("영어성적을 입력하세요. (범위 0~100)");
						eng = sc.nextInt();
					}while(eng<0||eng>100);
					do {
						System.out.println("수학성적을 입력하세요. (범위 0~100)");
						math = sc.nextInt();
					}while(math<0||math>100);
					
					
						
					 if(index>=max)
					 {
						 int korTemp[] = new int[max+3];
						 int engTemp[] = new int[max+3];
						 int mathTemp[] = new int[max+3];
						 
						 for(int i=0; i<index; i++) {
							 korTemp[i] = kors[i];
							 engTemp[i] = engs[i];
							 mathTemp[i] = maths[i];
						   }
						 
						 kors = korTemp;
						 engs = engTemp;
						 maths = mathTemp;
						 
						 max = max+3;
					 }
					 
					 kors[index] = kor;
					 engs[index] = eng;
					 maths[index] = math;
					 
					 index++;
						 
					 System.out.println("성적 입력을 계속하시겠습니까 ?");
					 System.out.print("예: 1번, 아니오: 2번 >");
					go = sc.nextInt();
					if(go==2)
						break;
					}
			} // end of case 1
			  break;
			case 2:
			{   
			
				System.out.println("성적 출력");
				System.out.printf("%s %10s %10s %10s %10s","국어","영어","수학","총점","평균\n");
				
				for(int i =0; i<index; i++) {
					int total = kors[i] + engs[i] + maths[i];
					float avg = total/3.0f;
					System.out.printf("%d %10d %10d %10d %12.2f\n",kors[i],engs[i],maths[i], total, avg);
				 }
			
				System.out.println("");
			}// end of case 2
			 break;
			
			case 3:
			{
				System.out.println("\t성적을 읽습니다... ");
				FileInputStream fis = new FileInputStream("res/score.csv");
				Scanner fscan = new Scanner(fis);
				fscan.nextLine();
				while(fscan.hasNext()) {
				 if(index>=max) {
					 int korTemp[] = new int[max+3];
					 int engTemp[] = new int[max+3];
					 int mathTemp[] = new int[max+3];
					 
					 for(int i=0; i<index; i++) {
						 korTemp[i] = kors[i];
						 engTemp[i] = engs[i];
						 mathTemp[i] = maths[i];
					   }
					 
					 kors = korTemp;
					 engs = engTemp;
					 maths = mathTemp;
					 
					 max = max+3;
				  }
				  
				 String[] tokens = fscan.nextLine().split(",");
				 int kor = Integer.parseInt(tokens[0]);
				 int eng = Integer.parseInt(tokens[1]);
				 int math = Integer.parseInt(tokens[2]);
				 
				 kors[index] = kor;
				 engs[index] = eng;
				 maths[index] = math;
				 index++;
				 
				} // end of fscan while
				 fscan.close();
				 fis.close();
				
			}// end of case 3
			  break;
			  
			case 4:
			{
				System.out.println("\t성적을 저장합니다... ");
				FileOutputStream fout = new FileOutputStream("res/score.csv");
				PrintStream ps = new PrintStream(fout);
				
				ps.print("kor");
				ps.print(",");
				ps.print("eng");
				ps.print(",");
				ps.println("math");
				
				for (int i =0; i<index; i++) {
					ps.print(kors[i]);
					ps.print(",");
					ps.print(engs[i]);
					ps.print(",");
					ps.println(maths[i]);
				}
				
				fout.close();
				ps.close();
				System.out.println("저장완료");
			}
			break;
			
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break EXIT;
			
			default:
				System.out.println("1~5사이의 값을 입력해주세요");
				 break;
			}
			
		
		} //end of 1st while
		
	}// end of main

}// end of class
